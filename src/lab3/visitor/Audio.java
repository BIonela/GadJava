package lab3.visitor;

public class Audio implements Element{
    private String name;
    private int price;
    private int time;

    public Audio(String name, int price, int time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return name + ", price " + price + ", time " + time;
    }

    public int getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }
}
