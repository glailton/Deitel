package cap14;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TypingTutor extends JFrame implements KeyListener{

	private JPanel contentPane;
	JPanel panelLabel;
	JPanel panelTxtField;
	JPanel panelButton;
	
	JLabel lblTips;
	JLabel lblNote;
	
	JScrollPane scrollPane;
	
	JTextArea textArea;
	
	Color colorButtonTemp;
	JButton btnNewButtonTil;
	JButton button_1;
	JButton button_2;
	JButton button_3;
	JButton button_4;
	JButton button_5;
	JButton button_6;
	JButton button_7;
	JButton button_8;
	JButton button_9;
	JButton button_0;
	JButton button_minus;
	JButton button_plus;
	JButton btnBackspace;
	JButton btnTab;
	JButton btn_Q;
	JButton btn_W;
	JButton btn_E;
	JButton btn_R;
	JButton btn_T;
	JButton btn_Y;
	JButton btn_U;
	JButton btn_I;
	JButton btn_O;
	JButton btn_P;
	JButton btnA;
	JButton btnS;
	JButton btnD;
	JButton btnF;
	JButton btnG;
	JButton btnH;
	JButton btnJ;
	JButton btnK;
	JButton btnL;
	JButton btnZ;
	JButton btnX;
	JButton btnC;
	JButton btnV;
	JButton btnB;
	JButton btnN;
	JButton btnM;
	JButton btnColcheteAberto;
	JButton btnColcheteFechado;
	JButton btnBarraInvertida;
	JButton btnCaps;
	JButton buttonDoisPontos;
	JButton buttonAspas;
	JButton btnEnter;
	JButton btnShift;
	JButton button_comas;
	JButton button_dot;
	JButton button_Inter;
	JButton btnSetaUp;
	JButton btnSetaDown;
	JButton btnSpace;
	JButton btnSetaLeft;
	JButton btnSetaRight;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TypingTutor frame = new TypingTutor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TypingTutor() {
		setTitle("Typing Tutor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelLabel = new JPanel();
		panelLabel.setBounds(12, 13, 686, 38);
		contentPane.add(panelLabel);
		panelLabel.setLayout(null);
		
		lblTips = new JLabel("Type some text using your keyboard. The keys you press will be highlighted and the text will be displayed");
		lblTips.setBounds(0, 0, 606, 16);
		lblTips.setHorizontalAlignment(SwingConstants.LEFT);
		panelLabel.add(lblTips);
		
		lblNote = new JLabel("Note: Click the buttons with your mouse will not perform any action.");
		lblNote.setBounds(0, 18, 606, 16);
		panelLabel.add(lblNote);
		
		panelTxtField = new JPanel();
		panelTxtField.setBounds(12, 56, 696, 148);
		contentPane.add(panelTxtField);
		panelTxtField.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 696, 148);
		panelTxtField.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);
		
		panelButton = new JPanel();
		panelButton.setBounds(12, 229, 696, 294);
		contentPane.add(panelButton);
		panelButton.setLayout(null);
		
		btnNewButtonTil = new JButton("~");
		btnNewButtonTil.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButtonTil.setBounds(0, 5, 43, 25);
		panelButton.add(btnNewButtonTil);
		
		button_1 = new JButton("1");
		colorButtonTemp = button_1.getBackground();
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_1.setBounds(45, 5, 43, 25);
		panelButton.add(button_1);
		
		button_2 = new JButton("2");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_2.setBounds(90, 5, 43, 25);
		panelButton.add(button_2);
		
		button_3 = new JButton("3");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_3.setBounds(135, 5, 43, 25);
		panelButton.add(button_3);
		
		button_4 = new JButton("4");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_4.setBounds(180, 5, 43, 25);
		panelButton.add(button_4);
		
		button_5 = new JButton("5");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_5.setBounds(225, 5, 43, 25);
		panelButton.add(button_5);
		
		button_6 = new JButton("6");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_6.setBounds(270, 5, 43, 25);
		panelButton.add(button_6);
		
		button_7 = new JButton("7");
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_7.setBounds(315, 5, 41, 25);
		panelButton.add(button_7);
		
		button_8 = new JButton("8");
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_8.setBounds(360, 5, 43, 25);
		panelButton.add(button_8);
		
		button_9 = new JButton("9");
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_9.setBounds(405, 5, 43, 25);
		panelButton.add(button_9);
		
		button_0 = new JButton("0");
		button_0.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_0.setBounds(450, 5, 43, 25);
		panelButton.add(button_0);
		
		button_minus = new JButton("-");
		button_minus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_minus.setBounds(495, 5, 43, 25);
		panelButton.add(button_minus);
		
		button_plus = new JButton("+");
		button_plus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_plus.setBounds(540, 5, 43, 25);
		panelButton.add(button_plus);
		
		btnBackspace = new JButton("Backspace");
		btnBackspace.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBackspace.setBounds(585, 5, 110, 25);
		panelButton.add(btnBackspace);
		
		btnTab = new JButton("Tab");
		btnTab.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnTab.setBounds(0, 35, 60, 25);
		panelButton.add(btnTab);
		
		btn_Q = new JButton("Q");
		btn_Q.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_Q.setBounds(62, 35, 43, 25);
		panelButton.add(btn_Q);
		
		btn_W = new JButton("W");
		btn_W.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_W.setBounds(107, 35, 46, 25);
		panelButton.add(btn_W);
		
		btn_E = new JButton("E");
		btn_E.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_E.setBounds(155, 35, 46, 25);
		panelButton.add(btn_E);
		
		btn_R = new JButton("R");
		btn_R.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_R.setBounds(203, 35, 46, 25);
		panelButton.add(btn_R);
		
		btn_T = new JButton("T");
		btn_T.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_T.setBounds(251, 35, 46, 25);
		panelButton.add(btn_T);
		
		btn_Y = new JButton("Y");
		btn_Y.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_Y.setBounds(299, 35, 46, 25);
		panelButton.add(btn_Y);

		btn_U = new JButton("U");
		btn_U.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_U.setBounds(347, 35, 46, 25);
		panelButton.add(btn_U);
		
		btn_I = new JButton("I");
		btn_I.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_I.setBounds(395, 35, 46, 25);
		panelButton.add(btn_I);
		
		btn_O = new JButton("O");
		btn_O.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_O.setBounds(443, 35, 46, 25);
		panelButton.add(btn_O);
		
		btn_P = new JButton("P");
		btn_P.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_P.setBounds(491, 35, 46, 25);
		panelButton.add(btn_P);
		
		btnColcheteAberto = new JButton("[");
		btnColcheteAberto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnColcheteAberto.setBounds(539, 35, 46, 25);
		panelButton.add(btnColcheteAberto);
		
		btnColcheteFechado = new JButton("]");
		btnColcheteFechado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnColcheteFechado.setBounds(587, 35, 46, 25);
		panelButton.add(btnColcheteFechado);
		
		btnBarraInvertida = new JButton("\\");
		btnBarraInvertida.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBarraInvertida.setBounds(635, 35, 46, 25);
		panelButton.add(btnBarraInvertida);
		
		btnCaps = new JButton("Caps");
		btnCaps.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCaps.setBounds(0, 65, 60, 25);
		panelButton.add(btnCaps);
		
		btnA = new JButton("A");
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnA.setBounds(62, 65, 43, 25);
		panelButton.add(btnA);
		
		btnS = new JButton("S");
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnS.setBounds(107, 65, 46, 25);
		panelButton.add(btnS);
		
		btnD = new JButton("D");
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnD.setBounds(155, 65, 46, 25);
		panelButton.add(btnD);
		
		btnF = new JButton("F");
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnF.setBounds(203, 65, 46, 25);
		panelButton.add(btnF);
		
		btnG = new JButton("G");
		btnG.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnG.setBounds(251, 65, 46, 25);
		panelButton.add(btnG);
		
		btnH = new JButton("H");
		btnH.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnH.setBounds(299, 65, 46, 25);
		panelButton.add(btnH);
		
		btnJ = new JButton("J");
		btnJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnJ.setBounds(347, 65, 46, 25);
		panelButton.add(btnJ);
		
		btnK = new JButton("K");
		btnK.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnK.setBounds(395, 65, 46, 25);
		panelButton.add(btnK);
		
		btnL = new JButton("L");
		btnL.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnL.setBounds(443, 65, 46, 25);
		panelButton.add(btnL);
		
		buttonDoisPontos = new JButton(":");
		buttonDoisPontos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonDoisPontos.setBounds(491, 65, 46, 25);
		panelButton.add(buttonDoisPontos);
		
		buttonAspas = new JButton("\"");
		buttonAspas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonAspas.setBounds(539, 65, 46, 25);
		panelButton.add(buttonAspas);
		
		btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEnter.setBounds(587, 65, 96, 25);
		panelButton.add(btnEnter);
		
		btnShift = new JButton("Shift");
		btnShift.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnShift.setBounds(0, 97, 60, 25);
		panelButton.add(btnShift);
		
		btnZ = new JButton("Z");
		btnZ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnZ.setBounds(62, 97, 43, 25);
		panelButton.add(btnZ);
		
		btnX = new JButton("X");
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnX.setBounds(107, 97, 46, 25);
		panelButton.add(btnX);
		
		btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnC.setBounds(155, 97, 46, 25);
		panelButton.add(btnC);
		
		btnV = new JButton("V");
		btnV.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnV.setBounds(203, 97, 46, 25);
		panelButton.add(btnV);
		
		btnB = new JButton("B");
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnB.setBounds(251, 97, 46, 25);
		panelButton.add(btnB);
		
		btnN = new JButton("N");
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnN.setBounds(299, 97, 46, 25);
		panelButton.add(btnN);
		
		btnM = new JButton("M");
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnM.setBounds(347, 97, 46, 25);
		panelButton.add(btnM);
		
		button_comas = new JButton(",");
		button_comas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_comas.setBounds(395, 97, 46, 25);
		panelButton.add(button_comas);
		
		button_dot = new JButton(".");
		button_dot.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_dot.setBounds(443, 97, 46, 25);
		panelButton.add(button_dot);
		
		button_Inter = new JButton("?");
		button_Inter.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button_Inter.setBounds(491, 97, 46, 25);
		panelButton.add(button_Inter);
		
		btnSetaUp = new JButton("|");
		btnSetaUp.setBounds(587, 97, 46, 25);
		panelButton.add(btnSetaUp);
		
		btnSpace = new JButton("");
		btnSpace.setBounds(155, 129, 333, 25);
		panelButton.add(btnSpace);
		
		btnSetaLeft = new JButton("<");
		btnSetaLeft.setBounds(540, 129, 46, 25);
		panelButton.add(btnSetaLeft);
		
		btnSetaRight = new JButton(">");
		btnSetaRight.setBounds(636, 129, 46, 25);
		panelButton.add(btnSetaRight);
		
		btnSetaDown = new JButton("|");
		btnSetaDown.setBounds(588, 129, 46, 25);
		panelButton.add(btnSetaDown);
		
		textArea.addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_DEAD_TILDE:
			btnNewButtonTil.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_1:
			button_1.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_2:
			button_2.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_3:
			button_3.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_4:
			button_4.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_5:
			button_5.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_6:
			button_6.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_7:
			button_7.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_8:
			button_8.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_9:
			button_9.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_0:
			button_0.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_MINUS:
			button_minus.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_ADD:
			button_plus.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_BACK_SPACE:
			btnBackspace.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_Q:
			btn_Q.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_W:
			btn_W.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_E:
			btn_E.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_R:
			btn_R.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_T:
			btn_T.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_Y:
			btn_Y.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_U:
			btn_U.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_I:
			btn_I.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_O:
			btn_O.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_P:
			btn_P.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_A:
			btnA.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_S:
			btnS.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_D:
			btnD.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_F:
			btnF.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_G:
			btnG.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_H:
			btnH.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_J:
			btnJ.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_K:
			btnK.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_L:
			btnL.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_Z:
			btnZ.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_X:
			btnX.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_C:
			btnC.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_V:
			btnV.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_B:
			btnB.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_N:
			btnN.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_M:
			btnM.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_OPEN_BRACKET:
			btnColcheteAberto.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_CLOSE_BRACKET:
			btnColcheteFechado.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_BACK_SLASH:
			btnBarraInvertida.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_SEMICOLON:
			buttonDoisPontos.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_QUOTE:
			buttonAspas.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_SLASH:
			button_Inter.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_COMMA:
			button_comas.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_PERIOD:
			button_dot.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_TAB:
			btnTab.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_CAPS_LOCK:
			btnCaps.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_SHIFT:
			btnShift.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_SPACE:
			btnSpace.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_UP:
			btnSetaUp.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_DOWN:
			btnSetaDown.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_LEFT:
			btnSetaLeft.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_RIGHT:
			btnSetaRight.setBackground(Color.BLACK);
			break;
		case KeyEvent.VK_ENTER:
			btnEnter.setBackground(Color.BLACK);
			break;

		default:
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub~
		btnNewButtonTil.setBackground(colorButtonTemp);
		button_1.setBackground(colorButtonTemp);
		button_2.setBackground(colorButtonTemp);
		button_3.setBackground(colorButtonTemp);
		button_4.setBackground(colorButtonTemp);
		button_5.setBackground(colorButtonTemp);
		button_6.setBackground(colorButtonTemp);
		button_7.setBackground(colorButtonTemp);
		button_8.setBackground(colorButtonTemp);
		button_9.setBackground(colorButtonTemp);
		button_0.setBackground(colorButtonTemp);
		button_minus.setBackground(colorButtonTemp);
		button_plus.setBackground(colorButtonTemp);
		btnBackspace.setBackground(colorButtonTemp);
		btn_Q.setBackground(colorButtonTemp);
		btn_W.setBackground(colorButtonTemp);
		btn_E.setBackground(colorButtonTemp);
		btn_E.setBackground(colorButtonTemp);
		btn_R.setBackground(colorButtonTemp);
		btn_T.setBackground(colorButtonTemp);
		btn_Y.setBackground(colorButtonTemp);
		btn_U.setBackground(colorButtonTemp);
		btn_I.setBackground(colorButtonTemp);
		btn_O.setBackground(colorButtonTemp);
		btn_P.setBackground(colorButtonTemp);
		btnA.setBackground(colorButtonTemp);
		btnS.setBackground(colorButtonTemp);
		btnD.setBackground(colorButtonTemp);
		btnF.setBackground(colorButtonTemp);
		btnG.setBackground(colorButtonTemp);
		btnH.setBackground(colorButtonTemp);
		btnJ.setBackground(colorButtonTemp);
		btnK.setBackground(colorButtonTemp);
		btnL.setBackground(colorButtonTemp);
		btnZ.setBackground(colorButtonTemp);
		btnX.setBackground(colorButtonTemp);
		btnC.setBackground(colorButtonTemp);
		btnV.setBackground(colorButtonTemp);
		btnB.setBackground(colorButtonTemp);
		btnN.setBackground(colorButtonTemp);
		btnM.setBackground(colorButtonTemp);
		btnColcheteAberto.setBackground(colorButtonTemp);
		btnColcheteFechado.setBackground(colorButtonTemp);
		btnBarraInvertida.setBackground(colorButtonTemp);
		buttonDoisPontos.setBackground(colorButtonTemp);
		buttonAspas.setBackground(colorButtonTemp);
		button_Inter.setBackground(colorButtonTemp);
		button_comas.setBackground(colorButtonTemp);
		button_dot.setBackground(colorButtonTemp);
		btnTab.setBackground(colorButtonTemp);
		btnCaps.setBackground(colorButtonTemp);
		btnShift.setBackground(colorButtonTemp);
		btnSpace.setBackground(colorButtonTemp);
		btnEnter.setBackground(colorButtonTemp);
		btnSetaUp.setBackground(colorButtonTemp);
		btnSetaDown.setBackground(colorButtonTemp);
		btnSetaLeft.setBackground(colorButtonTemp);
		btnSetaRight.setBackground(colorButtonTemp);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
