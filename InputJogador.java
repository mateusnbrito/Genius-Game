public class InputJogador {
  public String nome;
  public String apelido;

  InputJogador(String _nome, String _apelido){
    this.nome = _nome;
    this.apelido = _apelido;
  }

  public String getValidadoNome(){
    return this.nome;
  }

  public String getValidadoApelido(){
    return this.apelido;
  }
}
