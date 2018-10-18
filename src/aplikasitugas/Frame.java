/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasitugas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mirza
 */
public class Frame extends JFrame {
    public Frame(){
        setTitle("Frame");
        setSize(640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JOptionPane.showMessageDialog(null, "Halo");
    }
}
