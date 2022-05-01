package pattern.strategy;

public abstract class Move implements MovePosition {

    String msg = "Swimming";

    @Override
    public void move() {
        System.out.println(msg);
    }

    public void setMsg(String msg){
        this.msg = msg;
    }

}
