package Text;

public class UnderLineDecorator extends TextDecorator {
    public UnderLineDecorator(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "<u>" + super.getContent() + "</u>";
    }
}
