 import java.util.Scanner;
 public class find{
     void evenorodd(int num)
     {
       if(num%2==0){
        System.out.print("even");
       }
       else{
        System.out.print("odd");
       }
     }




    public static void main(String args[])
    {
        Scanner a= new Scanner(System.in);
        int number =a.nextInt();
        find b= new find();
        b.evenorodd(number);
    }
 }