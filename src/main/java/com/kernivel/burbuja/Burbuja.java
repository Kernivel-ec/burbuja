/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kernivel.burbuja;
// Importamos la libreria para ingresar datos por teclado
import java.util.Scanner;
/**
 *
 * @author UNG. Roberto Calero
 */
public class Burbuja {

    public static void main(String[] args) {
        // Definimos la variable de ingreso de datos por teclado
        Scanner temp = new Scanner(System.in);
        //Definimos variables a utilizar
        //Nota: cantidad sera cuantos numeros vamos a ingresar y aux sera un auxiliar para cambiar de lugar los numeros al ordenar
        int cantidad, aux;
        //Ordenar nuemero de menor a mayor mediante el codigo burbuja
        //Titulo del programa
        System.out.println("Codigo Burbuja");
        //// Peticion de ingreso de datos
        System.out.println("Ingrese cantidad de números a ordenar");
        //Guardamos los datos ingresados en la variable "cantidad"
        cantidad = temp.nextInt();
        //Creamos un array que contenga los numeros a ingresar
        //Nota: cantidad determina cuantas posiciones/indices tendra el vector
        int numeros [] = new int[cantidad];
        //Ciclo repetitivo inicia en 0 hasta la cantidad
        //Nota: recordemos que en programacion siempre iniciamos en 0 las posiciones en cadenas, vectores y matrices
        for(int x=0 ; x < cantidad ; x++){
           //Mensaje solicitando el numero
           //Nota: Al concatenar/unir/anidar variables al mensaje enceramos en un parentesis para que sume (0+1) = 1 caso contrario 0+1 = 01
           System.out.println("Ingrese numero "+(x+1)); 
           //Ingresamos el numero y lo alojamos en la posicion x del vector
           numeros[x] = temp.nextInt();
        }
        //Creamos un for para recorrer todo el vertor.
        for(int i = 0 ; i < cantidad ; i++){
            /*
            Creamos un for para recorrer desde la posicion de i hasta el final del vector
            Nota: este for inicia mas 1, esto es para hacer la comparacion del for anterior i con el numero siguiente j
            Explicacion: Si i = 0 tomamos el valor del vector numeros[0] posicion 0 y la comparamos con el mismo vector 
            numeros[j] que seria posicion j+1=1 de tal manera numeros[0] > numeros[1], de ser verdadero intecambiamos los valores
            */
            for(int j = i+1 ; j < cantidad ; j++){
                //Verificamos el numero mayor, de ser verdadero se intercambian
                if(numeros[i] > numeros[j]){
                    //aux guarda el valor actual de la posision del vector i
                    aux = numeros[i];
                    //Intercambiamos el valor actual de la posicion i con la posicion j
                    numeros[i] = numeros[j];
                    //Cambiamos el valor actual de la posicion j con el de aux
                    numeros[j] = aux;
                }
            }
        }
        //Salida de resultados
        System.out.println("Ordenados");
        //Ciclo for que recorre todas las posiciones del vector
        for(int y = 0 ; y < cantidad ; y++){
            //Impresionde datos en pantalla
            System.out.println(numeros[y]);
        }
    }
}
/*
El codigo burbuja se compone de dos for los cuales uno recorre todo el vector y el segundo recorre las posiciones faltantes que el
primero aun no recorre.
*/