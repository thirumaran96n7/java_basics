import java.util.Scanner;

class q4{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        if(a%5==0 && a%3==0){
            System.out.print("a is divisible by both 3 nd 5");
        
        }
        else{
            System.out.print("not");
        }

    }
}