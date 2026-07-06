import java.util.Scanner;

class q3{
    public static void main(String args[])
    {
        Scanner three = new Scanner(System.in);
        String a=three.nextLine();
        double b= three.nextDouble();
        three.nextLine();
        String c=three.nextLine();
        System.out.println("My name is "+a);
        System.out.println("My score is "+b/10+"/10");
        System.out.print("My departement is "+c);
    }
}