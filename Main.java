package licaoDeCasaM4;

public class Main {

    public static void main(String... args) {

        Integer quantidadePneus;
        Carro carro = new Carro(4);
        carro.setCor(Carro.PRATA);
        carro.setCombustivel(Carro.GASOLINA);

        carro.imprimeValores();
    }
}
