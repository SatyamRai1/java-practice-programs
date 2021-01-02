public class OneYearInterest {
    public static void main(String[] args) {
        double amount=10000;
        for(int i=2;i<9;i++){
            System.out.println("For rate = "+i+"% interest would be "+calculateInterest(amount,i));
        }

    }

    public static double calculateInterest(double amount, int rate){
        return (amount*rate/100);
    }
}

// to go from 8% to 1%, for loop would be  for(i=8;i>0;i--)