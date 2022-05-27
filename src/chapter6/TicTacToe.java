package chapter6;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        String winner = "";
        boolean xTurn = true;
        int row = 0;
        int col = 0;
        String[][] board = new String[3][3];
        initializeBoard(board);
        printCurrentBoard(board);
        while (winner.equals("")) {
            if (xTurn) {
                System.out.println("X turn");
            } else {
                System.out.println("O turn");
            }
            getUserInput(xTurn, board);
            System.out.println();

            printCurrentBoard(board);
            winner = getWinner(board);
            xTurn = !xTurn;//flip
            System.out.println(xTurn);
            if (winner.equals("") && isBoardFull(board)) {
                winner = "C";
            }
        }

            System.out.println();

            if (winner.equals("C")) {
                System.out.println("No winner");
            } else {
                System.out.println("Winner is :" + winner);
            }


    }//end main
    public static void initializeBoard(String[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=" ";
            }

        }
    }
    public static void printCurrentBoard(String[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]);
                if(j<2){
                    System.out.print("  |  ");
                }
            }
            System.out.println();
            if(i<2){
                System.out.print("- - - - - - -");
            }
            System.out.println();
        }
    }
    public static void getUserInput(boolean xTurn, String[][] board){
        Scanner keyboard = new Scanner(System.in);
        int row =-1;
        int col = -1;
        boolean keepAsking = true;
        while(keepAsking){
            System.out.println("Please enter row the column");

            row = keyboard.nextInt();
            col = keyboard.nextInt();
            keyboard.nextLine();

            if(row>=0 && row <=2 && col >= 0 && col <= 2){
                if(!cellAlreadyOccupied(row,col,board)){
                    keepAsking =false;
                }
                else{
                    System.out.println("Cell occupied");
                }

            }
        }

        if(xTurn){
            board[row][col]="x";
        }
        else{
            board[row][col]="o";

        }
    }
    public static boolean cellAlreadyOccupied(int row, int col, String[][] board){
        return !board[row][col].equals(" ");
    }
    public static String getWinner(String[][] board){
        final int ROWS = board.length;
        final int COLS = board[0].length;
        for(int i=0;i<ROWS;i++){
            if(!board[i][0].equals(" ")&& board[i][0].equals(board[i][1])&&
            board[i][1].equals(board[i][2])){
                return board[i][0];
            }
        }
        for(int i=0; i<COLS ;i++){
            if(!board[0][i].equals(" ")&& board[0][i].equals(board[1][i])&&
                    board[i][1].equals(board[i][2])){
                return board[0][i];
            }
        }
        if(!board[0][0].equals(" ")&& board[0][0].equals(board[1][1])&&
                board[1][1].equals(board[2][2])){
            return board[0][0];
        }
        if(!board[2][0].equals(" ")&& board[2][0].equals(board[1][1])&&
                board[1][1].equals(board[0][2])){
            return board[2][0];
        }
        return "";

    }
            public static boolean isBoardFull(String[][] board) {
                int countFill = 0;
                for (int i = 0; i < board.length; i++)
                {
                    for (int j = 0; j < board[i].length; j++)
                    {
                        if(!board[i][j].equals(" "))
                        {
                            countFill++;
                            //System.out.println(countFill);
                        }
                    }
                }
                return countFill==9;
            }
}