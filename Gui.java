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
	private JTextField textField1;
	private JTextField textField2;
  private JTextField textField3;
  private JTextField textField4;

  Main main = new Main();
  Scanner scanner = new Scanner(System.in);

	public Gui() {
		JPanel contentPane = new JPanel();

		setContentPane(contentPane);
    contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));

		JLabel lblNomePartida = new JLabel("Nome da partida:");
		contentPane.add(lblNomePartida);

    JLabel lblDataPartida = new JLabel("Data da partida:");
		contentPane.add(lblDataPartida);

    JLabel lblNomeJogador = new JLabel("Nome do Jogador:");
		contentPane.add(lblNomeJogador);

		JLabel lblApelido = new JLabel("Apelido do Jogador:");
		contentPane.add(lblApelido);

		JLabel lblJogadores = new JLabel("Jogadores");
		contentPane.add(lblJogadores);

		textField1 = new JTextField();
		textField1.setColumns(10);
		contentPane.add(textField1);

		textField2 = new JTextField();
		textField2.setColumns(10);
		contentPane.add(textField2);

    textField3 = new JTextField();
		textField3.setColumns(10);
		contentPane.add(textField3);

    textField4 = new JTextField();
		textField4.setColumns(10);
		contentPane.add(textField4);

		JLabel lblNewLabel_1_1 = new JLabel("Dificuldade");
		contentPane.add(lblNewLabel_1_1);

		JButton btnNewButton_1 = new JButton("1");
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("2");
		contentPane.add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("3");
		contentPane.add(btnNewButton_1_2);

		JLabel lblNewLabel_1_1_1 = new JLabel("Velocidade");
		contentPane.add(lblNewLabel_1_1_1);

		JButton btnNewButton_1_3 = new JButton("1");
		contentPane.add(btnNewButton_1_3);

		JButton btnNewButton_1_1_1 = new JButton("2");
		contentPane.add(btnNewButton_1_1_1);

		JButton btnNewButton_1_2_1 = new JButton("3");
		contentPane.add(btnNewButton_1_2_1);

		JButton btnNewButton_1_1_1_1_Jogar = new JButton("Jogar");
		contentPane.add(btnNewButton_1_1_1_1_Jogar);

		JButton btnNewButton_1_1_1_1_1_Sair = new JButton("Sair");
		contentPane.add(btnNewButton_1_1_1_1_1_Sair);

    JButton btnNewButton = new JButton("Novo Jogador");
		contentPane.add(btnNewButton);

    Button button = new Button("");
    Button button_1 = new Button("");
    Button button_1_1 = new Button("");
    Button button_1_2 = new Button("");
    Button button_1_3 = new Button("");
    Button button_1_4 = new Button("");
    Button button_1_5 = new Button("");
    Button button_1_6 = new Button("");
    Button button_1_7 = new Button("");
    Button button_2 = new Button("Gerar Relatorio");
    Button button_2_1 = new Button("Finalizar Jogo");

    btnNewButton_1.addActionListener((ActionListener) new ActionListener(){
      String input4Content;

      public void actionPerformed(ActionEvent event){
        input4Content = btnNewButton_1.getText().toString();

        main.inputDificuldadePartida = input4Content;
      }
    });

    btnNewButton_1_1.addActionListener((ActionListener) new ActionListener(){
      String input4Content;

      public void actionPerformed(ActionEvent event){
        input4Content = btnNewButton_1_1.getText().toString();

        main.inputDificuldadePartida = input4Content;
      }
    });

    btnNewButton_1_2.addActionListener((ActionListener) new ActionListener(){
      String input4Content;

      public void actionPerformed(ActionEvent event){
        input4Content = btnNewButton_1_2.getText().toString();

        main.inputDificuldadePartida = input4Content;
      }
    });

    btnNewButton_1_3.addActionListener((ActionListener) new ActionListener(){
      String input5Content;

      public void actionPerformed(ActionEvent event){
        input5Content = btnNewButton_1_3.getText().toString();

        main.inputVelocidadePartida = input5Content;
      }
    });

    btnNewButton_1_1_1.addActionListener((ActionListener) new ActionListener(){
      String input5Content;

      public void actionPerformed(ActionEvent event){
        input5Content = btnNewButton_1_1_1.getText().toString();

        main.inputVelocidadePartida = input5Content;
      }
    });

    btnNewButton_1_2_1.addActionListener((ActionListener) new ActionListener(){
      String input5Content;

      public void actionPerformed(ActionEvent event){
        input5Content = btnNewButton_1_2_1.getText().toString();

        main.inputVelocidadePartida = input5Content;
      }
    });

    btnNewButton_1_1_1_1_Jogar.addActionListener((ActionListener) new ActionListener(){
      String input0Content;
      String input1Content;
      String input2Content;
      String input3Content;

			public void actionPerformed(ActionEvent event) {
        // input0Content = textField1.getText().toString();
        // input1Content = textField2.getText().toString();
        // input2Content = textField3.getText().toString();
        // input3Content = textField4.getText().toString();

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

        button.setBackground(Color.BLUE);
        button.setBounds(40, 45, 91, 38);
        add(button);

        button_1.setBackground(Color.MAGENTA);
        button_1.setBounds(172, 45, 91, 38);
        add(button_1);

        button_1_1.setBackground(Color.RED);
        button_1_1.setBounds(293, 45, 91, 38);
        add(button_1_1);

        button_1_2.setBackground(Color.ORANGE);
        button_1_2.setBounds(40, 115, 91, 38);
        add(button_1_2);

        button_1_3.setBackground(Color.GREEN);
        button_1_3.setActionCommand("");
        button_1_3.setBounds(172, 115, 91, 38);
        add(button_1_3);

        button_1_4.setForeground(Color.WHITE);
        button_1_4.setBackground(Color.BLACK);
        button_1_4.setBounds(293, 115, 91, 38);
        add(button_1_4);

        button_1_5.setBackground(Color.GRAY);
        button_1_5.setBounds(40, 185, 91, 38);
        add(button_1_5);

        button_1_6.setBackground(Color.CYAN);
        button_1_6.setBounds(172, 185, 91, 38);
        add(button_1_6);

        button_1_7.setBackground(Color.PINK);
        button_1_7.setForeground(Color.BLACK);
        button_1_7.setBounds(293, 185, 91, 38);
        add(button_1_7);

        button_2.setBounds(93, 252, 87, 38);
        add(button_2);

        button_2_1.setBounds(251, 252, 87, 38);
        add(button_2_1);

        Thread Jogo = new Thread() {
          public void run() {
            iniciarPartida();
          }
        };

        Jogo.start();

        System.out.println("After");
			}
		});

    btnNewButton_1_1_1_1_1_Sair.addActionListener((ActionListener) new ActionListener(){
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
        main.inputApelidoJogador = scanner.nextLine();
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
