public class Teacher {
    int id;
    int salary;
    String name;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        salary = 1512;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void updateSalary(int salary) {
        this.salary = salary;
    }
}
