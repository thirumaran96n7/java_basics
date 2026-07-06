 public class ret{
    int sum(int a,int b)
    {
      int c= a+b;
      return c;
    }

    public static void main(String args[]){
        ret a=new ret();
        int sum= a.sum(10,20);
        System.out.print(sum);
        

    }
 }