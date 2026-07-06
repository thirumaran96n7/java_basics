 public class store{
    void soap(int money){
        System.out.println(money);
        System.out.println("soap sold");
    }
    void choco(int paise){// na ingaiyum money use pannalam
    // function ku same words use  panla but na paise use pannirukan
        System.out.println(paise);
        System.out.print("sold");
    }
    public static void main(String args[]){
        store a= new store();
        a.soap(30);
        a.choco(10);   
         }
 }