import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Gui extends JFrame {
	private JTextField inputFieldNomePartida;
	private JTextField inputFieldDataPartida;
  private JTextField inputFieldNomeJogador;
  private JTextField inputFieldApelidoJogador;

  Main main = new Main();
  Scanner scanner = new Scanner(System.in);

	public Gui() {
		JPanel contentPane = new JPanel();

		setContentPane(contentPane);
    contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));

		JLabel labelNomePartida = new JLabel("Nome da partida:");
		contentPane.add(labelNomePartida);

    JLabel labelDataPartida = new JLabel("Data da partida:");
		contentPane.add(labelDataPartida);

    JLabel labelNomeJogador = new JLabel("Nome do Jogador:");
		contentPane.add(labelNomeJogador);

		JLabel labelApelidoJogador = new JLabel("Apelido do Jogador:");
		contentPane.add(labelApelidoJogador);

		JLabel labelJogadores = new JLabel("Jogadores");
		contentPane.add(labelJogadores);

		inputFieldNomePartida = new JTextField();
		inputFieldNomePartida.setColumns(10);
		contentPane.add(inputFieldNomePartida);

		inputFieldDataPartida = new JTextField();
		inputFieldDataPartida.setColumns(10);
		contentPane.add(inputFieldDataPartida);

    inputFieldNomeJogador = new JTextField();
		inputFieldNomeJogador.setColumns(10);
		contentPane.add(inputFieldNomeJogador);

    inputFieldApelidoJogador = new JTextField();
		inputFieldApelidoJogador.setColumns(10);
		contentPane.add(inputFieldApelidoJogador);

		JLabel labelDificuldade = new JLabel("Dificuldade");
		contentPane.add(labelDificuldade);

		JButton botaoDificuldade1 = new JButton("1");
		contentPane.add(botaoDificuldade1);

		JButton botaoDificuldade2 = new JButton("2");
		contentPane.add(botaoDificuldade2);

		JButton botaoDificuldade3 = new JButton("3");
		contentPane.add(botaoDificuldade3);

		JLabel botaoVelocidade = new JLabel("Velocidade");
		contentPane.add(botaoVelocidade);

		JButton botaoVelocidade1 = new JButton("1");
		contentPane.add(botaoVelocidade1);

		JButton botaoVelocidade2 = new JButton("2");
		contentPane.add(botaoVelocidade2);

		JButton botaoVelocidade3 = new JButton("3");
		contentPane.add(botaoVelocidade3);

		JButton botaoIniciarJogo = new JButton("Jogar");
		contentPane.add(botaoIniciarJogo);

		JButton botaoFinalizarJogo = new JButton("Sair");
		contentPane.add(botaoFinalizarJogo);

    Button botaoTabuleiro1 = new Button("");
    Button botaoTabuleiro2 = new Button("");
    Button botaoTabuleiro3 = new Button("");
    Button botaoTabuleiro4 = new Button("");
    Button botaoTabuleiro5 = new Button("");
    Button botaoTabuleiro6 = new Button("");
    Button botaoTabuleiro7 = new Button("");
    Button botaoTabuleiro8 = new Button("");
    Button botaoTabuleiro9 = new Button("");
    Button botaoTabuleiroRelatorio = new Button("Gerar Relatorio");
    Button botaoTabuleiroFinalizar = new Button("Finalizar Jogo");

    botaoTabuleiro1.addActionListener((ActionListener) new ActionListener(){
      public void actionPerformed(ActionEvent event){
        main.inputBotaoSelecionado = "0";
      }
    });

    botaoTabuleiro2.addActionListener((ActionListener) new ActionListener(){
      public void actionPerformed(ActionEvent event){
        main.inputBotaoSelecionado = "1";
      }
    });

    botaoTabuleiro3.addActionListener((ActionListener) new ActionListener(){
      public void actionPerformed(ActionEvent event){
        main.inputBotaoSelecionado = "2";
      }
    });

    botaoTabuleiro4.addActionListener((ActionListener) new ActionListener(){
      public void actionPerformed(ActionEvent event){
        main.inputBotaoSelecionado = "3";
      }
    });

    botaoTabuleiro5.addActionListener((ActionListener) new ActionListener(){
      public void actionPerformed(ActionEvent event){
        main.inputBotaoSelecionado = "4";
      }
    });

    botaoTabuleiro6.addActionListener((ActionListener) new ActionListener(){
      public void actionPerformed(ActionEvent event){
        main.inputBotaoSelecionado = "5";
      }
    });

    botaoTabuleiro7.addActionListener((ActionListener) new ActionListener(){
      public void actionPerformed(ActionEvent event){
        main.inputBotaoSelecionado = "6";
      }
    });

    botaoTabuleiro8.addActionListener((ActionListener) new ActionListener(){
      public void actionPerformed(ActionEvent event){
        main.inputBotaoSelecionado = "7";
      }
    });

    botaoTabuleiro9.addActionListener((ActionListener) new ActionListener(){
      public void actionPerformed(ActionEvent event){
        main.inputBotaoSelecionado = "8";
      }
    });

    botaoTabuleiroRelatorio.addActionListener((ActionListener) new ActionListener(){
      public void actionPerformed(ActionEvent event){}
    });

    botaoTabuleiroFinalizar.addActionListener((ActionListener) new ActionListener(){
      public void actionPerformed(ActionEvent event){}
    });

    botaoDificuldade1.addActionListener((ActionListener) new ActionListener(){
      String input4Content;

      public void actionPerformed(ActionEvent event){
        input4Content = botaoDificuldade1.getText().toString();

        main.inputDificuldadePartida = input4Content;
      }
    });

    botaoDificuldade2.addActionListener((ActionListener) new ActionListener(){
      String input4Content;

      public void actionPerformed(ActionEvent event){
        input4Content = botaoDificuldade2.getText().toString();

        main.inputDificuldadePartida = input4Content;
      }
    });

    botaoDificuldade3.addActionListener((ActionListener) new ActionListener(){
      String input4Content;

      public void actionPerformed(ActionEvent event){
        input4Content = botaoDificuldade3.getText().toString();

        main.inputDificuldadePartida = input4Content;
      }
    });

    botaoVelocidade1.addActionListener((ActionListener) new ActionListener(){
      String input5Content;

      public void actionPerformed(ActionEvent event){
        input5Content = botaoVelocidade1.getText().toString();

        main.inputVelocidadePartida = input5Content;
      }
    });

    botaoVelocidade2.addActionListener((ActionListener) new ActionListener(){
      String input5Content;

      public void actionPerformed(ActionEvent event){
        input5Content = botaoVelocidade2.getText().toString();

        main.inputVelocidadePartida = input5Content;
      }
    });

    botaoVelocidade3.addActionListener((ActionListener) new ActionListener(){
      String input5Content;

      public void actionPerformed(ActionEvent event){
        input5Content = botaoVelocidade3.getText().toString();

        main.inputVelocidadePartida = input5Content;
      }
    });

    botaoIniciarJogo.addActionListener((ActionListener) new ActionListener(){
      String input0Content;
      String input1Content;
      String input2Content;
      String input3Content;

			public void actionPerformed(ActionEvent event) {
        // input0Content = inputFieldNomePartida.getText().toString();
        // input1Content = inputFieldDataPartida.getText().toString();
        // input2Content = inputFieldNomeJogador.getText().toString();
        // input3Content = inputFieldApelidoJogador.getText().toString();

        input0Content = "Nova Partida";
        input1Content = "2021/12/15";
        input2Content = "Mateus Brito";
        input3Content = "Britinho";

        main.inputNomePartida = input0Content;
        main.inputDataPartida = input1Content;
        main.inputNomeJogador = input2Content;
        main.inputApelidoJogador = input3Content;

        main.setInputsJogadores();
        main.setNovosJogadores();
        main.setNovaPartida();

        contentPane.removeAll();
        contentPane.revalidate();
        contentPane.repaint();
        contentPane.setLayout(null);

        botaoTabuleiro1.setBackground(new Color(0, 0, 153));
        // botaoTabuleiro1.setBackground(new Color(173, 216, 230));
        botaoTabuleiro1.setBounds(40, 45, 91, 38);
        add(botaoTabuleiro1);

        botaoTabuleiro2.setBackground(new Color(255, 204 ,0));
        // botaoTabuleiro2.setBackground(new Color(173, 216, 230));
        botaoTabuleiro2.setBounds(172, 45, 91, 38);
        add(botaoTabuleiro2);

        botaoTabuleiro3.setBackground(new Color(255, 102, 0));
        // botaoTabuleiro3.setBackground(new Color(255, 0, 0));
        botaoTabuleiro3.setBounds(293, 45, 91, 38);
        add(botaoTabuleiro3);

        botaoTabuleiro4.setBackground(new Color(153, 0, 0));
        // botaoTabuleiro4.setBackground(new Color(255, 0, 0));
        botaoTabuleiro4.setBounds(40, 115, 91, 38);
        add(botaoTabuleiro4);

        botaoTabuleiro5.setBackground(new Color(0, 102, 0));
        // botaoTabuleiro5.setBackground(new Color(0, 255, 0));
        botaoTabuleiro5.setActionCommand("");
        botaoTabuleiro5.setBounds(172, 115, 91, 38);
        add(botaoTabuleiro5);

        botaoTabuleiro6.setBackground(new Color(255, 20, 147));
        // botaoTabuleiro6.setBackground(new Color(178, 58, 238));
        botaoTabuleiro6.setBounds(293, 115, 91, 38);
        add(botaoTabuleiro6);

        botaoTabuleiro7.setBackground(new Color(85, 26, 139));
        // botaoTabuleiro7.setBackground(new Color(255, 110, 199));
        botaoTabuleiro7.setBounds(40, 185, 91, 38);
        add(botaoTabuleiro7);

        botaoTabuleiro8.setBackground(new Color(84, 84, 84));
        // botaoTabuleiro8.setBackground(new Color(211, 211, 211));
        botaoTabuleiro8.setBounds(172, 185, 91, 38);
        add(botaoTabuleiro8);

        botaoTabuleiro9.setBackground(new Color(0, 0, 0));
        // botaoTabuleiro9.setBackground(new Color(84, 84, 84));
        botaoTabuleiro9.setBounds(293, 185, 91, 38);
        add(botaoTabuleiro9);

        botaoTabuleiroRelatorio.setBounds(93, 252, 87, 38);
        add(botaoTabuleiroRelatorio);

        botaoTabuleiroFinalizar.setBounds(251, 252, 87, 38);
        add(botaoTabuleiroFinalizar);

        Thread Jogo = new Thread() {
          public void run() {
            iniciarPartida();
          }
        };

        Jogo.start();
			}
		});

    botaoFinalizarJogo.addActionListener((ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent event) {
        System.exit(0);
			}
		});

    setSize(750, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setVisible(true);
	}

  public void iniciarPartida(){
    while(!main.partidaFinalizada){
      int indexPartidaAtual = ((main.novoJogo.getPartidas()).length)-1;
      Partida atualPartida = main.novoJogo.getPartidas()[indexPartidaAtual];
      int indexRodadaAtual = ((atualPartida.getRodadas()).length)-1;
      Rodada atualRodada = atualPartida.getRodadas()[indexRodadaAtual];
      int indexJogadaAtual = ((atualRodada.getJogadas()).length);

      Boolean sequenciaCorreta;

      while(!main.rodadaFinalizada){
        main.setAtivarBotoes(atualRodada);
        main.setImprimirTabuleiro();
        main.setImprimirSequencia(atualRodada);

        System.out.println("\n"+atualPartida.getJogadorDaVez().getApelido()+", insira o botão desejado (1 a 9):\n");

        if(main.inputBotaoSelecionado != null){
          System.out.println("Novo valor! "+main.inputBotaoSelecionado);
        }
        // main.getValorDaJogada();
        // System.out.println("\n");

        // novaJogada = new Jogada(indexJogadaAtual, atualPartida.getJogadorDaVez(), Integer.parseInt(inputBotaoSelecionado)-1, indexPartidaAtual, indexRodadaAtual);
        // atualRodada.addJogada(novaJogada);

        // sequenciaCorreta = Arrays.equals(Arrays.copyOf(atualRodada.getSequencia(), ((atualRodada.getSequencia()).length)-1), atualRodada.getBotoesDasJogadas());

        // //Checagem da sequência
        // if(!sequenciaCorreta){
        //   atualRodada.setSequencia();
        //   atualRodada.setBotoesDasJogadas();
        //   atualPartida.setJogadorDaVez();
        //   main.novoJogo.setBotoes();

        //   if(atualPartida.getRodadaFinalizada()){
        //     //Contabilizar os acertos
        //     for(int i=0; i<(atualPartida.getJogadores()).length; i++){
        //       Jogador atualJogador = atualPartida.getJogadores()[i];
        //       int acertosJogador = 0;

        //       for(int j=0; j<(atualRodada.getJogadas()).length; j++){
        //         Jogada auxJogada = atualRodada.getJogadas()[j];

        //         if(auxJogada.getAcerto()){
        //           if(atualJogador.getNome() == auxJogada.getJogador().getNome()){
        //             acertosJogador++;
        //           }
        //         }
        //       }

        //       atualJogador.setAcertos(acertosJogador);
        //     }

        //     Jogador atualJogador = atualPartida.getJogadores()[0];
        //     Jogador jogadorVencedor = atualJogador;

        //     //Declarar vencedor
        //     for(int i=0; i<(atualPartida.getJogadores()).length; i++){
        //       atualJogador = atualPartida.getJogadores()[i];

        //       if(atualJogador.getAcertos()[0][indexRodadaAtual] > jogadorVencedor.getAcertos()[0][indexRodadaAtual]){
        //         jogadorVencedor = atualJogador;
        //       }
        //     }

        //     atualRodada.setJogadorVencedor(jogadorVencedor);

        //     //Encerrar rodada
        //     if(!atualRodada.getRodadaEmpatada()){
        //       rodadaFinalizada = true;
        //     }
        //     else{
        //       //Sugerir desempate
        //       rodadaFinalizada = true;
        //     }
        //   }
        // }
        // else{
        //   novaJogada.setAcerto();
        // }
      }

      if(main.rodadaFinalizada){
        indexRodadaAtual++;

        atualPartida.addRodada(new Rodada(indexRodadaAtual, atualRodada.getDificuldade(), atualRodada.getVelocidade()));

        indexRodadaAtual = ((atualPartida.getRodadas()).length)-1;
        atualRodada = atualPartida.getRodadas()[indexRodadaAtual];
        indexJogadaAtual = ((atualRodada.getJogadas()).length);

        main.rodadaFinalizada = false;
      }
    }
  }
}
