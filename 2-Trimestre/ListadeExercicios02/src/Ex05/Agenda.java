package Ex05;

public class Agenda {

    private String nome;
    private int contato;

    public Agenda() {
    }

    public Agenda(String nome, int contato) {
        this.nome = nome;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public int getContato() {
        return contato;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "nome='" + nome + '\'' +
                ", contato=" + contato +
                '}';
    }
}
