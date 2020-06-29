public class Contain_Value_Find {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5,6,7,8,9,10};
        int toFind = 9;
        boolean found = false;//local and nonstatic variable

        for (int n : num) {//for loop use for find value is true or false
            if (n == toFind) {
                found = true;
                break;
            }
        }
        if(found)//if else condition use for value find or not
            System.out.println("Find Value Is = " + toFind);//string concatenation
        else
            System.out.println("Not Find Value Is = " + toFind);//string concatenation
    }
}
