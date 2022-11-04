package elements;

import utilities.Utilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonProgramOpener {
    private JButton jButton;

    public JButton getjButton() {
        return jButton;
    }

    public void setjButton(JButton jButton) {
        this.jButton = jButton;
    }

    public ButtonProgramOpener() {
        jButton = new JButton("Programm öffnen");
        jButton.setPreferredSize(new Dimension(140, 40));
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jFileChooser = new JFileChooser();
                int rueckgabeWert = jFileChooser.showSaveDialog(null);
                // Pfad aus der Datei lesen
                String pathString = "";
                if (rueckgabeWert == JFileChooser.APPROVE_OPTION) {
                    pathString = jFileChooser.getSelectedFile().getAbsolutePath();
                    Utilities.startProgram(pathString);
                } else if (rueckgabeWert == JFileChooser.CANCEL_OPTION) {
                    System.out.println("Also dann nicht");
                }

            }
        });
    }


}
