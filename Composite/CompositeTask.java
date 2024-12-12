import java.util.ArrayList;
import java.util.List;

public class CompositeTask implements Task {
    private final String name;
    private final String description;
    private final List<Task> tasks;

    public CompositeTask(String name, String description) {
        this.name = name;
        this.description = description;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getEstimatedTime() {
        int time = 0;
        for (Task task: tasks) {
            time += task.getEstimatedTime();
        }
        return time;
    }
}
