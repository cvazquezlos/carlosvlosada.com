package carlosvlosada.model;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.joda.time.DateTime;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String title;
	private String littleImage;
	private Date creationDate;
	private int day;
	private String month;
	private int year;
	private List<Object> content;

	@ManyToOne
	private User writer;

	@OneToMany
	private List<Comment> comments;

	public Post(String title, String littleImage, Date creationDate, List<Object> content, User writer) {
		this.title = title;
		this.littleImage = littleImage;
		this.creationDate = creationDate;
		DateTime dateTime = new DateTime(this.creationDate);
		this.day = dateTime.getDayOfMonth();
		int month = dateTime.getMonthOfYear();
		this.month = Month.of(month).getDisplayName(TextStyle.SHORT_STANDALONE, new Locale("es", "ES"));
		this.year = dateTime.getYear();
		this.content = new ArrayList<Object>(content);
		this.writer = writer;
		this.comments = new ArrayList<Comment>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLittleImage() {
		return littleImage;
	}

	public void setLittleImage(String littleImage) {
		this.littleImage = littleImage;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Object> getContent() {
		return content;
	}

	public void setText(List<Object> content) {
		this.content = content;
	}

	public User getWriter() {
		return writer;
	}

	public void setWriter(User writer) {
		this.writer = writer;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}