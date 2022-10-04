public class Contato {
    private String descricao;
    private String telefone;
    private int tipo;

    public Contato(String descricao, String telefone, int tipo) {
        this.descricao = descricao;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void imprimirContato(){
        System.out.println("=========== Contato ================");
        System.out.println("Descrição: " + descricao );
        System.out.println("Telefone: " + telefone + " Tipo: " + tipo  );
    }
}
