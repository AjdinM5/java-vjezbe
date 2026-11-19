package vjezbe_18_11_2026;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RacunanjeOcjene {
    private JPanel panel;
    private JTextField ImeStudenta;
    private JTextField Projekat1;
    private JTextField Projekat2;
    private JTextField ZavrsniTest;
    private JTextField Ukupno;
    private JTextField Ocjena;
    private JTextField Polozio;
    private JButton IzracunajButton;


    public RacunanjeOcjene() {
        IzracunajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int m1,m2,m3;
                m1 = Integer.parseInt(Projekat1.getText());
                m2 = Integer.parseInt(Projekat2.getText());
                m3 = Integer.parseInt(ZavrsniTest.getText());
                int tot=m1+m2+m3;
                Ukupno.setText(String.valueOf(tot));

                if (tot>55) {
                    Polozio.setText("Polozio");
                }
                else {
                    Polozio.setText("Nije polozio");
                }

                if (tot <= 54) {
                    Ocjena.setText("5");
                } else if (tot <= 64) {
                    Ocjena.setText("6");
                } else if (tot <= 74) {
                    Ocjena.setText("7");
                } else if (tot <= 84) {
                    Ocjena.setText("8");
                } else if (tot <= 94) {
                    Ocjena.setText("9");
                } else {
                    Ocjena.setText("10");
                }
            }

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RacunanjeOcjene");
        frame.setContentPane(new RacunanjeOcjene().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
