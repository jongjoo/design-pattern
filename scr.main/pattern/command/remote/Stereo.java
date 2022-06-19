package pattern.command.remote;

public class Stereo {

    boolean system;
    int volume;
    String cd;
    String dvd;
    String Radio;

    public void on() {
        this.system = true;
    }

    public void off() {
        this.system = false;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public void setRadio(String radio) {
        Radio = radio;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
