import java.util.Arrays;

public class Jogador {
  private String nome;
  private String apelido;
  private int[][] acertos = {};

  Jogador(String _nome, String _apelido){
    this.nome = _nome;
    this.apelido = _apelido;
  }

  public void setNome(String _nome){
    this.nome = _nome;
  }

  public void setApelido(String _apelido){
    this.apelido = _apelido;
  }

  public String getNome(){
    return this.nome;
  }

  public String getApelido(){
    return this.apelido;
  }

  public int[][] getAcertos(){
    return this.acertos;
  }

  public void setAcertos(int _acertos){
    this.acertos = Arrays.copyOf(this.acertos, (this.acertos.length)+1);
    this.acertos[(this.acertos.length)-1] = new int[0];

    this.acertos[0] = Arrays.copyOf(this.acertos[0], (this.acertos[0].length)+1);
    this.acertos[0][(this.acertos[0].length)-1] = _acertos;
  }
}
