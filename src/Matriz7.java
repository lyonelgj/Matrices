import java.util.Scanner;

public class Matriz7 {
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
        int y = numfila - 1;
        int resultado = 0;
        for (int i = 0; i < matriz.length; i++){
            resultado += matriz[i][y];
            y--;
        }

        System.out.println("El resultado de la suma diagonal inversa es: " + resultado);
    }
}
