public class Study444 {
    public static void main(String[] args) {
        Auser a1=new Auser("학민",50);
        System.out.println(a1.toString());
        Buser b1=new Buser("학민",50,50);
        System.out.println(b1.toString());
    }
}
class Auser {
    protected String name;
    protected int hp;
    public Auser(String name,int hp){
        this.name=name;
        this.hp=hp;
    }
    @Override
    public String toString() {
        return "Auser{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
class Buser extends Auser{//자식 클래스
    private int mp;

    public Buser(String name,int hp,int mp) {
        super(name, hp);
        this.mp = mp;
    }

    @Override
    public String toString() {
        return "Buser{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                "mp=" + mp +
                '}';
    }
}
// 출력으 반환하는게 toString
//extends 상속 받는다 의미 중요
//super(); 상속 할떄 이거쓰면 쉽게 하기 가능
//protected 상속시만 사용가능한 접근제어자
//오버 로딩 오버 라이딩 차이점 알기