
package finallabpractices;


public class Quiz {
    private int id;
    private int mark;

    public Quiz(int id, int mark) {
        this.id = id;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
    public void displayOutput(){
        System.out.println("ID : " + this.id + " Mark : " + this.mark);
    }
}
