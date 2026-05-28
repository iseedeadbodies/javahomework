package EmployeeProject;

public class Main {

    public static void main(String[] args) {

        Developer developer = new Developer("Alibek", 400000, "Java");
        Designer designer = new Designer("Amina", 350000, "Figma");
        Manager manager = new Manager("Dias", 500000, 5);

        System.out.println("Информация:");
        developer.info();
        developer.work();

        System.out.println();

        designer.info();
        designer.work();

        System.out.println();

        manager.info();
        manager.work();

        System.out.println("\nИзменение данных через setter:");

        developer.setName("Erlan");
        developer.setSalary(450000);
        developer.setProgrammingLanguage("Python");

        designer.setDesignTool("Photoshop");

        manager.setTeamSize(8);
        manager.increaseSalary(50000);

        System.out.println();

        developer.info();
        System.out.println();

        designer.info();
        System.out.println();

        manager.info();

        System.out.println("\nПроверка валидации:");

        developer.setName("");
        developer.setSalary(-1000);
        developer.setProgrammingLanguage("");

        designer.setDesignTool("");

        manager.setTeamSize(-3);
        manager.increaseSalary(-500);
    }
}
