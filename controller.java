import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

class controller extends Grid implements ActionListener
{
 private game newGame = new game();
 private int result = 0;
 private String winStatus; 
 private boolean Player1 = true; // SET PLAYER 1 TO GO FIRST
 
 public controller()
 {
  
  for(int x=0; x<9; x++)
   super.button[x].addActionListener(this);
 }
 
 
 public void goAgain()
 {
  JOptionPane.showMessageDialog(null,finalResult(), "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);
   dispose();
   System.exit(0);
 }
 
 
 public void actionPerformed (ActionEvent event)
 {
  Object objClicked = event.getSource();

  for(int position=0; position<9; position++)
  {
   if(objClicked==super.button[position])
   {
    if (super.button[position].getText()=="")
    {
     if (Player1 == true)
     {
      
      super.button[position].setText("1");
      newGame.setClick(position,1);
      Player1 = false;  // CHANGE TO NEXT PLAYER
      
      result = newGame.getResult();
 
     }
     else
     {
      super.button[position].setText("2"); 
      newGame.setClick(position,2);
      Player1 = true; // CHANGE TO NEXT PLAYER 
      
      result = newGame.getResult();
     }
    }
   }
  }
  if(result!=0)
    goAgain();

 }
 
  public String finalResult(){
    if (result == 1) {
        return "Player 1 Wins";
    }
    else if(result == 2) {
        return "Player 2 Wins";
    }
    else{
        return "Match Draw";
    }
}
}
