public class Main {
    public static void main(String[] args) {
        Button button = new Button("Submit");
        TextField textField = new TextField("Enter your name");
        Label label = new Label("Username");

        button.display();
        textField.display();
        label.display();

        Theme.getInstance().setThemeColor("Dark");

        System.out.println("------- Dark mode on -------");

        button.display();
        textField.display();
        label.display();
    }
}
