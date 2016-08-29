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
     public List<Aresta> removeAtresta = new ArrayList<Aresta>();

    
    public DetecAresta(List<Aresta> grafo){
        for(int i = 0; i<grafo.size();i++){
            Aresta aresta =  grafo.get(i);
            this.verificaArestas(grafo, aresta);
        }
    }
    
    
    public void verificaArestas(List<Aresta> grafo, Aresta aresta) {
        List<Aresta> vizinhosVertice = new ArrayList<Aresta>();
        arestasVizinhas(grafo, aresta.verticeU, aresta, vizinhosVertice, 0);
        boolean refA = analiseEstatistica(vizinhos, aresta);
        vizinhos = new ArrayList<Aresta>();
        List<Aresta> vizinhosVertices = new ArrayList<Aresta>();
        arestasVizinhas(grafo, aresta.verticeV, aresta, vizinhosVertices, 0);
        boolean refB = analiseEstatistica(vizinhos, aresta);
       
        if (refA && refB) {
            
            removeAtresta.add(aresta);
        } 
    }

    /*
    procura os vizinhos de acordo com a profundidade
    List<Aresta> grafo: arvore geradora mínima
    Vertice vertice: vertice no qual será analisado so vozinhos
    Aresta aresta: aresta que será testada 
    List<Aresta> vizinhos: lista que receberá os vizinhos
    int pulo: contador de profundidade, verificara o critério de parada da recurcividade, sempre começa com "0"
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

    /*
    realiza os cálulos  estatísticos para avalição da aresta 
     */
    public boolean analiseEstatistica(List<Aresta> vizinhosA, Aresta arestaAvaliacao) {
        double media = 0;
        double variacao = 0;
        double desvio = 0;
        boolean verifica = false;
        if (vizinhosA.size() > 1) {
            for (int i = 0; i < vizinhosA.size(); i++) {
                Aresta aresta = vizinhosA.get(i);

                media += aresta.distacia;
            }

            media = (media / vizinhosA.size());

            for (int i = 0; i < vizinhosA.size(); i++) {
                Aresta aresta = vizinhosA.get(i);
                variacao +=Math.pow(Math.abs(aresta.distacia - media), 2);
            }

            variacao = (variacao / (vizinhosA.size()-1));

            desvio = Math.sqrt(variacao);

            double tamanho = media + (profundidade * desvio);
            if (arestaAvaliacao.distacia > tamanho) {
               // System.out.println(verifica + "  arestaAvaliacao.distacia: " + arestaAvaliacao.distacia + "  tamanho:" + tamanho+ " numV:"+vizinhosA.size());
               //  System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                verifica = true;
            }
            //System.out.println(verifica + "  arestaAvaliacao.distacia: " + arestaAvaliacao.distacia + "  tamanho:" + tamanho);
            return verifica;
        }else{
            
            return false;
        }

    }

}
