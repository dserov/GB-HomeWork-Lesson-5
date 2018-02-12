/**
 * класс Сотрудник
 *
 * @author DSerov
 * @version dated 09 feb, 2018
 * @link https://github.com/dserov/GB-HomeWork-Lesson-5/
 */
public class Person {
    /**
     * ФИО
     */
    private String name;
    /**
     * Должность
     */
    private String position;
    /**
     * Электронная почта
     */
    private String email;
    /**
     * Телефон
     */
    private String phone;
    /**
     * Зарплата
     */
    private double salary;
    /**
     * Возраст
     */
    private int age;

    /**
     * @param name фио
     * @param position должность
     * @param email емаил
     * @param phone телефон
     * @param salary зарплата
     * @param age возраст
     */
    public Person(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FIO = ");
        builder.append(name);
        builder.append(", Position = ");
        builder.append(position);
        builder.append(", Email = ");
        builder.append(email);
        builder.append(", Phone = ");
        builder.append(phone);
        builder.append(", Salary = ");
        builder.append(salary);
        builder.append(", Age = ");
        builder.append(age);
        return builder.toString();
    }
}
