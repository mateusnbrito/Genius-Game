public class Botao {
  public int id;
  public String cor;

  private boolean foiAtivado;
  private boolean foiPressionado;
  public boolean estaLigado = false;

  Botao(int _id, String _cor){
    this.id = _id;
    this.cor = _cor;
  }

  public void setFoiPressionado(boolean _foiPressionado){
    this.foiPressionado = _foiPressionado;
  }

  public void setFoiAtivado(boolean _foiAtivado, int _velocidade){
    setEstaLigado(true);

    this.foiAtivado = _foiAtivado;
  }

  public void setEstaLigado(boolean _valor){
    this.estaLigado = _valor;
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
