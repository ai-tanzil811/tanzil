package khelaHobe;

public class RaiterPinik {
    int a;

    int c = 0;
    boolean Tanzil;

    public boolean KhankirPola(int a) {
        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                c++;
            }

        }
        if (c == 2) {
            return Tanzil = true;
        } else {
            return Tanzil = false;
        }
    }
}

