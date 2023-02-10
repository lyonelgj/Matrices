import java.util.Scanner;

public class Matriz {
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


        //Inicializar directamente la matriz
       /* int[][]m={{1,2,3},
                  {4,5,6},
                  {7,8,9}};*/
        //Leer el valor a buscar en la matriz
        System.out.println("Introduce el valor a buscar: ");
        int valor = sc.nextInt();
        //Variable que cuenta el numero de veces que aparece el valor
        int cont = 0;
        //Se recorre la matriz para la búsqueda del elemento
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j]==valor){
                    cont++;
                }
            }
        }
        System.out.println("El valor a buscar se repite " + cont + " veces");
    }
}
