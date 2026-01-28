class Box<T>{
	private T item;  
	public void setItem(T item){ 
		this.item = item;
	}
	public T getItem(){
		return item;
	}
}
 class Main{
	public static void main(String[] args){
		Box<String> stringBox = new Box<>();
		StringBox.setItem("Hello Generics!");
		System.out.println("String Box contains: " +stringBox.getItem());

		Box<Integer> intBox = new Box<>();
		StringBox.setItem(123);
		System.out.println("Integer Box contains: " +intBox.getItem());

		Box<Double> doubleBox = new Box<>();
		StringBox.setItem(45.67);
		System.out.println("Double Box contains: " +doubleBox.getItem());
    }
}