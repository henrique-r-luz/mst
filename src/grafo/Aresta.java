/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author henrique classes resposnsável por criar as aresesta
 */
public class Aresta {

    //aresta de saida
    public Vertice verticeU;
    //aresta de chegada
    public Vertice verticeV;
    //peso da aresta, valor da distância entre os dos pontos
    public double distacia;
    public List<Aresta> grafo = new ArrayList();
    //valor extremamente alto para verificação da menor distância
    public static final int valorAlto = 10000000;

    /*
    metodo que gera a árvore geradora mínima
    listaVerticeSemCon: lisa com os vértices sem conexão
    listaVerticeCon: lista com os vértices com conexão
    List<Aresta> subGrafo: grafo que contém a árvore geradora mínima
     */
    public void geraPrim(List<Vertice> listaVerticeSemCon, List<Vertice> listaVerticeCon, List<Aresta> subGrafo) {
        this.grafo = subGrafo;

        if (this.paradaRecurciva(listaVerticeSemCon)) {
            double refDist = valorAlto;
            Aresta arestaMinima = new Aresta();

            //escolhe a melhor aresta
            //aquela que possui a menor distância
            for (int i = 0; i < listaVerticeSemCon.size(); i++) {
                for (int j = 0; j < listaVerticeCon.size(); j++) {
                    //System.out.println(i);
                    Vertice verticeSemCon = (Vertice) listaVerticeSemCon.get(i);
                    Vertice verticeCon = (Vertice) listaVerticeCon.get(j);

                    double aux = this.dist(verticeCon, verticeSemCon);
                    if (aux < refDist) {
                        refDist = aux;
                        arestaMinima.verticeU = verticeCon;
                        arestaMinima.verticeV = verticeSemCon;
                        arestaMinima.distacia =refDist;
                      //  DecimalFormat df = new DecimalFormat("#,00");
                      //  arestaMinima.distacia =  Double.parseDouble(df.format(refDist));
                    }

                }
            }

            listaVerticeSemCon.remove(arestaMinima.verticeV);
            listaVerticeCon.add(arestaMinima.verticeV);
            subGrafo.add(arestaMinima);
            this.geraPrim(listaVerticeSemCon, listaVerticeCon, subGrafo);
        }

    }
    
    //calcula as distâncias entre os dois pontos
    public double dist(Vertice v1, Vertice v2) {

        double cateto1 = Math.abs((v1.getX() - v2.getX()));
        double cateto2 = Math.abs((v1.getY() - v2.getY()));
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

    }

    //para quando o grafo contemplar todas as aresta
    public boolean paradaRecurciva(List<Vertice> listaVerticeSemCon) {

        if (listaVerticeSemCon.size() == 0) {
           
            return false;
        } else {
            return true;
        }
    }

}
