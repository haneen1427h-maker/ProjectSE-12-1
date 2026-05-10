import java.util.ArrayList;
public class TaskManager {
    private ArrayList<Task> tasks;
    public TaskManager() {
        tasks = new ArrayList<Task>();
    }
    public void addTask(Task t) {
        tasks.add(t);
    }
    public void deleteTask(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskID() == id) {
                tasks.remove(i);
                break;
            }
        }
    }
    public ArrayList<Task> getTasks() {
        return tasks;
    }
    public void editTask(int id, String newTitle, String newDesc) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskID() == id) {
                tasks.get(i).setTitle(newTitle);
                tasks.get(i).setDescription(newDesc);
                break;
            }
        }
    }
    public void markAsDone(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskID() == id) {
                tasks.get(i).markAsDone();
                break;
            }
        }
    }
    public void viewTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("ID: " + tasks.get(i).getTaskID());
            System.out.println("Title: " + tasks.get(i).getTitle());
            System.out.println("Done: " + tasks.get(i).isCompleted());
            System.out.println("------------");
        }
    }
}