import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int funds = 10000;
    static int employeeCount = 0;
    static ArrayList<Project> projects = new ArrayList<>();
    static Random rand = new Random();

    public static void main(String[] args) {
        generateProjects();
        while (true) {
            System.out.println("Funds: " + funds);
            System.out.println("Employees: " + employeeCount);
            System.out.println("Projects: ");
            for (int i = 0; i < projects.size(); i++) {
                System.out.println((i + 1) + ": " + projects.get(i).name);
            }
            System.out.println("Choose an action: ");
            System.out.println("1: Hire an employee");
            System.out.println("2: Take a project");
            System.out.println("3: Quit");
            Scanner sc = new Scanner(System.in);
            int action = sc.nextInt();
            switch (action) {
                case 1:
                    hireEmployee();
                    break;
                case 2:
                    takeProject();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid action");
                    break;
            }
        }
    }

    public static void generateProjects() {
        projects.add(new Project("Project 1", 1, 1, 1, 1, 1, 1, "Client 1", 7, 2000, 2000, "Easy"));
        projects.add(new Project("Project 2", 1, 2, 1, 2, 1, 2, "Client 2", 14, 5000, 5000, "Medium"));
        projects.add(new Project("Project 3", 2, 3, 3, 2, 1, 1, "Client 3", 21, 10000, 10000, "Complex"));
    }

    public static void hireEmployee() {
        employeeCount++;
        funds -= 1000;
    }

    public static void takeProject() {
        System.out.println("Enter the number of the project you want to take: ");
        Scanner sc = new Scanner(System.in);
        int projectNumber = sc.nextInt();
        if (projectNumber < 1 || projectNumber > projects.size()) {
            System.out.println("Invalid project number");
            return;
        }
        Project project = projects.get(projectNumber - 1);
        if (employeeCount < project.requiredEmployees) {
            System.out.println("Not enough employees to take this project");
            return;
        }
        funds += project.price;
        employeeCount -= project.requiredEmployees;
        projects.remove(projectNumber - 1);
        System.out.println("Project taken");
    }
}