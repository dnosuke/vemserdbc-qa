public class Endereco {
   private int tipo;
   private String logradouro;
   private int numero;
   private String complemento;
   private String cep;
   private String cidade;
   private String estado;
   private String pais;


    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void imprimirEndereco(){
       System.out.println("========== Endereco ===============");
       System.out.println("Tipo: " + tipo);
       System.out.println("Logradouro: " + logradouro + ", Número: " + numero);
       System.out.println("Complemento: " + complemento);
       System.out.println("CEP: " + cep);
       System.out.println("Cidade: " + cidade);
       System.out.println("Estado: " + estado + " País: " + pais );
   }
}
