package lab3.visitor;

public interface Visitor {
     void visit(Book book);
     void visit(Video video);
     void visit(Audio audio);

}
