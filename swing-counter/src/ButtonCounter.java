import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonCounter implements ActionListener {
    private int numberOfClicks;
    private final JFrame jframe;
    private final JPanel jPanel;
    private final JLabel jLabel;
    private final JButton incrementButton;


    public ButtonCounter() {
        numberOfClicks = 0;
        jframe = new JFrame();
        jPanel = new JPanel();
        jLabel = new JLabel("number of clicks : " + numberOfClicks);
        incrementButton = new JButton("click to increment");

        incrementButton.addActionListener(this);

        jPanel.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        jPanel.setLayout(new GridLayout(0, 1));
        jPanel.add(incrementButton);
        jPanel.add(jLabel);

        jframe.add(jPanel, BorderLayout.CENTER);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setTitle("counter incrementer");
        jframe.pack();
        jframe.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        numberOfClicks++;
        jLabel.setText("number of clicks : " + numberOfClicks);
    }
}

