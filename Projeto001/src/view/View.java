package view;

/**
 *
 * @author brayan
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.*;
import sistema.Sistema;

public class View extends JFrame {

    //teclas numericas 
    private final JButton tBtn_N0, tBtn_N1, tBtn_N2, tBtn_N3, tBtn_N4, tBtn_N5, tBtn_N6, tBtn_N7, tBtn_N8, tBtn_N9;
    //teclas de operação 
    private JButton btn_Soma, btn_Subtracao, btn_Divisao, btn_Multiplicacao, btn_Ce, btn_Resultado;
    //label para mostrar resultado
    private JLabel lbl_Resultado, lbl_Conta;
    //Largura Altura do frame
    private int JLWhidth = 300, JAHeight = 500;
    //conf min dimension frame
    private final Dimension minDimension = new Dimension(300, 500);
    //cor dos buttons
    private final Color color = new Color(128, 128, 128);
    //Largura e algura das teclas
    private int TAHeight, TLWhidth;
    //timer
    private Timer timerFDimension = new Timer(20, e -> FDimension());

    Sistema sistema = new Sistema();
    double valor1;
    String string1 = "";
    byte codigoOperacao = 0;

    public View() {

        //config na janela
        setSize(JLWhidth, JAHeight);
        setResizable(true);
        setMinimumSize(minDimension);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        //config dos labels
        {
            //inicializando as teclas
            lbl_Conta = new JLabel();
            lbl_Resultado = new JLabel();
            tBtn_N0 = new JButton("0");
            tBtn_N1 = new JButton("1");
            tBtn_N2 = new JButton("2");
            tBtn_N3 = new JButton("3");
            tBtn_N4 = new JButton("4");
            tBtn_N5 = new JButton("5");
            tBtn_N6 = new JButton("6");
            tBtn_N7 = new JButton("7");
            tBtn_N8 = new JButton("8");
            tBtn_N9 = new JButton("9");
            //inicialização das teclas operacionais
            btn_Soma = new JButton("+");
            btn_Subtracao = new JButton("-");
            btn_Multiplicacao = new JButton("X");
            btn_Divisao = new JButton("/");
            btn_Ce = new JButton("CE");
            btn_Resultado = new JButton("=");

            //config Jlabel cor
            lbl_Resultado.setBackground(color);
            //lbl_Conta.setBackground(color);
            tBtn_N0.setBackground(color);
            tBtn_N1.setBackground(color);
            tBtn_N2.setBackground(color);
            tBtn_N3.setBackground(color);
            tBtn_N4.setBackground(color);
            tBtn_N5.setBackground(color);
            tBtn_N6.setBackground(color);
            tBtn_N7.setBackground(color);
            tBtn_N8.setBackground(color);
            tBtn_N9.setBackground(color);
            btn_Soma.setBackground(color);
            btn_Subtracao.setBackground(color);
            btn_Multiplicacao.setBackground(color);
            btn_Divisao.setBackground(color);
            btn_Ce.setBackground(color);
            btn_Resultado.setBackground(color);

            lbl_Conta.setOpaque(false);
            lbl_Resultado.setOpaque(false);
            tBtn_N0.setOpaque(true);
            tBtn_N1.setOpaque(true);
            tBtn_N2.setOpaque(true);
            tBtn_N3.setOpaque(true);
            tBtn_N4.setOpaque(true);
            tBtn_N5.setOpaque(true);
            tBtn_N6.setOpaque(true);
            tBtn_N7.setOpaque(true);
            tBtn_N8.setOpaque(true);
            tBtn_N9.setOpaque(true);
            btn_Soma.setOpaque(true);
            btn_Subtracao.setOpaque(true);
            btn_Multiplicacao.setOpaque(true);
            btn_Divisao.setOpaque(true);
            btn_Ce.setOpaque(true);
            btn_Resultado.setOpaque(true);

            lbl_Conta.setVisible(true);
            lbl_Resultado.setVisible(true);
            tBtn_N0.setVisible(true);
            tBtn_N1.setVisible(true);
            tBtn_N2.setVisible(true);
            tBtn_N3.setVisible(true);
            tBtn_N4.setVisible(true);
            tBtn_N5.setVisible(true);
            tBtn_N6.setVisible(true);
            tBtn_N7.setVisible(true);
            tBtn_N8.setVisible(true);
            tBtn_N9.setVisible(true);
            btn_Soma.setVisible(true);
            btn_Subtracao.setVisible(true);
            btn_Multiplicacao.setVisible(true);
            btn_Divisao.setVisible(true);
            btn_Ce.setVisible(true);
            btn_Resultado.setVisible(true);

            lbl_Conta.setHorizontalAlignment(SwingConstants.RIGHT);
            lbl_Resultado.setHorizontalAlignment(SwingConstants.LEFT);

            add(lbl_Resultado);
            add(lbl_Conta);
            add(tBtn_N0);
            add(tBtn_N1);
            add(tBtn_N2);
            add(tBtn_N3);
            add(tBtn_N4);
            add(tBtn_N5);
            add(tBtn_N6);
            add(tBtn_N7);
            add(tBtn_N8);
            add(tBtn_N9);
            add(btn_Soma);
            add(btn_Subtracao);
            add(btn_Multiplicacao);
            add(btn_Divisao);
            add(btn_Ce);
            add(btn_Resultado);
        }
        FDimension();
        timerFDimension.start();
        setVisible(true);
        teclas();

    }

    public void FDimension() {
        TAHeight = getHeight() / 6;
        TLWhidth = getWidth() / 4 - 15;

        lbl_Resultado.setBounds(10, 20, getWidth() - 45, TAHeight);
        lbl_Conta.setBounds(10, 20, getWidth() - 45, TAHeight);

        tBtn_N7.setBounds(10, lbl_Resultado.getY() + lbl_Resultado.getHeight() + 5, TLWhidth, TAHeight);
        tBtn_N8.setBounds(tBtn_N7.getX() + tBtn_N7.getWidth() + 5, tBtn_N7.getY(), TLWhidth, TAHeight);
        tBtn_N9.setBounds(tBtn_N8.getX() + tBtn_N8.getWidth() + 5, tBtn_N7.getY(), TLWhidth, TAHeight);
        btn_Divisao.setBounds(tBtn_N9.getX() + tBtn_N9.getWidth() + 5, tBtn_N7.getY(), TLWhidth, TAHeight);
        tBtn_N4.setBounds(tBtn_N7.getX(), tBtn_N7.getY() + tBtn_N7.getHeight() + 5, TLWhidth, TAHeight);
        tBtn_N5.setBounds(tBtn_N8.getX(), tBtn_N4.getY(), TLWhidth, TAHeight);
        tBtn_N6.setBounds(tBtn_N9.getX(), tBtn_N4.getY(), TLWhidth, TAHeight);
        btn_Multiplicacao.setBounds(btn_Divisao.getX(), tBtn_N4.getY(), TLWhidth, TAHeight);
        tBtn_N1.setBounds(tBtn_N4.getX(), tBtn_N4.getY() + tBtn_N4.getHeight() + 5, TLWhidth, TAHeight);
        tBtn_N2.setBounds(tBtn_N5.getX(), tBtn_N1.getY(), TLWhidth, TAHeight);
        tBtn_N3.setBounds(tBtn_N6.getX(), tBtn_N1.getY(), TLWhidth, TAHeight);
        btn_Soma.setBounds(btn_Multiplicacao.getX(), tBtn_N1.getY(), TLWhidth, TAHeight);
        btn_Ce.setBounds(tBtn_N1.getX(), tBtn_N1.getY() + tBtn_N1.getHeight() + 6, TLWhidth, TAHeight);
        tBtn_N0.setBounds(tBtn_N2.getX(), btn_Ce.getY(), TLWhidth, TAHeight);
        btn_Subtracao.setBounds(tBtn_N3.getX(), btn_Ce.getY(), TLWhidth, TAHeight);
        btn_Resultado.setBounds(btn_Soma.getX(), btn_Ce.getY(), TLWhidth, TAHeight);

        tBtn_N0.setFont(new Font("Serif", Font.PLAIN, (TAHeight + TLWhidth) / 6 + 5));
        tBtn_N1.setFont(new Font("Serif", Font.PLAIN, (TAHeight + TLWhidth) / 6 + 5));
        tBtn_N2.setFont(new Font("Serif", Font.PLAIN, (TAHeight + TLWhidth) / 6 + 5));
        tBtn_N3.setFont(new Font("Serif", Font.PLAIN, (TAHeight + TLWhidth) / 6 + 5));
        tBtn_N4.setFont(new Font("Serif", Font.PLAIN, (TAHeight + TLWhidth) / 6 + 5));
        tBtn_N5.setFont(new Font("Serif", Font.PLAIN, (TAHeight + TLWhidth) / 6 + 5));
        tBtn_N6.setFont(new Font("Serif", Font.PLAIN, (TAHeight + TLWhidth) / 6 + 5));
        tBtn_N7.setFont(new Font("Serif", Font.PLAIN, (TAHeight + TLWhidth) / 6 + 5));
        tBtn_N8.setFont(new Font("Serif", Font.PLAIN, (TAHeight + TLWhidth) / 6 + 5));
        tBtn_N9.setFont(new Font("Serif", Font.PLAIN, (TAHeight + TLWhidth) / 6 + 5));
        btn_Soma.setFont(new Font("Serif", Font.PLAIN, (TAHeight + TLWhidth) / 6 + 5));
        btn_Subtracao.setFont(new Font("Serif", Font.PLAIN, (TAHeight + TLWhidth) / 6 + 5));
        btn_Multiplicacao.setFont(new Font("Serif", Font.PLAIN, (TAHeight + TLWhidth) / 6 + 5));
        btn_Divisao.setFont(new Font("Arial", Font.BOLD, (TAHeight + TLWhidth) / 6 + 5));
        btn_Ce.setFont(new Font("Serif", Font.PLAIN, (TAHeight + TLWhidth) / 7));
        btn_Resultado.setFont(new Font("Serif", Font.PLAIN, (TAHeight + TLWhidth) / 6 + 5));

        lbl_Resultado.setText(" "+String.valueOf(sistema.getValor()));
        lbl_Conta.setText(" "+String.valueOf(sistema.getResValor()));
        lbl_Resultado.setFont(new Font("Serif", Font.PLAIN, (TAHeight + TLWhidth) / 6 + 5));
        lbl_Conta.setFont(new Font("Serif", Font.PLAIN, (TAHeight + TLWhidth) / 6 + 5));

    }

    public void teclas() {

        tBtn_N0.addActionListener((ActionEvent e) -> {string1 += 0;sistema.conversao(string1);});
        tBtn_N1.addActionListener((ActionEvent e) -> {string1 += 1;sistema.conversao(string1);});
        tBtn_N2.addActionListener((ActionEvent e) -> {string1 += 2;sistema.conversao(string1);});
        tBtn_N3.addActionListener((ActionEvent e) -> {string1 += 3;sistema.conversao(string1);});
        tBtn_N4.addActionListener((ActionEvent e) -> {string1 += 4;sistema.conversao(string1);});
        tBtn_N5.addActionListener((ActionEvent e) -> {string1 += 5;sistema.conversao(string1);});
        tBtn_N6.addActionListener((ActionEvent e) -> {string1 += 6;sistema.conversao(string1);});
        tBtn_N7.addActionListener((ActionEvent e) -> {string1 += 7;sistema.conversao(string1);});
        tBtn_N8.addActionListener((ActionEvent e) -> {string1 += 8;sistema.conversao(string1);});
        tBtn_N9.addActionListener((ActionEvent e) -> {string1 += 9;sistema.conversao(string1);});
        btn_Soma.addActionListener((ActionEvent e) -> {sistema.operacao(codigoOperacao);codigoOperacao = 1;string1 = "";});
        btn_Subtracao.addActionListener((ActionEvent e) -> {sistema.operacao(codigoOperacao);codigoOperacao = 2;string1 = "";});
        btn_Multiplicacao.addActionListener((ActionEvent e) -> {sistema.operacao(codigoOperacao);codigoOperacao = 3;string1 = "";});
        btn_Divisao.addActionListener((ActionEvent e) -> {sistema.operacao(codigoOperacao);codigoOperacao = 4;string1 = "";});
        btn_Ce.addActionListener((ActionEvent e) -> {codigoOperacao = 5;sistema.operacao(codigoOperacao);codigoOperacao = 0;string1 = "";});
        btn_Resultado.addActionListener((ActionEvent e) -> {sistema.operacao(codigoOperacao);string1 = "";});
    }

}
