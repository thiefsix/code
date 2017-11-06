
public class xxxx_c8e2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock sk = new Stock("Java","Sun Microsystem Inc");
		sk.setPreviousClosingPrice(4.5);
		sk.setCurrentPrice(4.35);
		double d=sk.getChangPercent();
		System.out.println(d);
	}

}

class Stock{
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	Stock(String symbol,String name){
		this.symbol=symbol;
		this.name=name;
	}
	public double getChangPercent(){
		double f=currentPrice/previousClosingPrice;
		return f;
	}
	public void setPreviousClosingPrice(double previousClosingPrice){
		this.previousClosingPrice=previousClosingPrice;
		return;
	}
	public double getPreviousClosingPrice(){
		return previousClosingPrice;
	}
	public void setCurrentPrice(double currentPrice){
		this.currentPrice=currentPrice;
		return;
	}
	public double getCurrentPrice(){
		return currentPrice;
	}
}
