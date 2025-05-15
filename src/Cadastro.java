import java.util.*;

public class Cadastro {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
        int opcao = 0;

        Virtual objJogadorVirtual = new Virtual();
        Fisico objJogadorFisico = new Fisico();
        Convidado objJuizConvidado = new Convidado();
        Contratado objJuizContratado = new Contratado();

        ArrayList<Virtual> listaJogadoresVirtuais = new ArrayList<>();// Lista instanciada em Virtual (muito específica)
        ArrayList<Pessoa> lista = new ArrayList<>();// Lista instanciada em Pessoa (mais genérica)

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

                System.out.print("\nDigite a opção desejada: ");
                opcao = Integer.parseInt(ler.nextLine());

                switch (opcao) {
                    case 1:// Cadastrar Jogador Virtual
                        System.out.println("\nCadastrar Jogador Virtual");
                        while (true) {
                            objJogadorVirtual = new Virtual();// Criar nova instância a cada iteração

                            while (true) {
                                try {
                                    System.out.print("Digite o ID: ");
                                    int id = Integer.parseInt(ler.nextLine());
                                    if (id > 0 && id <= 1000) {
                                        objJogadorVirtual.setId(id);
                                        break;
                                    } else {
                                        System.out.println("ID inválido! O ID deve ser entre 0 e 1000.");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Valor inválido! O ID deve ser um número inteiro.");
                                }
                            }
                            System.out.print("Digite o Nome: ");
                            objJogadorVirtual.setNome(ler.nextLine());
                            System.out.print("Digite o Email: ");
                            objJogadorVirtual.setEmail(ler.nextLine());
                            System.out.print("Digite o Esporte: ");
                            objJogadorVirtual.setEsporte(ler.nextLine());
                            System.out.print("Digite a Idade: ");
                            objJogadorVirtual.setIdade(Integer.parseInt(ler.nextLine())); // usa nextLine + conversão
                            System.out.print("Digite o Tipo de Jogo: ");
                            objJogadorVirtual.setTipoJogo(ler.nextLine());
                            System.out.print("Digite a Posição no Ranking: ");
                            objJogadorVirtual.setPosicaoRanking(Integer.parseInt(ler.nextLine())); // usa nextLine + conversão
                            System.out.println("\nJogador Virtual cadastrado com sucesso!\n");
                            listaJogadoresVirtuais.add(objJogadorVirtual);
                            
                            System.out.println("Deseja cadastrar outro jogador virtual? (S/N)");
                            String resposta = ler.nextLine().trim().toLowerCase();
                            if (resposta.equals("n")){
                                break;
                            }
                        }
                        break;

                    case 2:
                        // Cadastrar Jogador Fisico
                        System.out.println("\nCadastrar Jogador Fisico");

                        objJogadorFisico = new Fisico(); // Criar nova instância a cada iteração

                        System.out.print("Digite o ID: ");
                        objJogadorFisico.setId(Integer.parseInt(ler.nextLine()));
                        System.out.print("Digite o Nome: ");
                        objJogadorFisico.setNome(ler.nextLine());
                        System.out.print("Digite o Email: ");
                        objJogadorFisico.setEmail(ler.nextLine());
                        System.out.print("Digite o Esporte: ");
                        objJogadorFisico.setEsporte(ler.nextLine());
                        System.out.print("Digite a Idade: ");
                        objJogadorFisico.setIdade(Integer.parseInt(ler.nextLine()));
                        System.out.print("Digite o Modalidade: ");
                        objJogadorFisico.setModalidade(ler.nextLine());
                        System.out.print("Digite a Categoria: ");
                        objJogadorFisico.setCategoria(ler.nextLine());
                        System.out.println("\nJogador Fisico cadastrado com sucesso!\n");
                        lista.add(objJogadorFisico);

                    break;
                    
                    case 11:
                        // Listar Jogadores Virtuais
                        System.out.println("\nOs jogadores virtuais cadastrados são:");
                        for (Virtual jogador : listaJogadoresVirtuais) {
                            if (jogador instanceof Virtual) {
                                System.out.println("ID: " + jogador.getId());
                                System.out.println("Nome: " + jogador.getNome());
                                System.out.println("Email: " + jogador.getEmail());
                                System.out.println("Esporte: " + jogador.getEsporte());
                                System.out.println("Idade: " + jogador.getIdade());
                                System.out.println("Tipo de Jogo: " + jogador.getTipoJogo());
                                System.out.println("Posição no Ranking: " + jogador.getPosicaoRanking());
                                System.out.println("----------------------------------------------");
                            }
                        }
                        break;

                    case 12:
                        // Listar Jogadores Fisicos
                        for (Pessoa jogador : lista) {
                            if (jogador instanceof Fisico) {
                                System.out.println("\nLista de Jogadores Fisicos:");
                                jogador.lista();
                            }
                        }
                        break;

                    case 21:
                        // Listar jogadores de Volei
                        System.out.println("\nOs jogadores de virtuais de Volei são:");
                        for (Virtual jogador : listaJogadoresVirtuais) {
                            if (jogador.getEsporte().equalsIgnoreCase("Volei") || jogador.getEsporte().equalsIgnoreCase("volei")) {
                                System.out.println("Nome: " + jogador.getNome());
                                
                            }
                        }
                        System.out.println("\nOs jogadores fisicos de Volei são:\n");
                        for (Pessoa jogador : lista) {
                            if (jogador instanceof Jogador) {
                                Jogador jogadorVolei = (Jogador) jogador;
                                if (jogadorVolei.getEsporte().equalsIgnoreCase("Volei") || jogadorVolei.getEsporte().equalsIgnoreCase("volei")) {
                                    System.out.println("Nome: " + jogadorVolei.getNome());
                                }
                            }
                        }
                    break;

                    case 22:
                        // Mostrar os 3 melhores jogadores do ranking
                        System.out.println("\nOs 3 melhores jogadores do ranking são:");
                        for (Virtual jogador : listaJogadoresVirtuais) {
                            if (jogador.getPosicaoRanking() <= 3) {
                                System.out.println("Nome: " + jogador.getNome());
                                System.out.println("Posição no Ranking: " + jogador.getPosicaoRanking());
                            }
                        }
                        
                    //     // Mostrar os 3 melhores jogadores do ranking
                    //     System.out.println("\nOs 3 melhores jogadores do ranking são:");
                    //     Collections.sort(listaJogadoresVirtuais, new Comparator<Virtual>() {
                    //         @Override
                    //         public int compare(Virtual j1, Virtual j2) {
                    //             return Integer.compare(j1.getPosicaoRanking(), j2.getPosicaoRanking());
                    //         }
                    //     });
                    //     for (int i = 0; i < Math.min(3, listaJogadoresVirtuais.size()); i++) {
                    //         Virtual jogador = listaJogadoresVirtuais.get(i);
                    //         System.out.println("Nome: " + jogador.getNome());
                    //         System.out.println("Posição no Ranking: " + jogador.getPosicaoRanking());
                    //     }
                    // break;
                    
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