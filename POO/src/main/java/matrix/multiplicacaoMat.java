/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class multiplicacaoMat {
    public static void main(String[] arg){
        Scanner entrada = new Scanner(System.in);
        
        int matA[][] = new int[4][4];
        int matB[][] = new int[4][4];
        int matC[][] = new int[4][4];
        int matD[][] = new int[4][4];
        int matE[][] = new int[4][4];
        
        System.out.print("========== Mat A ==========\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Informe o valor coluna >> "+ i + "Linha >> "+j+":\n");
                matA[i][j] = entrada.nextInt();
                
            }
        }
        
        System.out.print("========== Mat B ==========\n");
        for (int k = 0; k < 4; k++) {
            for (int l = 0; l < 4; l++) {
                System.out.print("Informe o valor coluna >> "+ k + "Linha >> "+l+":\n");
                matB[k][l] = entrada.nextInt();
                
            }
        }
        
        
        
        //Multiplicação da matriz A pela matriz B 
        
        
        for (int m = 0; m < 4; m++) {
            for (int n = 0; n < 4; n++) {
                for (int x = 0; x < 4; x++) {
                    matC[m][n] = matA[m][x] * matB[x][n];
                }
            }
        }
        //Mostrando matriz resultadte:
        for (int a = 0; a < 4; a++) {
            System.out.print("\n[");
            for (int b = 0; b < 4; b++) {
                System.out.print("\t"+matC[a][b]+"\t");
            }
            System.out.print("]");
        }
        
        //Multipplicaçã da diagonal da matriz A pela Matriz B
        try {
            
            for (int o = 0; o < 4; o++) {
                for (int p = 0; p < 4; p++) {
                    if (p == o) {
                        matD[o][p] = matA[o][p] * matB[o][p];
                    }
                    else{
                        matD[o][p] = matA[o][p];
                    }
                }
            }
        } catch (Exception e) {
            System.out.print("Erro1:: "+ e);
        }
        
        //Multiplicação da Matriz D pela matriz C
        
        try {
            for (int q = 0; q < 4; q++) {
                for (int r = 4; r > 0; r--) {
                    matE[q][r] = matD[q][r] * matC[q][r];
                }
            }
            for (int s = 0; s < 4; s++) {
                for (int t = 0; t < 4; t++) {
                    if(matE[s][t] == 0){
                        matE[s][t] = matC[s][t];
                    }
                }
            }
        } catch (Exception e) {
            System.out.print("Erro2:: "+ e);
        }
        //Fim
        
    }
}
