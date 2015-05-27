package subway;

public class Connection
{
    private Station station1, station2;
    private String lineName;
    private String lineStatus;
    
    public Connection(Station station1, Station station2, String lineName)
    {
        this.station1 = station1;
        this.station2 = station2;
        this.lineName = lineName;
        this.lineStatus = "on";
    }
    
    public Station getStation1()
    {
        return station1;
    }

    public Station getStation2()
    {
        return station2;
    }

    public String getLineName()
    {
        return lineName;
    }
    
    public String toString()
    {
        return "[" + station1.getName() + ", " + station2.getName() + ", " + lineName + "]";
    }
    
    public String getLineStatus(){
    	return lineStatus;
    }
    
    public void setLineStatus(String new_status){
    	lineStatus = new_status;
    }
    
}
