/**
 * Runnable
 * 과제1) Runnable 인터페이스를 상속받은 Human 클래스를 만드시오. (기본)
과제2) class Animal 을 만들고 멤버변수 name과 location을 private로 지정하고 getter와 setter를 만드시오. location 은 land, sea, air 만 입력 할 수 있도록 하시오.(심화)
과제3) Speak 인터페이스에 silent와 loud 기능을 만들고 Human class에 implements 하시오. Tiger class를 만들고 객체를 생성한 후 부모 클래스인 Animal class로 변수를 받으시오.(심화
 */
public class Animal {
    private String name; // 이름
    private String location; // 지역 (land,sea,air만 가능)

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Animal [location=" + location + ", name=" + name + "]";
    }

    public void setLocation(String location) {
        if (location == "land" || location == "sea" || location == "air") {
            this.location = location;
        } else {
            // 입력이 잘못된 경우
        }

    }

}

class Tiger extends Animal {
    private int age; // 나이
    private int weight; // 무게

    public Tiger() {
    }

    public Tiger(String name, String location, int age, int weight) {
        // 무게와 나이는 유효한 값만 받겠다.
        super.setName(name);
        super.setLocation(location);
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
        if (weight > 0) {
            this.weight = weight;
        } else {
            this.weight = 0;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            this.weight = 0;
        }
    }

    @Override
    public String toString() {
        return "Tiger [age=" + age + ", weight=" + weight + "kg " + "location= " + getLocation() + " name= " + getName()
                + "]";
    }

}

class Test2 {
    public static void main(String[] args) {
        Tiger t = new Tiger("mytiger", "land", 5, 200);
        System.out.println(t);

    }
}
