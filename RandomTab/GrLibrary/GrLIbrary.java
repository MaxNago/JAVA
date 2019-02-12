package GrLibrary;
import java.awt.Polygon;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class GrLibrary extends Frame implements WindowListener {

    public void windowOpened(WindowEvent e) {};

    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    };

    public void windowClosed(WindowEvent e) {};
    public void windowIconified(WindowEvent e) {};
    public void windowDeiconified(WindowEvent e) {};
    public void windowActivated(WindowEvent e) {};
    public void windowDeactivated(WindowEvent e) {};

    public void paint(Graphics g) {
        Dimension rc = getSize();
        Insets in = getInsets();

        int RH = rc.width;
        int RW = rc.height;

        int minX = in.left;
        int maxX = RH - in.right;
        int minY = in.top;
        int maxY = RW - in.bottom;

        int cx, cy, dx, dy;

        cx = Math.abs(maxX - minX) / 2;
        cy = Math.abs(maxY - minY) / 2;
        dx = maxX / 10;
        dy = maxY / 10;

        g.setColor(new Color(0x8F46C8));
        String txt = "";
        g.setFont(new Font("Trebuchet Ms", Font.PLAIN, 24));
        int nf = g.getFontMetrics().stringWidth(txt);
        g.drawString(txt, nf / 2 - 220, nf / 2 - 180);


        int x1, y1, x2, y2;

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3.0f));


        // TO DO


                Random rand=new Random();
        x1=-50;y1=0;
                int[][] arr = new int[4][4];
        for (int k = 0; k < 12; k++) {


                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j <4; j++) {
                        arr[i][j] = 10 + (int) (Math.random() * 90);
                        /*
                        arr[i][j]=rand.nextInt(100)-100;
*/
                       String elemen = "";
                       int element = arr[i][j];
                       elemen+=element+" ";

                            g.drawString(elemen, x1+100, y1+100);

                            y1=y1+30;
                        elemen = "";

                    }
                }
                y1=0;
                x1=x1+60;
        }
                /*
                for (int[] anArr : arr) {
                    for (int anAnArr : anArr) {
                        System.out.print(anAnArr + " ");
                    }
                    System.out.println();
                }
                */
    }

    public GrLibrary() {
        super("Графічні примітиви.");
        addWindowListener(this);
        setLayout(null);
        setLocation(120,100);
        setSize(800,600);
        show();
    }
}
