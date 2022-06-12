package forTest;

public class NestedForExample{

    public static void main(String[] args){
        for(int x=1;x<=7;x++){
            for(int y=1;y<=x;y++){
                System.out.print("* ");
            }
            //new line when the inner loop is executed completely
            System.out.println();
        }
    }
}
/*

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *

 */

