
package bookpractices;


public class TestBox {
    public static void main(String[] args){
        Box box1 = new Box(5, 1, 2);
        
        System.out.println(box1.toString()); //it is showing output of the dimension
        System.out.println("The volume equals to : " + box1.volume());
       
        box1.toString();  //doesn't showing any output, why?
        
        box1.setDim(10, 10, 10);
        System.out.println("After setting up whole new dimension: " + box1.toString()); //after setting up new dimension value. it worked-given me 1000
        System.out.println("New volume after new dimension: " + box1.volume());
        
        box1.setHeight(1);
        System.out.println("After setting up new Height: " + box1.toString());
        
        System.out.println("See/get the depth value: " + box1.getDepth());
        System.out.println("See/get the height value: " + box1.getHeight()); //man it is working
        
        Box box2 = new Box(5);
        System.out.println("The volume of cubic box: " + box2.volume());
        
        Box originalBox = new Box(1, 2, 3);
        Box goodCopy = new Box(originalBox);
        System.out.println("The volume of GoodCopy: " + goodCopy.volume());
        
        //check equality of original and goodCopy
        System.out.println("Is it equal or same: " + goodCopy.equalTo(originalBox));
        
        goodCopy.setDim(4, 5, 6);
        System.out.println("new dimension of goodCopy = " + goodCopy.toString());
        
        
        
        
    }
}
