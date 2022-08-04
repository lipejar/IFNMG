import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Cria a conta
        Conta teste = new Conta();
        Cliente trouxa = new Cliente();


        //MENU
        System.out.println("--- MENU ----");
        int sair = 1;

        while (sair != 0){
            //Opções
            System.out.println("Escolha uma das seguintes opções:");
            System.out.println("1- Consultar Saldo"
                    + "\n2 - Depositar Dinheiro"
                    + "\n3 - Sacar Dinheiro"
                    + "\n4 - Inserir informações do cliente"
                    + "\n5 - Exibir informações do cliente"
                    + "\n0 - Sair");
            //Entrada
            int opc = Integer.parseInt(input.nextLine());

            //Decisão
            if (opc == 0) {
                break;
            }

            switch (opc){
                case 1:
                    System.out.println(teste.getSaldo());
                    break;

                case 2:
                    System.out.print("Digite o valor que deseja depositar: ");
                    float valorDeDeposito = Float.parseFloat(input.nextLine());
                    teste.depositar(valorDeDeposito);
                    System.out.println("====== Valor depositado com sucesso! =======");
                    break;

                case 3:
                    System.out.print("Digite o valor que deseja sacar: ");
                    float valorSaque = Float.parseFloat(input.nextLine());
                    teste.saque(valorSaque);

                    System.out.println("======= Valor Sacado com sucesso! ======");
                    break;

                case 4:
                    System.out.println("Digite o nome do Cliente: ");
                    trouxa.setNome(input.nextLine());

                    System.out.println("Digite o sobrenome do Cliente: ");
                    trouxa.setSobrenome((input.nextLine()));

                    System.out.println("Digite o CPF do Cliente usando apenas números: ");
                    trouxa.setCpf(input.nextLine());

                    System.out.println("======= Informações feitas com sucesso! =======");
                    break;

                case 5:
                    if (trouxa.isTesteNome() == null){
                        System.out.println("Informações não inseridas anteriormente.");
                        break;
                    }

                    System.out.println("Nome: "+ trouxa.getNome() +
                            "\nSobrenome: " + trouxa.getSobrenome() +
                            "\nCPF: " + trouxa.getCpf());
                    break;

                default:
                    System.out.println("Número inválido, por favor digite outro número!");

            }
        }

    }
    }

