import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberButton extends JButton implements ActionListener {

    private Calculator calculator;
    private String label;

    public NumberButton(String text, Calculator calculator) {
        super(text);
        this.calculator = calculator;
        label = text;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        String text = calculator.textField.getText();
        if (label != "." || text.indexOf(".") == -1)
            calculator.textField.setText( text + label );
    }
    
}
