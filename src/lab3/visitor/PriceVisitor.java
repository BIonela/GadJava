package lab3.visitor;

public class PriceVisitor implements Visitor{
    private int price;

    @Override
    public void visit(Book book) {
        price += book.getPrice();
    }

    @Override
    public void visit(Video video) {
        price += video.getPrice();
    }

    @Override
    public void visit(Audio audio) {
        price += audio.getPrice();
    }

    @Override
    public String toString() {
        return "Total price is: " + price;
    }


}
