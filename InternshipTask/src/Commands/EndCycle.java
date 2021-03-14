package Commands;

import CommandProcessing.AllCommands;
import CommandProcessing.Command;

public class EndCycle implements Command {
    private AllCommands allCommands;

    public EndCycle(AllCommands allCommands) {
        this.allCommands = allCommands;
    }

    @Override
    public void execute() {
        allCommands.endCycle();
    }
}
