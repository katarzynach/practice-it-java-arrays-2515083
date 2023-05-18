import java.util.Arrays;

public class App {
  
  public static void printTriangle(Object[] arr) {
        for (int i=0; i<arr.length; i++){
            Arrays.stream(Arrays.copyOfRange(arr, 0, i+1)).forEach(System.out::print);
            System.out.println();
        }
      System.out.println();
 }

    public static void printTriangle_v2(Object[] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(arr[col]);
            }
            System.out.println();
        }
        System.out.println();
    }
    
  public static void main(String args[]) {
    printTriangle(new Integer[] {1, 2, 3, 4});
    printTriangle(new Character[] {'A', 'B', 'C', 'D', 'E'});
    printTriangle(new String[] {});
    printTriangle(new String[] {"Hello"});
    printTriangle(new String[] {"Hello", "There", "Friend"});
  }
}