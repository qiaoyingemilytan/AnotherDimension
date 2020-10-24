public class ArrayOps{
  public static int sum(int[] arr){
    int total = 0;
    for(int i = 0; i < arr.length; i++){
      total += arr[i];
    }
    return total;
  }

  public static int largest(int[] arr){
    int greatest = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > greatest){
        greatest = arr[i];
      }
    }
    return greatest;
  }

  public static int[] sumRows(int[][] matrix){
    int[] sums = new int[matrix.length];
    for(int i = 0; i < matrix.length; i++){
      sums[i] = sum(matrix[i]);
    }
    return sums;
  }

  public static int[] largestInRows(int[][] matrix){
    int[] largests = new int[matrix.length];
    for(int i = 0; i < matrix.length; i++){
      largests[i] = largest(matrix[i]);
    }
    return largests;
  }

  public static int sum(int[][]arr){
    return sum(sumRows(arr));
  }

  public static int[] sumCols(int[][] matrix){
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[] columnSums = new int[cols];
    for(int i = 0; i < cols; i++){
      int sums = 0;
      for(int j = 0; j < rows; j++){
        sums += matrix[j][i];
      }
      columnSums[i] = sums;
    }
    return columnSums;
  }

  public static boolean isRowMagic(int[][] matrix){
    int[] sumArray = sumRows(matrix);
    boolean same = true;
    for(int i = 0; i< sumArray.length-1; i++){
      if(sumArray[i] != sumArray[i+1]){
        same = false;
      }
    }
    return same;
  }

}
