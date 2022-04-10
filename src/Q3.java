public class Q3 {
    public static void main(String[] args) {

        //Write a Java program to print the following grid.
        //- - - - - - - - - -
        //- - - - - - - - - -
        //- - - - - - - - - -
        //- - - - - - - - - -
        //- - - - - - - - - -
        //- - - - - - - - - -
        //- - - - - - - - - -
        //- - - - - - - - - -
        //- - - - - - - - - -
        //- - - - - - - - - -

        int[][] arr=new int[10][10];

        for (int i = 0; i <10 ; i++)
        {
            for (int j = 0; j <10 ; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
