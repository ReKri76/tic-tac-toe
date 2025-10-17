public class Board {
    private int[][] data = new int[3][3];
    void print() {
        for(int i = 0; i < 3; ++i) {
            System.out.print(" | ");

            for(int j = 0; j < 3; ++j) {
                switch (this.data[i][j]) {
                    case 0 -> System.out.print(' ');
                    case 1 -> System.out.print('X');
                    case 2 -> System.out.print('O');
                }

                System.out.print(" | ");
            }

            System.out.println();
        }

    }
}
