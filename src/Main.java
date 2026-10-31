
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> tarefas = new ArrayList<>();

        tarefas.add("Estudar");
        tarefas.add("Aprender uma nova atividade");
        tarefas.add("Olhar a paisagem");

        System.out.println(tarefas.get(1));
        System.out.println(tarefas.size());


        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(tarefas.get(i));

        }


//        Scanner scanner = new Scanner(System.in);
//
//        int opcao;
//
//        do {
//        // configuração padrão para o usuário - repetir continuamente
//            System.out.println("\n===== TASK MANAGER =====");
//            System.out.println("1 - Cadastrar tarefa");
//            System.out.println("2 - Listar tarefas");
//            System.out.println("3 - Concluir tarefa");
//            System.out.println("4 - Excluir tarefa");
//            System.out.println("0 - Sair");
//
//            System.out.print("Escolha uma opção: ");
//            opcao = scanner.nextInt();
//
//            switch (opcao) {
//
//                case 1:
//                    System.out.println("Cadastro de tarefa");
//                    break;
//
//                case 2:
//                    System.out.println("Listagem de tarefas");
//                    break;
//
//                case 3:
//                    System.out.println("Conclusão de tarefa");
//                    break;
//
//                case 4:
//                    System.out.println("Exclusão de tarefa");
//                    break;
//
//                case 0:
//                    System.out.println("Encerrando sistema...");
//                    break;
//
//                default:
//                    System.out.println("Opção inválida!");
//            }
//
//        } while (opcao != 0);
//
//        scanner.close();
//    }
    }    }
