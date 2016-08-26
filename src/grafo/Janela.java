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
import java.util.List;
import java.util.Random;
import javax.swing.JPanel;


public class Janela extends JPanel {
     
    public List<Vertice> lista;
    public List<Aresta> listaAresta;
    
    
    
    public Janela(List<Vertice> lista, List<Aresta> listaAresta){
        this.lista = lista;
        this.listaAresta = listaAresta;
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
         this.setBackground(Color.white);
         
         
         for(int i = 0;i<this.lista.size();i++){
            Vertice vertice = (Vertice)this.lista.get(i);
             if(vertice.cor.equals("preto")){
                 g.setColor(Color.BLACK);
             }else{
                 g.setColor(Color.red);
             }
             g.fillRect(vertice.getX(), vertice.getY(), 5, 5);
             
         }
         
         for(int i = 0;i<listaAresta.size();i++){
             Aresta aresta  = listaAresta.get(i);
              g.setColor(Color.GREEN);
              g.drawLine(aresta.verticeU.getX(), aresta.verticeU.getY(), aresta.verticeV.getX(), aresta.verticeV.getY());
         }
         
        // g.fillRect(400, 300, 5, 5);
    }



    
}
