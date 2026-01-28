

class  outer {
    static int outer_x=10;
    int outer_y=20;
    private static int outer_private=30;
    static class staticNestedClass{
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
public class class21march {
    public static void main(String[] args) {
        outer.staticNestedClass nod = new outer.staticNestedClass();
        nod.display();
    
        
    }
   
    
}
