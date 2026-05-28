package EmployeeProject;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int salary, String programmingLanguage) {
        super(name, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.isEmpty()) {
            System.out.println("Ошибка: язык программирования не должен быть пустым");
            return;
        }

        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void info() {
        System.out.println("Developer");
        System.out.println("Имя: " + getName());
        System.out.println("Зарплата: " + getSalary());
        System.out.println("Язык программирования: " + getProgrammingLanguage());
    }

    @Override
    public void work() {
        System.out.println(getName() + " пишет код на " + getProgrammingLanguage());
    }
}