 public class money{
    int a_prize=20;
    int a_count=10;

    void total(){
        System.out.print(a_prize*a_count);
    }
    public static void main(String args[]){
        money a= new money();
        a.total();
    }
 }