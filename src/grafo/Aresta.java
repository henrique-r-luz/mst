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
public class Aresta {
    //aresta de saida

    public Vertice verticeU;
    //aresta de chegada
    public Vertice verticeV;
    public double distacia;
    public List<Aresta> grafo = new ArrayList();

    //já começa com o primero no removido
    public List<Vertice> listaParada;

    public Aresta criaPrimeiraAresta(Vertice inicio, List<Vertice> listaVertice) {
        double refDist = 100000;
        Aresta arestaMinima = new Aresta();
        for (int i = 0; i < listaVertice.size(); i++) {
            Vertice vertice = (Vertice) listaVertice.get(i);
            if (vertice != inicio) {
                double aux = this.dist(inicio, vertice);
                if (aux < refDist) {
                    refDist = aux;
                    arestaMinima.verticeU = inicio;
                    arestaMinima.verticeV = vertice;
                    arestaMinima.distacia = refDist;
                }
            }
        }
        return arestaMinima;
    }

    public void geraPrim(List<Vertice> listaVertice, List<Aresta> subGrafo) {
        this.grafo = subGrafo;
        // System.out.println(subGrafo.size());
        if (this.paradaRecurciva(listaVertice)) {
            double refDist = 100000;
            Aresta arestaMinima = new Aresta();
            for (int i = 0; i < listaVertice.size(); i++) {
                for (int j = 0; j < subGrafo.size(); j++) {
                    //System.out.println(i);
                    Vertice vertice = (Vertice) listaVertice.get(i);
                    Aresta aresta = (Aresta) subGrafo.get(j);

                    double auxU = this.dist(aresta.verticeU, vertice);
                    if (auxU < refDist) {
                        refDist = auxU;
                        //menorVertice = vertice;
                        arestaMinima.verticeU = aresta.verticeU;
                        arestaMinima.verticeV = vertice;
                        arestaMinima.distacia = refDist;
                    }

                    double auxV = this.dist(aresta.verticeV, vertice);
                    if (auxV < refDist) {
                        refDist = auxV;
                        arestaMinima.verticeU = aresta.verticeV;
                        arestaMinima.verticeV = vertice;
                        arestaMinima.distacia = refDist;
                    }

                }
            }
            //listaParada.remove(arestaMinima.verticeV);
            subGrafo.add(arestaMinima);
            this.geraPrim(listaVertice, subGrafo);
        }

    }

    public double dist(Vertice v1, Vertice v2) {
        if (v1.equals(v2) || existConexao(v1, v2) || existConexao(v2, v1)) {
            return 100000;
        } else {
            float cateto1 = Math.abs((v1.getX() - v2.getX()));
            float cateto2 = Math.abs((v1.getY() - v2.getY()));
            return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        }
    }

    public boolean existConexao(Vertice v1, Vertice v2) {
        for (int i = 0; i < this.grafo.size(); i++) {

            Aresta aresta = this.grafo.get(i);
          
                if (aresta.verticeU.equals(v1) && aresta.verticeV.equals(v2)) {
                    return true;
                }
         
        }

        return false;
    }

    //para quando o grafo conteplar todas as aresta
    public boolean paradaRecurciva(List<Vertice> listaVertice) {
        List<Vertice> paradaVertice = new ArrayList<Vertice>();
        for (int i = 0; i < this.grafo.size(); i++) {
            Aresta aresta = this.grafo.get(i);
            if (!paradaVertice.contains(aresta.verticeU)) {
                paradaVertice.add(aresta.verticeU);
            }
            if (!paradaVertice.contains(aresta.verticeV)) {
                paradaVertice.add(aresta.verticeV);
            }

        }
      /*  for (int i = 0; i < this.grafo.size(); i++) {

            Aresta aresta = this.grafo.get(i);
            if (aresta.verticeV != null) {
                System.out.println("aresta1 :" + aresta.verticeU.id + " ares2:" + aresta.verticeV.id);
            }
        }*/

        if (paradaVertice.size() == listaVertice.size()) {
             System.out.println(this.grafo.size());
            return false;
        } else {
            return true;
        }
    }

}
