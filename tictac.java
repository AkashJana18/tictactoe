
import java.util.Arrays;
import java.util.Scanner;


public class tictac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        do {
                playTicTac();
            System.out.println("Play tictac ? y or n");
            input = sc.next();
        } while (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y"));

    }

    private static void playTicTac() {
        char[][] board = new char[3][3];

        for (char[] chars : board) {
            Arrays.fill(chars, ' ');
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(!gameOver && count < 10){
            if( count == 9){
                printBoard(board);
                System.out.println("DRAW");
                break;
            }
            printBoard(board);
            System.out.println("Player " + player + " enter : ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(board[row][col] == ' '){
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if(gameOver){
                    printBoard(board);
                    System.out.println("Player " + player + " has won!");
                } else {
                    player = player == 'X' ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move. Try again!");
                count--;
            }
            count++;
        }
    }

    public static boolean haveWon(char[][] board, char player){
        for (char[] chars : board) {
            if (chars[0] == player && chars[1] == player && chars[2] == player) return true;
        }
        for(int col=0 ; col < board[0].length ; col++){
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player ) return true;
        }
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player ) return true;
        return board[0][2] == player && board[1][1] == player && board[2][0] == player;
    }
    public static void printBoard(char[][] board){
        for (char[] chars : board) {
            for (char aChar : chars) {
                System.out.print(aChar + " | ");
            }
            System.out.println();
        }
    }
}
