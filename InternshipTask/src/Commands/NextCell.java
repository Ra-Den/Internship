package Commands;

import CommandProcessing.AllCommands;
import CommandProcessing.Command;

public class NextCell implements Command {
    private AllCommands allCommands;

    public NextCell(AllCommands allCommands) {
        this.allCommands = allCommands;
    }

    @Override
    public void execute() {
        allCommands.nextCell();
    }
}
