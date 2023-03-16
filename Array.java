package Package1;

import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    // 1. Declara un arreglo de 15 enteros.
    int[] arregloEnteros = new int[15];

    // 2. Declara un arreglo que guarde 20 nombres.
    String[] arregloNombres = new String[20];

    // 3. Declara un arreglo de 100 objetos de la clase Circulo.
    Circulo[] arregloCirculos = new Circulo[100];

    // 4. Asigna un valor de 5 a la décima posición en el arreglo declarado que guarda enteros.
    arregloEnteros[9] = 5;

    // 5. Inserta "Francisco" en la primer posición del arreglo declarado para guardar nombres.
    arregloNombres[0] = "Francisco";

    // 6. Escribe un método para mostrar los contenidos de un arreglo.
    mostrarArreglo(arregloEnteros);
    mostrarArreglo(arregloNombres);
    mostrarArreglo(arregloCirculos);

    // 7. Escribe un método para buscar un valor en el arreglo.
    int posicion = buscarValor(arregloEnteros, 5);
    System.out.println("El valor 5 está en la posición " + posicion);

    // 8. Escribe un método para eliminar un valor en un arreglo.
    eliminarValor(arregloNombres, "Francisco");
    mostrarArreglo(arregloNombres);
  }

  public static void mostrarArreglo(int[] arreglo) {
    System.out.println(Arrays.toString(arreglo));
  }

  public static void mostrarArreglo(String[] arreglo) {
    System.out.println(Arrays.toString(arreglo));
  }

  public static void mostrarArreglo(Circulo[] arreglo) {
    System.out.println(Arrays.toString(arreglo));
  }

  public static int buscarValor(int[] arreglo, int valor) {
    for (int i = 0; i < arreglo.length; i++) {
      if (arreglo[i] == valor) {
        return i;
      }
    }
    return -1;
  }

  public static void eliminarValor(String[] arreglo, String valor) {
    for (int i = 0; i < arreglo.length; i++) {
      if (arreglo[i] != null && arreglo[i].equals(valor)) {
        for (int j = i; j < arreglo.length - 1; j++) {
          arreglo[j] = arreglo[j+1];
        }
        arreglo[arreglo.length-1] = null;
        break;
      }
    }
  }
}

class Circulo {
  // implementación de la clase Circulo
}
