/**
 * Created by FranciscoSantos on 30/08/16.
 */

import java.util.*;


class Matrix1 {
    private static char A[][];
    private static int NL;
    private static int NC;

    //método construtor
    Matrix1(int n, int m) {
        A = new char[n][m];
        NL = n;
        NC = m;

    }

    // leitura dos NLxNC elementos da matriz
    void leMatriz(Scanner stdin) {

        for (int i = 0; i < NL; i++)
            for (int j = 0; j < NC; j++) {
                A[i][j] = stdin.next().charAt(0);
                System.out.print(A[i][j]);
            }
    }

    //funcao nao pedida
    public void print() {
        for(int lin=0; lin<NL; lin++){
            for(int col=0; col<NC; col++){
                System.out.print(A[lin][col]);
            }
            System.out.println();
        }
    }

    static int count() {

        int numberh = 0;

        for (int i = 0; i < NL; i++) {
            for (int j = 0; j < NC; j++) {

                if (A[i][j] =='#'){
                    numberh++;
                }
            }
        }
        System.out.println(numberh);
        return numberh;
    }
}
public class ContandoCardinais {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int flag = stdin.nextInt();
        if (flag==1){
            Matrix1.count();
        }
        int L = stdin.nextInt();
        int C = stdin.nextInt();

        Matrix1 a;
        a = new Matrix1(L,C);
        a.leMatriz(stdin);


        //if (flag == 1) {
           // System.out.println("%d", a.count());
        //}


    }
}

