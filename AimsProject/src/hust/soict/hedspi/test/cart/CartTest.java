package hust.soict.hedspi.test.cart;
import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
     
        Cart cart = new Cart();
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
        		"Animation", "Roger Allers", 87, 19.95f); 
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", 
        		"Science Fiction", "George Lucas", 87, 24.95f); 
        cart.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
        		"Animation", 18.99f);
        cart.addMedia(dvd3);
        
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladin",
        		"Animation", 18.99f);
        cart.addMedia(dvd4);
        
        cart.print();
        
        cart.searchByID(3);
        cart.searchByTitle("Lion");
    }
}