package GVN.laxminarayana;

public class Barfi implements Gift
{
	String nameofaweet;
	int price;
	public Barfi()
	{
		setPrice(20);
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
}
