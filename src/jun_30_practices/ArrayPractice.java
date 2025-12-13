package jun_30_practices;

public class ArrayPractice {
    public static void main(String[] args) {
        Bird [] myArray = new Bird [ 3 ] ;
        for ( int i =0; i <3; i ++)
        {
            myArray [ i ] = new Bird ();
        }
        myArray[0].fly();
        myArray[1].joytanzil();
    }
}
class Bird {
    public void fly() {
        System.out.println("Bird can fly");

    }
    public void joytanzil() {
        System.out.println("EID UL AZHA");

    }
}