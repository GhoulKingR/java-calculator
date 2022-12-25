import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackspaceButton extends JButton implements ActionListener {
    
    private Calculator calculator;

    public BackspaceButton(Calculator calculator) {
        super("C");
        this.calculator = calculator;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        String text = calculator.textField.getText();
        if (text.length() > 0) {
            calculator.textField.setText(
                text.substring(0, text.length() - 1)
            );
        }
    }
}
