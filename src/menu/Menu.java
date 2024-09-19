package src.menu;

import java.util.Scanner;

public class Menu {

  public static void options(){
    Scanner teclado = new Scanner(System.in);
    String option = "";

    while(!option.equals("x")) {
      System.out.println("Selecionar una opción para empezar el proceso");
      System.out.println("A.- Cargar Archivo");
      System.out.println("B.- Encriptar contenido");
      System.out.println("C.- Crear archivo con contenido encriptado");
      System.out.println("D.- Desencriptar archivo");
      System.out.println("E.- Desencriptar archivo con fuerza bruta");
      System.out.println("F.- Desencriptar archivo con análisis estadístico");
      System.out.println("X.- Salir");
      option = teclado.nextLine().toLowerCase();

      switch (option) {
        case "a" -> System.out.println(option + "1");
        case "b" -> System.out.println(option + "2");
        case "c" -> System.out.println(option + "3");
        case "d" -> System.out.println(option + "4");
        case "e" -> System.out.println(option + "5");
        case "f" -> System.out.println(option + "6");
      }

    }

    System.out.println("Fin del programa Baigon");
  }
}
