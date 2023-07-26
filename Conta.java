class Conta {
    private String agencia;
    private int numero;
    private String titular;
    private double saldo;
    private Data dataDeAbertura;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Data getDataDeAbertura() {
        return dataDeAbertura;
    }
    public void setDataDeAbertura(Data dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    boolean saca(double quantia) {
        if (saldo > quantia) {
            saldo = saldo - quantia;
            return true;
        }
        else {
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
