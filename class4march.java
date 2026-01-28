class invalidAgeException  extends Exception{
    public invalidAgeException(String message){
        super(message);
    }
} 
public class class4march {
    static void validateAge(int age) throws invalidAgeException{
        if (age <18){
            throw new invalidAgeException("Age must be 18 or or above");

        }
        System.out.println("valid age");

    }
    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (invalidAgeException e) {
            System.out.println(" caught " + e.getMessage());
        }
    }
    
}
