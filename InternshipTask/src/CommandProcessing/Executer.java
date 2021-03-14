package CommandProcessing;

class Executer {
    private Command increment;
    private Command decrement;
    private Command beginCycle;
    private Command endCycle;
    private Command nextCell;
    private Command prevCell;
    private Command printChar;

     Executer(Command increment, Command decrement, Command beginCycle, Command endCycle, Command nextCell, Command prevCell, Command printChar) {
        this.increment = increment;
        this.decrement = decrement;
        this.beginCycle = beginCycle;
        this.endCycle = endCycle;
        this.nextCell = nextCell;
        this.prevCell = prevCell;
        this.printChar = printChar;
    }
    void exIncrement(){
        increment.execute();
    }
    void exDecrement(){
        decrement.execute();
    }
    void exNextCell(){
        nextCell.execute();
    }
    void exPrevCell(){
        prevCell.execute();
    }
    void exBeginCycle(){
        beginCycle.execute();
    }
    void exEndCycle(){
        endCycle.execute();
    }
    void exPrintChar(){
        printChar.execute();
    }

}
