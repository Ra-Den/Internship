package Tests;

import Program.Main;
import Util.Input;
import org.junit.Test;

public class MainTest {
    Main main=new Main();
    @Test
    public void mainTest(){
        main.lookThrough(Input.input4);
    }
}
