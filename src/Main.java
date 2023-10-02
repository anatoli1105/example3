public class Main {
    int x;
    int y;
    public Integer sumNumbersClas(int x,int y){
        return x+y;

    }

    public static void main(String[] args) {
        int firstNumber=4;
        int secondNumber=5;
        Main sumNumbers=new Main();
        System.out.println(sumNumbers.sumNumbersClas(firstNumber,secondNumber));

    }
}