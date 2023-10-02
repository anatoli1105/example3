public class Main {
    int x;
    int y;
    public Integer sumNumbersClas(int x,int y){
        return x+y;

    }
    public void maxNumbersClas(int x,int y){
        if(x>y){ System.out.println ("число x больше числа y");}
        else {System.out.println("\"число y больше числа x");}
    }

    public static void main(String[] args) {
        int firstNumber=4;
        int secondNumber=5;
        Main sumNumbers=new Main();
        //System.out.println(sumNumbers.sumNumbersClas(firstNumber,secondNumber));
        Main maxNumbers=new Main();
        maxNumbers.maxNumbersClas(firstNumber,secondNumber);


    }
}