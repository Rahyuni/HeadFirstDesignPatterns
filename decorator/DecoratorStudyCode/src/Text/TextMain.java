package Text;

public class TextMain {
    public static void main(String[] args) {
        Text text = new PlainText("Hello, Decorator Pattern!");
        System.out.println("Plain text: " + text.getContent());

        text = new BoldDecorator(text);
        System.out.println("Bold text: " + text.getContent());

        text = new ItalicDecorator(text);
        System.out.println("Bold and italic text: " + text.getContent());

        text = new UnderLineDecorator(text);
        System.out.println("Bold, italic, and underlined text: " + text.getContent());

        Text anotherText = new UnderLineDecorator(
                new ItalicDecorator(new PlainText("Another example"))
        );
        System.out.println("Underlined and italic text: " + anotherText.getContent());
    }
}
