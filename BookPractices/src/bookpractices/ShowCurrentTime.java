
package bookpractices;


public class ShowCurrentTime {
    public static void main(String[] args){
        long totalMiliSecs = System.currentTimeMillis();
        
        long totalSecs = totalMiliSecs / 1000 ;
        long currentSecs = totalSecs % 60 ;
        
       // int currentMiliSecs = totalMiliSecs % 1000;
        
        long totalMin = totalSecs / 60;
        long currentMin = totalSecs % 60;
        
        long totalHour = totalMin / 60;
        long currentHour = totalHour % 24;
        
        System.out.println("Current Time is " + currentHour + " : " + currentMin + " : " + currentSecs );
        
    }
}
