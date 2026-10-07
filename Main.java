public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro("Toyota", "Corolla", 2023, 150.00, 4);
        Veiculo veiculo2 = new Motocicleta("Honda", "CB 500F", 2022, 90.00, 500);

        System.out.println("--- DADOS INICIAIS DOS VEÍCULOS ---");
        veiculo1.exibirInformacoes();
        System.out.println();
        veiculo2.exibirInformacoes();

        System.out.println("\n--- ALTERANDO DADOS (ENCAPSULAMENTO) ---");
        veiculo2.setValorDiaria(100.00);
        System.out.println("Novo valor da diária da moto: R$ " + veiculo2.getValorDiaria());

        System.out.println("\n--- CÁLCULO DE LOCAÇÃO (SOBRECARGA) ---");
        int diasLocacao = 5;

        double totalSemDesconto = veiculo1.calcularValorDiaria(diasLocacao);
        System.out.println("Locação do Corolla (" + diasLocacao + " dias): R$ " + totalSemDesconto);

        double totalComDesconto = veiculo1.calcularValorDiaria(diasLocacao, 10.0);
        System.out.println("Locação do Corolla (" + diasLocacao + " dias com 10% de desconto): R$ " + totalComDesconto);
    }
}