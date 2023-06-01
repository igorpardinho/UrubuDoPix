import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta();
        while (true) {
            System.out.println("""
                    _    _   _____    _    _   ____    _    _     _____     ____      _____    _____  __   __
                     | |  | | |  __ \\  | |  | | |  _ \\  | |  | |   |  __ \\   / __ \\    |  __ \\  |_   _| \\ \\ / /
                     | |  | | | |__) | | |  | | | |_) | | |  | |   | |  | | | |  | |   | |__) |   | |    \\ V /\s
                     | |  | | |  _  /  | |  | | |  _ <  | |  | |   | |  | | | |  | |   |  ___/    | |     > < \s
                     | |__| | | | \\ \\  | |__| | | |_) | | |__| |   | |__| | | |__| |   | |       _| |_   / . \\\s
                      \\____/  |_|  \\_\\  \\____/  |____/   \\____/    |_____/   \\____/    |_|      |_____| /_/ \\_\\
                                                            \s""");
            System.out.println("Escolha uma opção: 01-Criar conta | 02-Saque | 03-Depósito | 0-Para sair");
            Integer opcao = sc.nextInt();

            if (opcao.equals(1)) {
                conta = new Conta();
                sc = new Scanner(System.in);
                System.out.println("Digite seu nome: ");
                String nome = sc.nextLine();
                conta.setNome(nome);
                contas.add(conta);
                System.out.println("Conta criada com sucesso.");
            } else if (opcao.equals(2)) {
                if (conta.getNome() == null) {
                    System.out.println("[ATENÇAO] - Conta não criada");
                    continue;
                }
                System.out.println("Qual valor voce deseja sacar");
                Double valor = sc.nextDouble();
                conta.saque(valor);
            } else if (opcao.equals(3)) {
                if (conta.getNome() == null) {
                    System.out.println("[ATENÇAO] - Conta não Criada");
                    continue;
                }
                System.out.println("Qual valor voce deseja depositar");
                Double valor = sc.nextDouble();
                conta.deposito(valor);
                System.out.println("URUBU DO PIX TRABALHANDO... \uD80C\uDD42");
                System.out.println("RENDIDMENTO SENDO FEITO... \uD80C\uDD42");
            } else {
                break;
            }
            conta.mostrarContas(contas);
            


        }


    }
}