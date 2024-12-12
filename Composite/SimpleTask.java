public class SimpleTask implements Task {
    private final String name;
    private final String description;
    private final int estimatedTime;

    public SimpleTask(String name, String description, int estimatedTime) {
        this.name = name;
        this.description = description;
        this.estimatedTime = estimatedTime;
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
        return estimatedTime;
    }
}
