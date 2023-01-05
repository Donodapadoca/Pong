
import java.awt.Canvas;
import java.awt.Dimension;

import javax.management.monitor.GaugeMonitor;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {

    public static int WIDTH = 240;
    public static int HEIGHT = 120;
    public static int SCALE = 2;

    public Game() {
        this.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
    }

    public static void main(String[] args) {

        Game game = new Game();
        JFrame frame = new JFrame("Pong");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(game);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

}
