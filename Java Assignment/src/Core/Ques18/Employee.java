package Core.Ques18;

public class Employee {
    String name;
    String city;
    int age;
    Employee (String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Name = " + name +
                ", Age = " + age +
                ", City = " + city;
    }
}
