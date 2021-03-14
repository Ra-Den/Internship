package Commands;

import CommandProcessing.AllCommands;
import CommandProcessing.Command;

public class Increment implements Command {
    private AllCommands allCommands;
    public Increment(AllCommands allCommands){
        this.allCommands=allCommands;
    }
    @Override
    public void execute(){
        allCommands.increment();
    }

}
