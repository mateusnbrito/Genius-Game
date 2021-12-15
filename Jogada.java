public class Jogada {
  private int id;
  private Jogador jogador;
  private int botao;
  private int partida;
  private int rodada;
  private boolean acerto = false;

  Jogada(int _id, Jogador _jogador, int _botao, int _partida, int _rodada){
    this.id = _id;
    this.jogador = _jogador;
    this.botao = _botao;
    this.partida = _partida;
    this.rodada = _rodada;
  }

  public void setAcerto(){
    this.acerto = true;
  }

  public int getId(){
    return this.id;
  }

  public Jogador getJogador(){
    return this.jogador;
  }

  public int getBotao(){
    return this.botao;
  }

  public int getpartida(){
    return this.partida;
  }

  public int getRodada(){
    return this.rodada;
  }

  public boolean getAcerto(){
    return this.acerto;
  }
}
