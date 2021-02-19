/*
Q4 Create an Employee Class with instance variables (String) name, (Integer)age, (String)city and get the instance of the Class using constructor reference

*/
class Employee {

    String name;
    Integer age;
    String city;

    public Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

interface ConstructorReference {
    Employee createEmp(String name, Integer age, String city);
}

public class Q4 {
    public static void main(String[] args) {

        ConstructorReference cf = Employee::new;
        System.out.println(cf.createEmp("Shivam", 23, "Noida"));
    }
}