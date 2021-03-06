package designpattern.behave.visitor.one;

public class Bar implements Element {
    @Override
    public void visit(Visitor v) {
        v.visit(this);
    }

    public String getBAR() {
        return "Bar";
    }
}
