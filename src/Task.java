public class Task {
    
    private String name, description;
    
    public Task(String nm, String d)
    {
        name = nm;
        description = d;   
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public boolean validate(){
        if (name == null || name.equals("") || description == null || description == ("")){
            return false;            
        }
        else
            return true;
    }
    
    public String toString() {
        return "Task:\tName:"+ name+ ", Description: " +description+ "\n==========\n";
    }
}
