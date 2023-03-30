/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiaejerciciosclase3;

/**
 *
 * @author Siscop
 */
public class GuiaEjerciciosClase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1.- Utilizando solo tipos primitivos, String (solo usar método length), 
        vectores, iteraciones simples y condicionales, genere una clase por 
        ejercicio que posea los siguientes métodos:
         */
        Ejercicio1A();
        Ejercicio1B();

    }

    public static void Ejercicio1A() {
        /*
        a.- Dado un String y una letra, que cuente la cantidad de apariciones
        de la letra en el String.
         */

        String buscarLetra = "En este string, vamos a buscar una letra especifica";
        char letraABuscar = 'e';
        int contadorApariciones = 0;

        for (int indice = 0; indice < buscarLetra.length(); indice++) {
            if (buscarLetra.charAt(indice) == letraABuscar) {

                contadorApariciones++;
            }
        }
        System.out.println("Respuesta del Ejercicio 1A:");
        System.out.println("El Caracter '" + letraABuscar + "', aparece " + contadorApariciones + ".");
    }

    public static void Ejercicio1B() {

        /*
        b.- Dados 3 números y un orden (ascendente o descendente) que ordene los mismos y los retorne en un vector de 3.
         */
        int a = 3;
        int b = 2;
        int c = 1;
        int array[] = new int[3];
        boolean ascendenteODescendente = true; // Si es true, es ascendente, es decir, de menor a mayor...

        if (ascendenteODescendente) {

            if ((a < b) && (a < c) && (b < c)) {
                System.out.println("A es el numero menor, B el numero del medio, y C es el numero mayor");
                array[0] = a;
                array[1] = b;
                array[2] = c;
            } else if ((a < c) && (a < b) && (c < b)) {
                System.out.println("A es el numero menor, C el numero del medio, y B es el numero mayor");
                array[0] = a;
                array[1] = c;
                array[2] = b;
            } else if ((b < a) && (b < c) && (a < c)) {
                System.out.println("B es el numero menor, A el numero del medio, y C es el numero mayor");
                array[0] = b;
                array[1] = a;
                array[2] = c;
            } else if ((b < c) && (b < a) && (c < a)) {
                System.out.println("B es el numero menor, C el numero del medio, y A es el numero mayor");
                array[0] = b;
                array[1] = c;
                array[2] = a;
            } else if ((c < a) && (c < b) && (a < b)) {
                System.out.println("C es el numero menor, A el numero del medio, y B es el numero mayor");
                array[0] = c;
                array[1] = a;
                array[2] = b;
            } else if ((c<b) &&   (c<a) &&   (b<a)) {
                System.out.println("C es el numero menor, A el numero del medio, y B es el numero mayor");
                array[0] = c;
                array[1] = b;
                array[2] = a;
            }

        }
        System.out.println("Respuesta del Ejercicio 1B:");
        System.out.print(array[0]);
        System.out.print(array[1]);
        System.out.println(array[2]);

    }

}
