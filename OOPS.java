public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);

        BankAcc myAcc=new BankAcc();
        myAcc.username="Shreyansh";
        // myAcc.password="xyz";        // We can't do this as password is private access type in BankAcc class
        myAcc.SetPass("xyz");       // We can do by making a public function(non-static) in BankAcc class to change the password and call it from here by sending the password value
        

        Book b1 = new Book();
        b1.setColor("Red");
        System.out.println(b1.Getcolor());
        b1.setPage(5);
        System.out.println(b1.GetPage());
        b1.setColor("Yellow");
        System.out.println(b1.Getcolor());

    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class BankAcc {
    public String username;
    private String password;
    public void SetPass(String pwd){
        this.password=pwd;
    }
}

class Book {
    private String color;
    private int Page;

    String Getcolor(){
        return this.color;
    }
    void setColor(String color) {
        this.color = color;
    }

    int GetPage(){
        return this.Page;
    }
    void setPage(int Page) {
        this.Page = Page;
    }
}