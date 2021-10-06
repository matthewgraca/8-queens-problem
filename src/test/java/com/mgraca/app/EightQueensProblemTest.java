package com.mgraca.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EightQueensProblemTest 
{
  @Test
  public void test(){
    assertTrue(true);
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
  public void collisionsNoSolution(){
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
}
