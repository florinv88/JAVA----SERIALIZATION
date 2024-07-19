import java.io.Serializable;

public class Cat implements Serializable {

    private final static long serialVersionUID = 1L;

    private String name;
    private transient int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
