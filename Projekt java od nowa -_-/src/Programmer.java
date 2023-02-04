class Programmer extends Employee {
    public String[] technologies;

    public Programmer(int id, String name, int salary, int accuracy, int punctuality, int risk, String[] technologies) {
        super(id, name, salary, accuracy, punctuality, risk);
        this.technologies = technologies;
    }

    public String[] getTechnologies() {
        return technologies;
    }
}