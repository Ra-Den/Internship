package Commands;

import CommandProcessing.AllCommands;
import CommandProcessing.Command;

public class Decrement  implements Command {
    private AllCommands allCommands;
    public Decrement(AllCommands allCommands) {
        this.allCommands = allCommands;
    }
    @Override
    public void execute(){
        allCommands.decrement();
    }
}