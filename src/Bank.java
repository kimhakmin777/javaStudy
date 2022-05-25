public class Bank {
    public static void main(String[] args) {
        BBank b1=new BBank(100000);
        am.a(b1,7000);
        am.check(b1);
    }
}
class BBank{
    private int money;
    public BBank(int money){
        this.money=money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}


class am{
    public static void check(BBank plus){
        System.out.printf("현재 잔액은:%d\n",plus.getMoney());

    }

    public static void a(BBank plus,int b){
        int c=plus.getMoney();
        plus.setMoney(c+b);
    }
}