package service;

import java.util.List;
import model.Tarefa;
import repository.TarefaRepository;

public class TarefaService {
    private TarefaRepository repository;

    public TarefaService() {
        repository = new TarefaRepository();
    }

    public void criarTarefa(String titulo) {
        repository.adicionar(titulo);
    }

    public List<Tarefa> listarTarefas() {
        return repository.listar();
    }

    public boolean moverTarefa(int id, String novoStatus) {
        return repository.mover(id, novoStatus);
    }

    public boolean removerTarefa(int id) {
        return repository.remover(id);
    }
}
