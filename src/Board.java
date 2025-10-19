public class Board {
    private int[][] data = new int[3][3];
    Board(){}
    void add(int i, int j, int el) {
        if (i >= 0 && i < 3 && j >= 0 && j < 3) {
            if (this.data[i][j] != 0) {
                throw new IllegalArgumentException("Поле уже занято\n");
            } else if (el != 1 && el != 2) {
                throw new IllegalArgumentException("deer penis");
            } else {
                this.data[i][j] = el;
            }
        } else {
            throw new IndexOutOfBoundsException("Выход за границу поля\n");
        }
    }
}