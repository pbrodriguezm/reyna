/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appswingreyna;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Compu
 */
public class AppSwingReyna extends JApplet {
        
    /**
     * Patrick Rodriguez 05/21
     * Registro de Comprobante
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                try {
                    RegistroComprobante  registroComprobante = new RegistroComprobante();
                    registroComprobante.setVisible(true);
            
                } catch (Exception e) {
                    System.out.println("ERROR: No pude cargar interfaz de registro");
                }
            
            }
        });
    }
    
}
