package carlosvlosada.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String title;
	private String shortDescription;
	private String littleImage;

	private Boolean isAnImageCollection;
	private List<String> images;

	private Boolean isAnAncleElement;
	private String url;

	private Boolean isADescriptiveProject;
	private String largeDescription;
	private Boolean hasClient;
	private String client;
	private List<String> usedTechnology;

	public Item(String title, String shortDescription, String littleImage, List<String> images) {
		this.title = title;
		this.shortDescription = shortDescription;
		this.littleImage = littleImage;
		this.isAnImageCollection = true;
		this.images = new ArrayList<String>(images);
		this.isAnAncleElement = false;
		this.isADescriptiveProject = false;
	}

	public Item(String title, String shortDescription, String littleImage, String url) {
		this.title = title;
		this.shortDescription = shortDescription;
		this.littleImage = littleImage;
		this.isAnAncleElement = true;
		this.url = url;
		this.isAnImageCollection = false;
		this.isADescriptiveProject = false;
	}

	public Item(String title, String shortDescription, String littleImage, String largeDescription,
			List<String> usedTechnology) {
		this.title = title;
		this.shortDescription = shortDescription;
		this.littleImage = littleImage;
		this.isADescriptiveProject = true;
		this.largeDescription = largeDescription;
		this.hasClient = false;
		this.usedTechnology = new ArrayList<String>(usedTechnology);
		this.isAnImageCollection = false;
		this.isAnAncleElement = false;
	}

	public Item(String title, String shortDescription, String littleImage, String largeDescription, String client,
			List<String> usedTechnology) {
		this.title = title;
		this.shortDescription = shortDescription;
		this.littleImage = littleImage;
		this.isADescriptiveProject = true;
		this.largeDescription = largeDescription;
		this.hasClient = true;
		this.client = client;
		this.usedTechnology = new ArrayList<String>(usedTechnology);
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

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLittleImage() {
		return littleImage;
	}

	public void setLittleImage(String littleImage) {
		this.littleImage = littleImage;
	}

	public Boolean getIsAnImageCollection() {
		return isAnImageCollection;
	}

	public void setIsAnImageCollection(Boolean isAnImageCollection) {
		this.isAnImageCollection = isAnImageCollection;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public Boolean getIsAnAncleElement() {
		return isAnAncleElement;
	}

	public void setIsAnAncleElement(Boolean isAnAncleElement) {
		this.isAnAncleElement = isAnAncleElement;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getIsADescriptiveProject() {
		return isADescriptiveProject;
	}

	public void setIsADescriptiveProject(Boolean isADescriptiveProject) {
		this.isADescriptiveProject = isADescriptiveProject;
	}

	public String getLargeDescription() {
		return largeDescription;
	}

	public void setLargeDescription(String largeDescription) {
		this.largeDescription = largeDescription;
	}

	public Boolean getHasClient() {
		return hasClient;
	}

	public void setHasClient(Boolean hasClient) {
		this.hasClient = hasClient;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public List<String> getUsedTechnology() {
		return usedTechnology;
	}

	public void setUsedTechnology(List<String> usedTechnology) {
		this.usedTechnology = usedTechnology;
	}
}