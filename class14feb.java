public class class14feb {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.Sound();
        d.barks();

        gr k = new gr();
        k.color();
        k.Sound();
        k.barks();

        cat c = new cat();
        c.color();
        c.Sound();

    }
    
}
class Animal{
    public void Sound(){
        System.out.println("Animal makes sound");
    }
    
}
class Dog extends Animal{
    
       public void barks(){
            System.out.println("Dog bark");
        }
    }
class gr extends Dog{
    public void color(){
        System.out.println("golden");
    }
}
class cat extends Animal{
    public void color(){
        System.out.println("black");
    }
}

