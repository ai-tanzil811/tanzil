package jun_30_practices;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        int x;
        Scanner sc  = new Scanner(System.in);
        x= sc.nextInt();
        Machine m = new Machine();
        m.method(x);
    }
}
class Machine
{
    int x;
    int t1=0;
    int t2 =1;
    int nextTerm =0;
    void method(int x)
    {
        for (int i=0;i<=x;i++)
        {
            System.out.print(nextTerm);
            t1 = t2;
            t2 = nextTerm;
            nextTerm =t1+t2;
            if(i<x) System.out.print(",");

        }
    }

}
