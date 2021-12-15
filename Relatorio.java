import java.time.LocalDate;

public class Relatorio {
  public String nomeDoJogador;
  public String apelidoDoJogador;
  public String nomeDaPartida;
  public LocalDate dataDaPartida;
  public int pontosDoJogador;
  public Double tempoJogado;
  public Double jogadaMaisRapida;

  Relatorio(String _nomeDoJogador, String _apelidoDoJogador, String _nomeDaPartida, LocalDate _dataDaPartida, int _pontosDoJogador, Double _tempoJogado, Double _jogadaMaisRapida){
    this.nomeDoJogador = _nomeDoJogador;
    this.apelidoDoJogador = _apelidoDoJogador;
    this.nomeDaPartida = _nomeDaPartida;
    this.dataDaPartida = _dataDaPartida;
    this.pontosDoJogador = _pontosDoJogador;
    this.tempoJogado = _tempoJogado;
    this.jogadaMaisRapida = _jogadaMaisRapida;
  }
}
