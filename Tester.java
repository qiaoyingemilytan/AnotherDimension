public class Tester{

  public static String arrToString(int[] arr){
    String newString = "{";
    for(int i = 0; i < arr.length - 1; i++){
      newString += arr[i];
      newString += ", ";
    }
    if(arr.length > 0){
      newString += (arr[arr.length-1]);
    }
    newString += "}";
    return newString;
  }

  public static void main(String[] args){
    int[] testerArray = {3, 4, 5};
    int[][] tester2dArray = {{1, 2, 3},{4, 5, 6}, {7, 8, 9},{10, 11, 12}};

    System.out.println(ArrayOps.sum(testerArray));
    System.out.println(ArrayOps.largest(testerArray));
    System.out.println(arrToString(ArrayOps.sumRows(tester2dArray)));
    System.out.println(arrToString(ArrayOps.largestInRows(tester2dArray)));
    System.out.println(ArrayOps.sum(tester2dArray));
    System.out.println(arrToString(ArrayOps.sumCols(tester2dArray)));
    System.out.println(ArrayOps.isRowMagic(tester2dArray));
    System.out.println(ArrayOps.isColMagic(tester2dArray));
  }
}
