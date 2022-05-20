public class Study22 {

    public static void main(String[] args) {
        C s1=new C();
        s1.name= "coke";
        s1.hp=20;
        s1.move="펀치";

        System.out.println(s1.print());
    }
}

//class
class C {
    //feild
    String name;
    int hp;
    String move;
    //method
    String print(){
        return String.format("%s이고 가격은 %d원 입니다",name,hp);
    }

}

//배열
//int [] 변수명={,,}; 이런 식으로 입력

//배열 예시
////성적표
//        double [] s= {3.56, 2.47,3.56};
//
//        System.out.println("1학년 평균 점수"+s[0]);
//        System.out.println("2학년 평균 점수"+s[1]);
//        System.out.println("3학년 평균 점수"+s[2]);
//        System.out.println((s[0]+s[1]+s[2])/3);

// 매스 함수
//System.out.println(Math.max(10,5)); 요런식으로 활용
//max는 큰거,min은 작은거, abs는 절대값, pow는 제곱

//매스 반복
//int [] arr=new int[5];
//        arr[0]=10;
//        arr[1]=20;
//        arr[2]=30;
//        arr[3]=40;
//        arr[4]=50;
//
//        for (int i=0; i<arr.length;i++){
//            System.out.println(arr[i]);

//매스 반복 예제
//int [] v=new int[10];
//
//        for (int i=0; i<v.length;i++){
//            v[i]= (int)Math.pow(2,i);
//            System.out.println(v[i]);

//class

//C s1=new C();
//        s1.name= "coke";
//        s1.price=1000;
//        s1.print();

//class
//class C {
//    //feild
//    String name;
//    int price;
//    //method
//    void print(){
//        System.out.println(name+":"+price+"");
//    }
//
//}

//class 연습
//public class Study22 {
//
//    public static void main(String[] args) {
//        C s1=new C();
//        s1.name= "coke";
//        s1.hp=20;
//        s1.move="펀치";
//        s1.print();
//
//    }
//}
//
////class
//class C {
//    //feild
//    String name;
//    int hp;
//    String move;
//    //method
//    void print(){
//        System.out.println(name+":"+hp+"hp");
//        System.out.println(move+"");
//    }
//
//}

//public class Study22 {
//
//    public static void main(String[] args) {
//        C s1=new C();
//        s1.name= "coke";
//        s1.hp=20;
//        s1.move="펀치";
//
//        System.out.println(s1.print());
//    }
//}
//

//class 다른 출력 방법
// class
//class C {
//    //feild
//    String name;
//    int hp;
//    String move;
//    //method
//    String print(){
//        return String.format("%s이고 가격은 %d원 입니다",name,hp);
//    }
//
//}