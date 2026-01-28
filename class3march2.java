class insufficentFundException extends RuntimeException{
    public insufficentFundException (String message){
        super(message);
    }
}
public class class3march2 {
    static void withdraw(double amount){
        if (amount<5000){
            throw new insufficentFundException("Withdrawal limit exceeded!");

        }
        System.out.println("withdraw");

    }
    public static void main(String[] args) {
        withdraw(4000);
    }
    
}
