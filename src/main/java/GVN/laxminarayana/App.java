package GVN.laxminarayana;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner input=new Scanner(System.in);
    	System.out.print("ENTER NUMBER OF SWEETS REQUIRED : ");
    	int number=input.nextInt();
    	int z;
    	int total=0;
    	for(z=0;z<number;z++)
    	{
    		System.out.print("ENTER THE SWEET NAME : ");
    		String name=input.next();
    		Gift x;
    		if(name.equals("Barfi"))
    			x=new Barfi();
    		else if(name.equals("Kheer"))
    			x=new Kheer();
    		else if(name.equals("Jelebi"))
    			x=new Jelabi();
    		else
    		{
    			System.out.println("This type of sweet is not available ");
    			z--;
    			continue;
    		}
    		System.out.print("Quantity of sweet required: ");
    		int kg=input.nextInt();
    		total+=x.getPrice()*kg;
    	}
    	System.out.println("cost of the gift : "+total);
    	
    	input.close();
    }
}