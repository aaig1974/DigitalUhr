package listener;

import utilities.Utilities;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ProgOpenerListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        JButton jButton = (JButton) e.getSource();
        String text = jButton.getActionCommand();
        String path;

        switch (text){
            case "eclipse":
                path = "C:\\Program Files\\Bitwarden\\Bitwarden.exe";
                Utilities.startProgram(path);
                break;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
