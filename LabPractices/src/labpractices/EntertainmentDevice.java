/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpractices;

/**
 *
 * @author shohe
 */
public abstract class EntertainmentDevice extends Device {
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    
    
    public void increaseVolume(){
        System.out.println("Volume is increasing");
    }
    
    public void decreaseVolume(){
        System.out.println("Volume is decreasing");
    }
    
    public abstract void playContent();
}
