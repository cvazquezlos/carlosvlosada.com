package carlosvlosada.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String title;
	private String littleImage;
	private Date creationDate;
	private String text;

	@ManyToOne
	private User writer;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
	private List<Comment> comments;

	public Post(String title, String littleImage, Date creationDate, String text, User writer) {
		this.title = title;
		this.littleImage = littleImage;
		this.creationDate = creationDate;
		this.text = text;
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
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