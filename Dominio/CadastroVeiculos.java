package Dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroVeiculos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> lista = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n1 - Cadastrar novo veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Tipo (1-Carro, 2-Moto, 3-Caminhão): ");
                int tipo = sc.nextInt();
                sc.nextLine();

                System.out.print("Modelo: ");
                String modelo = sc.nextLine();
                System.out.print("Placa: ");
                String placa = sc.nextLine();
                System.out.print("Ano: ");
                int ano = sc.nextInt();

                if (tipo == 1) {
                    System.out.print("Qtd de portas: ");
                    int portas = sc.nextInt();
                    lista.add(new Carro(placa, modelo, ano, portas));
                } else if (tipo == 2) {
                    System.out.print("Cilindrada: ");
                    int cilindrada = sc.nextInt();
                    lista.add(new Moto(placa, modelo, ano, cilindrada));
                } else if (tipo == 3) {
                    System.out.print("Capacidade de carga (em toneladas): ");
                    double carga = sc.nextDouble();
                    lista.add(new Caminhao(placa, modelo, ano, carga));
                } else {
                    System.out.println("Tipo inválido.");
                }

            } else if (opcao == 2) {
                if (lista.isEmpty()) {
                    System.out.println("Nenhum veículo cadastrado.");
                } else {
                    for (Veiculo v : lista) {
                        v.exibirDados(); 
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida.");
            }

        } while (opcao != 3);

        sc.close();
    }
}

