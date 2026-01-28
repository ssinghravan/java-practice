class  outer {
    static int outer_x=10;
    int outer_y=20;
    private static int outer_private=30;
    class staticNestedClass{
        void display()
        {
            System.out.println("outer_x" + outer_x);
            System.out.println("outer_private" + outer_private);
            //System.out.println("outer_y" + outer_y);
            outer out = new outer();
            System.out.println("outer_y" + out.outer_x);
        }
    }

    
}
public class class21mar{
    public static void main(String[] args) {
        outer obj = new outer();
        outer.staticNestedClass nod = obj.new staticNestedClass();
        nod.display();
    
        
    }
   
    
}

