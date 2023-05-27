package licaoDeCasaM4;

public class Carro {

    public static final String VERMELHO = "vermelho";
    public static final String PRETA = "preta";
    public static final String PRATA = "prata";
    public static final String GASOLINA = "gasolina";
    public static final String ALCOOL = "alcool";

    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusoPneu;
    private Integer quantidadePortas = 4;

    public Integer getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(Integer quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }


    public Carro(Integer quantidadePneus) {
        setQuantidadePneus(quantidadePneus);
    }

    public Carro(Integer quantidadePortas) {
        setQuantidadePortas(quantidadePortas);
    }

    public Integer getQuantidadePneus() {
        return quantidadePneus + 1;
    }

    public void setQuantidadePneus(Integer quantidadePneus) {
        quantidadeCalotas = quantidadePneus;
        quantidadeParafusoPneu = quantidadePneus * 4;
        this.quantidadePneus = quantidadePneus;
    }

    public void setCor(String cor) {
        System.out.println(cor);

    }
    public void setCombustivel(String combustivel) {
        System.out.println(combustivel);
    }

    public void imprimeValores() {
        System.out.println("Quantidade de Pneus " + getQuantidadePneus());
        System.out.println("Quantidade de Calotas " + getQuantidadeCalotas());
        System.out.println("Quantidade de Parafuso " + getQuantidadeParafusoPneu());
        System.out.println("Quantidade de Portas " + getQuantidadePortas());
    }

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas;
    }

    public void setQuantidadeCalotas(Integer quantidadeCalotas) {
        this.quantidadeCalotas = quantidadeCalotas;
    }

    public Integer getQuantidadeParafusoPneu() {
        return quantidadeParafusoPneu;
    }

    public void setQuantidadeParafusoPneu(Integer quantidadeParafusoPneu) {
        this.quantidadeParafusoPneu = quantidadeParafusoPneu;
    }
}
