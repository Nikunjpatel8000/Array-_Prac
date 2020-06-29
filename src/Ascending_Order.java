public class Ascending_Order {

    public static void main(String[] args) {//static & main method
        //Initialize values of array
        int[] arr = new int[]{5, 2, 8, 7, 1};//int values
        int temp = 0;

        System.out.println("Enter Value Is = ");//string values print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //for loop use for array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();//new line
        //Displaying elements of array after sorting
        System.out.println("Enter Value Is Ascending = ");//print the string value
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");//print the array value
        }
    }
}
