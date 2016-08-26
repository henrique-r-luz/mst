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
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class Grafo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Ola");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Vertice vertice  = new Vertice();
        List<Vertice> listaVertice = vertice.geraVertice();
        List<Vertice> listaVerticeAux = new ArrayList<Vertice>(); 
        listaVerticeAux.addAll(listaVertice);
        listaVerticeAux.remove(vertice.initVertice);
        Aresta aresta = new Aresta();
        Aresta subGrafo = aresta.criaPrimeiraAresta(vertice.initVertice, listaVertice);
        
        
        List<Aresta> grafo = new ArrayList<Aresta>();
        grafo.add(subGrafo);
        aresta.listaParada = listaVerticeAux;
       
        aresta.geraPrim(listaVertice, grafo);
        Janela janela = new Janela(listaVertice,aresta.grafo);
        frame.add(janela);
        frame.setSize(1200, 700);
        frame.setVisible(true);
        // System.out.print("atualiza");
    }

    /**
     *
     * @return
     */
    

}
