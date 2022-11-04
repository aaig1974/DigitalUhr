package elements;

import listener.ProgOpenerListener;
import model.IconButton;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseListener;

public class ButtonPanelProgramOpener {
    private JPanel jPanelProgramOpener;
    private final String[] iconStrings = {"eclipse", "firefox", "mail", "textedit"};

    public JPanel getjPanelProgramOpener() {
        return jPanelProgramOpener;
    }

    public void setjPanelProgramOpener(JPanel jPanelProgramOpener) {
        this.jPanelProgramOpener = jPanelProgramOpener;
    }

    public ButtonPanelProgramOpener(){
        jPanelProgramOpener = new JPanel(new GridLayout(2, 2, 5, 5));

        for(String iconString : iconStrings){
            IconButton iconButton = new IconButton(iconString , "2" , iconString);
            iconButton.setBorder(new LineBorder(Color.green));
            iconButton.addMouseListener(new ProgOpenerListener());
            jPanelProgramOpener.add(iconButton);
        }
    }
}
