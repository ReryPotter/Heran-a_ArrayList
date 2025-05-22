import java.util.Scanner;

public abstract class Pessoa {

    private int id;
    private String nome;
    private String email;

    // Setters and Getters
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    // Construtores
    public Pessoa() {
        id = 0;
        nome = new String();
        email = new String();
    }

    public Pessoa(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public void lista() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }

    public void cadastrar(Scanner ler) {
        while (true) {
            try {
                System.out.print("Digite o ID: ");
                int id = Integer.parseInt(ler.nextLine());
                if (id > 0 && id <= 1000) {
                    setId(id);
                    break;
                } else {
                    System.out.println("ID inválido! O ID deve ser entre 0 e 1000.");
                }
            } catch (Exception e) {
                System.out.println("Valor inválido! O ID deve ser um número inteiro.");
            }
        }
        while (true) {
            try {
                System.out.print("Digite o nome: ");
                String nome = ler.nextLine();
                if (nome.length() > 3 && nome.length() <= 100) {
                    setNome(nome);
                    break;
                } else {
                    System.out.println("Nome inválido! O nome deve ter entre 1 e 100 caracteres.");
                }
            } catch (Exception e) {
                System.out.println("Valor inválido! O nome deve ser uma string.");
            }
        }
        while (true) {
            try {
                System.out.print("Digite o email: ");
                String email = ler.nextLine();
                if (email.length() > 3
                    && email.length() <= 100
                    && email.contains("@")
                    && email.contains(".")
                    && email.contains(".com")) {
                    setEmail(email);
                    break;
                } else {
                    System.out.println("Email inválido! O email deve ter entre 1 e 100 caracteres.");
                }
            } catch (Exception e) {
                System.out.println("Valor inválido! O email deve ser uma string.");
            }
        }
    }
}