public class Board {
    private int[][] data = new int[3][3];
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
