public class class13feb {
    public static void main(String[] args) {
        String s1 = "sahil singh";
        String s2 = s1.trim(); //use to trime
        System.out.println(s2);
        String s4 = "sahil singh";
        String [] arr = s4.split(" "); // use to split the String just depend upon like we use  " ",","
        for (String i : arr)
        System.out.println(i);
        StringBuilder s5 = new StringBuilder();
      
        s5.append("singh");
        System.out.println(s5);
        s5.delete(1, 3);
        System.out.println(s5);
        StringBuilder s4 = new StringBuilder(s4[0]);
        s4.reverse();
        System.out.println(s4); 
    }
    
}
