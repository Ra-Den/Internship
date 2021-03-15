package CommandProcessing;

import Program.Main;

import java.util.ArrayList;

import static java.lang.System.exit;

public class AllCommands { //Класс в котором описан механизм работы каждой команды
    private static int counter=0;
    private static ArrayList<Integer> i=new ArrayList<>();
    private static int[] firstPoint= new int[1000];
    public static int index=0;

    public AllCommands() {
        if(i.size()==0){
            i.add(0);
        }
    }

    public void increment(){
        int temp=i.get(counter);
        i.set(counter,(++temp));

    }

    public void decrement(){
        var temp=i.get(counter);
        i.set(counter,--temp);
    }

    public void nextCell(){
        counter++;
        if(counter>i.size()-1){
            i.add(0);
        }
    }

    public void prevCell(){
        counter--;
    }

    public void printChar(){
        int temp= i.get(counter);
        System.out.print((char)temp);
    }

    public void beginCycle(){ //цикл реализован так что сначала находится первая скобка и в массив начал цикла записывается текущее положенее "указателя"
        index++;
        firstPoint[index]= Main.pointer;
    }

    public void endCycle(){
        if(index==0){ //Если же первой скобки не было произойдет ошибка и программа закроется.
            System.out.println("Cycle error");
            exit(0);
        }
        if(i.get(counter)!=0) {  //Когда счетчик цикла не равен нулю "указатель" будет переноситься в начало массива до тех пор пока счетчик не обнулится
            Main.pointer=firstPoint[index];
        }
        else if(index >1){
            index--;
        }
    }
}
