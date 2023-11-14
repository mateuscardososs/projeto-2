public class Inventario {
    private Carta[] cartas;
    private int nivelAtual;
    private int cardcoins;

    public Inventario() {
        this.cartas = new Carta[200];
        this.nivelAtual = 1;
        this.cardcoins = 0;
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    public int getNivelAtual() {
        return nivelAtual;
    }

    public void setNivelAtual(int nivelAtual) {
        this.nivelAtual = nivelAtual;
    }

    public int getCardcoins() {
        return cardcoins;
    }

    public void setCardcoins(int cardcoins) {
        this.cardcoins = cardcoins;
    }

    public void adicionarCarta(Carta carta) {
        // Verifica se o inventário já está cheio
        if (cartas.length >= 200) {
            System.out.println("O inventário está cheio. Não é possível adicionar mais cartas.");
            return;
        }
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i] == null) {
                cartas[i] = carta;
                System.out.println("Carta adicionada ao inventário: " + carta.getNome());
                return;
            }
        }

        System.out.println("O inventário está cheio.");
    }

    public void removerCarta(Carta carta) {
    }
}