package model;

import java.text.DecimalFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="artwork")
public class Artwork {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="TITLE")
	private String title;
	@Column(name="ARTIST_NAME")
	private String artistName;
	@Column(name="MEDIA")
	private String media;
	@Column(name="YEAR")
	private String year;
	@Column(name="VALUE")
	private double value;
	
	//default constructor
	public Artwork() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructor for 2 strings Title and Artist Name
	public Artwork(String title, String artistName) {
		super();
		this.title = title;
		this.artistName = artistName;
	}
	//constructor for for all field but ID and Value
		public Artwork(String title, String artistName, String media, String year) {
		super();
		this.title = title;
		this.artistName = artistName;
		this.media = media;
		this.year = year;
	}
		
		
		public Artwork(String title, String artistName, String media, String year, double value) {
		super();
		this.title = title;
		this.artistName = artistName;
		this.media = media;
		this.year = year;
		this.value = value;
	}

		//constructor for for all field (int, string, sting, string, string, double)
	public Artwork(int id, String title, String artistName, String media, String year, double value) {
			super();
			this.id = id;
			this.title = title;
			this.artistName = artistName;
			this.media = media;
			this.year = year;
			this.value = value;
		}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Artwork [id=" + id + ", title=" + title + ", artistName=" + artistName + "]";
	}
	
/*	public String returnArtworkDetails() {
	return title + " : " + artistName;
	}
	*/
	public String returnArtworkDetails() {
		DecimalFormat df = new DecimalFormat("$ ##.00");
		return id + " : " + title + " : " + artistName + " : " + media + " : " + year+ " : " + df.format(value);
		
	}
	
	
}
