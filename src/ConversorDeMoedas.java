import java.util.Scanner;

public class ConversorDeMoedas {
    String nomeMoedaDeOrigem;
    String nomeMoedaDeDestino;
    double valorDaCotaçao;
    double valorDeConversao;

    public void ObeterDadosDoUsuario(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual é a moeda de origem?");
        nomeMoedaDeOrigem= leitor.nextLine();

        System.out.println("Qual é a moeda de destino?");
        nomeMoedaDeDestino= leitor.nextLine();

        System.out.println(" Quanto custa atualmente 1 " + nomeMoedaDeDestino + " em " + nomeMoedaDeOrigem + "?");
        valorDaCotaçao= leitor.nextDouble();

        calcularConversorDeMoedas();
    }
    public void calcularConversorDeMoedas(){
        valorDeConversao= 1 / valorDaCotaçao;
        exibirDados();
    }

    public void exibirDados(){
        String valorDeConversaoComDoisDecimais = String.format("%.2f" , valorDeConversao);
        System.out.println(" 1 " + nomeMoedaDeOrigem + " equivale a " + valorDeConversaoComDoisDecimais + " " + nomeMoedaDeDestino);
    }
}
