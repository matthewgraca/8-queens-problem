package com.mgraca.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EightQueensProblemTest 
{
  @Test
  public void testSolution(){
    int[][] board = EightQueensProblem.solve();
    for (int i = 0; i < board.length; i++){
      for (int j = 0; j < board.length; j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
    assertTrue( !EightQueensProblem.collisionFound(board) && 
                EightQueensProblem.numOfQueens(board) == 8);
  }

  @Test
  public void noCollisionsSolution1(){
    int[][] board = new int[8][8];
    board[0][3] = 1;
    board[1][6] = 1;
    board[2][2] = 1;
    board[3][7] = 1;
    board[4][1] = 1;
    board[5][4] = 1;
    board[6][0] = 1;
    board[7][5] = 1;
    assertTrue(!EightQueensProblem.collisionFound(board));
  }

  @Test
  public void collisionsNoSolution1(){
    int[][] board = new int[8][8];
    board[0][2] = 1;
    board[0][3] = 1;
    board[2][2] = 1;
    board[3][2] = 1;
    board[4][2] = 1;
    board[5][5] = 1;
    board[6][5] = 1;
    board[7][5] = 1;
    assertTrue(EightQueensProblem.collisionFound(board));
  }

  @Test
  public void collisionsNoSolution2(){
    int[][] board = new int[8][8];
    board[0][0] = 1;
    board[1][4] = 1;
    board[2][1] = 1;
    board[3][5] = 1;
    board[4][2] = 1;
    board[5][6] = 1;
    board[6][3] = 1;
    board[7][7] = 1;
    assertTrue(EightQueensProblem.collisionFound(board));
  }
}
