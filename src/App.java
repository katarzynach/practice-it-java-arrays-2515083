import java.util.Arrays;

public class App {

  public static void moveZerosToTheEnd(int[] arr) {
    int lastIndex = 0;
    for(int i=0; i<arr.length; i++){
      if(arr[i] != 0) {
        //int temp = arr[i];
        arr[lastIndex] = arr[i];
        lastIndex++;
      }
    }
    while (lastIndex < arr.length){
      arr[lastIndex] = 0;
      lastIndex++;
    }
  }

  //not recommended - creating another table
  public static int[] moveZerosToTheEndWithAnotherTable(int[] arr)
  {
    int[] result = new int[arr.length];
    int lastIndex = 0;
    for(int i =0; i<arr.length; i++){
      if(arr[i]!=0){
        result[lastIndex]=arr[i];
        lastIndex++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = new int[] {1, 1, 0, 0, 0, 1, 0};
    System.out.println(Arrays.toString(arr));
    moveZerosToTheEnd(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println();

    int[] arr2 = new int[] {0, 0, 1, 2, 3, 0, 4};
    System.out.println(Arrays.toString(arr2));
    moveZerosToTheEnd(arr2);
    System.out.println(Arrays.toString(arr2));
    System.out.println();

    int[] arr3 = new int[] {0, 0};
    System.out.println(Arrays.toString(arr3));
    moveZerosToTheEnd(arr3);
    System.out.println(Arrays.toString(arr3));
    System.out.println();

    int[] arr4 = new int[] {2, 9, 1};
    System.out.println(Arrays.toString(arr4));
    moveZerosToTheEnd(arr4);
    System.out.println(Arrays.toString(arr4));
    System.out.println();

    int[] arr5 = new int[] {0, 10, 0};
    System.out.println(Arrays.toString(arr5));
    moveZerosToTheEnd(arr5);
    System.out.println(Arrays.toString(arr5));
    System.out.println();

    int[] arr6 = new int[] {3, 0, 0};
    System.out.println(Arrays.toString(arr6));
    moveZerosToTheEnd(arr6);
    System.out.println(Arrays.toString(arr6));
    System.out.println();

    int[] arr7 = new int[] {};
    System.out.println(Arrays.toString(arr7));
    moveZerosToTheEnd(arr7);
    System.out.println(Arrays.toString(arr7));
    System.out.println();

    System.out.println("Reversing an array - v2");
    int[] arr8 = new int[] {1, 1, 0, 0, 0, 1, 0};
    System.out.println(Arrays.toString(arr8));
    System.out.println(Arrays.toString(moveZerosToTheEndWithAnotherTable(arr8)));
    System.out.println();

    int[] arr9 = new int[] {5,6,7,0,8,9,0};
    System.out.println(Arrays.toString(arr9));
    System.out.println(Arrays.toString(moveZerosToTheEndWithAnotherTable(arr9)));
    System.out.println();

  }
}