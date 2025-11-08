
package bookpractices;


public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    
    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = 0.0;
        this.currentPrice = 0.0;
    }
    
    //getters 
    public String getSymbol(){
        return this.symbol;
    }
    public String getName(){
        return this.name;
    }
    public double getPreviousClosingPrice(){
        return this.previousClosingPrice;
    }
    public double getCurrentPrice(){
        return this.currentPrice;
    }
    
    //setters
    public void setSymbol(String newSymbol){
        if(newSymbol == null || newSymbol.trim().isEmpty()){
            throw new IllegalArgumentException("Symbol should not empty or null");
        }
        this.symbol = newSymbol;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setPreviousClosingPrice(double newPreviousClosingPrice){
        this.previousClosingPrice = newPreviousClosingPrice;
    }
    
    public void setCurrentPrice(double newCurrentPrice){
        this.currentPrice = newCurrentPrice;
    }
    
    public double getChangePercent(){
        double result = ((this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice) * 100;
        return result;
    }
    
    public String toString(){
        return "Symbol : " + this.symbol + " Name : " + this.name;
    }
    
}
