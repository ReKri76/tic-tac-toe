import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      start()
    }
    private static void start() {
        Board board = new Board();
        Scanner input = new Scanner(System.in);
        int steps = 0;
        boolean returnInput = true;
        System.out.println("Start of game");

        while(true) {
            int i = 0;
            int j = 0;

            while(returnInput) {
                System.out.println("X:");
                returnInput = false;

                try {
                    i = input.nextInt() - 1;
                    j = input.nextInt() - 1;
                } catch (InputMismatchException var8) {
                    System.out.println("Введите координаты точки X");
                    returnInput = true;
                    input.next();
                }

                try {
                    board.add(i, j, 1);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    returnInput = true;
                }
            }

            returnInput = true;
            ++steps;
            if (steps >= 3 && board.isWin(1, i, j)) {
                System.out.println("Player X is win!\nWould you like to play again? (Y/N): ");
                String in = input.next();
                if (!in.equals("y") && !in.equals("Y")) {
                    if (in.equals("n")) {
                        System.exit(0);
                    }
                } else {
                    start();
                }
            }

            board.print();
            if (steps == 5) {
                while(returnInput) {
                    returnInput = false;
                    System.out.print("Draw!\nWould you like to play again? (Y/N): ");
                    String in = input.next();
                    if (in.equals("y")) {
                        start();
                    } else if (in.equals("n")) {
                        System.exit(0);
                    } else {
                        input.next();
                        returnInput = true;
                    }
                }
            }

            while(returnInput) {
                System.out.println("O:");
                returnInput = false;

                try {
                    i = input.nextInt() - 1;
                    j = input.nextInt() - 1;
                } catch (InputMismatchException var10) {
                    System.out.println("Введите координаты точки O");
                    returnInput = true;
                    input.next();
                }

                try {
                    board.add(i, j, 1);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    returnInput = true;
                }
            }

            returnInput = true;
            board.print();
            if (steps >= 3 && board.isWin(2, i, j)) {
                System.out.println("Player O is win!\nWould you like to play again? (Y/N): ");
                String in = input.next();
                if (in.equals("y")) {
                    start();
                } else if (in.equals("n")) {
                    System.exit(0);
                }
            }
        }
}

}