import java.util.Scanner;

class q7{
    public static void main(String args[]){
      Scanner a= new Scanner(System.in);
      int b=a.nextInt();
        int[] k= new int[b];
        for(int i=0;i<b;i++){
            k[i]= a.nextInt();
        }
      int m=b/2;
      System.out.print("mid value : "+k[m]);
    }
}