package arreys;

public class exercicio1 {
    public static void main(String[] args) {
        double soma=0;
        double  media;

        double[] valores = new double[10];
        valores[0]=12.25;
        valores[1]=78.15;
        valores[2]=24.22;
        valores[3]=87.33;
        valores[4]=22.11;
        valores[5]=45.11;
        valores[6]=33.55;
        valores[7]=45.22;
        valores[8]=78.11;
        valores[9]=45.33;

    
    for(int index=0; index <valores.length; index++){
        soma = soma+valores[index];
    }
    media= soma/10;

    System.out.printf("a media e:%.2f\n",media);
}
}
