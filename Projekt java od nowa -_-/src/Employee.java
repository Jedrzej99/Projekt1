import java.util.Random;

class Employee {
    public int id;
    public String name;
    public int salary;
    public int accuracy;
    public int punctuality;
    public int risk;

    public Employee(int id, String name, int salary, int accuracy, int punctuality, int risk) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.accuracy = accuracy;
        this.punctuality = punctuality;
        this.risk = risk;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getPunctuality() {
        return punctuality;
    }

    public int getRisk() {
        return risk;
    }
}
