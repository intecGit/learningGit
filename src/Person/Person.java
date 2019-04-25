package Person;

public abstract class Person {
    private String name;
    private int age;
    private double height;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract double payOverAMonth();

    public abstract double payOverAYear();

    public abstract double payOverALifeTime();

    @Override
    public String toString() {
        return "Person " +
                "name '" + name + '\'' +
                ", age " + age +
                ", height " + height;
    }
}
