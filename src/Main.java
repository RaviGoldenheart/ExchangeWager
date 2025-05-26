import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("para saber todas as moedas disponiveis, acesse: https://www.exchangerate-api.com/docs/supported-currencies" );
//        System.out.println("por favor, insira a moeda principal, moeda alvo e valor. pressione enter em cada inserção");
//
//        ExchangerRate exchangerRate = new ExchangerRate(scan.nextLine(), scan.nextLine(), scan.nextDouble());
//        System.out.println("moeda principal selecionada: " + exchangerRate.baseRate() + " moeda alvo selecionada: "
//                + exchangerRate.targetRate() + " valor á ser convertido: " + exchangerRate.rateValue());
        HttpHead brl = new HttpHead();
        Exchange x = brl.Requester("BRL");

        System.out.println(x.conversion_rates());

    }
}