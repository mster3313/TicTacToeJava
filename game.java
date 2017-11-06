class game
{
 int buttonarr[] = new int[9]; 
 int numberOfClicks = 0;
 
 public void setClick(int position, int value)
 { 
  buttonarr[position]= value; 
  numberOfClicks++; 

 }
 
 public void resetClick()
 {
  numberOfClicks = 0;
  for(int position = 0; position<9; position++)
  {
   buttonarr[position]= 0;
  }
 }
 
 public int getResult()
 { 
 
    if (buttonarr[0]==1 && buttonarr[1]==1 && buttonarr[2]==1)
     return 1;  
   if (buttonarr[0]==2 && buttonarr[1]==2 && buttonarr[2]==2)
   return 2;  
  if (buttonarr[3]==1 && buttonarr[4]==1 && buttonarr[5]==1)
     return 1; 
  if (buttonarr[3]==2 && buttonarr[4]==2 && buttonarr[5]==2)
   return 2; 
  if (buttonarr[6]==1 && buttonarr[7]==1 && buttonarr[8]==1)
     return 1;  
  if (buttonarr[6]==2 && buttonarr[7]==2 && buttonarr[8]==2)
   return 2; 
  
  if (buttonarr[0]==1 && buttonarr[3]==1 && buttonarr[6]==1)
     return 1;  
  if (buttonarr[0]==2 && buttonarr[3]==2 && buttonarr[6]==2)
   return 2; 
  if (buttonarr[1]==1 && buttonarr[4]==1 && buttonarr[7]==1)
     return 1; 
  if (buttonarr[1]==2 && buttonarr[4]==2 && buttonarr[7]==2)
   return 2; 
  if (buttonarr[2]==1 && buttonarr[5]==1 && buttonarr[8]==1)
     return 1; 
  if (buttonarr[2]==2 && buttonarr[5]==2 && buttonarr[8]==2)
   return 2; 
   
  
  
   if (buttonarr[0]==1 && buttonarr[4]==1 && buttonarr[8]==1)
     return 1; 
   if (buttonarr[0]==2 && buttonarr[4]==2 && buttonarr[8]==2)
   return 2; 
  if (buttonarr[2]==1 && buttonarr[4]==1 && buttonarr[6]==1)
     return 1; 
   if (buttonarr[2]==2 && buttonarr[4]==2 && buttonarr[6]==2)
   return 2; 
   
  if (numberOfClicks==9)
   return 3; 

  return 0;
 }
  
 
}

