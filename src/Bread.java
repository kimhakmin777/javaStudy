public class Bread {

    public static void main(String[] args) {
        D s1=new D("피자",1500,300 , 12);

        System.out.println(s1.print());

        D s2=new D("야채",1200,200, 10);


        System.out.println(s2.print());
    }
}
class D {
    String name;
    int hp;
    int mp;
    int LV;

    //생성자
    D(String _name,int _hp, int _mp, int _LV){
        name=_name;
        hp=_hp;
        mp=_mp;
        LV= _LV;
    }

    String print(){
        return String.format("%dhp %dmp %dLV %s의 스킬 :스킬을 사용합니다!",hp,mp,LV,name);
    }
}

//생성자
//B(String _name,int _price){
//        name=_name;
//        price=_price;
//    } 식으로 사용하면됨
//
//        s2.name= "야채";
//        s2.price=1000; 이걸 생략이 가능해짐