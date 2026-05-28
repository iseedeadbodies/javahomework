package EmployeeProject;

public class Designer extends Employee {

    private String designTool;

    public Designer(String name, int salary, String designTool) {
        super(name, salary);
        setDesignTool(designTool);
    }

    public String getDesignTool() {
        return designTool;
    }

    public void setDesignTool(String designTool) {
        if (designTool == null || designTool.isEmpty()) {
            System.out.println("Ошибка: инструмент дизайна не должен быть пустым");
            return;
        }

        this.designTool = designTool;
    }

    @Override
    public void info() {
        System.out.println("Designer");
        System.out.println("Имя: " + getName());
        System.out.println("Зарплата: " + getSalary());
        System.out.println("Инструмент дизайна: " + getDesignTool());
    }

    @Override
    public void work() {
        System.out.println(getName() + " делает дизайн в " + getDesignTool());
    }
}