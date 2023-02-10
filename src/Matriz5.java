import java.util.Scanner;

public class Matriz5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿De cuántas fila será la matriz?");
        int numfila = sc.nextInt();
        System.out.println("¿De cuántas columna será la matriz?");
        int numcolumna = sc.nextInt();

        int[][] matriz = new int[numfila][numcolumna];

        //Declarar e inicializar la matriz
        System.out.println("Lectura de elementos de la matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                matriz[i][j] = sc.nextInt();
            }
        }
        int mayor = matriz[0][0];
        int posX = 0;
        int posY = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (mayor <  matriz[i][j] ){
                   mayor = matriz[i][j];
                   posX = i;
                   posY = j;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("El mayor es el " + mayor + " y su posición es [" + posX + "][" + posY + "]" );
    }
}
