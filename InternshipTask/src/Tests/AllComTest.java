package Tests;

import CommandProcessing.AllCommands;
import org.junit.Test;

public class AllComTest {
    AllCommands allCommands=new AllCommands();
    @Test
    public void incTest(){
        allCommands.increment();
    }
    @Test
    public void decTest(){
        allCommands.decrement();
    }
    @Test
    public void nextCellTest(){
        allCommands.nextCell();
    }
    @Test
    public void prevCellTest(){
        allCommands.prevCell();
    }
    @Test
    public void CycleTest(){
        allCommands.beginCycle();
        allCommands.endCycle();
    }
    @Test
    public void printCharTest(){
        allCommands.printChar();
    }
}

