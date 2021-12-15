public class Botao {
  public int id;
  public String cor;

  private boolean foiAtivado;
  private boolean foiPressionado;
  public boolean estaLigado;

  Botao(int _id, String _cor){
    this.id = _id;
    this.cor = _cor;
  }

  public void setFoiPressionado(boolean _foiPressionado){
    this.foiPressionado = _foiPressionado;
  }

  public void setFoiAtivado(boolean _foiAtivado, int _velocidade){
    this.estaLigado = true;

    while(this.estaLigado){
      try {
        Thread.sleep(_velocidade);
      } catch (Exception e) {
        System.out.println(e);
      }

      this.estaLigado = false;
    }

    this.foiAtivado = _foiAtivado;
  }

  public boolean getFoiPressionado(){
    return this.foiPressionado;
  }

  public boolean getFoiAtivado(){
    return this.foiAtivado;
  }

  public boolean getEstaLigado(){
    return this.estaLigado;
  }
}
