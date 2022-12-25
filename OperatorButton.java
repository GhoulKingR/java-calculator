import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorButton extends JButton implements ActionListener {
    
    private Calculator calculator;
    private String label;

    public OperatorButton(String text, Calculator calculator) {
        super(text);
        this.calculator = calculator;
        label = text;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        String text = calculator.textField.getText();
        if (text.length() > 0) {
            double num = Double.parseDouble(text);
            if (calculator.sign == "+") calculator.cache += num;
            else if (calculator.sign == "-") calculator.cache -= num;
            else if (calculator.sign == "/") calculator.cache /= num;
            else if (calculator.sign == "*") calculator.cache *= num;
            else calculator.cache = num;

            calculator.sign = label;
            calculator.textField.setText("");
        }
    }
}