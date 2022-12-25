import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.GridLayout;

public class Calculator {

    private JPanel panel;

    JTextField textField;
    double cache = 0;
    String sign = "";

    public Calculator() {
        JFrame frame = new JFrame();
        panel = new JPanel();
        panel.setLayout( new GridLayout(6, 1) );

        textField = new JTextField();
        textField.setEditable(false);
        panel.add(textField);

        setUpButtons();

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setResizable(false);
        frame.setPreferredSize( new Dimension(250, 300) );
        frame.pack();
        frame.setVisible(true);
    }

    private void setUpButtons() {
        JPanel buttonRow0 = new JPanel();
        buttonRow0.setLayout( new GridLayout(1, 0) );
        JPanel buttonRow1 = new JPanel();
        buttonRow1.setLayout( new GridLayout(1, 0) );
        JPanel buttonRow2 = new JPanel();
        buttonRow2.setLayout( new GridLayout(1, 0) );
        JPanel buttonRow3 = new JPanel();
        buttonRow3.setLayout( new GridLayout(1, 0) );
        JPanel buttonRow4 = new JPanel();
        buttonRow4.setLayout( new GridLayout(1, 0) );

        /*
        * 
        * 7 8 9 /
        * 4 5 6 -
        * 1 2 3 +
        * 0 . = *
        */

        ClearButton cButton = new ClearButton(this);
        BackspaceButton bButton = new BackspaceButton(this);
        buttonRow0.add(cButton); buttonRow0.add(bButton);
        panel.add(buttonRow0);
        
        NumberButton n7 = new NumberButton("7", this);
        NumberButton n8 = new NumberButton("8", this);
        NumberButton n9 = new NumberButton("9", this);
        OperatorButton slash = new OperatorButton("/", this);
        buttonRow1.add(n7); buttonRow1.add(n8); buttonRow1.add(n9);
        buttonRow1.add(slash);
        panel.add(buttonRow1);

        NumberButton n4 = new NumberButton("4", this);
        NumberButton n5 = new NumberButton("5", this);
        NumberButton n6 = new NumberButton("6", this);
        OperatorButton star = new OperatorButton("*", this);
        buttonRow2.add(n4); buttonRow2.add(n5); buttonRow2.add(n6);
        buttonRow2.add(star);
        panel.add(buttonRow2);

        NumberButton n1 = new NumberButton("1", this);
        NumberButton n2 = new NumberButton("2", this);
        NumberButton n3 = new NumberButton("3", this);
        OperatorButton minus = new OperatorButton("-", this);
        buttonRow3.add(n1); buttonRow3.add(n2); buttonRow3.add(n3);
        buttonRow3.add(minus);
        panel.add(buttonRow3);

        NumberButton n0 = new NumberButton("0", this);
        NumberButton dot = new NumberButton(".", this);
        EqualButton equal = new EqualButton(this);
        OperatorButton plus = new OperatorButton("+", this);
        buttonRow4.add(n0); buttonRow4.add(dot); buttonRow4.add(equal);
        buttonRow4.add(plus);
        panel.add(buttonRow4);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}