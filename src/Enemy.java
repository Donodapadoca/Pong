
import java.awt.Graphics;
import java.awt.Color;

public class Enemy {

    public double x, y;
    public int height;
    public int width;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 40;
        this.height = 10;

    }

    public void tick() {

    }

    public void render(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect((int) x, (int) y, width, height);

    }

}
