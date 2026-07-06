 import java.util.Random;
 class wr{
    public static void main(String args[]){
        Random r=  new Random();
        int a=0;
        while (a!=7){
         a=r.nextInt(8);
         System.out.println(a);
        }
    }
 }