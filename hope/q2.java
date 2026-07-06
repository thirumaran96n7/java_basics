import java.util.Scanner;

class q2{
    public static void main(String args[]){
        Scanner add=new Scanner(System.in);
        int a = add.nextInt();
        int b = add.nextInt();
        int c = add.nextInt();
        int d= a*b*c;
        int e = a+b+c;
        System.out.print(d/e);
    }
}
