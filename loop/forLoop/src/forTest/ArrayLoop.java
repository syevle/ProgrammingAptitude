package forTest;

public class ArrayLoop {
    public static void main(String[] args) {
        int arr[] = new int[5];

        //Initializing the array with five values as size is 5
        arr[0] = 140;
        arr[1] = 20;
        arr[2] = 260;
        arr[3] = 281;
        arr[4] = 53;

        //Printing the elements using for loop
        System.out.println("Using for-loop:");
        for(int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //Printing the elements using for-each loop
        System.out.println("Using for-each loop:");
        for(int obj: arr){
            System.out.println(obj);
        }

    }
}
