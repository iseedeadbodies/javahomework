package EmployeeProject;

public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, int salary, int teamSize) {
        super(name, salary);
        setTeamSize(teamSize);
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        if (teamSize < 0) {
            System.out.println("Ошибка: размер команды не может быть отрицательным");
            return;
        }

        this.teamSize = teamSize;
    }

    @Override
    public void info() {
        System.out.println("Manager");
        System.out.println("Имя: " + getName());
        System.out.println("Зарплата: " + getSalary());
        System.out.println("Размер команды: " + getTeamSize());
    }

    @Override
    public void work() {
        System.out.println(getName() + " управляет командой из " + getTeamSize() + " человек");
    }
}