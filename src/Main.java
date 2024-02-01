import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<String> listaCursos = new ArrayList<>();
    public static List<String> professores = new ArrayList<>();
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte opcao = 1;

        imprimirBoasVindas();

        do {
            imprimirMenu();
            opcao = entrada.nextByte();

            switch (opcao){
                case 0:
                    System.out.println("\n--------------------------");
                    System.out.println("Professores cadastrados: ");
                    System.out.println("--------------------------");
                    imprimirLista(professores);
                    System.out.println("\n--------------------------");
                    System.out.println("Cursos cadastrados: ");
                    System.out.println("--------------------------");
                    imprimirLista(listaCursos);
                    System.out.println("\nEncerrando...");
                    break;
                case 1:
                    System.out.println("\nVocê entrou no modulo de cadastramento de professor!");
                    adicionarItemLista(professores);
                    imprimirLista(professores);
                    break;
                case 2:
                    System.out.println("\nVocê entrou no modulo de cadastramento de curso!");
                    adicionarItemLista(listaCursos);
                    imprimirLista(listaCursos);
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

    public static void imprimirMenu() {
        System.out.print(
                "--------------------------------------------------------------------\n" +
                "                                MENU                                \n" +
                "--------------------------------------------------------------------\n" +
                "[1] Adicionar professor \n" +
                "[2] Adicionar curso \n" +
                "[0] Sair \n" +
                "--------------------------------------------------------------------\n" +
                "Por favor, digite o número da opção do menu que você deseja acessar: "
        );
    }

    public static void imprimirLista(List<String> lista) {
        for (String item : lista){
            System.out.println(item);
        }
    }

    public static void adicionarItemLista(List<String> lista) {
        Scanner entrada = new Scanner(System.in);
        String item;

        do {
            System.out.print("Informe o item a ser cadastrado ou [s] para sair: ");
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
}