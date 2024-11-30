package hust.soict.hedspi.aims.media;

import java.util.*;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}
	
	public CompactDisc(String title) {
		super(title);
	}
	
	public CompactDisc(String title, String category) {
		super(title, category);
	}
	
	public CompactDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	public CompactDisc(String title, String category, String artist, float cost) {
        super(title, category, cost);
        this.artist = artist;
    }
	
	public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println(track.getTitle() + " has been added!");
        } else {
            System.out.println("Track already exists in CD.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println(track.getTitle() + " has been removed!");
        } else {
            System.out.println("Track does not exist in CD.");
        }
    }
	
	public int getLength() {
		int totalLength = 0;
		for (Track track : tracks) {
			totalLength += track.getLength();
		}
		return totalLength;
	}
	
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD length: " + this.getLength());
		for (Track track : tracks) {
			track.play();
		}
	}
	
	@Override
	public String toString() {
		return "CD: " + this.getTitle() + 
				" - Category: " + this.getCategory() + 
				" - Artist: " + this.getArtist() + 
				" - Length: " + this.getLength() + 
				" - Cost: " + this.getCost() + "$";
	}
}
