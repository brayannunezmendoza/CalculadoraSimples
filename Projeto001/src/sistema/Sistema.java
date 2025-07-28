package sistema;

/**
 *
 * @author brayan
 */
public class Sistema {

    //mensagem 
    private String aviso = "Não é possivel dividir por zero";
    private double valor;
    private double resValor;

    public void conversao(String string) {
        valor = Double.parseDouble(string);
        string = "";
    }

    public void operacao(byte codigoOperacao) {
        switch (codigoOperacao) {
            case 0 ->resValor = valor;
            case 1 ->resValor = resValor + valor;
            case 2 ->{if (resValor == 0) {resValor = valor * -1;} else {resValor = resValor - valor;}}
            case 3 ->resValor = resValor * valor;
            case 4 -> {resValor = resValor / valor;}
            case 5 -> {resValor = 0;valor = 0;codigoOperacao = 0;}
        }
    }

    public double getResValor() {return resValor;}

    public double getValor() {return valor;}

    public String getAviso() {return aviso;}//configurar para que a mensagem seja ativa

}
