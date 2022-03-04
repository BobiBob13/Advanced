package Person;

public class Employee {
    private String name;
    private Integer age;
    private String email;
    private Double salary;
    private String position;
    private String department;


    public Employee(String name, Integer age, String email, Double salary,
                    String position, String department) {
       this(name, salary, position, department);
        this.age = age;
        this.email = email;

    }

    public Employee(String name, String email, Double salary,
                    String position, String department) {
        this(name, salary, position, department);
        this.email = email;


    }

    public Employee(String name, Integer age, Double salary,
                    String position, String department) {
        this(name, salary, position, department);
        this.age = age;


    }

    public Employee(String name, Double salary,
                    String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = "n/a";
        this.age = -1;
    }

}
