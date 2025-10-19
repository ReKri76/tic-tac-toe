public class Board {
    private int[][] data = new int[3][3];
      Board(){}
    boolean isWin(int symbol, int i, int j) {
        if (symbol != 1 && symbol != 2) {
            throw new IllegalArgumentException("deer penis");
        } else if (this.data[i][0] == symbol && this.data[i][1] == symbol && this.data[i][2] == symbol) {
            return true;
        } else if (this.data[1][j] == symbol && this.data[0][j] == symbol && this.data[2][j] == symbol) {
            return true;
        } else {
            int ij = i + j;
            if (ij % 2 == 0) {
                if (i == 1) {
                    if (this.data[0][0] == symbol && this.data[2][2] == symbol || this.data[0][2] == symbol && this.data[2][0] == symbol) {
                        return true;
                    }
                } else if (this.data[1][1] == symbol && ij == 2) {
                    if (this.data[j][i] == symbol) {
                        return true;
                    }
                } else if (this.data[Math.abs(i - 2)][Math.abs(j - 2)] == symbol) {
                    return true;
                }
            }

            return false;
        }
    }
}
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
