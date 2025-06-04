// Kelas Pasien
public class Patient {
    private String name;
    private String condition;
    private Priority priority;

    public Patient(String name, String condition, Priority priority) {
        this.name = name;
        this.condition = condition;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Patient [Name=" + name + ", Condition=" + condition + ", Priority=" + priority.name() + "]";
    }
}