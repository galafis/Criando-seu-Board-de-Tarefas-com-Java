import controller.TarefaController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TarefaController controller = new TarefaController();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n== Board de Tarefas ==");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Mover tarefa");
            System.out.println("4. Remover tarefa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título da tarefa: ");
                    String titulo = scanner.nextLine();
                    controller.adicionar(titulo);
                    break;
                case 2:
                    controller.listar();
                    break;
                case 3:
                    System.out.print("ID da tarefa: ");
                    int idMover = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo status (A Fazer, Em Progresso, Concluído): ");
                    String status = scanner.nextLine();
                    controller.mover(idMover, status);
                    break;
                case 4:
                    System.out.print("ID da tarefa: ");
                    int idRemover = scanner.nextInt();
                    controller.remover(idRemover);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
