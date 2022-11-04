package elements;

import listener.UrlOpenerListener;
import model.IconButton;

import javax.swing.*;

public class ButtonPaneUrl {
    //Container für die Button die Url öffnen
    private JPanel buttonUrlJPanel;
    private final String[] iconString = {"facebook", "twitter", "amazon", "youtube"};

    public JPanel getButtonUrlJPanel() {
        return buttonUrlJPanel;
    }

    public void setButtonUrlJPanel(JPanel buttonUrlJPanel) {
        this.buttonUrlJPanel = buttonUrlJPanel;
    }

    public ButtonPaneUrl(){
        buttonUrlJPanel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(buttonUrlJPanel, BoxLayout.PAGE_AXIS);
        buttonUrlJPanel.setLayout(boxLayout);

        for(String iconName : iconString){
            IconButton iconButton = new IconButton(iconName, "1", iconName);
            iconButton.addMouseListener(new UrlOpenerListener());
            buttonUrlJPanel.add(iconButton);
        }
    }

}
