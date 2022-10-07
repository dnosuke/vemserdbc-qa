public enum Comida {
  JAPONESA("japonesa", 50),
  FAST_FOOD("fast food", 30),
  TRADICIONAL("tradicional", 20);

  private String descricao;
  private double valor;

  Comida(String descricao, double valor){
    this.descricao = descricao;
    this.valor = valor;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }
}
