
package bookpractices;


public class Box {
    private double width;
    private double height;
    private double depth;
    
    public Box(){
        this.width = 0.0;
        this.height = 0.0;
        this.depth = 0.0;
    }
    
    //special method constructor
    public Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    //it's for only same length dimension, like cube, just provide one value and call it.
    public Box(double len){
        this.width = len;
        this.height = len;
        this.depth = len;
    }
    
    //it's the good copy one. For copying and comparing each other like to the original;
    public Box(Box box){
        this.width = box.width;
        this.height = box.height;
        this.depth = box.depth;
    }
    
    //getters
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    
    public double getDepth(){
        return this.depth;
    }
    
    //setters
    public void setWidth(double newWidth){ 
        this.width = newWidth;
    }
    public void setHeight(double newHeight){
        this.height = newHeight; // best practice
       // height = newHeight; //it stills work without "this", how?
    }
    public void setDepth(double newDepth){
        this.depth = newDepth;
    }
    
    //set dimension
    public void setDim(double newWidth, double newHeight, double newDepth){
        this.width = newWidth;
        this.height = newHeight;
        this.depth = newDepth;
    }
    
    //for checking equality between two objects and their properties
    public boolean equalTo(Box o){
        return this.width == o.width && this.height == o.height && this.depth == o.depth;
        
    }
    
    public double volume(){
        return this.width* this.height * this.depth;  //best practice
        //return (width*height*depth); //both return line works, how? Without this, how is it possible?
    }
    
    public String toString(){
        return "Width = " + this.width + " Height = " + this.height + " Depth = " + this.depth;
    }
    
    
}
