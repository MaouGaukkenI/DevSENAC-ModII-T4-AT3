package Model;

public class Consultas {

    private String nome;
    private String cpf;
    private String telefone;
    private String data;
    private String fidelidade;
    private String finalizar;

    public Consultas(){
        
    }
    
    public Consultas(String nome, String cpf, String telefone, String data, String fidelidade, String finalizar) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data = data;
        this.fidelidade = fidelidade;
        this.finalizar = finalizar;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the fidelidade
     */
    public String getFidelidade() {
        return fidelidade;
    }

    /**
     * @param fidelidade the fidelidade to set
     */
    public void setFidelidade(String fidelidade) {
        this.fidelidade = fidelidade;
    }

    /**
     * @return the finalizar
     */
    public String getFinalizar() {
        return finalizar;
    }

    /**
     * @param finalizar the finalizar to set
     */
    public void setFinalizar(String finalizar) {
        this.finalizar = finalizar;
    }

}
