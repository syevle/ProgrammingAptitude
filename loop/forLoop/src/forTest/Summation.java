package forTest;

public class Summation {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        /*
         *  Using for-each loop to add each number and
         *  Store it in the sum variable
         */

        for (int obj: arr){
            sum = sum + obj;
        }
        System.out.println("The total of first 10 natural number:" +sum);
    }

}
