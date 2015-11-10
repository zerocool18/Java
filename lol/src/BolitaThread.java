

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import javax.swing.*;
/**
* @author jjdiaz
*
*/
public class BolitaThread extends Thread {
boolean tocaron = false;
int x;
int y;
int directionY = 1;
int directionX = 1;
// JWindow bolitaJWindow = new JWindow();
public JFrame bolitaJWindow = new JFrame();
static int width;
static int height;
@Override
public void run() {
Random randomizer = new Random();
while( true ) {
if( tocaron )
break;
try {
Thread.sleep(5);
this.y += (randomizer.nextInt(3)) * this.directionY;
if( this.y >= BolitaThread.height || this.y <= 0 ) {
Toolkit.getDefaultToolkit().beep();
this.directionY = this.directionY > 0 ? -1 : 1;
if( this.y > BolitaThread.height )
this.y = BolitaThread.height;
else 
if( this.y < 0 )
this.y = 0;
} // if
this.x += (randomizer.nextInt(3)) * this.directionX;
if( this.x >= BolitaThread.width || this.x <= 0 ) {
Toolkit.getDefaultToolkit().beep();
this.directionX = this.directionX > 0 ? -1 : 1;
if( this.x > BolitaThread.width )
this.x = BolitaThread.width;
else
if( this.x < 0 )
this.x = 0;
} // if
bolitaJWindow.setLocation(this.x, this.y);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} // catch
} // while ( true )
} // run
public BolitaThread(int i, int j, String string) {
try {
URL url = new URL( string );
this.bolitaJWindow.add(new JLabel(new ImageIcon( url ) ));
} catch (MalformedURLException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
this.bolitaJWindow.setUndecorated(true); // sin bordes de Windows
this.bolitaJWindow.setBackground( new Color(0,0,0,0) ); // background transparente
this.bolitaJWindow.pack(); // setSize( )
this.bolitaJWindow.setLocation( this.x = i, this.y = j );
this.bolitaJWindow.addMouseListener(new MouseListener() {
@Override
public void mouseReleased(MouseEvent e) {
// TODO Auto-generated method stub
}
@Override
public void mousePressed(MouseEvent e) {
// TODO Auto-generated method stub
Toolkit.getDefaultToolkit().beep();
tocaron = true;
// bolitaJWindow.setVisible(false);
// bolitaJWindow = null;
}
@Override
public void mouseExited(MouseEvent e) { 
// TODO Auto-generated method stub
}
@Override
public void mouseEntered(MouseEvent e) {
// TODO Auto-generated method stub
}
@Override
public void mouseClicked(MouseEvent e) {
System.exit(0);
}
});
this.bolitaJWindow.setVisible(true);
BolitaThread.height = Toolkit.getDefaultToolkit().getScreenSize().height
- bolitaJWindow.getSize().height;
BolitaThread.width = Toolkit.getDefaultToolkit().getScreenSize().width
- bolitaJWindow.getSize().width;
} //constructor
public static void main( String[] s ) {
BolitaThread red = new bolitasLindas.BolitaThread(1, 222,
"http://www.uprb.edu/profes…/…/SICI4029/images/bolitaRoja.png");
red.start();
new bolitasLindas.BolitaThread(50, 100, "http://www.uprb.edu/…/jjdiaz/SICI4029/images/bolitaVerde.png")
.start();
new bolitasLindas.BolitaThread(100, 1, "http://www.uprb.edu/profes…/…/SICI4029/images/bolitaAzul.png")
.start();
} // main
} // class
