package modelo;
/*
    A classe Usuario fornece o id, email nome e a senha de cada usuario.
    Ela gera herança para a classe Cliente e Funcionario.
    Seus construtores são: O construtor completo que permite instanciar o objeto com todos os atributos,
    o construtor com id e nome e o construtor com email e senha.

*/
/**
 * Classe Usuario
 * @author Pedro Lucas Garcia
 */
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String telefone; 

    /* Construtor completo */
    public Usuario(int id, String nome, String email, String senha, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }
    
    /* Construtor com id e nome */
    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    /* Construtor com id, email e senha */
    public Usuario(int id, String email, String senha) {
        this.id = id;
        this.email = email;
        this.senha = senha;
    }
    
    /* Construtor com email e senha */
    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}