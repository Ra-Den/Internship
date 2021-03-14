package CommandProcessing;

import Commands.*;
import Program.Main;

import static java.lang.System.exit;

public class CertainCommand { //Класс который опеределяет какую команду нужно применить в зависимости от символа на котором находится "указатель"

    private AllCommands allCommands=new AllCommands();
    private Executer executer=new Executer(
            new Increment(allCommands),
            new Decrement(allCommands),
            new BeginCycle(allCommands),
            new EndCycle(allCommands),
            new NextCell(allCommands),
            new PrevCell(allCommands),
            new PrintChar(allCommands));

    public CertainCommand(char sign){
        switch (sign) {
            case '+':
                executer.exIncrement();
                break;
            case '-':
                executer.exDecrement();
                break;
            case '.':
                executer.exPrintChar();
                break;
            case '[':
                executer.exBeginCycle();
                break;
            case ']':
                executer.exEndCycle();
                break;
            case '>':
                executer.exNextCell();
                break;
            case '<':
                executer.exPrevCell();
                break;
            default:
                System.out.println("\nError during compilation");
                exit(0);
        }
    }

}

