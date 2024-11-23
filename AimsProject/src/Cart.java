
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
}
