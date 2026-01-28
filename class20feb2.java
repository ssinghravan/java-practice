class person {
    String name;
    int age;
    person(String name ,int age){
        this.name=name;
        this.age=age;

    }
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj==null || getClass()!= obj.getClass()) return false;
        person p = (person) obj;
        return age == p.age && name.equals(p.name);

    }
}
public class class20feb2 {
    public static void main(String[] args) {
        person p1 = new person("Alice", 30);
        person p2 = new person("Alice", 30);
        person p3 = new person("sahil", 20);
        System.out.println(p1.equals(p2));
        
    }
    
}

