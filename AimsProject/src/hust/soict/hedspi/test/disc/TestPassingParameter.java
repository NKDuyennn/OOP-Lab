package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		DigitalVideoDiscWrapper wjungleDVD = new DigitalVideoDiscWrapper(jungleDVD);
		DigitalVideoDiscWrapper wcinderellaDVD = new DigitalVideoDiscWrapper(cinderellaDVD);
		
		// Wrong swap() function
		swap(jungleDVD, cinderellaDVD);
		System.out.println("Wrong swap jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("Wrong swap cinderella dvd title: " + cinderellaDVD.getTitle());
		
		
		// Correct swap() function
		swap(wjungleDVD, wcinderellaDVD);
		System.out.println("Correct swapped jungle dvd title: " + wjungleDVD.dvd.getTitle());
		System.out.println("Correct swapped cinderella dvd title: " + wcinderellaDVD.dvd.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("Change jungle dvd title: " + jungleDVD.getTitle());
	}
	
	// Wrong
	public static void swap(Object o1, Object o2)
	{
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	// Correct
	public static void swap(DigitalVideoDiscWrapper o1, DigitalVideoDiscWrapper o2)
	{
		DigitalVideoDisc tmp = o1.dvd;
		o1.dvd = o2.dvd;
		o2.dvd = tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title)
	{
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

}
