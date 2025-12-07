
package labpractices;


 class MethodOverLoading {
    private int num1;
    private int num2;
    
    public MethodOverLoading(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public static int add(int n1, int n2){
        return n1 + n2;
    }
    public static double add(double n1, double n2){
        return n1 + n2;
    }
    
    public static int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
}
