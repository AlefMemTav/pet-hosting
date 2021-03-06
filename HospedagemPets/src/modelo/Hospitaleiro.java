package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe Hospitaleiro.
 * @author Pedro Lucas Garcia
 */
public class Hospitaleiro extends Usuario {
    private int idHospitaleiro;
    private Date nascimento;
    private String cidade;
    private String genero;
    private String habitacao; // Casa ou apartamento
    private int servico; //Hospedagem, passeio, creche
    private int preco;
    
    /**
     * Construtor completo da classe hospitaleiro, que herda da classe Usuario.
     * @param idHospitaleiro
     * @param id
     * @param nivelDeAcesso
     * @param nome
     * @param email
     * @param nascimento
     * @param cidade
     * @param genero
     * @param habitacao
     * @param servico
     * @param preco 
     */
    public Hospitaleiro(int idHospitaleiro, int id, int nivelDeAcesso, String nome, String email, String nascimento, String cidade, String genero, String habitacao, int servico, int preco) {
        super(id, nivelDeAcesso, nome, email);
        this.idHospitaleiro = idHospitaleiro;
        try {
            this.nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(nascimento); // Converter Date em String
        } catch (ParseException ex) {
           Logger.getLogger(Hospitaleiro.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.cidade = cidade;
        this.genero = genero;
        this.habitacao = habitacao;
        this.servico = servico;
        this.preco = preco;
    }
    
    @Override
    public String toString(){
        return getNome();
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getHabitacao() {
        return habitacao;
    }

    public void setHabitacao(String habitacao) {
        this.habitacao = habitacao;
    }

    public int getPreco() {
        return preco;
    }
    
    public void setPreco(int preco) {
        this.preco = preco;
    }
 
}	