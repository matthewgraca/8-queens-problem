package com.mgraca.app;

public class EightQueensProblem 
{
  // if all queens are placed, return true
  // place queen in first available column
  // mark places rendered invalid by queens placement
  // move ot next row
  public static boolean solve(){
    return true;
  }

  /**
   * Determines if a collision will occur between any queens on the board
   * @param board the board containing the queens (0 open, 1 queen)
   * @return true if a collision will occur, false if not
   */
  public static boolean collisionFound(int[][] board){
    int n = board.length;
    for (int row = 0; row < n; row++){
      for (int col = 0; col < n; col++){
        if (board[row][col] == 1){
          if (rowCollisionFound(board, row, col) ||
              columnCollisionFound(board, row, col) ||
              diagonalCollisionFound(board, row, col))
          {
            return true;
          }
        }
      }
    }
    return false;
  }

  /**
   * Determines if there will be a collision between queens on the row
   * @param board the board containing the queens (0 open, 1 queen)
   * @param row   the row containing the queen being checked
   * @param col   the column containing the queen being checked
   * @return false if the queen doesn't collide, true if she does
   */
  private static boolean rowCollisionFound(int[][] board, int row, int col){
    int n = board.length;
    for (int a = 0; a < n; a++){
      if (a != col && board[row][a] == 1){
        return true;
      }
    }
    return false;
  }

  /**
   * Determines if there will be a collision between queens on the column 
   * @param board the board containing the queens (0 open, 1 queen)
   * @param row   the row containing the queen being checked
   * @param col   the column containing the queen being checked
   * @return false if the queen doesn't collide, true if she does
   */
  private static boolean columnCollisionFound(int[][] board, int row, int col){
    int n = board.length;
    for (int b = 0; b < n; b++){
      if (b != row && board[b][col] == 1){
        return true;
      }
    }
    return false;
  }

  /**
   * Determines if there will be a collision between queens on the diagonals
   * @param board the board containing the queens (0 open, 1 queen)
   * @param row   the row containing the queen being checked
   * @param col   the column containing the queen being checked
   * @return false if the queen doesn't collide, true if she does
   */
  private static boolean diagonalCollisionFound(int[][] board, int row, int col){
    int n = board.length;
    int i, j;

    // check northeast diagonal
    for (i = row-1, j = col+1; i - 1 >= 0 && j + 1 < n; i--, j++){
      if (board[i][j] == 1){
        return true;
      }
    }

    // check northwest diagonal
    for (i = row-1, j = col-1; i - 1 >= 0 && j - 1 >= 0; i--, j--){
      if (board[i][j] == 1){
        return true;
      }
    }

    // check southeast diagonal
    for (i = row+1, j = col+1; i + 1 < n && j + 1 < n; i++, j++){
      if (board[i][j] == 1){
        return true;
      }
    }

    // check southwest diagonal
    for (i = row+1, j = col-1; i + 1 < n && j - 1 >= 0; i++, j--){
      if (board[i][j] == 1){
        return true;
      }
    }
    return false;
  }
}
