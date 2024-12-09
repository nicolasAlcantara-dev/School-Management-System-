public class Student {
    int id;
    String name;
    int grade;
    int feesPaid;
    int totalFess;

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

    public void updateFeesPaid(int fees) {
        this.feesPaid += fees;
    }

    public void updateTotalFess(int actualFess) {
        this.totalFess -= actualFess;
    }

    public void updateGrade(int grade) {
        this.grade = grade;
    }
}
