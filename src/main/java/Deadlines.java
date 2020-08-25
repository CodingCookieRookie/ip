public class Deadlines extends Task {
    private String by;

    Deadlines(String taskInfo , String by) {
        super(taskInfo, TaskType.DEADLINE);
        this.by = by;
    }

    public String returnTime() {
        return by;
    }

    @Override
    public Deadlines doneTask() {
        super.done = true;
        return this;
    }
    
    @Override
    public String toString() {
        return String.format("%s (by: %s)", super.toString(), this.by);
    }
}
