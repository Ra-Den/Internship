package Program;

import Util.Input;

import java.util.Scanner;

import static java.lang.System.exit;

public class Dialog {
     public void enterCode(){
        Scanner in=new Scanner(System.in);

        System.out.println("Would you like to enter your code?\n1-Yes\n2-No(Will be used default code)");
        int select=in.nextInt();

        if(select==1){
            System.out.println("Enter your code:");
            Input.input3=in.next();
        }else if(select!=2){
            System.out.println("Invalid input");
            exit(0);
        }
    }
}
