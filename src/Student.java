public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFess;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        feesPaid = 0;
        totalFess = 4000;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getTotalFess() {
        return totalFess;
    }

    public void payFees(int fees) {
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(this.feesPaid);
    }

    public void updateTotalFess(int actualFess) {
        this.totalFess -= actualFess;
    }

    public void updateGrade(int grade) {
        this.grade = grade;
    }

    public int getRemainingFees() {
        return totalFess = feesPaid;
    }
}
