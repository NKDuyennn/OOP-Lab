package hust.soict.hedspi.aims.media;

public class Disc extends Media {

	private String director;
	private int length;
	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	 public Disc(String title) {
	    super(title);
    }
	
	public Disc(String title, String category) {
		super(title, category);
	}
	
    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }
    
    public Disc(String title, String category, String director, float cost) {
        super(title, category, cost);
        this.director = director;
    }
    
    public Disc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

}
