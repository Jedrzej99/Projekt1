import java.util.Random;

class Client {
    public String name;
    public String type;
    public int delayPaymentChance;
    public int avoidPenaltyChance;
    public int faultyProjectConsequence;
    public int nonPaymentChance;

    public Client(String name, String type) {
        this.name = name;
        this.type = type;

        if (type.equals("Laid-back")) {
            this.delayPaymentChance = 30;
            this.avoidPenaltyChance = 20;
            this.faultyProjectConsequence = 0;
        } else if (type.equals("Demanding")) {
            this.delayPaymentChance = 0;
            this.avoidPenaltyChance = 0;
            this.faultyProjectConsequence = 50;
        } else if (type.equals("skrwiel")) {
            this.delayPaymentChance = 30;
            this.avoidPenaltyChance = 5;
            this.faultyProjectConsequence = 100;
            this.nonPaymentChance = 1;
        } else {

            this.delayPaymentChance = 0;
            this.avoidPenaltyChance = 0;
            this.faultyProjectConsequence = 50;
        }
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isLatePayment() {
        Random rand = new Random();
        int chance = rand.nextInt(100);
        return chance < delayPaymentChance;
    }

    public boolean canAvoidPenalty() {
        Random rand = new Random();
        int chance = rand.nextInt(100);
        return chance < avoidPenaltyChance;
    }

    public boolean isFaultyProjectDetected() {
        Random rand = new Random();
        int chance = rand.nextInt(100);
        return chance < faultyProjectConsequence;
    }

    public boolean isNonPayment() {
        Random rand = new Random();
        int chance = rand.nextInt(100);
        return chance < nonPaymentChance;
    }
}

