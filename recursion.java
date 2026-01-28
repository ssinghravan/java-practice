public class recursion {
    static int function (int n)
    {
        if(n==0){
            return 1;
        }
        else{
           
            return  n*function(n-1);
             
        }
    
    }
    public static void main(String[] args) {
        int k = function(3);
        System.out.println(k);
        
    }
    
}
