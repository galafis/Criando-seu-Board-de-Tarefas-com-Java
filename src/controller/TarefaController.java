package controller;

import java.util.List;
import model.Tarefa;
import service.TarefaService;

public class TarefaController {
    private TarefaService service;

    public TarefaController() {
        service = new TarefaService();
    }

    public void adicionar(String titulo) {
        service.criarTarefa(titulo);
    }

    public void listar() {
        List<Tarefa> tarefas = service.listarTarefas();
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
        } else {
            tarefas.forEach(System.out::println);
        }
    }

    public void mover(int id, String status) {
        if (service.moverTarefa(id, status)) {
            System.out.println("Tarefa movida com sucesso!");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void remover(int id) {
        if (service.removerTarefa(id)) {
            System.out.println("Tarefa removida.");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }
}
