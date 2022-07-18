package pattern.state;

public class HasQuarterState implements State {

    GumballMachineTwo gumballMachine;

    public HasQuarterState(GumballMachineTwo gumballMachineTwo) {
        this.gumballMachine = gumballMachineTwo;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전은 한 개만 넣어 주세요");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전이 반환됩니다");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이를 돌리셨습니다");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("알맹이를 내보낼 수 없습니다");
    }
}
