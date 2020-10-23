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

}
