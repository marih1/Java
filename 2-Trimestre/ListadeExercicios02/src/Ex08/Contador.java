package Ex08;

public class Contador {

    private int contagem;

    public Contador() {
    }

    public Contador(int contagem) {
        this.contagem = contagem;
    }

    public int zerarContador() {
        this.contagem = 0;
        return contagem;
    }

    public int incrementarContador() {
        this.contagem++;
        return contagem;
    }

    public int getContagem() {
        return contagem;
    }

    public void setContagem(int contagem) {
        this.contagem = contagem;
    }
}
