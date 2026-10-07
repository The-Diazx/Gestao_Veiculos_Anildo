public class Motocicleta extends Veiculo {
    private int cilindrada;

    public Motocicleta(String marca, String modelo, int ano, double valorDiaria, int cilindrada) {
        super(marca, modelo, ano, valorDiaria);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() { return cilindrada; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Especificação -> Tipo: Motocicleta | Cilindrada: " + cilindrada + "cc");
    }
}