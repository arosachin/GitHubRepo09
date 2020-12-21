public class ArrayClass {

    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 30};

        displayArray(arr);
        modifyArray(arr);
        displayArray(arr);

    }

    public static void modifyArray(int[] arrays) {
        arrays[0] = 786;
    }

    public static void displayArray(int[] arrays) {
        System.out.println("Array is : ");

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("arr[" + i + "] = " + arrays[i]);
        }
        System.out.println();
    }


 }

