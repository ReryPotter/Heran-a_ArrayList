import java.util.*;

public class Cadastro {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
        int opcao = 0;

        Virtual objJogadorVirtual = new Virtual();
        Fisico objJogadorFisico = new Fisico();
        Convidado objJuizConvidado = new Convidado();
        Contratado objJuizContratado = new Contratado();

        do {
            try {
                
                System.out.println("\n\n----------------- MENU -----------------");
                System.out.println("1 - Cadastrar Jogador Virtual");
                System.out.println("2 - Cadastrar Jogador Fisico");
                System.out.println("3 - Cadastrar Juiz Convidado");
                System.out.println("4 - Cadastrar Juiz Contratado");
                System.out.println("11 - Listar Jogadores Virtuais");
                System.out.println("12 - Listar Jogadores Fisicos");
                System.out.println("13 - Listar Juizes Convidados");
                System.out.println("14 - Listar Juizes Contratados");
                System.out.println("21 - Listar Jogadores de Volei");
                System.out.println("22 - Mostrar os 3 melhores jogadores do ranking");
                System.out.println("23 - Pesquisar jogador por nome");
                System.out.println("100 - Sair");
                System.out.println("----------------------------------------------");

                System.out.print("Digite a opção desejada: ");
                opcao = ler.nextInt();

                switch (opcao) {
                    case 1:// Cadastrar Jogador Virtual
                        System.out.println("\nCadastrar Jogador Virtual");
                        while (true) {
                            try {
                                System.out.print("Digite o ID: ");
                                int id = Integer.parseInt(ler.nextLine());
                                if (id < 0 && id > 1000) {
                                    objJogadorVirtual.setId(id);
                                    break;
                                } else {
                                    System.out.println("ID inválido! O ID deve ser entre 0 e 1000.");
                                }
                            } catch (Exception e) {
                                System.out.println("Valor inválido! O ID deve ser um número inteiro.");
                            }
                            break;
                        }
                        System.out.print("Digite o Nome: ");
                        objJogadorVirtual.setNome(ler.next());
                        System.out.print("Digite o Email: ");
                        objJogadorVirtual.setEmail(ler.next());
                        System.out.print("Digite o Esporte: ");
                        objJogadorVirtual.setEsporte(ler.next());
                        System.out.print("Digite a Idade: ");
                        objJogadorVirtual.setIdade(ler.nextInt());
                        System.out.print("Digite o Tipo de Jogo: ");
                        objJogadorVirtual.setTipoJogo(ler.next());
                        System.out.print("Digite a Posição no Ranking: ");
                        objJogadorVirtual.setPosicaoRanking(ler.nextInt());
                        System.out.println("\nJogador Virtual cadastrado com sucesso!\n");                  
                        break;

                    case 2:
                        // Cadastrar Jogador Fisico
                        System.out.println("\nCadastrar Jogador Fisico");
                        System.out.print("Digite o ID: ");
                        objJogadorFisico.setId(ler.nextInt());
                        System.out.print("Digite o Nome: ");
                        objJogadorFisico.setNome(ler.next());
                        System.out.print("Digite o Email: ");
                        objJogadorFisico.setEmail(ler.next());
                        System.out.print("Digite o Esporte: ");
                        objJogadorFisico.setEsporte(ler.next());
                        System.out.print("Digite a Idade: ");
                        objJogadorFisico.setIdade(ler.nextInt());
                        System.out.print("Digite o Modalidade: ");
                        objJogadorFisico.setModalidade(ler.next());
                        System.out.print("Digite a Categoria: ");
                        objJogadorFisico.setCategoria(ler.next());
                        System.out.println("\nJogador Fisico cadastrado com sucesso!\n");                  
                        break;

                    case 100:
                        System.out.println("Saindo do sistema...");
                        break;
                    
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                ler.nextLine(); // Limpa o buffer do scanner
            }
        } while (opcao != 100);

    }
}