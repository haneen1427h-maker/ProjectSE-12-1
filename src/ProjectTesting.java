public class ProjectTesting {
    public static void main(String[] args) {
        System.out.println("====== STARTING SYSTEM TESTING ======");

        // 1. User Class Testing
        System.out.println("\n[Testing User Class...]");
        User user = new User(101, "Haneen", "haneen@example.com");
        if(user.getUserID() == 101 && user.getName().equals("Haneen")) {
            System.out.println("-> User Creation Test: PASSED");
        } else {
            System.out.println("-> User Creation Test: FAILED");
        }

        // 2. Unit Testing: Task Class
        System.out.println("\n[Unit Testing: Task Class...]");
        Task task1 = new Task(1, "Study SE", "Review testing phase documentation");

        // Check initial status (should be false)
        if (!task1.isCompleted()) {
            System.out.println("-> Initial Status Test (false): PASSED");
        }

        // Check markAsDone() method
        task1.markAsDone();
        if (task1.isCompleted()) {
            System.out.println("-> markAsDone() Method Test: PASSED");
        } else {
            System.out.println("-> markAsDone() Method Test: FAILED");
        }

        // 3. Integration Testing: TaskManager Class
        System.out.println("\n[Integration Testing: TaskManager Class...]");
        TaskManager manager = new TaskManager();

        // Check addTask()
        Task task2 = new Task(2, "Fix Dashboard", "Update the UI charts");
        manager.addTask(task2);
        if (manager.getTasks().size() == 1) {
            System.out.println("-> addTask() Integration Test: PASSED");
        }

        // Check editTask() - [تم تصحيح الخطأ هنا بوضع الأقواس الصحيحة جافا]
        manager.editTask(2, "Fix Dashboard Layout", "New Description");
        if (manager.getTasks().get(0).getTitle().equals("Fix Dashboard Layout")) {
            System.out.println("-> editTask() Integration Test: PASSED");
        } else {
            System.out.println("-> editTask() Integration Test: FAILED");
        }

        // Check deleteTask()
        manager.deleteTask(2);
        if (manager.getTasks().isEmpty()) {
            System.out.println("-> deleteTask() Integration Test: PASSED");
        } else {
            System.out.println("-> deleteTask() Integration Test: FAILED");
        }

        System.out.println("\n====== ALL TESTS COMPLETED ======");
    }
}



