package pattern.facade;

public class TheaterLights {

    int dim;

    public void dim(int i) {
        this.dim = i;
        System.out.println("조명 밝기를 10%로 설정합니다.");
    }


    public void on() {
        this.dim = 100;
        System.out.println("조명이 켜졌습니다.");
    }
}
