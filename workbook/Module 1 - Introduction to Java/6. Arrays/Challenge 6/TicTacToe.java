import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("\nLet's play tic tac toe");

    // Task 1: Create an array with three rows of '_' characters.
    char[][] board = {
        { '_', '_', '_' },
        { '_', '_', '_' },
        { '_', '_', '_' },
    };

    // Task 2: Call the function printBoard();
    printBoard(board);

    /*
     * { Task 3: Loop through turns.
     * 
     * if (X) turn {
     * Task 4: call askUser().
     * Task 5: populate the board using askUser's return value.
     * } else {
     * Task 4: call askUser().
     * Task 5: populate the board using askUser's return value. Then, print it.
     * 
     * }
     * 
     * Task 6 - Call the function.
     * if return value == 3 {
     * print: X wins and break the loop
     * } else if return value == -3 {
     * print: O wins and break the loop
     * }
     * 
     * }
     */

    int[] answer;
    int score = 0;

    for (int i = 0; i < 9; i++) {
      if (i % 2 == 0) {
        // X turns
        System.out.println("Turn: X");
        answer = askUser(board);
        board[answer[0]][answer[1]] = 'X';
      } else {
        // O turns
        System.out.println("Turn: O");
        answer = askUser(board);
        board[answer[0]][answer[1]] = 'O';
      }
      printBoard(board);

      score = checkWin(board);

      if (score == 3 || score == -3) {
        break;
      }
    }

    if (score == 3) {
      System.out.println("\nX Wins!");
    } else if (score == -3) {
      System.out.println("\nO Wins!");
    } else {
      System.out.println("\nIt's a tie!");
    }

    scan.close();
  }

  /**
   * Task 2 - Write a function that prints the board.
   * Function name - printBoard()
   * 
   * @param board (char[][])
   * 
   *              Inside the function:
   *              1. print a new line.
   *              2. print the board.
   *              • separate each row by two lines.
   *              • each row precedes a tab of space
   *              • each character in the grid has one space from the other
   *              character
   */

  public static void printBoard(char[][] board) {
    System.out.println();
    for (int i = 0; i < board.length; i++) {
      System.out.print("\t");
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  /**
   * Task 4 - Write a function that lets the user choose a spot
   * Function name – askUser
   * 
   * @param board (char[][] board)
   * @return spot (int[])
   * 
   *         Inside the function
   *         1. Asks the user: - pick a row and column number:
   *         2. Check if the spot is taken. If so, let the user choose again.
   *         3. Return the row and column in an int[] array.
   * 
   */
  public static int[] askUser(char[][] board) {
    int row, col;

    while (true) {
      System.out.print("\tPick a row and column number: ");
      row = scan.nextInt();
      col = scan.nextInt();

      if (board[row][col] != 'X' && board[row][col] != 'O') {
        break;
      }
    }

    return new int[] { row, col };
  }

  /**
   * Task 6 - Write a function that determines the winner
   * Function name - checkWin
   * 
   * @param board (char[][])
   * @return count (int)
   * 
   *         Inside the function:
   *         1. Make a count variable that starts at 0.
   *         2. Check every row for a straight X or straight O (Task 7).
   *         3. Check every column for a straight X or straight O (Task 8).
   *         4. Check the left diagonal for a straight X or straight O (Task 9).
   *         5. Check the right diagonal for a straight X or straight O (Task 10).
   */
  public static int checkWin(char[][] board) {
    int count = 0;
    // Check row for straight X/O
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j] == 'X') {
          count++;
        } else if (board[i][j] == 'O') {
          count--;
        }
      }

      if (count == 3 || count == -3) {
        return count;
      } else {
        count = 0;
      }
    }

    // Check column for straight X/O
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[j][i] == 'X') {
          count++;
        } else if (board[j][i] == 'O') {
          count--;
        }
      }

      if (count == 3 || count == -3) {
        return count;
      } else {
        count = 0;
      }
    }

    for (int i = 0; i < board.length; i++) {
      if (board[i][i] == 'X') {
        count++;
      } else if (board[i][i] == 'O') {
        count--;
      }
    }

    if (count == 3 || count == -3) {
      return count;
    } else {
      count = 0;
    }

    for (int i = board.length - 1; i >= 0; i--) {
      if (board[i][i] == 'X') {
        count++;
      } else if (board[i][i] == 'O') {
        count--;
      }
    }

    return count;
  }

  // public static boolean bfs(char[][] board, int row, int col, char turn) {

  // if (col + 1 <= 2) {
  // boolean right = bfs(board, row, col + 1, turn);
  // if (right) {
  // return true;
  // }
  // }

  // if (col - 1 >= 0) {
  // boolean left = bfs(board, row, col - 1, turn);
  // if (left) {
  // return true;
  // }
  // }

  // if (row + 1 <= 2 && col + 1 <= 2) {
  // boolean diagonalRight = bfs(board, row + 1, col + 1, turn);
  // if (diagonalRight) {
  // return true;
  // }
  // }

  // if (row - 1 >= 0 && col - 1 >= 2) {
  // boolean diagonalLeft = bfs(board, row - 1, col - 1, turn);
  // if (diagonalLeft) {
  // return true;
  // }
  // }

  // return board[row][col] == turn;
  // }

}
