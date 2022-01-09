/**
 * Runnable
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
