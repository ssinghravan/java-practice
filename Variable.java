 public class  Variable {
static int c=0;
int hello=5;
public void counter()
{
    int local =10;
    c++;
    hello++;
    System.out.println("Local" + local);
    System.out.println("static" + c);
    System.out.println("instance" + hello);

}

public static void main (String[]ar){
    Variable s1= new Variable();
    s1.counter();
    Variable s2= new Variable();
    s2.counter();
    Variable s3= new Variable();
    s3.counter();
   

       
        System.out.println("static" + c);
        System.out.println(" instance" + s3.hello);

    }

    
}
