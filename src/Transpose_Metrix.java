public class Transpose_Metrix {
    public static void main(String args[]){
//First matrix
        int original[][]={{1,2,3},{1,2,3},{1,2,3}};//Initialize value of  array

//Second Matrix to store transpose the matrix
        int transpose[][]=new int[3][3];  //[3] Rows and [3] Columns

//for loop use for transpose a matrix
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                transpose[i][j]=original[j][i];
            }
        }
        System.out.println("Before Transpose Of Matrix = ");//print string value
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(original[i][j]+" ");
            }
            System.out.println();//new line
        }
        System.out.println("After Transpose Of Matrix = ");//print string value
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(transpose[i][j]+" ");//print string value
            }
            System.out.println();//new line
        }
    }

}
