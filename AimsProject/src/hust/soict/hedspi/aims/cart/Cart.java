package hust.soict.hedspi.aims.cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered = 0;

    // Add dvd to cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        if (dvdList.length > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full!");
        } else {
            for (int i = 0; i < dvdList.length; i++) {
                itemsOrdered[qtyOrdered] = dvdList[i];
                System.out.println(dvdList[i].getTitle() + " has been added!");
                qtyOrdered +=1 ;
            }
    
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
        DigitalVideoDisc [] dvdList = {dvd1, dvd2};
        addDigitalVideoDisc(dvdList);
    }
    
    // remove dvd in cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                // Dịch chuyển các phần tử sau đó lên một vị trí
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null; // Xóa phần tử cuối
                qtyOrdered--;
                found = true;
                System.out.println("The disc has been removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc is not found in the cart.");
        }
    }

    // totalprice of cart
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    
    public void print()
    {
    	System.out.println("**************************CART***********************");
    	System.out.println("Ordered Items:");
    	for (int i = 0; i < qtyOrdered; i++)
    	{
    		System.out.println(itemsOrdered[i]);
    	}
    	System.out.println("Total cost: " + totalCost());
    	System.out.println("*****************************************************");
    }
    
    public void searchByID(int id)
    {
    	boolean found = false;
    	for (int i = 0; i < qtyOrdered; i++)
    	{
    		if (itemsOrdered[i].getId() == id)
    		{
    			System.out.println("Found" + itemsOrdered[i]);
    			found = true;
    		}
    	}
    	if (found==false)
    	{
    		System.out.println("Sorry, no DVDs were found that match the ID provided!");
    	}
    }
    
    public void searchByTitle(String keyword)
    {
    	boolean matchFound = false;
    	for (int i=0; i < qtyOrdered; i++)
    	{
    		if (itemsOrdered[i].isMatch(keyword))
    		{
    			System.out.println("Found" + itemsOrdered[i]);
    			matchFound = true;
    		}
    	}
    	if (matchFound == false)
    	{
    		System.out.println("Sorry, no DVDs were found with \"" + keyword +"\" in the title!");
    	}
    }
    
    public void searchByCategory(String category) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getCategory().equalsIgnoreCase(category)) {
                System.out.println("Found" + itemsOrdered[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Sorry, no DVDs matching the \"" + category + "\" category were found!");
        }
    }
    
    public void searchByPrice(float maxCost) {
        boolean matchFound = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getCost() <= maxCost) {
                System.out.println("Found" + itemsOrdered[i]);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("Sorry, no DVDs were found that match the maximum cost provided!");
        }
    }
    
    public void searchByPrice(float minCost, float maxCost) {
        boolean matchFound = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getCost() >= minCost && itemsOrdered[i].getCost() <= maxCost) {
                System.out.println("Found" + itemsOrdered[i]);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("Sorry, no DVDs were found that match the cost range between your specified minimum and maximum!");
        }
    }
    
}
