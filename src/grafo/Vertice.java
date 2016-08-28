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
 * classe que representa os vertices do grafo
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
      //  int cont = 1000;
         /*for (int i = 0; i < 50; i++) {
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
        }*/
       /* for (int i = 0; i < 80; i++) {

            Random geradorx = new Random();
            Random geradory = new Random();
            Vertice vertice = new Vertice();
            vertice.id = i;
            vertice.setX(geradorx.nextInt(1000) + 100);
            vertice.setY(geradorx.nextInt(600) + 50);
            listaVertice.add(vertice);
            if (vertice.getX() < cont) {
                cont = vertice.getX();
                this.initVertice = vertice;
            }
            //geradorx.nextInt(799)
        }*/
        /* for (int i = 0; i < 25; i++) {
            Random geradorx = new Random();
            Random geradory = new Random();
            Vertice vertice = new Vertice();
            vertice.setX(geradorx.nextInt(400)+600);
            vertice.setY(geradorx.nextInt(250)+400);
            listaVertice.add(vertice);
            //geradorx.nextInt(799)
        }*/
       // this.initVertice.cor = "vermelho";
       Vertice vertice = new Vertice();
        vertice.id = 1;
       vertice.setX(58*(4));
       vertice.setY(12*(4));
       this.initVertice = vertice;
       listaVertice.add(vertice);
       
        vertice = new Vertice();
        vertice.id = 2;
       vertice.setX(61*(4));
       vertice.setY(15*(4));
       listaVertice.add(vertice);
       
        vertice = new Vertice();
        vertice.id = 3;
       vertice.setX(61*(4));
       vertice.setY(25*(4));
       listaVertice.add(vertice);
       
       
        vertice = new Vertice();
        vertice.id = 4;
       vertice.setX(64*(4));
       vertice.setY(20*(4));
       listaVertice.add(vertice);
       
       
       vertice = new Vertice();
        vertice.id = 5;
       vertice.setX(64*(4));
       vertice.setY(30*(4));
       listaVertice.add(vertice);
       
       vertice = new Vertice();
        vertice.id = 6;
       vertice.setX(66*(4));
       vertice.setY(18*(4));
       listaVertice.add(vertice);
       
       vertice = new Vertice();
        vertice.id = 7;
       vertice.setX(66*(4));
       vertice.setY(23*(4));
       listaVertice.add(vertice);
       
       vertice = new Vertice();
        vertice.id = 8;
       vertice.setX(69*(4));
       vertice.setY(15*(4));
       listaVertice.add(vertice);
       
       
       vertice = new Vertice();
        vertice.id = 9;
       vertice.setX(69*(4));
       vertice.setY(21*(4));
       listaVertice.add(vertice);
       
       vertice = new Vertice();
        vertice.id = 10;
       vertice.setX(70*(4));
       vertice.setY(4*(4));
       listaVertice.add(vertice);
       
       
       vertice = new Vertice();
        vertice.id = 11;
       vertice.setX(72*(4));
       vertice.setY(31*(4));
       listaVertice.add(vertice);
       
       vertice = new Vertice();
        vertice.id = 12;
       vertice.setX(76*(4));
       vertice.setY(27*(4));
       listaVertice.add(vertice);
       
       vertice = new Vertice();
        vertice.id = 13;
       vertice.setX(77*(4));
       vertice.setY(12*(4));
       listaVertice.add(vertice);
       
       
       vertice = new Vertice();
        vertice.id = 14;
       vertice.setX(78*(4));
       vertice.setY(16*(4));
       listaVertice.add(vertice);
        
       
       
       vertice = new Vertice();
        vertice.id = 15;
       vertice.setX(83*(4));
       vertice.setY(21*(4));
       listaVertice.add(vertice);
        
       
       
       return listaVertice;
        
        
    }

}
