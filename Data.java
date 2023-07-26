class Data {
    private int dia;
    private int mes;
    private int ano;
   
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getDia() {
        return dia;
    }
   

    

    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    String formatada() {
        return dia + "/" + mes + "/" + ano;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }
}
