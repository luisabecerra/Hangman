/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class MainAhorcado extends JFrame {
    public static void main (String [] args){
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.add(new Ahorcadoo());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
