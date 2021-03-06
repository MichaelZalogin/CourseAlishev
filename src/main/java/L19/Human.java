package L19;

public class Human {
    private int age;
    private String name;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println(this.name + " " + this.age);
    }
}

class Test {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Иван");
        human1.setAge(24);
        human1.getInfo();
        Human human2 = new Human();
        human2.setName("Петр");
        human2.setAge(29);
        human2.getInfo();
    }
}