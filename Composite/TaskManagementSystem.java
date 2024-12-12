public class TaskManagementSystem {
    public static void main(String[] args) {
        SimpleTask task1 = new SimpleTask("Design", "Design the project architecture", 5);
        SimpleTask task2 = new SimpleTask("Coding", "Implement the project features", 10);
        SimpleTask task3 = new SimpleTask("Java", "Learn Java", 7);

        CompositeTask project = new CompositeTask("Project", "Complete the project");
        project.addTask(task1);
        project.addTask(task2);

        System.out.println("Total estimated time for project: " + project.getEstimatedTime() + " hours"); // Output: 15 hours

        CompositeTask project2 = new CompositeTask("Project 2", "Complete all the courses");
        project2.addTask(task3);
        project2.addTask(project);

        System.out.println("Total estimated time for project2: " + project2.getEstimatedTime() + " hours"); // Output: 22 hours
    }
}