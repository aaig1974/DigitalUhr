package elements;

import utilities.Utilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class TextFieldUrlOpener {
    private JTextField jTextField;
    private final JScrollPane jScrollPane;

    public TextFieldUrlOpener() {
        jTextField = new JTextField();
        jTextField.setFont(new Font("Arial", Font.ITALIC, 16));
        jScrollPane = new JScrollPane(jTextField, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jTextField.setPreferredSize(new Dimension(140, 30));
        jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                   if (jTextField.getText() != null){
                       Utilities.openUrl(jTextField.getText());
                   }
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }

    public JTextField getjTextField() {
        return jTextField;
    }

    public void setjTextField(JTextField jTextField) {
        this.jTextField = jTextField;
    }
}
