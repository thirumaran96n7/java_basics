import java.util.Scanner;

class ifelse{
    public static void main(String args[]){
    Scanner boo = new Scanner(System.in);
    boolean rain=boo.nextBoolean(); 
    if(rain){
        System.out.println("take an umberlla");
    }    
    else{
        System.out.print("no need");
    }
    }
}