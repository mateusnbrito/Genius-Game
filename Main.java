import java.awt.EventQueue;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String args[]){
    EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
  }

  Scanner scanner = new Scanner(System.in);

  public String inputNomePartida;
  public String inputDataPartida;
  public String inputDificuldadePartida;
  public String inputVelocidadePartida;
  public String inputCriarJogador;
  public String inputNomeJogador;
  public String inputApelidoJogador;
  public String inputBotaoSelecionado;

  public InputPartida inputPartida;
  public InputJogador[] inputsJogadores = {};
  public Jogador[] novosJogadores = {};

  public boolean partidaFinalizada = false;
  public boolean rodadaFinalizada = false;

  Jogo novoJogo;
  Partida novaPartida;
  Jogada novaJogada;

  public void setInputsJogadores(){
    inputPartida = new InputPartida(inputNomePartida, inputDataPartida, Integer.parseInt(inputDificuldadePartida), Integer.parseInt(inputVelocidadePartida));
    inputsJogadores = Arrays.copyOf(inputsJogadores, (inputsJogadores.length)+1);
    inputsJogadores[(inputsJogadores.length)-1] = new InputJogador(inputNomeJogador, inputApelidoJogador);
  }

  public void setNovosJogadores(){
    for(int i=0; i<inputsJogadores.length; i++){
      novosJogadores = Arrays.copyOf(novosJogadores, (novosJogadores.length)+1);
      novosJogadores[(novosJogadores.length)-1] = new Jogador(inputsJogadores[i].nome, inputsJogadores[i].apelido);
    }
  }

  public void setNovaPartida(){
    novaPartida = new Partida(0, inputPartida.getValidadoNome(), inputPartida.getValidadoData(), novosJogadores, new Rodada(0, inputPartida.getValidadoDificuldade(), inputPartida.getValidadoVelocidade()));
    novoJogo = new Jogo(novaPartida);
  }

  public void setAtivarBotoes(Rodada _atualRodada){
    for(int i=0; i<((novoJogo.getBotoes()).length); i++){
      for(int j=0; j<(_atualRodada.getSequencia()).length; j++){
        if((novoJogo.getBotoes()[i].id == _atualRodada.getSequencia()[j])){
          novoJogo.getBotoes()[i].setFoiAtivado(true, novoJogo.getVelocidade(_atualRodada.getVelocidade()));
        }
      }
    }
  }

  public void setImprimirTabuleiro(){
    for(int i=0; i<((novoJogo.getBotoes()).length); i++){
      String[] botaoPressionado = {" ", " ", " "};

      if(i%3 == 0){
        int auxCont = 0;

        for(int j=i; j<i+3; j++){
          Botao atualBotao = (novoJogo.getBotoes())[j];

          if(atualBotao.getFoiAtivado()){
            botaoPressionado[auxCont] = "X";
          }

          auxCont++;
        }

        if(i == 0){
          System.out.println("-------------");
        }

        System.out.println("| "+botaoPressionado[0]+" | "+botaoPressionado[1]+" | "+botaoPressionado[2]+" |");

        System.out.println("-------------");
      }
    }

    System.out.println("\n");
  }

  public void setImprimirSequencia(Rodada _atualRodada){
    //Botões da Sequência
    for(int j=0; j<(_atualRodada.getSequencia()).length; j++){
      System.out.println("Sequência: "+(_atualRodada.getSequencia()[j]+1));
    }

    System.out.println("\n");
  }
}