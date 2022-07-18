package pattern.state;

public class SoldState implements State {
    GumballMachineTwo gumballMachine;

    public SoldState(GumballMachineTwo gumballMachineTwo) {
        this.gumballMachine = gumballMachineTwo;
    }

    @Override
    public void insertQuarter() {
        System.out.println("알맹이를 내보내고 있습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑으셨습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이는 한 번만 돌려 주세요");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("품절되었습니다.");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

}
