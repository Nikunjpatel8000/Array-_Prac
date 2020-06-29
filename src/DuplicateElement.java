public class DuplicateElement {


    static  int [] arr = new int [] {2,3,4,5,6,7,7,8,8,9,2,3,};//Initialize value of  array

    public static void main(String[] args) {//static & main method

        System.out.println("Duplicate Value Is = ");//print the value of string
        for(int i = 0; i < arr.length; i++) {//for loop use for find the duplicate values of array
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);//print of array value
            }
        }

    }


}
