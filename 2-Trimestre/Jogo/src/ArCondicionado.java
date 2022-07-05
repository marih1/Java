public class ArCondicionado {

    private String modelo;
    private int temperatura;
    private int velocidade;
    private boolean ligado;
    private boolean oscilar;
    private int timer;

    public ArCondicionado() {
    }

    public ArCondicionado(String modelo, int temperatura) {
        this.modelo = modelo;
        this.temperatura = temperatura;
    }

    public ArCondicionado(String modelo, int temperatura, int velocidade, boolean ligado, boolean oscilar, int timer) {
        this.modelo = modelo;
        this.temperatura = temperatura;
        this.velocidade = velocidade;
        this.ligado = ligado;
        this.oscilar = oscilar;
        this.timer = timer;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isOscilar() {
        return oscilar;
    }

    public void setOscilar(boolean oscilar) {
        this.oscilar = oscilar;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    @Override
    public String toString() {
        return "ArCondicionado{" +
                "modelo='" + modelo + '\'' +
                ", temperatura=" + temperatura +
                ", velocidade=" + velocidade +
                ", ligado=" + ligado +
                ", oscilar=" + oscilar +
                ", timer=" + timer +
                '}';
    }
}
