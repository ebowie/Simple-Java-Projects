package spreed;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * This is gui app for the speed reader.
 */
public class SpreedApp extends JFrame {
    /** gui jPane. */
    private final JPanel contentPane;
    /** This is to access words. */
    private static WordSource wordList;
    /** This is to access pivot and alignments and pause length. */
    private static SpreedWord speedList;
    /** a master counter to move the words. */
    private static int count = 0;
    /** A timer to help move the words or stop them. */
    private static Timer timer;
    /** To get the play button play or pause. */
    private static boolean play1 = false;
    /** This to for the speed of the words. */
    private static int speed;
    /** This is the array for the different speeds. */
    private static String[] wpm = {"250", "350", "500", "650", "800", "1000"};
    /** This is the display for the words. */
    private static JLabel label;
    /** To display the words. */
    private static String word = "";
    /** To take in a word for just to hold. */
    private static String wordTemp;

    /**
     * This is the main where everything will get displayed.
     *
     * @param String
     *            [] arg this driver of the program.
     * @throw IOException this is for the file to come through.
     */
    public static void main(final String[] arg) throws IOException {
        wordList = new WordSource(arg[0]);

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    SpreedApp frame = new SpreedApp();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public SpreedApp() throws IOException {
        // this is jFrame.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 482, 223);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        // this is the jSlider
        final JSlider slider = new JSlider();
        slider.setBounds(186, 151, 200, 23);
        slider.setValue(0);
        slider.setMaximum(wordList.getSize() - 1);
        slider.addChangeListener(new SliderListener());
        contentPane.add(slider);
        // this is the Jlist
        JList list = new JList();
        list.setBounds(230, 139, 1, 1);
        contentPane.add(list);
        // this is the jButton
        JButton reset = new JButton("Reset");
        reset.setFont(new Font("Tahoma", Font.PLAIN, 10));
        reset.addActionListener(new ActionListener() {
            @Override
            // this action is the reset button
            public void actionPerformed(final ActionEvent e) {
                // stops timer
                timer.stop();


                slider.setValue(0); // sets slider back to zero
                count = 0; // set the count to zer0
                play1 = false; // set play to false
                label.setText("  Push Play to Start.");
            }
        });
        reset.setBounds(10, 151, 75, 23);
        contentPane.add(reset);
        // the timer being set.
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                wordTemp = wordList.getWord(count);

                int pivot = speedList.getPivot(wordTemp);

                word = wordTemp;

                slider.setValue(count);
                // this if statement is pause length method that
                // keeps longer words on the screen longer.
                if (1 == speedList.getPauseLength(word)) {

                    label.setText(speedList.getAlignedWord(word, 25));
                    timer.setDelay(speed);
                } else if (2 == speedList.getPauseLength(word)) {

                    label.setText(speedList.getAlignedWord(word, 25));
                    timer.setDelay(speed * 2);

                } else if (3 == speedList.getPauseLength(word)) {

                    label.setText(speedList.getAlignedWord(word, 25));
                    timer.setDelay(speed * 3);

                } else if (4 == speedList.getPauseLength(word)) {

                    label.setText(speedList.getAlignedWord(word, 25));
                    timer.setDelay(speed * 4);

                } else if (5 == speedList.getPauseLength(word)) {

                    label.setText(speedList.getAlignedWord(word, 25));
                    timer.setDelay(speed * 5);

                } else if (6 == speedList.getPauseLength(word)) {

                    label.setText(speedList.getAlignedWord(word, 25));
                    timer.setDelay(speed * 6);

                } else if (7 == speedList.getPauseLength(word)) {

                    label.setText(speedList.getAlignedWord(word, 25));
                    timer.setDelay(speed * 7);

                }
                count++;
                // the timer will stop at the end of the last word.
                if (count == wordList.getSize()) {
                    timer.stop();
                    play1 = false;
                    label.setText("Speed Reader Done");
                }

            }
        });
        final JButton play = new JButton("Play");
        play.setFont(new Font("Tahoma", Font.PLAIN, 10));
        play.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(final ActionEvent arg0) {
                // this toggles the play and pause button
                // and controls the timer.
                play1 = !play1;
                if (play1) {
                    if (count == wordList.getSize()) {
                        count = 0;
                    }
                    timer.start();
                     play.setText("Pause");
                    timer.setDelay(speed);

                } else {
                    timer.stop();
                    play.setText("Play");
                }

            }
        });
        play.setBounds(107, 151, 69, 23);
        contentPane.add(play);

        JComboBox comboBox = new JComboBox(wpm);
        comboBox.setBounds(397, 151, 59, 23);
        comboBox.setSelectedItem(0);
        speed = 250;
        comboBox.addActionListener(new ActionListener() {
            @Override
            // this set the speeds of the words
            // in the combo box
            public void actionPerformed(final ActionEvent e) {
                JComboBox combo = (JComboBox) e.getSource();
                int wpmNum = combo.getSelectedIndex();
                // this what changes the speed
                speed = Integer.parseInt(wpm[wpmNum]);
                speed = 1000 / (speed / 60);
                timer.setDelay(speed);

            }
        });
        // Jlabel to display the words
        contentPane.add(comboBox);
        label = new JLabel("Push Play to Start");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        label.setOpaque(true);
        label.setBackground(Color.WHITE);
        label.setBounds(10, 11, 446, 117);
        contentPane.add(label);

    }

    /**
     * This help jslider update of the words when you move it.
     *
     * @param index
     *            this will get number to update the word.
     */
    public static void setWord(final int index) {
        count = index; // updates each word while jslider is moving
        label.setText(speedList.getAlignedWord(wordList.getWord(count), 25));
    }
}

/**
 *
 * @author Eric This is for the jslider to be to move any where you want it to
 *         or certain word you want to display.
 */
class SliderListener implements ChangeListener {
    @Override
    // this make the jslider able to move with the word being
    // updated
    public void stateChanged(final ChangeEvent e) {
        JSlider source = (JSlider) e.getSource();
        SpreedApp.setWord(source.getValue());

    }

}
