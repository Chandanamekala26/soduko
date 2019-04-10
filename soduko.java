import javax.swing.*;
import java.awt.*;
import java.util.*;
/* < applet code="Generate.class" height=200 width200>
</applet>
*/
public class Generatew  extends JApplet
{
JButton model1[][];
public void init()
{
Container cp= getContentPane();
model1 =new JButton[9][9];
Random  rnd=new Random(1);
int[][] model =new int[9][9];
cp.setLayout(new GridLayout(9,9));
for (int i=0; i<9; i++)
{
int t=(int) (10*Math.random());
for (int j=0; j<9; j++)
{
int t1=(int) (10*Math.random());
if ((t==0) || (t==t1))
model[i][j]=0;
else
model[i][j]=rnd.nextInt(10);
model1[i][j]=new JButton(String.valueOf(model[i][j]));
cp.add(model1[i][j]);
}
}
}
}