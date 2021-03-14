package Commands;

import CommandProcessing.AllCommands;
import CommandProcessing.Command;

public class PrevCell implements Command {
    private AllCommands allCommands;

    public PrevCell(AllCommands allCommands) {
        this.allCommands = allCommands;
    }

    @Override
    public void execute() {
        allCommands.prevCell();
    }
}
