public class Solution{
  public static void main(String[] args)
  {
    int[][] solution = EightQueensProblem.solve();

    for (int[] row : solution){
      for (int col : row){
        System.out.print(col + "   ");
      }
      System.out.println("\n");
    }
  }
}
