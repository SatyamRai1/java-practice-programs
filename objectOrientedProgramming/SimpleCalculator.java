public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }


    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }
    public double getSubtractionResult(){
        return firstNumber-secondNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }
    public double getDivisionResult(){
        if(secondNumber==0){
            return 0;
        }else{
            return firstNumber/secondNumber;
        }
    }
}



/*
public class Main {
    public static void main(String[] args) {
        SimpleCalculator simp= new SimpleCalculator();
        simp.setFirstNumber(10);
        simp.setSecondNumber(5);

        System.out.println(simp.getAdditionResult());
        System.out.println(simp.getSubtractionResult());
        System.out.println(simp.getMultiplicationResult());
        System.out.println(simp.getDivisionResult());



    }
}

*/
