package duke.task;

public class ToDos extends Task {
    public ToDos(String task) {
        super(task, TaskType.TODO);
    }

    @Override
    public ToDos doneTask() {
        super.done = true;
        return this;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}