public class Task {
    private int taskID;
    private String title;
    private String description;
    private boolean status;
    public Task(){
        taskID=0;
        title="";
        description="";
        status=false;
    }
    public Task(int id,String t,String d){
       this.taskID=id;
       this.title=t;
       this.description=d;
       this.status=false;
    }
    public int getTaskID() {
        return taskID;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public boolean isCompleted() {
        return status;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String d) {
        this.description = d;
    }

    public void markAsDone(){

        this.status=true;
    }
}
