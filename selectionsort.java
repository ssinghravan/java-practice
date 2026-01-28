public class selectionsort {
    public static void main(String[] args) {
        int [] arr={56,32,78,1,75,33};
       for (int i = 0; i < arr.length; i++) {
        int m=arr[i];
        int loc=i;

        for(int j = i+1 ; j <arr.length;j++ ){
            if (m>arr[j]){
                m=arr[j];
                loc=j;
            }

        }
        if (arr[loc]<arr[i]){
            int tem=arr[loc];
            arr[loc]=arr[i];
            arr[i]= tem;
        }

           
       }
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
           
       }
}
}