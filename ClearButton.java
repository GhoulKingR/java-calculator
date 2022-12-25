import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButton extends JButton implements ActionListener {
    
    private Calculator calculator;

    public ClearButton(Calculator calculator) {
        super("CE");
        this.calculator = calculator;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        calculator.textField.setText("");
        calculator.sign = "";
        calculator.cache = 0;
    }
}
