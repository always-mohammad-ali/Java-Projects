
package labpractices;


public abstract class Device {
    private String deviceId;
    private String location;
    private boolean powerOn;

    public Device() {
        this.deviceId = "random";
        this.location = "random";
        this.powerOn = false;
    }

    public Device(String deviceId, String location, boolean powerOn) {
        this.deviceId = deviceId;
        this.location = location;
        this.powerOn = powerOn;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }
    
    public void turnOn(){
        System.out.println(this.deviceId + " is turn on");
    };
    
    public void turnOff(){
        System.out.println(this.deviceId + " is turn off");
    };
    
    public abstract String getStatus();
    
    
}
