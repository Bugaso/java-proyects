package Codigoprincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class uwu {
    private JPanel panel1;

    public uwu() {
        panel1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                System.out.println("Hola");
                super.componentResized(e);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }



}
