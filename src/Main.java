import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<String> listaCursos = new ArrayList<>();
    public static List<String> professores = new ArrayList<>();
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        popularListas();
        byte opcao;

        imprimirBoasVindas();

        do {
            imprimirOpcoes();
            opcao = entrada.nextByte();

            switch (opcao){
                case 0:
                    imprimirLista(professores, "Professores");
                    imprimirLista(listaCursos, "Cursos");
                    System.out.println("\nEncerrando...");
                    break;
                case 1:
                    gerarMenu(professores, "Professores");
                    break;
                case 2:
                    gerarMenu(listaCursos, "Cursos");
                    break;
                default:
                    System.out.println("\nOpção invalida!");
                    break;
            }
        } while (opcao != 0);

        entrada.close();
    }

    public static void imprimirBoasVindas() {
        System.out.println(
                "┳┓         •   ┓  \n" +
                "┣┫┏┓┏┳┓  ┓┏┓┏┓┏┫┏┓\n" +
                "┻┛┗ ┛┗┗  ┗┛┗┛┗┗┻┗┛\n" +
                "Esperamos que você aproveite ao máximo sua experiência aqui."
        );
    }
    public static void imprimirOpcoes() {
        System.out.print(
                        "\n------------------------------------------------------\n" +
                        "                        OPÇÕES                        \n" +
                        "------------------------------------------------------\n" +
                        "[1] Professor\n" +
                        "[2] Curso\n" +
                        "[0] Sair \n" +
                        "------------------------------------------------------\n" +
                        "Digite o número da opção que você deseja interagir: "
        );
    }

    public static void imprimirMenu(String tipo) {
        System.out.print(
                "\n--------------------------------------------------------------------\n" +
                "                                MENU                                \n" +
                "--------------------------------------------------------------------\n" +
                "[1] Listar " + tipo +
                "\n[2] Adicionar " + tipo +
                "\n[0] Sair \n" +
                "--------------------------------------------------------------------\n" +
                "Por favor, digite o número da opção do menu que você deseja acessar: "
        );
    }

    public static void imprimirLista(List<String> lista, String tipo) {
        System.out.println("\n*************************");
        System.out.println(tipo);
        System.out.println("*************************");
        for (int indice = 0; indice < lista.size(); indice++){
            System.out.println(indice + "- " + lista.get(indice));
        }
        System.out.println("*************************");
    }

    public static void gerarMenu(List<String> lista, String tipo) {
        Scanner entrada = new Scanner(System.in);
        byte opcao;
        do {
            imprimirMenu(tipo);
            opcao = entrada.nextByte();

            switch (opcao) {
                case 0:
                    imprimirLista(lista, tipo);
                    System.out.println("\nVoltando ao menu anterior!");
                    break;
                case 1:
                    imprimirLista(lista, tipo);
                    break;
                case 2:
                    adicionarItemLista(lista);
                    break;
                default:
                    System.out.println("\nOpção invalida!");
                    break;
            }
        } while (opcao != 0);
    }

    public static void adicionarItemLista(List<String> lista) {
        Scanner entrada = new Scanner(System.in);
        String item;

        do {
            System.out.print("\nInforme o item a ser cadastrado ou [s] para sair: ");
            item = entrada.nextLine();
            if (item.equals("s")) {
                System.out.println("Finalizando cadastro.");
                continue;
            }
            if (item.isEmpty()){
                System.out.println("Não conseguimos efetuar o cadastro.");
                continue;
            }
            if (lista.contains(item)){
                System.out.println("Item já cadastrado.");
                continue;
            }
            lista.add(item);
            System.out.println("Cadastrado realizado com sucesso.");
        } while (!item.equals("s"));
    }

    public static void popularListas() {
        listaCursos.add("CSS");
        listaCursos.add("JS");
        professores.add("Pâmela");
        professores.add("Rafael");
    }
}