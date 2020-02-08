package GVN.laxminarayana;

public class Kheer implements Gift
{
	String nameofsweet;
	int price;
	public Kheer()
	{
		setPrice(30);
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