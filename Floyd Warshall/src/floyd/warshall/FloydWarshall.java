/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floyd.warshall;

/**
 *
 * @author munizc
 */
public class FloydWarshall {

    /**
     * @param args the command line arguments
     */
    
    static void floyd_warshall(int grafo [][]){
    
        int distancia[][]=getMatrix(0,grafo);
        int caminos[][]=getMatrix(1,grafo);
        int tmp;
        for (int k = 0; k < 10; k++) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    tmp = distancia[i][k]+distancia[k][j];
                    if (tmp<distancia[i][j]) {
                        distancia[i][j] = tmp;
                        caminos[i][j]=k;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
