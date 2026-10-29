
/*
 * Description: Displays the array-based stack visually using
 * Java Swing. Draws stack slots, values, and highlights the
 * top element when PEEK is used.
 *
 * Programmed by: [Your Name] [Course] [Section] [Subject]
 *
 * Last Modified: October 29, 2026
 *
 * Version: 1.0
 *
 * Acknowledgements: OpenAI ChatGPT (GPT-6) assisted with
 * implementation guidance and code review.
 *
 * AI Prompt: "Help me create a Java Swing StackPanel that
 * displays an array-based stack with capacity slots, values,
 * a top-element highlight, and an empty-stack message."
 */

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class StackPanel extends JPanel {

    private final int capacity;
    private int[] items;
    private boolean highlightTop;

    public StackPanel(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                "Capacity must be greater than zero."
            );
        }

        this.capacity = capacity;
        this.items = new int[0];
        this.highlightTop = false;

        setPreferredSize(new Dimension(420, 400));
        setBackground(Color.WHITE);
    }

    public void show(int[] contents, boolean highlight) {
        if (contents == null) {
            items = new int[0];
        } else {
            items = Arrays.copyOf(contents, contents.length);
        }

        highlightTop = highlight;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g.create();

        try {
            g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
            );

             int panelWidth = getWidth();
            int panelHeight = getHeight();

            int slotWidth = Math.min(220, panelWidth - 60);
            slotWidth = Math.max(80, slotWidth);

            int slotHeight = Math.min(
                32,
                Math.max(20, (panelHeight - 100) / capacity)
            );

            int totalHeight = slotHeight * capacity;
            int startX = (panelWidth - slotWidth) / 2;
            int startY = (panelHeight - totalHeight) / 2;

            g2.setColor(Color.BLACK);
            g2.setFont(new Font(
                "SansSerif", Font.BOLD, 16
            ));
            g2.drawString("Stack Visualizer", startX, startY - 12);

            // Draw each stack slot from top to bottom.
            for (int i = 0; i < capacity; i++) {
                int x = startX;
                int y = startY
                    + (capacity - 1 - i) * slotHeight;

                boolean occupied = i < items.length;
                boolean isTop = occupied
                    && i == items.length - 1;

                if (occupied && isTop && highlightTop) {
                    g2.setColor(new Color(255, 220, 120));
                } else if (occupied) {
                    g2.setColor(new Color(180, 220, 250));
                } else {
                    g2.setColor(new Color(245, 245, 245));
                }

                g2.fillRect(x, y, slotWidth, slotHeight);

                g2.setColor(Color.DARK_GRAY);
                g2.drawRect(x, y, slotWidth, slotHeight);

                if (occupied) {
                    String value = String.valueOf(items[i]);
                    FontMetrics fm = g2.getFontMetrics();

                    int textX = x
                        + (slotWidth - fm.stringWidth(value)) / 2;

                    int textY = y
                        + (slotHeight - fm.getHeight()) / 2
                        + fm.getAscent();

                    g2.setColor(Color.BLACK);
                    g2.drawString(value, textX, textY);
                }
            }
            g2.setColor(Color.BLACK);
            g2.drawString(
                "Stack Visualizer",
                20,
                25
            );

        } finally {
            g2.dispose();
        }
    }
}
