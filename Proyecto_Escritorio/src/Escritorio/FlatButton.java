/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escritorio;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import javax.swing.JLabel;

/**
 *
 * @author jjimenez
 */
public class FlatButton extends JLabel implements Serializable, MouseListener{

    public FlatButton() {
        this.setBackground(new java.awt.Color(22, 160, 133));
        this.setFont(new java.awt.Font("Segoe UI", 0, 16));
        this.setForeground(new java.awt.Color(255, 255, 255));
        this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.setText("Aceptar");
        this.setOpaque(true);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBorder(null);
    }
    
    
    
}
