import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<Chamado> chamados = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("===================================");
            System.out.println("          HELPDESK JAVA");
            System.out.println("===================================");
            System.out.println("1 - Abrir chamado");
            System.out.println("2 - Listar chamados");
            System.out.println("3 - Consultar chamado");
            System.out.println("4 - Encerrar chamado");
            System.out.println("0 - Sair");

            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Digite o nome do funcionário: ");
                    String nome = input.nextLine();
                    System.out.println("Funcioário: " + nome);

                    System.out.println("Digite o problema encontrado: ");
                    String problema = input.nextLine();
                    
                    Chamado chamado = new Chamado();
                    chamado.setFuncionario(nome);
                    chamado.setProblema(problema);
                    chamados.add(chamado);

                    System.out.println("Problema: " + problema);
                    System.out.println("Chamado aberto!");
                    break;
                
                case 2:
                    System.out.println("Listar chamados");
                    if(chamados.size() == 0){
                        System.out.println("Não ha chamados abertos");
                    }else{
                        for(int i = 0; i < chamados.size(); i++){
                            System.out.println("Chamado #" + (i + 1));
                            System.out.println("Data: " + chamados.get(i).getDataAberturaFormatada());
                            System.out.println("Funcionário: " + chamados.get(i).getFuncionario());
                            System.out.println("Problema: " + chamados.get(i).getProblema());
                            System.out.println("Status: " + chamados.get(i).getStatus());
                            System.out.println("-----------------------------------");
                        }
                    }
                    break;
                
                case 3:
                    System.out.println("Consultar chamado");
                    System.out.println("Digite o número do chamado: ");

                    int numero = input.nextInt();

                    if (numero < 1 || numero > chamados.size()){
                        System.out.println("Número de chamado inválido!");
                    }else{
                        Chamado c = chamados.get(numero - 1);
                        System.out.println("===== DADOS DO CHAMADO =====");
                        System.out.println("Data: " + c.getDataAberturaFormatada());
                        System.out.println("Funcionário: " + c.getFuncionario());
                        System.out.println("Problema: " + c.getProblema());
                        System.out.println("Status: " + c.getStatus());
                        System.out.println("=============================");
                    }

                    break;
                
                case 4:
                    System.out.println("Encerrar chamado");
                    System.out.println("Digite o numero do chamado: ");

                    int numeroEncerrar = input.nextInt();

                    if (numeroEncerrar < 1 || numeroEncerrar > chamados.size()){
                        System.out.println("Número de chamado inválido!");
                    } else {
                        Chamado c = chamados.get(numeroEncerrar - 1);
                        if(c.getStatus().equals("Encerrado")){
                            System.out.println("Este chamado já está encerrado!");
                        }else{
                            c.setStatus("Encerrado");
                            System.out.println("Chamado encerrado com sucesso");
                        }
                    }

                    break;
                
                case 0:
                    System.out.println("Programa encerrado com sucesso");
                    break;
                
                default:
                    System.out.println("Opção invalida");
            }

        } while(opcao != 0);


        input.close();
    }
}
