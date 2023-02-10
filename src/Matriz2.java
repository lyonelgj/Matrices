import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿De cuántas filas será la matriz?");
        int numfilas = sc.nextInt();
        System.out.println("¿De cuántas columnas será la matriz?");
        int numcolumnas = sc.nextInt();

        int [][] matriz = new int[numfilas][numcolumnas];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("A[" + i + "][" + j + "]= ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Introduce el valor a buscar: ");
        int valor = sc.nextInt();

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j]==valor){
                    matriz[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
