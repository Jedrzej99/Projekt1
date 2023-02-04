import java.util.ArrayList;
public class ITCompany {
    public int money;
    public int employees;
    public int projectsCompleted;
    public ArrayList<Project> projects;

    public int currentEmployeeCount;
    public int maxEmployeeCount;

    public ITCompany() {
        money = 10000;
        employees = 0;
        projectsCompleted = 0;
        projects = new ArrayList<Project>();
    }

    public void hireEmployee() {
        employees++;
        money -= 1000;
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void completeProject(Project project) {
        projects.remove(project);
        money += project.getPrice();
        projectsCompleted++;
    }

    public int getMoney() {
        return money;
    }

    public int getEmployees() {
        return employees;
    }

    public int getProjectsCompleted() {
        return projectsCompleted;
    }

}
