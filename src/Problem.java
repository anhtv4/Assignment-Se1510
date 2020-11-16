
/**
 *
 * @author Asus
 */
public class Problem {
    String id;
    String dateCreate;
    String name;
    String description;
    String link;
    Double markWeight;
    String category;
    String author;

    public Problem() {
    }

    public Problem(String id, String dateCreate, String name, String description, String link, Double markWeight, String category, String author) {
        this.id = id;
        this.dateCreate = dateCreate;
        this.name = name;
        this.description = description;
        this.link = link;
        this.markWeight = markWeight;
        this.category = category;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Double getMarkWeight() {
        return markWeight;
    }

    public void setMarkWeight(Double markWeight) {
        this.markWeight = markWeight;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Problem{" + "id=" + id + ", dateCreate=" + dateCreate + ", name=" + name + ", description=" + description + ", link=" + link + ", markWeight=" + markWeight + ", category=" + category + ", author=" + author + '}';
    }
    
    
}
