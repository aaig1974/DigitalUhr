package model;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class IconButton extends JButton {
    private final int BUTTON_WIDTH = 45;
    private final int BUTTON_HEIGHT = 45;

    public IconButton(String command, String imageFolder, String iconName) {
        setupButton(command, imageFolder, iconName);

    }

    private void setupButton(String command, String imageFolder, String iconName) {
        // Button Text setzen, der nicht sichbar ist
        setActionCommand(command);
        // Button Größe bestimmen
        setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        // Tooltip hinzufügen
        setToolTipText(command);
        // Icon hinzufügen
        URL imageUrl = getClass().getResource("/image" + imageFolder + "/" + iconName + ".png");
        if (imageUrl != null) {
            ImageIcon icon = new ImageIcon(imageUrl);
            setIcon(icon);
        } else {
            setText(command);
            System.out.println("Bild könnte nicht gefunden werden");
        }
    }
}
