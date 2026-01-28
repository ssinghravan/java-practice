public class class29jan2 {
    public static void main(String[] args) {
        int a[][] = new int [4][4];
        for (int i=0;i<4;i++){
            for(int j =0 ;j<4;j++)
            {
                if(i==j){
                    System.out.print("* ");
                     
                }
                else
                {
                    System.out.print(" ");
                }
                
            }
           System.out.println();
        }
    }
    
}
