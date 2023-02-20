import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World");
        JLabel label = new JLabel("Hello World",
        JLabel.CENTER);

        frame.add(label);
        frame.setSize( 400, 400 );
        frame.setVisible(true);
    }
}