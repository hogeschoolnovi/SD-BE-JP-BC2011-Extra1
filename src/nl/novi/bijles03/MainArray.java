package nl.novi.bijles03;

public class MainArray {
    public static void main(String[] args) {

        String[] cars = new String[2];
        cars[0] = "Volvo";
        cars[1] = "BMW";

        char[][] board = new char[3][3];
        board[0][0] = '-';
        board[0][1] = '-';
        board[0][2] = '-';


        char[][] board2 = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        for (int i = 0; i < board2.length; i++) {
            char[] boardRow = board2[i];
            for (int j = 0; j < boardRow.length; j++) {
                System.out.print(boardRow[j]);
            }
            System.out.println("");
        }

    }
}
