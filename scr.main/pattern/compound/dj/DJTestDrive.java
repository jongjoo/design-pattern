package pattern.compound.dj;

public class DJTestDrive {

    public DJTestDrive() {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
