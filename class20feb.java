class car{
    String brand;
    int year;
    car (String brand, int Year){
        this.brand = brand;
        this.year=year;
    }
}
public class class20feb {
    public static void main(String[] args) {
        car car1=new car("tesla",2022);
        car car2=new car("Audi",2024);
        System.out.println(car1.toString());
        System.out.println(car1.hashCode());
        System.out.println(car1.getClass());
        System.out.println(car1.equals(car2));


    }
    
}
