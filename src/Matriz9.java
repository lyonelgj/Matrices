import java.util.Scanner;

public class Matriz9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿De cuántas fila será la matriz?");
        int numfila = sc.nextInt();
        System.out.println("¿De cuántas columna será la matriz?");
        int numcolumna = sc.nextInt();

        int[][] matriz = new int[numfila][numcolumna];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print("[" + i + "][" + j +"]= ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int suma = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                if (i > j){
                    suma += matriz[i][j];
                }
            }
        }
        System.out.println("La suma del triángulo inferior es: " + suma);
    }
}

