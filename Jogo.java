import java.util.Arrays;
import java.util.Random;

public class Jogo {
  private String[] coresDosBotoes = {"BLUE", "YELLOW", "ORANGE", "RED", "GREEN", "PURPLE", "PINK", "GRAY", "BLACK"};
  private int[] valoresDasDificuldades = {8, 14, 20};
  private int[] valoresDasVelocidades = {1000, 750, 500};

  public Botao[] botoes = {};
  public Dificuldade[] dificuldades = {};
  public Velocidade[] velocidades = {};

  private Partida[] partidas = {};

  Jogo(){
    setDificuldades();
    setVelocidades();
  }

  Jogo(Partida _partida){
    setBotoes();
    setDificuldades();
    setVelocidades();

    this.partidas = Arrays.copyOf(this.partidas, (this.partidas.length)+1);
    this.partidas[(this.partidas.length)-1] = _partida;
  }

  public void setBotoes(){
    Botao[] botoesAux = {};
    botoes = botoesAux;

    for(int i=0; i<coresDosBotoes.length; i++){
      this.botoes = Arrays.copyOf(this.botoes, (this.botoes.length)+1);
      this.botoes[(this.botoes.length)-1] = new Botao(i, coresDosBotoes[i]);
    }
  }

  private void setDificuldades(){
    for(int i=0; i<valoresDasDificuldades.length; i++){
      this.dificuldades = Arrays.copyOf(this.dificuldades, (this.dificuldades.length)+1);
      this.dificuldades[(this.dificuldades.length)-1] = new Dificuldade(i, valoresDasDificuldades[i]);
    }
  }

  private void setVelocidades(){
    for(int i=0; i<valoresDasVelocidades.length; i++){
      this.velocidades = Arrays.copyOf(this.velocidades, (this.velocidades.length)+1);
      this.velocidades[(this.velocidades.length)-1] = new Velocidade(i, valoresDasVelocidades[i]);
    }
  }

  public Dificuldade getDificuldade(int _index){
    return this.dificuldades[_index];
  }

  public int getVelocidade(int _index){
    return this.velocidades[_index].tempo;
  }

  public Partida[] getPartidas(){
    return this.partidas;
  }

  public Botao[] getBotoes(){
    return this.botoes;
  }

  public int genBotaoAleatorio(){
    Random randomIndex = new Random();
    int randomIndexValue = randomIndex.nextInt(((this.coresDosBotoes).length));

    return randomIndexValue;
  }
}
