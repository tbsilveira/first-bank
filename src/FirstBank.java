import java.util.Scanner;

public class FirstBank {
    public static void main(String[] args) {

        String nome = "John Rambo";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("\n*********   Welcome to FIRST BANK   **********");
        System.out.println("Nome do cliente:  " + nome);
        System.out.println("Tipo de conta:    " + tipoConta);
        System.out.println("Saldo atual:      " + saldo);
        System.out.println("**********************************************\n");

        String menu = """
                ** Escolha uma operação **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Depositar valor
                4 - Sair
                
                """;

        Scanner leitor = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitor.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("Saldo atual: [ " + saldo + " ]\n");
                    break;

                case 2:
                    System.out.println("Informe o valor a ser transferido:");
                    double valorTransferencia = leitor.nextDouble();
                    if (saldo <= valorTransferencia) {
                        System.out.println("Saldo insuficiente para realizar a operação \n" );
                        break;
                    } else {
                        saldo -= valorTransferencia;
                        System.out.println("Valor [ " + valorTransferencia + " ] transferido com sucesso!");
                        System.out.println("Saldo atual: [ " + saldo + " ]\n");
                        break;
                    }

                case 3:
                    System.out.println("Informe o valor a ser depositado:");
                    double valorDeposito = leitor.nextDouble();
                    if (valorDeposito <= 0) {
                        System.out.println("Valor do depósito deve ser maior que ZERO! \n" );
                        break;
                    } else {
                        saldo += valorDeposito;
                        System.out.println("Valor [ " + valorDeposito + " ] depositado com sucesso!");
                        System.out.println("Saldo atual: [ " + saldo + " ]\n");
                        break;
                    }

                case 4:
                    System.out.println("Obrigado e até breve!");
                    break;

                default:
                    System.out.println("Opção inválida! \n");
                    break;
            }
        }
    }
}
