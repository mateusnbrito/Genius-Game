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

public class Gui extends JFrame {
	private JTextField textField1;
	private JTextField textField2;
  private JTextField textField3;
  private JTextField textField4;

	public Gui() {
    Main main = new Main();
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

		JButton btnNewButton = new JButton("Novo Jogador");
		btnNewButton.setBounds(52, 69, 122, 23);
		contentPane.add(btnNewButton);

    btnNewButton_1_1_1_1_Jogar.addActionListener((ActionListener) new ActionListener(){
      String input0Content;
      String input1Content;
      String input2Content;
      String input3Content;

			public void actionPerformed(ActionEvent event) {
        input0Content = textField1.getText().toString();
        input1Content = textField2.getText().toString();
        input2Content = textField3.getText().toString();
        input3Content = textField4.getText().toString();

        main.inputNomePartida = input0Content;
        main.inputDataPartida = input1Content;
        main.inputNomeJogador = input2Content;
        main.inputApelidoJogador = input3Content;

        main.setInputsJogadores();

        contentPane.removeAll();
        contentPane.revalidate();
        contentPane.repaint();
        contentPane.setLayout(null);

        Button button = new Button("");
        button.setBackground(Color.BLUE);
        button.setBounds(40, 45, 91, 38);
        add(button);

        Button button_1 = new Button("");
        button_1.setBackground(Color.MAGENTA);
        button_1.setBounds(172, 45, 91, 38);
        add(button_1);

        Button button_1_1 = new Button("");
        button_1_1.setBackground(Color.RED);
        button_1_1.setBounds(293, 45, 91, 38);
        add(button_1_1);

        Button button_1_2 = new Button("");
        button_1_2.setBackground(Color.ORANGE);
        button_1_2.setBounds(40, 115, 91, 38);
        add(button_1_2);

        Button button_1_3 = new Button("");
        button_1_3.setBackground(Color.GREEN);
        button_1_3.setActionCommand("");
        button_1_3.setBounds(172, 115, 91, 38);
        add(button_1_3);

        Button button_1_4 = new Button("");
        button_1_4.setForeground(Color.WHITE);
        button_1_4.setBackground(Color.BLACK);
        button_1_4.setBounds(293, 115, 91, 38);
        add(button_1_4);

        Button button_1_5 = new Button("");
        button_1_5.setBackground(Color.GRAY);
        button_1_5.setBounds(40, 185, 91, 38);
        add(button_1_5);

        Button button_1_6 = new Button("");
        button_1_6.setBackground(Color.CYAN);
        button_1_6.setBounds(172, 185, 91, 38);
        add(button_1_6);

        Button button_1_7 = new Button("");
        button_1_7.setBackground(Color.PINK);
        button_1_7.setForeground(Color.BLACK);
        button_1_7.setBounds(293, 185, 91, 38);
        add(button_1_7);

        Button button_2 = new Button("Gerar Relatorio");
        button_2.setBounds(93, 252, 87, 38);
        add(button_2);

        Button button_2_1 = new Button("Finalizar Jogo");
        button_2_1.setBounds(251, 252, 87, 38);
        add(button_2_1);
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
}
