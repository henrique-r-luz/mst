/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author henrique
 */
public class Vertice {

    private int x;
    private int y;
    public int id;
    public Vertice initVertice;
    public String cor = "preto";

    public Vertice() {

    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    //cria os vértices do grafo
    //de forma randômica
    public List<Vertice> geraVertice() {
        
        List<Vertice> listaVertice = new ArrayList<Vertice>();
        int cont = 1000;
        for (int i = 0; i < 50; i++) {
            Random geradorx = new Random();
            Random geradory = new Random();
            Vertice vertice = new Vertice();
            vertice.id  = i;
            vertice.setX(geradorx.nextInt(1200));
            vertice.setY(geradorx.nextInt(700));
            listaVertice.add(vertice);
            //verifica qual é o menor vertice em
            //relação ao eixo X
            if(vertice.getX()<cont){
                cont = vertice.getX(); 
                this.initVertice = vertice;
            }
            //geradorx.nextInt(799)
        }
        /* for (int i = 0; i < 10; i++) {
            Random geradorx = new Random();
            Random geradory = new Random();
            Vertice vertice = new Vertice();
            vertice.setX(geradorx.nextInt(400)+600);
            vertice.setY(geradorx.nextInt(250)+400);
            listaVertice.add(vertice);
            //geradorx.nextInt(799)
        }*/
          this.initVertice.cor = "vermelho";
         return listaVertice;
    }
    
    
   

}
