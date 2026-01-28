class  rectangle {
    int l;
    int c;
    rectangle()
    {
        l=9;
        c=6;
        
    }
    rectangle(int a,int b)
    {
        l=a;
        c=b;

    }
        public void  area(){
        int k=l*c;
        System.out.println(k);
    }
}

public class class4feb{
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        rectangle r2=new rectangle( 3,5);
        r1.area();
        r2.area();

        
       
    }
}
