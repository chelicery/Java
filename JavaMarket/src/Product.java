public class Product {
	private String code;
	private String name;
	private int price;
	private double discountPrice;;
	private int quantity;
	
	
	Product(String code, String name, int price, int quantity){
		this.code = code;
		this.name = name;
		this.price = price;	
		this.quantity = quantity;
		this.discountPrice = price - price * 0.05;
	}	
	String getCode() {return this.code;}
	String getName() {return this.name;}
	double getPrice(){return this.price;}
	double getDiscountPrice(){return this.discountPrice;}
	int getQuantity() {return this.quantity;}
	
	public void showInfo(){
		System.out.println(" kod prod: " + code + "\tnazwa prod: " + name + "\tcena: " + price + "\t cena po obnizce: " + discountPrice);
	}
	public void discounts(){
		
		
	}
	
   
	

}

