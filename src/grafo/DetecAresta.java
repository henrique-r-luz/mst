/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author henrique
 */
public class DetecAresta {

 
    public static final int profundidade = 2;
    public List<Aresta> vizinhos;
    
    
    public void removeAresta(List<Aresta> grafo) {

    }

    public void arestasVizinhas(List<Aresta> grafo, Vertice vertice, Aresta aresta, List<Aresta> vizinhos, int pulo) {
        this.vizinhos = vizinhos;
        if (pulo < profundidade) {
            //  List<Aresta> vizinhos = new ArrayList<Aresta>();
            for (int i = 0; i < grafo.size(); i++) {
                Aresta arestaItem = grafo.get(i);
                if (!arestaItem.equals(aresta)) {
                    /* List<Vertice> verticeList = new ArrayList<Vertice>();
                       verticeList.add(arestaItem.verticeU);
                       verticeList.add(arestaItem.verticeV);
                       for(int j ; )*/
                    if (vertice.equals(arestaItem.verticeU) || vertice.equals(arestaItem.verticeV)) {
                        vizinhos.add(arestaItem);
                        pulo++;
                        this.arestasVizinhas(grafo, this.getProxVertice(arestaItem, vertice), arestaItem, vizinhos, pulo);
                    }
                }
            }
        }
      
        

    }

    public Vertice getProxVertice(Aresta aresta, Vertice vertice) {
        if (aresta.verticeU.equals(vertice)) {
            return aresta.verticeV;
        } else {
            return aresta.verticeU;
        }

    }

}
