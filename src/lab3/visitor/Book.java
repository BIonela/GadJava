package lab3.visitor;

public class Book implements Element{
    private String name;
    private int numberOfPages;
    private String author;
    private int price;

    public Book(String name, int numberOfPages, int price) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void accept(Visitor v){
        v.visit(this);
    }

    public String toString() {
        return name + ", " + numberOfPages + ", pages, written by " + author + ", price: " + price;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
