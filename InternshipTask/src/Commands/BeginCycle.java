package Commands;

import CommandProcessing.AllCommands;
import CommandProcessing.Command;

public class BeginCycle implements Command {
    private AllCommands allCommands;

    public BeginCycle(AllCommands allCommands) {
        this.allCommands = allCommands;
    }

    @Override
    public void execute() {
        allCommands.beginCycle();
    }
}
