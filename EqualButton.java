import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EqualButton extends JButton implements ActionListener {
    
    private Calculator calculator;

    public EqualButton(Calculator calculator) {
        super("=");
        this.calculator = calculator;
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

            calculator.sign = "";
            calculator.textField.setText( Double.toString(calculator.cache) );
        }
    }
}
