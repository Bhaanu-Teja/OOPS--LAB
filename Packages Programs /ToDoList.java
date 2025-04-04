import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class ToDoList {
    public static void main(String[] args) {
        PriorityQueue<Task> tasks = new PriorityQueue<>();
        tasks.add(new Task("Submit report", 2));
        tasks.add(new Task("Reply to emails", 4));
        tasks.add(new Task("Team meeting", 1));
        tasks.add(new Task("Code review", 3));

        System.out.println("Tasks by priority:");
        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }
    }
}
