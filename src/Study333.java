import java.util.Scanner;

public class Study333 {
    public static void main(String[] args) {
        People p1=new People("김학민","01098171909");
          System.out.printf("이름:%s 번호는%s",p1.getName(),p1.getNumber());
          p1.setName("학민");
          p1.setNumber("010-9817-1909");
          System.out.printf("이름:%s 번호는%s",p1.getName(),p1.getNumber());

    }
}
class People{
    private String name;
    private String number;
    public People(String name, String number){
        this.name=name;
        this.number=number;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}


//스캐너
//Scanner 변수=new Scanner(System.변수): 기본 활용법
//int a=in.nextInt():
//        String b=in.next() or nextline:
//        double c=in.nextDouble():  형마다 이렇게 사용됨
//int a=in.nextInt();
//        System.out.println(a); 사용 예시는 이렇게
//Boolean a=in.hasNextInt();
//        System.out.println(a); 이것은 트루 풜스 확인

//스캐너 예제
//int a=in.nextInt();
//        int b=in.nextInt();
//        System.out.println("나머지:"+a%b+ "몫:"+a/b);

//Test t1=new Test(); 이걸 써야됨
//        Test.n1(); 스태틱이 있으면 바로 가능
//        t1.n2(); 스태틱이 없어서 line35
//static void n1(){
//        System.out.println("난 유틸리티 메소드 에용!");
//    }
//    void n2(){
//        System.out.println("난 메소드 에용!");
//    }

//접근 제어자
//public(모두 공개),
// protected( 상속 경우만 공개),
//default (클래스에서만 공개)
//private (모두 비공개)

//스태틱 분석

//디스

//투스트링

//게터와 세터