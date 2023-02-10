import java.util.Scanner;

public class Matriz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿De cuántas fila será la matriz?");
        int numfila = sc.nextInt();
        System.out.println("¿De cuántas columna será la matriz?");
        int numcolumna = sc.nextInt();

        int[][] matriz = new int[numfila][numcolumna];

        //Declarar e inicializar la matriz
        System.out.println("Lectura de elementos de la matriz: ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("A[" + i + "][" + j + "]= ");
                matriz[i][j] = sc.nextInt();
            }
        }

        //Variable que cuenta el numero de veces que aparece el valor
        int positivos = 0;
        int negativos = 0;
        //Se recorre la matriz para la búsqueda del elemento
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j]>=0){
                    positivos+=matriz[i][j];
                } else if (matriz[i][j] < 0) {
                    negativos+=matriz[i][j];
                }
            }
        }
        System.out.println("La suma de los positivos: " + positivos);
        System.out.println("La suma de los negativos: " + negativos);
    }
}
