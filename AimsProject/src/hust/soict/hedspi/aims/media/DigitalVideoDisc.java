package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media {
	
	private String director;
	private int length;
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	
	public boolean isMatch(String keyword)
	{
		return this.getTitle().toLowerCase().contains(keyword.toLowerCase());
	}
	
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	
	@Override
	public String toString()
	{
		return "DVD: " + this.getTitle() +
				" - Category: " + this.getCategory() +
				" - Director: " + this.director +
				" - DVD length: " + this.length +
				" - Cost: " + this.getCost() + "$";
	}
	
}