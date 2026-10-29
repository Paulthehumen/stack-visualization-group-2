
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

            // Stack drawing will be added in Commit 2.
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
