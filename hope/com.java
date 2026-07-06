import java.util.Scanner;

class com{
    public static void main(String args[]){
      Scanner comp=new Scanner(System.in);
      int a=comp.nextInt();
      int b=comp.nextInt();
      if(a>b) {
        System.out.print("a is greater");
      } 
      else{
        System.out.print("b is greater");
      }
    }
}