package vjezbe_11_11_2026;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel panel;
    private JLabel unosLabel;
    private JTextField unosText;
    private JButton klikButton;
    private JLabel poruka;


    public GUI() { //desni klik na dugme "Klik", create listener, action listener
        klikButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = unosText.getText();
                poruka.setText("Hello, " + text + " !");
            }
        });
    }

    public static void main(String[] args) { //desni klik, generate, form main
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400,150);
        frame.setVisible(true);
    }
}
