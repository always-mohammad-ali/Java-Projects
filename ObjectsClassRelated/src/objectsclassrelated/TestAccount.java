
package objectsclassrelated;


public class TestAccount {
    public static void main(String[] args){
        Account acc1 = new Account(235321, 500);
       System.out.println(acc1.toString()); 
        Account acc2 = new Account(54321, 1000);
        System.out.println(acc2.toString());
        
        System.out.println("AFTER ADDING credit");
        acc1.credit(5000);
        System.out.println(acc1.toString());
        acc1.debit(20000);
        System.out.println(acc1.toString());
    }
}
