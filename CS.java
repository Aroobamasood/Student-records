package Java;
import java.util.Scanner;

public class CS extends Student {
    Scanner in = new Scanner(System.in);
    public String choice;
   
    @Override
    public void pass() {
        int ticks;
        System.out.println("Input number of ticks for CS student: ");
         ticks = in.nextInt();

        if (ticks == 20){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
    }
    
}
