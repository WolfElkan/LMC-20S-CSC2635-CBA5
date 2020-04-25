import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
   This program shows a frame that is filled with two components.
*/
public class FilledFrameViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      
      JButton button = new JButton("Cliquez moi!");
      JLabel label = new JLabel("Bonjour le monde!");

      JPanel panel = new JPanel();
      panel.add(button);
      panel.add(label);
      frame.add(panel);

      final int FRAME_WIDTH = 300;
      final int FRAME_HEIGHT = 100;
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("Un cadre à deux composants");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.setVisible(true);
   }
}
