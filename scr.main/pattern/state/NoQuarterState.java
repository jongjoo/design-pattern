package pattern.state;

public class NoQuarterState implements State{

    GumballMachineTwo gumballMachine;

    public NoQuarterState(GumballMachineTwo gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다");
        gumballMachine.setState(gumballMachine.hasQuarterState);
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어 주세요");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어 주세요");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어 주세요");
    }
}
