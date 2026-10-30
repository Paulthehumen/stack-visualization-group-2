/* Name: Aldrine Bellinario
 * Course/Year: BSIT 2
 * Subject: DATA STRUCTURES AND ALGORITHMS
 * Acknowledgements: OpenAI ChatGPT (GPT-6) assisted with
 * GUI layout and implementation of stack operation buttons.
 *
 * Prompt: "Help implement the Java Swing GUI layout for an
 * array-based Stack Visualizer, including the input field
 * and PUSH, POP, and PEEK buttons."
 */



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

public class StackGUI extends JPanel {

    private static final int CAPACITY = 10;

    // Shared components
    private final ArrayStack stack = new ArrayStack(CAPACITY);
    private final StackPanel drawing = new StackPanel(CAPACITY);
    private final JTextField input = new JTextField(6);
    private final JLabel status = new JLabel("Ready");
    private final JLabel sizeLabel = new JLabel();

    public StackGUI() {
        setLayout(new BorderLayout(8, 8));

        add(buildControls(), BorderLayout.NORTH);
        add(drawing, BorderLayout.CENTER);
        add(buildStatusBar(), BorderLayout.SOUTH);

        refresh(false);
    }

    // Builds the controls at the top of the window.
    private JPanel buildControls() {
        JPanel controls = new JPanel(new FlowLayout());

        controls.add(buildInputArea());
        controls.add(buildMainButtons());
        controls.add(buildExtraButtons());

        return controls;
    }

    // Builds the value input field.
    private JPanel buildInputArea() {
        JPanel area = new JPanel();

        area.add(new JLabel("Value:"));
        area.add(input);

        return area;
    }

    // Builds PUSH, POP, and PEEK buttons.
    private JPanel buildMainButtons() {
        JPanel buttons = new JPanel();

        buttons.add(makeButton("PUSH", e -> onPush()));
        buttons.add(makeButton("POP", e -> onPop()));
        buttons.add(makeButton("PEEK", e -> onPeek()));

        return buttons;
    }

/*Name:Alberto Jr.S.Barluado
 * Course/Year: BSIT 2
 * Subject: DATA STRUCTURES AND ALGORITHMS
 * Description:
 * This section builds the additional stack operation buttons,
 * status bar, and reusable button creation method.
 *
 * Acknowledgements:
 * OpenAI ChatGPT (GPT-6) assisted with organizing the GUI
 * components and implementing reusable button functionality.
 *
 * AI Prompt:
 * "Help divide the Java Swing StackGUI extra buttons,
 * status bar, and reusable button creation method into
 * three development stages with descriptions."
 */
    
    // Builds the extra stack operation buttons.
    private JPanel buildExtraButtons() {
        JPanel buttons = new JPanel();

        buttons.add(makeButton("CLEAR", e -> onClear()));
        buttons.add(makeButton("CHECK STACK", e -> onCheck()));
        buttons.add(makeButton("RANDOM", e -> onRandom()));

        return buttons;
    }

     // Builds the status bar at the bottom of the GUI.
    private JPanel buildStatusBar() {
        JPanel bar = new JPanel(new BorderLayout());

        bar.setBorder(
            BorderFactory.createEmptyBorder(4, 10, 8, 10)
        );

        bar.add(status, BorderLayout.CENTER);
        bar.add(sizeLabel, BorderLayout.EAST);

        return bar;
    }

      // Creates a button and connects it to its action.
    private JButton makeButton(
            String text, ActionListener action) {

        JButton button = new JButton(text);
        button.addActionListener(action);

        return button;
    }

