public class Book {
    private String name;
    private Author[] authors;
    private double price;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.price = price;
        this.authors = authors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthorNames() {
        String authorNames = "";
        for(int i=0;i<authors.length; i++) {
            authorNames += authors[i].getName() + ", ";
        }
        return authorNames;
    }
}
