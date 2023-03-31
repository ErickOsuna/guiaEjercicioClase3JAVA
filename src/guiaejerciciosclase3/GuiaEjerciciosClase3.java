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
        Ejercicio1C();
        Ejercicio2A();

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
        int a = -3;
        int b = 4;
        int c = 10;
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
            } else if ((c < b) && (c < a) && (b < a)) {
                System.out.println("C es el numero menor, A el numero del medio, y B es el numero mayor");
                array[0] = c;
                array[1] = b;
                array[2] = a;
            }
            System.out.println("Respuesta del Ejercicio 1B:");

            for (int iterador = 0; iterador < array.length; iterador++) {
                System.out.println(array[iterador]);
            }

        } else if (!ascendenteODescendente) {
            if ((a > b) && (a > c) && (b > c)) {
                System.out.println("A es el numero mayor, B el numero del medio, y C es el numero menor");
                array[0] = a;
                array[1] = b;
                array[2] = c;
            } else if ((a > c) && (a > b) && (c > b)) {
                System.out.println("A es el numero mayor, C el numero del medio, y B es el numero menor");
                array[0] = a;
                array[1] = c;
                array[2] = b;
            } else if ((b > a) && (b > c) && (a > c)) {
                System.out.println("B es el numero Mayor, A el numero del medio, y C es el numero menor");
                array[0] = b;
                array[1] = a;
                array[2] = c;
            } else if ((b > c) && (b > a) && (c > a)) {
                System.out.println("B es el numero mayor, C el numero del medio, y A es el numero menor");
                array[0] = b;
                array[1] = c;
                array[2] = a;
            } else if ((c > a) && (c > b) && (a > b)) {
                System.out.println("C es el numero mayor, A el numero del medio, y B es el numero menor");
                array[0] = c;
                array[1] = a;
                array[2] = b;
            } else if ((c > b) && (c > a) && (b > a)) {
                System.out.println("C es el numero mayor, A el numero del medio, y B es el numero menor");
                array[0] = c;
                array[1] = b;
                array[2] = a;
            }
            System.out.println("Respuesta del Ejercicio 1B:");

            for (int iterador = 0; iterador < array.length; iterador++) {
                System.out.println(array[iterador]);
            }
        }
    }

    public static void Ejercicio1C() {
        /*
        c.- Dado un vector de números, y un número X, que sume todos los números > X y retorne el resultado...
         */

        int arrayNumeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numeroX = 5;
        int sumatoria = 0;

        for (int indice = 0; indice < arrayNumeros.length; indice++) {

            if (arrayNumeros[indice] > numeroX) {
                sumatoria = sumatoria + arrayNumeros[indice];
            }
        }
        System.out.println("Respuesta del Ejercicio 1C:");
        System.out.println(sumatoria);
    }

    public static void Ejercicio2A() {

        /*
        2.- Genere una clase que tenga los métodos para realizar la codificación y decodificación de un string, dado un número de desplazamiento..
        
        => Por ejemplo, con desplazamiento de 1:
        
        "hola que tal" --> "ipmbarvfaubm"
        h --> i
        o --> p
        
        => Con desplazamiento en 2:
        
        "hola que tal" --> "jqncbswgbvcn"
        h --> j
        o --> q
        
        En el ejemplo estamos usando este abecedario: "abcdefghijklmnñopqrstuvwxyz".
        
        Para este ejercicio puede usar todos los métodos de String, tanto de instancia (por ejemplo length) como de clase, por ejemplo String.valueOf(arr) # donde arr es un char[]. Tenga a mano los javadocs del mismo.      
         */
 /* 
        String abecedario = "abcdefghijklmnopqrstuvwxyz";
        String frase = "hola que tal";
        int indiceDesplazamiento = 1;
        char guardado = ' ';

        String fraseSinEspacios = frase.replace(" ", "");

        char abecedarioCharArray[] = abecedario.toCharArray();
        char fraseSinEspaciosCharArray[] = fraseSinEspacios.toCharArray();

        for (int h = 0; h < abecedarioCharArray.length; h++) {
            if (abecedarioCharArray[h] == indiceDesplazamiento) {
                System.out.println(abecedarioCharArray[h]);
                guardado = abecedarioCharArray[h];
            }
        }
        
        //System.out.println(guardado);

        for (int indice = 0; indice < fraseSinEspaciosCharArray.length; indice++) {
            for (int i = 0; i < abecedarioCharArray.length; i++) {

                if (fraseSinEspaciosCharArray[indice] == abecedarioCharArray[i]) {
                    System.out.println(abecedarioCharArray[i]);
                }
            }
        }

        // String fraseDesplazada = new String(fraseSinEspaciosCharArray);
        System.out.println("Respuesta del Ejercicio 2A:");
         */
        char[] letras = {'a', 'b', 'c', 'd', 'z'};

        // Incrementar todas las letras en 1
        for (int i = 0; i < letras.length; i++) {
            letras[i]++;
        }

        // Mostrar las letras resultantes
        for (int i = 0; i < letras.length; i++) {
            System.out.print(Character.toUpperCase(letras[i]) + " ");
        }

    }
}
