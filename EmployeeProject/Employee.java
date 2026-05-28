package EmployeeProject;

public class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        setName(name);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Ошибка: имя не должно быть пустым");
            return;
        }

        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            System.out.println("Ошибка: зарплата не может быть отрицательной");
            return;
        }

        this.salary = salary;
    }

    public void increaseSalary(int amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: сумма повышения должна быть больше 0");
            return;
        }

        salary += amount;
    }

    public void info() {
        System.out.println("Имя: " + getName());
        System.out.println("Зарплата: " + getSalary());
    }

    public void work() {
        System.out.println(getName() + " работает");
    }
}