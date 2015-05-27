package subway;

public class Station
{
    private String name;
    private String status;
    
    public Station(String name) {
        this.name = name;
        this.status = "on";
    }
    
    public String getName() {
        return name;
    }
    
    public boolean equals(Object obj) {
        if (obj instanceof Station) {
            Station otherStation = (Station) obj;
            if (otherStation.getName().equalsIgnoreCase(name))
            {
                return true;
            }
        }
        return false;
    }
    
    public int hashCode() {
        return name.toLowerCase().hashCode();
    }
    
    public String getStatus(){
    	return status;
    }
    
    public void setStatus(String new_status){
    	status = new_status;
    }
}
