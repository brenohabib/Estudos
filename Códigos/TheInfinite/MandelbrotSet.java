package TheInfinite;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MandelbrotSet extends JPanel {
    private final int width = 800;
    private final int height = 800;
    private final int maxIterations = 1000;
    private BufferedImage image;

    public MandelbrotSet() {
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        generateMandelbrotSet();
    }

    private void generateMandelbrotSet() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                double zx = 0;
                double zy = 0;
                double cx = (x - width / 2.0) * 4.0 / width;
                double cy = (y - height / 2.0) * 4.0 / height;
                int iteration = 0;
                while (zx * zx + zy * zy < 4.0 && iteration < maxIterations) {
                    double temp = zx * zx - zy * zy + cx;
                    zy = 2.0 * zx * zy + cy;
                    zx = temp;
                    iteration++;
                }
                int color = Color.HSBtoRGB((float) iteration / maxIterations, 1, 1);
                image.setRGB(x, y, color);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Mandelbrot Set");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            MandelbrotSet mandelbrotSet = new MandelbrotSet();
            frame.add(mandelbrotSet);
            frame.setSize(mandelbrotSet.width, mandelbrotSet.height);
            frame.setVisible(true);
        });
    }
}