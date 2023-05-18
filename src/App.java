import java.util.Arrays;

public class App {

    public static Integer findSecondSmallestItem(Integer[] arr) {
        Arrays.sort(arr);
        if (arr.length <= 1) {
            return null;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                return arr[i + 1];
            }

        }
        return null;
    }

    public static Integer findSecondSmallestItem_v2(Integer[] arr) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                second = smallest;
                smallest = arr[i];
            } else if (arr[i] < second && arr[i] != smallest) {
                second = arr[i];
            }


        }
        if (second == Integer.MAX_VALUE) {
            return null;
        }
        return second;
    }

    public static void main(String args[]) {
        System.out.println("findSecondSmallestItem");
        Integer[] arr = new Integer[]{5, 8, 3, 2, 6};
        System.out.println(findSecondSmallestItem(arr));

        Integer[] arr2 = new Integer[]{3, 8, 5, 2, 6};
        System.out.println(findSecondSmallestItem(arr2));

        Integer[] arr3 = new Integer[]{6, 8, 5, 2, 3};
        System.out.println(findSecondSmallestItem(arr3));

        Integer[] arr4 = new Integer[]{3, 3, 3, 3, 3};
        System.out.println(findSecondSmallestItem(arr4));

        Integer[] arr5 = new Integer[]{3, 3, 3, 2, 3};
        System.out.println(findSecondSmallestItem(arr5));

        Integer[] arr6 = new Integer[]{3, 4, 3, 3, 3};
        System.out.println(findSecondSmallestItem(arr6));

        Integer[] arrEmpty = new Integer[]{};
        System.out.println(findSecondSmallestItem(arrEmpty));

        Integer[] arrOne = new Integer[]{1};
        System.out.println(findSecondSmallestItem(arrOne));

        //Second
        System.out.println("findSecondSmallestItem_v2");

        System.out.println(findSecondSmallestItem_v2(arr));

        System.out.println(findSecondSmallestItem_v2(arr2));

        System.out.println(findSecondSmallestItem_v2(arr3));

        System.out.println(findSecondSmallestItem_v2(arr4));

        System.out.println(findSecondSmallestItem_v2(arr5));

        System.out.println(findSecondSmallestItem_v2(arr6));

        System.out.println(findSecondSmallestItem_v2(arrEmpty));

        System.out.println(findSecondSmallestItem_v2(arrOne));
    }
}