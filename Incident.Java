public class Incident{
    private static int count =0;
    private int ID;
    private string Location;
    public enum string Type{"Medical","Fire","Traffic","Other"};
    public enum int Severity{1,2,3,4,5};
    private enum string Status{"Waiting","Dispacthed"};


    private setID(int count,int ID){
        count += 1;
        this.ID = count;
    }
    private SetLocation(string Location){
        this.Location = Location;
    }
    private setType(string Type){
        this.Type = Type
    }
    private setSeverity(int Severity){
        this.Severity = Severity
    }
    private setStatus(string Status){
        this.Status = "Waiting"
    }
    public adjustStatus(string Status){
        this.Status ="Dispatched"
    }
    
}
