package jun_30_practices;

public class testdriveofpage16 {
    public static void main(String[] args) {
        pattern p = new pattern();
        p.halfpyramid();
    }
}

class pattern {
    int row, col, space;

    void halfpyramid() {
        for (row = 1; row <= 9; row++) {
            for (space = row; space <= 9; space++) {
                System.out.print(" ");
            }
            for (col = 1; col <= row; col++) {
                System.out.print(col);
            }
            for (col = 1; col <= row-1; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
