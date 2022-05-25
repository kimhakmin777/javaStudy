public class classs {
    public static void main(String[] args) {
        Player a=new Player("피가죽",50);
        Player b=new Player("라이죽",100);
        a.skill(b);
    }
}
class Player{
    String name;
    int hp;
    Player(String name, int hp){
        this.name=name;
        this.hp=hp;
    }
    void skill(Player s){
        s.hp-=10;
        System.out.printf("[%s]의 스킬\n",name);
        System.out.printf("%s의 남은 [%d] hp\n",s.name,s.hp);
    }

}
