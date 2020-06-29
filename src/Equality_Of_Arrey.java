public class Equality_Of_Arrey {


    public static void main(String[] args) {
        int[] firstArray = {2, 5, 1, 7, 4};//Initialize value of  array

        int[] secondArray = {2, 5, 1, 7, 4};//Initialize value of  array

        boolean equalOrNot = true;//boolean data type use condition true or not

        if (firstArray.length == secondArray.length) {//if else condition use for elements are equal or not
            for (int i = 0; i < firstArray.length; i++) {//for loop use for value compare
                if (firstArray[i] != secondArray[i]) {
                    equalOrNot = false;
                }
            }
        } else {//elase if not equal then false
            equalOrNot = false;
        }

        if (equalOrNot) {//if else condition use for print string values
            System.out.println("Two Arrays Are Equal ");//String value print
        } else {
            System.out.println("Two Arrays Are Not equal !!!");//String value print
        }
    }

}
