package utilities;


import javax.swing.*;
import java.net.URL;

import static java.awt.Desktop.getDesktop;
import static java.lang.Runtime.getRuntime;

public class Utilities {
    // Url öffnen
    public static void openUrl(String urlString){
        try {
            getDesktop().browse(new URL("https://" + urlString + "/").toURI());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Url unbekannt");
            e.printStackTrace();
        }

    }

    public static void startProgram(String path) {
        try {
            Process process = getRuntime().exec(path);
            try {
                Thread.sleep(5000);
            }catch (Exception e){
                e.printStackTrace();
            }
            process.destroy();
        } catch (Exception e) {

        } finally {

        }

    }
}
