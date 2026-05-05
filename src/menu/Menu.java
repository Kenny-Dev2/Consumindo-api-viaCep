package menu;

import model.Endereco;

import java.util.Scanner;

public class Menu {
  public void menuPrincipal() {
    System.out.println("========================================");
    System.out.println("       Buscador de Endereços");
    System.out.println("========================================");
    System.out.println("\nPor favor escolha uma das opções abaixo:");
    System.out.println("1 - Buscar um endereço pelo CEP");
    System.out.println("2 - Buscar endereço pelo nome da rua");
    System.out.println("3 - Sair\n");
    System.out.println("========================================");
    System.out.println("Escolha uma opção: ");
  }

  public void menuEndereco(Endereco endereco) {
    System.out.println("========================================");
    System.out.println("       Resultado da Busca");
    System.out.println("========================================\n");
    System.out.println(endereco);
    System.out.println("\nPressione ENTER para voltar ao menu...");
  }

}
