public class conta2 {
    private String agencia;
    private int numero;
    private String titular;
    private double saldo;
    private Data dataDeAbertura;

    boolean saca(double quantia) {
        if (saldo > quantia) {
            saldo = saldo - quantia;
            return true;
        } else {
            return false;
        }
    }

    void deposita(double quantia) {
        double novoSaldo = this.saldo + quantia;
        this.saldo = novoSaldo;
    }

    double calculaRendimento() {
        double taxaRendimento = 0.1;
        double rendimento = this.saldo * taxaRendimento;
        return rendimento;
    }

    String recuperaDadosParaImpressao() {
        String contaFormatada;
        contaFormatada = "Dados da Conta:\n";
        contaFormatada += "Agência: " + this.agencia + "\n";
        contaFormatada += "Número: " + this.numero + "\n";
        contaFormatada += "Titular: " + this.titular + "\n";
        contaFormatada += "Saldo: " + this.saldo + "\n";
        contaFormatada += "Data da abertura: " + this.dataDeAbertura.formatada() + "\n";
        return contaFormatada;
    }
}
