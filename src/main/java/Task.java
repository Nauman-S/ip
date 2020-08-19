
public abstract class Task {
    protected String description;
    protected boolean isDone;
    protected static int total = 0;

    public Task(String name, boolean isCompleted) {
        this.description = name;
        this.isDone = isCompleted;
        this.total ++;
    }


    public static int remainingTasks() {
        return Task.total;
    }

    public String toString() {
        return this.description;
    }

    public boolean isDone() {
        return this.isDone;
    }

    public void setDone() {
        if (!this.isDone) {
            this.total--;
        }
        this.isDone = true;
    }

    public String getSymbol() {
        return (isDone ? "[\u2713]" : "[\u2718]");
    }

    public abstract String getTaskSymbol();

}
