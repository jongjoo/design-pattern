package pattern.command.remote;

import pattern.command.simpleremote.Command;

public class NoCommand implements Command {
    public NoCommand() {
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
