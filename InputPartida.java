import java.time.LocalDate;

public class InputPartida {
  private String nome;
  private String data;
  private int dificuldade;
  private int velocidade;

  InputPartida(String _nome, String _data, int _dificuldade, int _velocidade){
    this.nome = _nome;
    this.data = _data;
    this.dificuldade = _dificuldade;
    this.velocidade = _velocidade;
  }

  public String getValidadoNome(){
    return this.nome;
  }

  public LocalDate getValidadoData(){
    String[] dataFormatada = {};

    dataFormatada = (this.data).split("/");

    return LocalDate.of(Integer.parseInt(dataFormatada[0]), Integer.parseInt(dataFormatada[1]), Integer.parseInt(dataFormatada[2]));
  }

  public int getValidadoDificuldade(){
    int dificuldade = 9;

    switch(this.dificuldade){
      case 1: 
        dificuldade = 0;
        break;
      case 2:
        dificuldade = 1;
        break;
      case 3:
        dificuldade = 2;
        break;
    }

    return dificuldade;
  }

  public int getValidadoVelocidade(){
    int velocidade = 9;

    switch(this.velocidade){
      case 1:
        velocidade = 0;
        break;
      case 2:
        velocidade = 1;
        break;
      case 3:
        velocidade = 2;
        break;
    }

    return velocidade;
  }
}