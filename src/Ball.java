import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;
import java.awt.Rectangle;

public class Ball {

    public double x, y;
    public int height;
    public int width;
    public boolean right, left;

    public double dx, dy;
    public double vel = 0.6;

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 4;
        this.height = 4;

        dx = new Random().nextGaussian();
        dy = new Random().nextGaussian();

    }

    public void tick() {

        if (x + (dx * vel) + width >= Game.WIDTH) {

            dx *= -1;

        }

        else if (x + (dx * vel) < 0) {
            dx *= -1;

        }

        if (y >= Game.HEIGHT) {
            System.out.println("Ponto do Inimigo");
            new Game();
            return;
            // ponto do inimigo

        }

        else if (y < 0) {
            System.out.println("Ponto do Player");
            // ponto do player
            new Game();
            return;
        }

        Rectangle bounds = new Rectangle((int) (x + (dx * vel)), (int) (y + (dy * vel)), width, height);

        Rectangle boundsPLayer = new Rectangle(Game.player.x, Game.player.y, Game.player.width, Game.player.height);
        Rectangle boundsEnemy = new Rectangle((int) Game.enemy.x, (int) Game.enemy.y, (int) Game.enemy.width,
                Game.enemy.height);

        if (bounds.intersects(boundsPLayer)) {
            dy *= -1;
            vel += 0.02;
        }

        else if (bounds.intersects(boundsEnemy)) {
            dy *= -1;
            vel += 0.02;
        }

        x += dx * vel;
        y += dy * vel;

    }

    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect((int) x, (int) y, width, height);

    }

}
