import java.time.LocalDate;
import java.util.Arrays;

public class Partida {
  private int id;
  private String nome;
  private LocalDate data;
  private Jogador[] jogadores = {};
  private Rodada[] rodadas = {};
  private int jogadorDaVez;
  private boolean rodadaFinalizada;

  Partida(int _id, String _nome, LocalDate _data, Jogador[] _jogadores, Rodada _rodada){
    this.id = _id;
    this.nome = _nome;
    this.data = _data;
    this.jogadores = _jogadores;
    this.jogadorDaVez = 0;

    addRodada(_rodada);
  }

  public void setNome(String _nome){
    this.nome = _nome;
  }

  public void setData(LocalDate _data){
    this.data = _data;
  }

  public void setJogadores(Jogador[] _jogadores){
    this.jogadores = _jogadores;
  }

  public void setJogadorDaVez(){
    if(this.jogadorDaVez < ((this.jogadores).length)-1){
      this.jogadorDaVez++;
    }
    else{
      this.rodadaFinalizada = true;
      this.jogadorDaVez = 0;
    }
  }

  public void addRodada(Rodada _rodada){
    this.rodadaFinalizada = false;

    this.rodadas = Arrays.copyOf(this.rodadas, (this.rodadas.length)+1);
    this.rodadas[(this.rodadas.length)-1] = _rodada;
  }

  public int getId(){
    return this.id;
  }

  public String getNome(){
    return this.nome;
  }

  public LocalDate getData(){
    return this.data;
  }

  public Jogador[] getJogadores(){
    return this.jogadores;
  }

  public Rodada[] getRodadas(){
    return this.rodadas;
  }

  public Jogador getJogadorDaVez(){
    return this.jogadores[this.jogadorDaVez];
  }

  public boolean getRodadaFinalizada(){
    return this.rodadaFinalizada;
  }
}
