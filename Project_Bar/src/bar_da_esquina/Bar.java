package bar_da_esquina;

import java.util.Scanner;

public class Bar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Sexo (F ou M): ");
    char sexo = scanner.next().toUpperCase().charAt(0);

    System.out.print("Quantidade de cervejas: ");
    int cervejas = scanner.nextInt();

    System.out.print("Quantidade de refrigerantes: ");
    int refrigerantes = scanner.nextInt();

    System.out.print("Quantidade de espetinhos: ");
    int espetinhos = scanner.nextInt();

    double consumo = (cervejas * 5) + (refrigerantes * 3) + (espetinhos * 7);
    double ingresso = (sexo == 'F') ? 8 : 10;
    double couvert = (consumo > 30) ? 0 : 4;
    double valorTotal = consumo + couvert + ingresso;

    System.out.println("\nRELATÓRIO:");
    System.out.printf("Consumo = R$ %.2f\n", consumo);
    if (couvert == 0) {
      System.out.println("Isento de Couvert");
    } else {
      System.out.printf("Couvert = R$ %.2f\n", couvert);
    }
    System.out.printf("Ingresso = R$ %.2f\n", ingresso);
    System.out.printf("Valor a pagar = R$ %.2f\n", valorTotal);

    scanner.close();
  }
}