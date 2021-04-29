package Java;
import java.util.Scanner;

public class NS extends Student {
    Scanner in = new Scanner(System.in);

    @Override
    public void pass() {
        int ticks;
        System.out.println("Input number of ticks for NS student: ");
         ticks=in.nextInt();

        if (ticks == 10){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
        
    }
    
}
