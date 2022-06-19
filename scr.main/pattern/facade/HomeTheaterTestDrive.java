package pattern.facade;

public class HomeTheaterTestDrive {

    public HomeTheaterTestDrive() {
        Amplifier amp = new Amplifier();
        Turer turer = new Turer();
        StreamingPlayer player = new StreamingPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, turer, player, projector, lights, screen, popper);

        homeTheater.watchMovie("인디아나 존스: 레이더스");
        homeTheater.endMovie();
    }
}
