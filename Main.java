package Package1;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] arregloEnteros = new int[15];
    String[] arregloNombres = new String[20];
    Circulo[] arregloCirculos = new Circulo[100];

    arregloEnteros[9] = 5;
    arregloNombres[0] = "Francisco";

    mostrarArreglo(arregloEnteros);
    mostrarArreglo(arregloNombres);
    mostrarArreglo(arregloCirculos);

    int posicion = buscarValor(arregloEnteros, 5);
    System.out.println("El valor 5 está en la posición " + posicion);

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


