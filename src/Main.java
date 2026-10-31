
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> tarefas = new ArrayList<>();
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
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Digite o nome da tarefa: ");

                    String nomeTarefa = scanner.nextLine();

                    tarefas.add(nomeTarefa);

                    System.out.println("Tarefa cadastrada!");

                    break;

                case 2:

                    System.out.println("\n===== LISTAGEM =====");

                    for (String tarefa : tarefas) {
                        System.out.println(tarefa);
                    }

                    break;

                case 3:
                    System.out.println("Conclusão de tarefa");
                    break;


                case 4:
                    System.out.println("Exclusão de tarefa");

                    if (tarefas.isEmpty()){
                        System.out.println("Tarefa vazia");
                    } else {

                        for(int i = 0; i < tarefas.size(); i++){
                            System.out.println( (i + 1 ) + "-" + tarefas.get(i));
                        }

                    }

                    System.out.print("Digite o numero da tarefa escolhida para remoção:  ");
                    int numeroEscolhido = scanner.nextInt();
                    int indice = numeroEscolhido - 1;

                    if (indice >= 0 && indice < tarefas.size()){
                        System.out.println(tarefas.get(indice) + "removida");
                        tarefas.remove(indice);

                    } else {
                        System.out.println("Numero de tarefa inválido");
                    }



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
