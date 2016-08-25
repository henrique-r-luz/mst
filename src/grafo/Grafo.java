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

import javafx.scene.paint.Color;
import javax.swing.JFrame;

public class Grafo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       JFrame frame = new JFrame("Ola");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Janela janela  = new Janela();
       frame.add(janela);
       frame.setSize(1200,700);
       frame.setVisible(true);
      // System.out.print("atualiza");
    }
    
}
