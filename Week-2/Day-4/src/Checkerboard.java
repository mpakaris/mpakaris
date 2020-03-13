import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int xStartUneven = 0, yStart = 0, xStartEven = 32, seize = 32;
        graphics.setColor(new Color(0, 0, 0));

        // We go line by line through the Canvavs
        for (int i = 0; i < 6; i++) {// Loop in y-Direction

            if ( i % 2 != 0) {
                for (int j = 1; j < 6; j++) {
                    graphics.fillRect(xStartUneven, yStart, seize, seize);
                    xStartUneven += 64;
                }
            } else {
                for (int j = 1; j < 6; j++) {
                    graphics.fillRect(xStartEven, yStart, seize, seize);
                    xStartEven +=64;
                }
            }
            yStart += 32;
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}