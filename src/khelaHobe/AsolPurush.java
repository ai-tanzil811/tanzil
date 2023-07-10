package khelaHobe;
import java.util.Scanner;
public class AsolPurush {
    public static void main(String[] args) {
        {
            int a;
            Scanner voda = new Scanner(System.in);
            RaiterPinik eiLo = new RaiterPinik();
            if(eiLo.KhankirPola(a=voda.nextInt()) == true)
            {
                System.out.println("KAM Sharese eita moulik madarchod");
            }
            else
            {
                System.out.println("Shalaai regular mal");
            }
        }
    }
}
