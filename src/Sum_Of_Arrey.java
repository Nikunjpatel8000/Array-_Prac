public class Sum_Of_Arrey {

    public static void main(String[] args) {//static & main method
        //Initialize value of  array
        int [] arr = new int [] {1, 2, 3, 4, 5};//all value is int
        int sum = 0;
        //for Loop use for array to calculate sum of int values
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);//string concatenation
    }

}
