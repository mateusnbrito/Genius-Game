import java.util.Arrays;

public class Rodada {
  private int id;
  private int dificuldade;
  private int velocidade;
  private int[] sequencia = {};
  private Jogada[] jogadas = {};
  private int[] botoesDasJogadas = {};
  private boolean rodadaEmpatada;
  private boolean rodadaFinalizada;
  private Jogador jogadorVencedor;

  Rodada(int _id, int _dificuldade, int _velocidade){
    this.id = _id;
    this.dificuldade = _dificuldade;
    this.velocidade = _velocidade;
    this.rodadaFinalizada = false;
    this.rodadaEmpatada = false;

    this.addIndexSequencia();
  }

  public void setDificuldade(int _dificuldade){
    this.dificuldade = _dificuldade;
  }

  public void setVelocidade(int _velocidade){
    this.velocidade = _velocidade;
  }

  public void setRodadaEmpatada(){
    this.rodadaEmpatada = true;
  }

  public void setJogadorVencedor(Jogador _jogador){
    this.jogadorVencedor = _jogador;
  }

  public void setSequencia(){
    int[] auxSequencia = {};

    this.sequencia = auxSequencia;
    this.addIndexSequencia();
  }

  public void setBotoesDasJogadas(){
    int[] auxBotoesDasJogadas = {};

    this.botoesDasJogadas = auxBotoesDasJogadas;
  }

  public void addJogada(Jogada _jogada){
    this.jogadas = Arrays.copyOf(this.jogadas, (this.jogadas.length)+1);
    this.jogadas[(this.jogadas.length)-1] = _jogada;

    this.botoesDasJogadas = Arrays.copyOf(this.botoesDasJogadas, (this.botoesDasJogadas.length)+1);
    this.botoesDasJogadas[(this.botoesDasJogadas.length)-1] = _jogada.getBotao();

    addIndexSequencia();
  }

  public void addIndexSequencia(){
    Jogo auxJogo = new Jogo();

    if(!rodadaFinalizada){
      this.sequencia = Arrays.copyOf(this.sequencia, (this.sequencia.length)+1);
      this.sequencia[(this.sequencia.length)-1] = auxJogo.genBotaoAleatorio();
    }
  }

  public void finalizarRodada(){
    this.rodadaFinalizada = true;
  }

  public int getId(){
    return this.id;
  }

  public int getDificuldade(){
    return this.dificuldade;
  }

  public int getVelocidade(){
    return this.velocidade;
  }

  public int[] getSequencia(){
    return this.sequencia;
  }

  public Jogada[] getJogadas(){
    return this.jogadas;
  }

  public int[] getBotoesDasJogadas(){
    return this.botoesDasJogadas;
  }

  public Jogador getJogadorVencedor(){
    return this.jogadorVencedor;
  }

  public boolean getRodadaEmpatada(){
    return this.rodadaEmpatada;
  }
}
