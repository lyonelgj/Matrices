import java.util.Scanner;

public class Matriz10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d;
        //Introducir las dimensiones de la matriz
        do {
            System.out.print("Introduce la dimensión de la matriz: ");
             d = sc.nextInt();

        } while (d<=4);{
            int[][] m = new int[d][d];
            //Se inicilia la matriz a 1
            for (int i = 0; i < m.length; i++){
                for (int j = 0; j < m.length; j++){
                    m[i][j] = 1;
                }
            }
            //Se declara la variable acumuladora
            int acumuladora = 0;
            //Se fijan las filas y se suman los elementos de esas filas
            for ( int j = 1; j < m[1].length-1; j++){
                acumuladora += m[1][j] + m[m.length-2][j];
            }
            for (int i = 2; i < m[1].length-2; i++){
                acumuladora += m[i][1] +  m[i][m.length-2];
            }
            System.out.println("El resultado es: " + acumuladora);
        }
    }
}







































/* System.out.println("¿De cuántas filas será la matriz?");
        int numFila = sc.nextInt();
        System.out.println("¿De cuántas columnas será la matriz?");
        int numColumna = sc.nextInt();

        int [][] matriz = new int[numFila][numColumna];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.println("[" + i + "][" + j +"]= ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int contador = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){

            }
        }*/

