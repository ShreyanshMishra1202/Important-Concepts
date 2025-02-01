
public class FIRE {
    public static void main(String[] args) {
        water kk=new water();
        kk.x=5;
        System.out.println(kk.x);
        kk.hh(10);
        System.out.println(kk.get());
    }
}

class water{
    public int x;
    private int y;
    public void hh(int y){
        this.y=y;
    }
    public int get(){
        return y;
    }
}
