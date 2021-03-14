package Commands;

import CommandProcessing.AllCommands;
import CommandProcessing.Command;

public class PrintChar implements Command {
    private AllCommands allCommands;

    public PrintChar(AllCommands allCommands) {
        this.allCommands = allCommands;
    }

    @Override
    public void execute() {
        allCommands.printChar();
    }
}
