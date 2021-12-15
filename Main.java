import java.awt.EventQueue;
import java.util.Arrays;

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
    Partida novaPartida = new Partida(0, inputPartida.getValidadoNome(), inputPartida.getValidadoData(), novosJogadores, new Rodada(0, inputPartida.getValidadoDificuldade(), inputPartida.getValidadoVelocidade()));
    novoJogo = new Jogo(novaPartida);
  }

  //Início do Gameplay
  public void setIniciarPartida(){
    while(!partidaFinalizada){
      int indexPartidaAtual = ((novoJogo.getPartidas()).length)-1;
      Partida atualPartida = novoJogo.getPartidas()[indexPartidaAtual];
      int indexRodadaAtual = ((atualPartida.getRodadas()).length)-1;
      Rodada atualRodada = atualPartida.getRodadas()[indexRodadaAtual];
      int indexJogadaAtual = ((atualRodada.getJogadas()).length);
      
      Boolean sequenciaCorreta;

      while(!rodadaFinalizada){
        //Ativar botoes
        for(int i=0; i<((novoJogo.getBotoes()).length); i++){
          for(int j=0; j<(atualRodada.getSequencia()).length; j++){
            if((novoJogo.getBotoes()[i].id == atualRodada.getSequencia()[j])){
              novoJogo.getBotoes()[i].setFoiAtivado(true, novoJogo.getVelocidade(atualRodada.getVelocidade()));
            }
          }
        }

        //Imprimir tabuleiro
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

        //Botões da Sequência
        for(int j=0; j<(atualRodada.getSequencia()).length; j++){
          System.out.println((atualRodada.getSequencia()[j])+1);
        }

        System.out.println("\n");

        System.out.println("\n"+atualPartida.getJogadorDaVez().getApelido()+", insira o botão desejado (1 a 9):\n");
        // inputBotaoSelecionado = scanner.nextLine();
        System.out.println("\n");

        Jogada novaJogada = new Jogada(indexJogadaAtual, atualPartida.getJogadorDaVez(), Integer.parseInt(inputBotaoSelecionado)-1, indexPartidaAtual, indexRodadaAtual);
        atualRodada.addJogada(novaJogada);

        sequenciaCorreta = Arrays.equals(Arrays.copyOf(atualRodada.getSequencia(), ((atualRodada.getSequencia()).length)-1), atualRodada.getBotoesDasJogadas());

        //Checagem da sequência
        if(!sequenciaCorreta){
          atualRodada.setSequencia();
          atualRodada.setBotoesDasJogadas();
          atualPartida.setJogadorDaVez();
          novoJogo.setBotoes();

          if(atualPartida.getRodadaFinalizada()){
            //Contabilizar os acertos
            for(int i=0; i<(atualPartida.getJogadores()).length; i++){
              Jogador atualJogador = atualPartida.getJogadores()[i];
              int acertosJogador = 0;

              for(int j=0; j<(atualRodada.getJogadas()).length; j++){
                Jogada auxJogada = atualRodada.getJogadas()[j];

                if(auxJogada.getAcerto()){
                  if(atualJogador.getNome() == auxJogada.getJogador().getNome()){
                    acertosJogador++;
                  }
                }
              }

              atualJogador.setAcertos(acertosJogador);
            }

            Jogador atualJogador = atualPartida.getJogadores()[0];
            Jogador jogadorVencedor = atualJogador;

            //Declarar vencedor
            for(int i=0; i<(atualPartida.getJogadores()).length; i++){
              atualJogador = atualPartida.getJogadores()[i];

              if(atualJogador.getAcertos()[0][indexRodadaAtual] > jogadorVencedor.getAcertos()[0][indexRodadaAtual]){
                jogadorVencedor = atualJogador;
              }
            }

            atualRodada.setJogadorVencedor(jogadorVencedor);

            //Encerrar rodada
            if(!atualRodada.getRodadaEmpatada()){
              rodadaFinalizada = true;
            }
            else{
              //Sugerir desempate
              rodadaFinalizada = true;
            }
          }
        }
        else{
          novaJogada.setAcerto();
        }
      }

      if(rodadaFinalizada){
        indexRodadaAtual++;

        atualPartida.addRodada(new Rodada(indexRodadaAtual, atualRodada.getDificuldade(), atualRodada.getVelocidade()));

        indexRodadaAtual = ((atualPartida.getRodadas()).length)-1;
        atualRodada = atualPartida.getRodadas()[indexRodadaAtual];
        indexJogadaAtual = ((atualRodada.getJogadas()).length);

        rodadaFinalizada = false;
      }
    }

    // scanner.close();

    // while(Integer.parseInt(inputCriarJogador) == 0){
    // // System.out.println("Insira o nome do novo jogador:");
    // // inputNomeJogador = scanner.nextLine();
    // inputNomeJogador = "Lucas Bispo";

    // // System.out.println("Insira o apelido do novo jogador:");
    // // inputApelidoJogador = scanner.nextLine();
    // inputApelidoJogador = "Homem de Pau";

    // inputsJogadores = Arrays.copyOf(inputsJogadores, (inputsJogadores.length)+1);
    // inputsJogadores[(inputsJogadores.length)-1] = new InputJogador(inputNomeJogador, inputApelidoJogador);

    // // System.out.println("\nPressione '0' para criar um novo jogador ou '1' para iniciar a partida:\n");
    // // inputCriarJogador = scanner.nextLine();
    // inputCriarJogador = "1";
    // }
  }
}