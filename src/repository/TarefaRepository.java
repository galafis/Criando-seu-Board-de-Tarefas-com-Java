package repository;

import java.util.ArrayList;
import java.util.List;
import model.Tarefa;

public class TarefaRepository {
    private List<Tarefa> tarefas = new ArrayList<>();
    private int proximoId = 1;

    public void adicionar(String titulo) {
        tarefas.add(new Tarefa(proximoId++, titulo, "A Fazer"));
    }

    public List<Tarefa> listar() {
        return tarefas;
    }

    public boolean mover(int id, String novoStatus) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.setStatus(novoStatus);
                return true;
            }
        }
        return false;
    }

    public boolean remover(int id) {
        return tarefas.removeIf(tarefa -> tarefa.getId() == id);
    }
}
