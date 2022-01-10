/**
 * Runnable
 * 과제1) Runnable 인터페이스를 상속받은 Human 클래스를 만드시오. (기본)
과제2) class Animal 을 만들고 멤버변수 name과 location을 private로 지정하고 getter와 setter를 만드시오. location 은 land, sea, air 만 입력 할 수 있도록 하시오.(심화)
과제3) Speak 인터페이스에 silent와 loud 기능을 만들고 Human class에 implements 하시오. Tiger class를 만들고 객체를 생성한 후 부모 클래스인 Animal class로 변수를 받으시오.(심화
 */
public interface Runnable {
    final int speed = 10;

    public void type(String type);

}

interface Speak {
    public void silent();

    public void loud();
}

class Human implements Runnable, Speak {

    private String name;

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void type(String type) {
        System.out.println("종은 " + type + "입니다.");

    }

    public void speed() {
        System.out.println("속도는 " + speed + "입니다.");
    }

    @Override
    public String toString() {
        return "Human [name=" + name + "]";
    }

    @Override
    public void silent() {
        System.out.println("조용!");

    }

    @Override
    public void loud() {
        System.out.println("울어!");

    }

}

class Test {
    public static void main(String[] args) {
        Human h = new Human();

        h.setName("bumseok");
        h.type("인간");
        h.speed();
        ;
        h.silent();
        System.out.println(h);
    }
}
