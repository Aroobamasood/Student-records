package Java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
     
    
    public static void main(String []args){
       
        
     ArrayList<Student> stud = new ArrayList<>();

     CS cs = new CS();
     cs.pass();
     stud.add(cs);

     NS ns = new NS();
     ns.pass();
     stud.add(ns);
     Scanner in = new Scanner(System.in);

    
     int i=1;
     while (i<10){
        String choice = "";
        System.out.println("Do you want to enter data for next student?  (Y/N)");
        cs.choice = in.nextLine();
        if (cs.choice.equalsIgnoreCase ("Y")) {

            System.out.println("Which department's Student data you want to enter?  (NS/CS)");
            choice = in.nextLine();
            in.nextLine();
        } 
        if (choice.equalsIgnoreCase ("NS")){
            
            NS n = new NS();
            n.pass();
            stud.add(n);
        }
        else if (choice.equalsIgnoreCase ("CS")){
            CS c = new CS();
            c.pass();
            stud.add(c);

        }
        else 
        if (cs.choice.equalsIgnoreCase ("N")){
       
            break;
        }

     }
  
    }
   

}
