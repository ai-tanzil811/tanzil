package car;

import java.sql.SQLOutput;
import java.util.Scanner;
class main{

}
class ArrayExample {
    public static void main(String[] args) {
        System.out.print("Enter how many car model data you want you enter = ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Car[] myArray = new Car[x];
        for(int i=0;i<x;i++) {
            String z;
            String l;
            System.out.print("PLease input car name of " +(i+1)+ " \n");
            z= sc.next();
            System.out.print("PLease input car model of " +(i+1)+ " \n");
            l= sc.next();
            System.out.println();
            myArray [i] = new Car(z,l);
        }
        for(int i=0;i<x;i++)
        {
            myArray[i].display();
        }


    }


}

class Car {
    String carName;
    String carModel;

    public Car(String carName, String carModel) {
        this.carName = carName;
        this.carModel = carModel;
    }

    void display() {
        System.out.println("CAR NAME = " + carName + "CAR MODEL = " + carModel);
    }
}