package forTest;

public class LabeledForLoop{
    public static void main(String[] args){
        //Using Labels
        Label1:
        for(int x=1;x<=5;x++){
            Label2:
            for(int y=1;y<=4;y++){
                if(x==3&&y==2){
                    break Label1;
                }
                System.out.println(x+" "+y);
            }
        }
    }
}


