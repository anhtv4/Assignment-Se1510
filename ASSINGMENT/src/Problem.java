

public class Problem {
    private String id;
    private String date;
    private String name;
    private String shortDescription;
    private String fullDescription;
    private double markWeight;
    private String category;
    private String author;

    public Problem() {
    }

    public Problem(String id, String date, String name, String shortDescription, String fullDescription, double markWeight, String category, String author) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public double getMarkWeight() {
        return markWeight;
    }

    public void setMarkWeight(double markWeight) {
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
        return "Problem{" + "id=" + id + ", date=" + date + ", name=" + name + ", shortDescription=" + shortDescription + ", fullDescription=" + fullDescription + ", markWeight=" + markWeight + ", category=" + category + ", author=" + author + '}';
    }
    
}
