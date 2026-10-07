public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, double valorDiaria, int quantidadePortas) {
        super(marca, modelo, ano, valorDiaria);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() { return quantidadePortas; }
    public void setQuantidadePortas(int quantidadePortas) { this.quantidadePortas = quantidadePortas; }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Especificação -> Tipo: Carro | Portas: " + quantidadePortas);
    }
}