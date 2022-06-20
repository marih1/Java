package Ex11;

public class Elevador {

    private int andar;
    private int totalDeAndares;
    private int capacidade;
    private int pessoas;

    public Elevador() {
    }

    public Elevador(int andar, int totalDeAndares, int capacidade, int pessoas) {
        this.andar = andar;
        this.totalDeAndares = totalDeAndares;
        this.capacidade = capacidade;
        this.pessoas = pessoas;
    }

    public int entrar() {
        if (this.pessoas < this.capacidade) {
            this.pessoas += 1;
        } else {
            System.out.println("Elevador lotado.");
        }
        return pessoas;
    }

    public int sair() {
        if (this.pessoas > 0) {
            this.pessoas -= 1;
        } else {
            System.out.println("Elevador vazio.");
        }
        return pessoas;
    }

    public int subir() {
        if (this.andar < this.totalDeAndares) {
            this.andar += 1;
        } else {
            System.out.println("Ultimo andar.");
        }
        return andar;
    }

    public int descer() {
        if (this.andar > 0) {
            this.andar -= 1;
        }
        return andar;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }
}
