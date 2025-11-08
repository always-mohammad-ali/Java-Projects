
package bookpractices;

public class StockTest {
    public static void main(String[] args){
        Stock s1 = new Stock("Oracle Corporation", "");
        s1.setPreviousClosingPrice(34.5);
        s1.setCurrentPrice(34.35);
        
        System.out.println(s1.toString());
        System.out.println("The percentage change in price is equal to : " + s1.getChangePercent() + "%");
    }
}
