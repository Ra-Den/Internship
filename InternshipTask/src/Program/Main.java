package Program;

import CommandProcessing.CertainCommand;
import Util.Input;

public class Main{
    public static int pointer;
    public static void main(String[] args) {
        new Dialog().enterCode();
        new Main().lookThrough(Input.input3);
    }

    public void lookThrough(String input){
        for(pointer=0;pointer<input.length();pointer++){
            char v=input.charAt(pointer);
            new CertainCommand(v);
        }
    }
}
