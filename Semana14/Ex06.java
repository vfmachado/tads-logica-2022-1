import java.awt.*;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

public class Ex06 extends JPanel implements MouseInputListener {

    private int[][] tabuleiro = new int[8][8];
    private int[][] alternativas = new int[8][8];


    public void seuCodigo() {

        //SEU CODIGO SERA EXCLUSIVAMENTE AQUI
        //VOCE PODE BUSCAR UMA PECA DO TABULEIRO UTILIZANDO tabuleiro[lin][col];
        //VOCE PODE ALTERAR UM NUMERO UTILIZANDO alternativas[lin][col] = 2;
        //ESSE CODIGO EH EXECUTADO SEMPRE QUE HOUVER UMA MODIFICACAO NA MATRIZ (CLIQUE NA TELA)
        //alternativas[0][0] = 1;
        //System.out.println("PASSEI AQUI");
      
    }

    private final int SIZE = 600;
    private final int QUAD = 75;
    private final Font font = new Font("TimesRoman", Font.PLAIN, 20);
    private final Stroke stroke = new BasicStroke(5);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        for (int i = 0; i <= SIZE; i += QUAD) {

            g.drawLine(0, i, SIZE, i);
            g.drawLine(i, 0, i, SIZE);

        }

        g.setFont(font);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(stroke);
        for (int lin = 0; lin < tabuleiro.length; lin++) {
            for (int col = 0; col < tabuleiro[lin].length; col++) {
                
                if (tabuleiro[lin][col] == 1)
                    g2d.setColor(Color.BLUE);
                else if (tabuleiro[lin][col] == 2)
                    g2d.setColor(Color.RED);
                else
                    g2d.setColor(Color.LIGHT_GRAY);

                g2d.drawOval(col * QUAD + 20, lin * QUAD + 20, 35, 35);

                g.drawString("" + alternativas[lin][col], col * QUAD + 33, lin * QUAD + 43);
            }
        }
    }

    public static void main(String[] args) {

        JFrame janela = new JFrame("Resta 1 Diferente");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(610, 640);

        Ex06 painel = new Ex06();
        painel.setBounds(0, 0, 600, 600);

        janela.addMouseListener(painel);

        janela.add(painel);
        janela.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        int lin = (e.getY() -30)/75;
        int col = e.getX()/75;

        if (lin >= 0 && lin < 8 && col >= 0 && col < 8) {
            if (e.getButton() == 1) {
                tabuleiro[lin][col] = 1;
            }

            else if (e.getButton() == 3) {
                tabuleiro[lin][col] = 2;
            } 

            else if (e.getButton() == 2) {
                tabuleiro[lin][col] = 0;
            }

            seuCodigo();
            repaint();
        }
    }

    //IGNORAR CÓDIGOS ABAIXO
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

}