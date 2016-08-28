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
/*
classes que verificara a incoscistência das arestas
*/
public class DetecAresta {

    //profundidade da perquisa na arvo re geradora
    public static final int profundidade = 2;
    public List<Aresta> vizinhos;
    
    
    public void removeAresta(List<Aresta> grafo) {

    }
    /*
    procura os vizinhos de acordo com a profundidade
    List<Aresta> grafo: arvore geradora mínima
    Vertice vertice: vertice no qual será analisado so vozinhos
    Aresta aresta: aresta que será testada 
    List<Aresta> vizinhos: lista que receberá os vizinhos
    int pulo: contador de profundidade, verificara o critério de parada a recurcividade
    */
    public void arestasVizinhas(List<Aresta> grafo, Vertice vertice, Aresta aresta, List<Aresta> vizinhos, int pulo) {
        this.vizinhos = vizinhos;
        if (pulo < profundidade) {
            //  List<Aresta> vizinhos = new ArrayList<Aresta>();
            for (int i = 0; i < grafo.size(); i++) {
                Aresta arestaItem = grafo.get(i);
                if (!arestaItem.equals(aresta)) {
                    
                    if (vertice.equals(arestaItem.verticeU) || vertice.equals(arestaItem.verticeV)) {
                        vizinhos.add(arestaItem);
                        int aux = pulo;
                        aux++;
                        this.arestasVizinhas(grafo, this.getProxVertice(arestaItem, vertice), arestaItem, vizinhos, aux);
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
