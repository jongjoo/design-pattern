package pattern.state;

public class SoldOutState implements State {

    GumballMachineTwo gumballMachine;

    public SoldOutState(GumballMachineTwo gumballMachineTwo) {
        this.gumballMachine = gumballMachineTwo;
    }

    @Override
    public void insertQuarter() {
        System.out.println("품절입니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("품절입니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("알맹이를 내보낼 수 없습니다.");

    }

    @Override
    public void dispense() {
        System.out.println("알맹이가 없음.");
    }
}
