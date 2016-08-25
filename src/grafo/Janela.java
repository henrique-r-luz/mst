/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

/**
 *
 * @author henrique
 */
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class Janela extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
         this.setBackground(Color.white);
         g.setColor(Color.BLACK);
         
         for(int i = 0;i<50;i++){
             Random geradorx = new Random();
             Random geradory = new Random();
             g.fillRect(geradorx.nextInt(799), geradory.nextInt(599), 5, 5);
             
         }
         
        // g.fillRect(400, 300, 5, 5);
    }



    
}
