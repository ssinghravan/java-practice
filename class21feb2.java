public class class21feb2 {
    public static void main(String[] args) {
        parent p = new parent();
        if (p instanceof child){
            child c = (child)p;
        }
        else {
            System.out.println("connot cast parent to child");
        }
    }
    
}
class parent{}
class child extends parent{
}
