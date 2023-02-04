public class Project {
    public int requiredEmployees;
    public String name;
    public int frontEndDays;
    public int backEndDays;
    public int dbDays;
    public int mobileDays;
    public int wordpressDays;
    public int prestashopDays;
    public String client;
    public int deadline;
    public int penalty;
    public int price;
    public int paymentDays;
    public String complexity;

    public Project(String name, int frontEndDays, int backEndDays, int dbDays, int mobileDays, int wordpressDays, int prestashopDays,
                   String client, int deadline, int penalty, int price, int paymentDays, String complexity) {
        this.name = name;
        this.frontEndDays = frontEndDays;
        this.backEndDays = backEndDays;
        this.dbDays = dbDays;
        this.mobileDays = mobileDays;
        this.wordpressDays = wordpressDays;
        this.prestashopDays = prestashopDays;
        this.client = client;
        this.deadline = deadline;
        this.penalty = penalty;
        this.price = price;
        this.paymentDays = paymentDays;
        this.complexity = complexity;
    }

    public Project(String name, int frontEndDays, int backEndDays, int dbDays, int mobileDays, int wordpressDays, int prestashopDays, String client, int deadline, int penalty, int price, String easy) {
    }

    public String getName() {
        return name;
    }

    public int getFrontEndDays() {
        return frontEndDays;
    }

    public int getBackEndDays() {
        return backEndDays;
    }

    public int getDbDays() {
        return dbDays;
    }

    public int getMobileDays() {
        return mobileDays;
    }

    public int getWordpressDays() {
        return wordpressDays;
    }

    public int getPrestashopDays() {
        return prestashopDays;
    }

    public String getClient() {
        return client;
    }

    public int getDeadline() {
        return deadline;
    }

    public int getPenalty() {
        return penalty;
    }

    public int getPrice() {
        return price;
    }

    public int getPaymentDays() {
        return paymentDays;
    }

    public String getComplexity() {
        return complexity;
    }
}

