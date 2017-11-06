import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

class Grid extends JFrame
{
 private static Grid firstView = null;
 protected JButton button[];
 protected GridLayout buttonPanel;
 
 protected Grid()
 {
  super("Tic Tac Toe");
  button = new JButton[9]; 
  buttonPanel= new GridLayout(3,3); 
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(300,300);
  setLayout(buttonPanel);
  
  //creating buttons
  button[0] = new JButton();
  button[1] = new JButton();
  button[2] = new JButton();
  button[3] = new JButton();
  button[4] = new JButton();
  button[5] = new JButton();
  button[6] = new JButton();
  button[7] = new JButton();
  button[8] = new JButton();
  
  //adding to the grid
  add(button[0]);
  add(button[1]);
  add(button[2]);
  add(button[3]);
  add(button[4]);
  add(button[5]);
  add(button[6]);
  add(button[7]);
  add(button[8]);
   
  setVisible(true);
 }
 
  public void clearButtons()
 {
  for(int buttonNum=0; buttonNum<9; buttonNum++)
  {
   button[buttonNum].setText(null);
  }
 }



 public static Grid getInstace()
 {
  if (firstView == null)
   firstView = new Grid();
  
  return firstView;
 }
}

