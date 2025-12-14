
package labpractices;


public class SmartTV extends EntertainmentDevice implements Connectable {
   private int channel;
   private String[] applist;

    public SmartTV() {
    }

    public SmartTV(int channel, String[] applist, int volume) {
        super(volume);
        this.channel = channel;
        this.applist = applist;
    }
    
    public void changeChannel(int newChannel){
        
    }
    
    public void launchApp(String appName){
        
    }
    
    public String getStatus(){
        System.out.println("Smart tv: " + this.channel);
    }
    
    public void playContent(){
        System.out.println("Content is playing");
    }
    
    public void connectToWifi(){
        System.out.println("Yes it is connected");
    }
    
    public String getConnectionStatus(){
        return "yeah connection status okay";
    }
   
    
   
}
