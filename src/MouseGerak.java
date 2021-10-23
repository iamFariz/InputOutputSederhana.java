import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class MOuseGerak extends MouseMotionAdapter {

    Frame f;

    MOuseGerak(){
        //creating the frame with title
        f = new Frame( "Mouse Motion Adapter");

        //adding MouseMonitorLiser to the frame
        f.addMouseMotionListener(this);

        //setting the size, layout and visibility of the frame
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

    }
    public void mouseDragged(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),20,20);
    }

    public static void main(String[] args) { new MOuseGerak();}

    }


