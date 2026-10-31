
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n===== TASK MANAGER =====");
            System.out.println("1 - Cadastrar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Excluir tarefa");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Cadastro de tarefa");
                    break;

                case 2:
                    System.out.println("Listagem de tarefas");
                    break;

                case 3:
                    System.out.println("Conclusão de tarefa");
                    break;

                case 4:
                    System.out.println("Exclusão de tarefa");
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
