import java.util.Date;
import java.util.Scanner;

public class Main {

    static Scanner read = new Scanner(System.in);

    static String alerta = null;
    static int base = 200;
    static String[] tipos_empregados = {"Horário", "Assalariado", "Comissionado"};
    static String[] metodo_pagamento = {"Cheque via correios", "Cheque em mãos", "Depósito bancário"};

    //Para manter organizados os empregados
    static int total_empregados = 0;
    static int index_empregados = 0;
    static Empregado[] empregados = new Empregado[base];
    static int index_agenda_pagamentos = 0;
    static AgendaPagamento[] agendas_pagamentos = new AgendaPagamento[25];

    public static void main(String[] args) {
        char opcao = '0';

        while(opcao != '8') {
            menu();
            opcao = read.next().charAt(0);

            switch (opcao) {
                case '1':
                    //listar_empregados();
                    System.out.println("Empregados\n");
                    break;
                case '2':
                    //rodar_folha_pagamento();
                    System.out.println("Rodando folha de pagamentos\n");
                    break;
                case '3':
                    //lancar_cartao_ponto();
                    System.out.println("Lançando cartão de ponto\n");
                    break;
                case '4':
                    //lancar_venda();
                    System.out.println("Lançando venda\n");
                    break;
                case '5':
                    //lancar_taxa_servico();
                    System.out.println("Lançando taxa de serviço\n");
                    break;
                case '6':
                    //listar_agendas_pagamento();
                    System.out.println("Listando agendas de pagamentos\n");
                    break;
                case '7':
                    //refazer_transacoes();
                    System.out.println("Undo/Redo\n");
                    break;
                case '8':
                    System.exit(0);
                    break;
                default:
                    alerta = "Opção Inválida!";
                    break;
            }
        }
    }

    public static void mostrar_alerta() {
        if (alerta != null) {
            System.out.println("\n" +alerta);

            alerta = null;
        }
    }

    public static void menu() {
        System.out.println("1 - Empregados");
        System.out.println("2 - Rodar Folha de Pagamentos");
        System.out.println("3 - Lançar Cartão de Ponto");
        System.out.println("4 - Lançar Venda");
        System.out.println("5 - Lançar Taxa de Serviço");
        System.out.println("6 - Listar Agendas de Pagamentos");
        System.out.println("7 - Undo/Redo");
        System.out.println("8 - Sair");
        System.out.print(">> ");
    }


}
