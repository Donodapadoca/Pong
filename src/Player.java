
import java.awt.Color;
import java.awt.Graphics;

public class Player {

    public void tick() {
    }

    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(200, 120 - 10, 40, 10);

    }
}
