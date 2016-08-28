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
        /*
        inicializa os vértices
        */
        List<Vertice> listaVerticeInit = vertice.geraVertice();
        List<Vertice> listaVerticeSemCon = new ArrayList<Vertice>();
        listaVerticeSemCon.addAll(listaVerticeInit);
        listaVerticeSemCon.remove(vertice.initVertice);
        List<Vertice> listaVerticeCon = new ArrayList<Vertice>(); 
        listaVerticeCon.add(vertice.initVertice);
        
        List<Aresta> grafo = new ArrayList<Aresta>();
      
       Aresta aresta = new Aresta();
       aresta.geraPrim(listaVerticeSemCon,listaVerticeCon, grafo);
       
       
       /*
       remove arestas para definição de grupos
       */
       DetecAresta detcAresta = new DetecAresta();
       Aresta arestaTeste = aresta.grafo.get(2);
       List<Aresta> vizinhos = new ArrayList<Aresta>();
       detcAresta.arestasVizinhas(aresta.grafo, arestaTeste.verticeU,  arestaTeste, vizinhos, 0);
        System.out.println(detcAresta.vizinhos);
       /*cria janela gráfica
        */ 
        Janela janela = new Janela(listaVerticeInit,aresta.grafo,detcAresta.vizinhos,arestaTeste);
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
