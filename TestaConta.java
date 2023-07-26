class TestaConta {
    public static void main(String[] args) {
        Conta minhaConta;
        double rendimento;

        minhaConta = new Conta();
        minhaConta.setAgencia("1234-X"); 
        minhaConta.setNumero(78980);
        minhaConta.setTitular("Duke"); 
        minhaConta.deposita( 2000.0);
        
        Data data = new Data();
        data.setDia(25); 
        data.setMes(3);
        data.setAno(2023); 
        minhaConta.setDataDeAbertura(data); 

        minhaConta.saca(150.0);
        System.out.println(minhaConta.recuperaDadosParaImpressao());

        minhaConta.deposita(35.0);
        System.out.println("Saldo após depósito: " + minhaConta.getSaldo());

        rendimento = minhaConta.calculaRendimento();
        System.out.println("Rendimento: " + rendimento);
    }
}
