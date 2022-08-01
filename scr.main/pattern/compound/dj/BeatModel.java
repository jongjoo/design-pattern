package pattern.compound.dj;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BeatModel implements BeatModelInterface, Runnable {

    List<BeatObserver> beatObserverList = new ArrayList<>();
    List<BPMObserver> bpmObserverList = new ArrayList<>();
    int bpm = 90;
    Thread thread;
    boolean stop = false;
    Clip clip;

    @Override
    public void run() {
        while (!stop) {
            playBeat();
            notifyBeatObservers();
            try {
                Thread.sleep(60000 / getBPM());
            } catch (Exception e) {
            }
        }
    }


    @Override
    public void initialize() {
        try {
            File resource = new File("clap.wav");
            clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
            clip.open(AudioSystem.getAudioInputStream(resource));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void on() {
        bpm = 90;
        notifyBPMObservers();
        thread = new Thread(this);
        stop = false;
        thread.start();
    }

    @Override
    public void off() {
        stopBeat();
        stop = true;
    }


    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        notifyBPMObservers();
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObserverList.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        for (int i = 0; i < beatObserverList.size(); i++) {
            BeatObserver observer = beatObserverList.get(i);
            observer.updateBeat();
        }
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObserverList.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        for (int i = 0; i < bpmObserverList.size(); i++) {
            BPMObserver observer = bpmObserverList.get(i);
            observer.updateBPM();
        }
    }

    private void notifyBPMObservers() {
        for (int i = 0; i < bpmObserverList.size(); i++) {
            BPMObserver observer = bpmObserverList.get(i);
            observer.updateBPM();
        }
    }

    private void notifyBeatObservers() {
        for (int i = 0; i < beatObserverList.size(); i++) {
            BeatObserver observer = beatObserverList.get(i);
            observer.updateBeat();
        }
    }

    private void playBeat() {
        clip.setFramePosition(0);
        clip.start();
    }

    private void stopBeat() {
        clip.setFramePosition(0);
        clip.stop();
    }
}
