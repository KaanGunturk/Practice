public class Q8 {
    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

        int[] arr = {1, 2, -3, 4, -5, -6};

        for (int w :arr) {
            w*=-1;
        }
    }
}
