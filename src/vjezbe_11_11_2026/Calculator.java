package vjezbe_11_11_2026;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel panel;
    private JTextField rezultat;
    private JButton mod;
    private JButton plusMinus;
    private JButton procenat;
    private JButton dijeljenje;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton AC;
    private JButton a8Button;
    private JButton a9Button;
    private JButton mnozenje;
    private JButton a5Button;
    private JButton a6Button;
    private JButton oduzimanje;
    private JButton a2Button;
    private JButton a3Button;
    private JButton sabiranje;
    private JButton a0Button;
    private JButton tacka;
    private JButton jedanko;

    private double firstNumber = 0;
    private double secondNumber = 0;
    private String operator = "";
    private boolean isNewOperation = true;
    private ActionListener numberListener = new NumberListener();

    public Calculator() {
        mod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperator("%");
            }
        });
        plusMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        procenat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        dijeljenje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                	setOperator("/");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberListener.actionPerformed(e);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberListener.actionPerformed(e);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberListener.actionPerformed(e);
            }
        });
        mnozenje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                	setOperator("*");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberListener.actionPerformed(e);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberListener.actionPerformed(e);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberListener.actionPerformed(e);
            }
        });
        oduzimanje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperator("-");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberListener.actionPerformed(e);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberListener.actionPerformed(e);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberListener.actionPerformed(e);
            }
        });
        sabiranje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperator("+");
            }
        });
        AC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                	clear();
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberListener.actionPerformed(e);
            }
        });
        tacka.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        jedanko.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateResult();
            }
        });
        rezultat.setText("0");
        rezultat.setHorizontalAlignment(SwingConstants.RIGHT);
    }

    private void clear() {
        rezultat.setText("0");
        firstNumber = 0;
        secondNumber = 0;
        operator = "";
        isNewOperation = true;

    }

    private void setOperator(String op) {
        if(!operator.isEmpty()) {
            calculateResult();
        }
        firstNumber = Double.parseDouble(rezultat.getText());
        operator = op;
        isNewOperation = true;
    }

    private void calculateResult() {
    secondNumber = Double.parseDouble(rezultat.getText());
    double result;
    switch (operator) {
        case "+":
            result = firstNumber + secondNumber;
            break;
        case "-":
            result = firstNumber - secondNumber;
            break;
        case "*":
            result = firstNumber * secondNumber;
            break;
        case "/":
            result = secondNumber != 0 ? firstNumber / secondNumber : 0;
            break;
        case "%":
            result = firstNumber % secondNumber;
            break;
        default:
            result = 0;
            break;
    }
    rezultat.setText(String.valueOf(result));
    firstNumber = result;
    operator = "";
    isNewOperation = true;
}

    private class NumberListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String value = ((JButton) e.getSource()).getText();
            if (isNewOperation) {
                rezultat.setText(value);
                isNewOperation = false;
            } else {
                rezultat.setText(rezultat.getText() + value);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
