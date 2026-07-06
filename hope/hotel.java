 public class hotel{
    int coff=20;
    int tea=10;
    
   public static void main(String args[])
   {
    //we needs sever to use coff nd tea prize default
     hotel sev1 = new hotel();
     sev1.coff=26;
     System.out.println("sir coffee rate uh "+sev1.coff);
     
     //seri avaru eppa tea rate keta 
     //so next sever create pannikalam
     hotel sev2= new hotel();
     System.out.print("sir tea rate uh "+sev2.tea);

   }
 }