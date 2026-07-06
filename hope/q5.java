import java.util.Scanner;

class q5{
    public static void main(String args[]){
        Scanner n= new Scanner(System.in);
        int a=n.nextInt();
        if(a<50){
            System.out.print("You need to improve");
            
        }
        // if um use panla illana else if panla
        if(a>=50 && a<=70){
            System.out.print("good job");
        }
        if(a>70){
            System.out.print("Excellent");
        }
    }
}