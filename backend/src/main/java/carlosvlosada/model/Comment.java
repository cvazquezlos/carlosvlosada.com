package carlosvlosada.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String username;
	private String email;
	private Boolean hasWebsite;
	private String website;
	private String message;
	private Date wroteDate;

	@OneToMany
	private List<Comment> replies;

	public Comment(String username, String email, String message, Date wroteDate) {
		this.username = username;
		this.email = email;
		this.hasWebsite = false;
		this.message = message;
		this.wroteDate = wroteDate;
		this.replies = new ArrayList<Comment>();
	}

	public Comment(String username, String email, String website, String message, Date wroteDate) {
		this.username = username;
		this.email = email;
		this.hasWebsite = true;
		this.website = website;
		this.message = message;
		this.wroteDate = wroteDate;
		this.replies = new ArrayList<Comment>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getHasWebsite() {
		return hasWebsite;
	}

	public void setHasWebsite(Boolean hasWebsite) {
		this.hasWebsite = hasWebsite;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getWroteDate() {
		return wroteDate;
	}

	public void setWroteDate(Date wroteDate) {
		this.wroteDate = wroteDate;
	}

	public List<Comment> getReplies() {
		return replies;
	}

	public void setReplies(List<Comment> replies) {
		this.replies = replies;
	}
}