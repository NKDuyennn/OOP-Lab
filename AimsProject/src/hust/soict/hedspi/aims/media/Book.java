package hust.soict.hedspi.aims.media;

import java.util.*;

public class Book {

	private int id;
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}


	public List<String> getAuthors() {
		return authors;
	}


	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}


	public Book(String title) {
		this.title = title;
	}
	
	public Book(String title, String category) {
		this.title = title;
		this.category = category;
	}
	
	public Book(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public void addAuthor(String authorName) {
		if(!authors.contains(authorName)) {
			authors.add(authorName);
			System.out.println("Add author successfully!");
		} else {
			System.out.println("This author has already been in the list!");
		}
	}
	
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println("Remove author successfully!");
		} else {
			System.out.println("No author has been found to remove!");
		}
	}

}
