import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    public School(List<Student> students, List<Teacher> teachers) {
        this.students = students;
        this.teachers = teachers;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }


    public void setTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
        totalMoneySpent += moneySpent;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }


    /**
     *
     * @return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     *
     * @param student the studento to be added
     */
    public void setStudents(Student student) {
        students.add(student);
    }
}
