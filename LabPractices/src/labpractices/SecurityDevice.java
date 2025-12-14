
package labpractices;

public abstract class SecurityDevice extends Device{
    private boolean isArmed;

    public boolean isIsArmed() {
        return isArmed;
    }

    public void setIsArmed(boolean isArmed) {
        this.isArmed = isArmed;
    }
    
    public void armDevice(){
          System.out.println("this is armDevice");
    }
    
    public void disarmDevice(){
        System.out.println("This is disArmDevice");
    }
    
    public abstract String checkSecurity();
}
