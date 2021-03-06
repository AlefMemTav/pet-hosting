
package modelo;

/**
 * Classe Servico.
 * @author Pedro Lucas Garcia
 */
public abstract class Servico {
    protected int idServico; // Definido como 1 para hospendagem, 2 p/ passeio, 3 p/ creche.
    public Hospitaleiro hospitaleiro;
    protected Cliente cliente; // 
    protected Pet pet;
    /**
     * Contrutor completo da classe Servico, que gera herança para as classes Hospedagem, Passeio e Creche.
     * @param idServico
     * @param hospitaleiro
     * @param cliente
     * @param pet 
     */
    public Servico(int idServico, Hospitaleiro hospitaleiro, Cliente cliente, Pet pet) {
        this.idServico = idServico;
        this.hospitaleiro = hospitaleiro;
        this.cliente = cliente;
        this.pet = pet;
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public Hospitaleiro getHospitaleiro() {
        return hospitaleiro;
    }

    public void setHospitaleiro(Hospitaleiro hospitaleiro) {
        this.hospitaleiro = hospitaleiro;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}