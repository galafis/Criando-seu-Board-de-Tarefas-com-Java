package model;

public class Tarefa {
    private int id;
    private String titulo;
    private String status;

    public Tarefa(int id, String titulo, String status) {
        this.id = id;
        this.titulo = titulo;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "[" + id + "] " + titulo + " - " + status;
    }
}
