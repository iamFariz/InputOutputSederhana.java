import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardLisneter extends Frame implements KeyListener {
    Label l; //deklarasi variabel 'l'
    TextArea area; //deklarasi variabel 'area'

        //kelas konstruktor
    KeyboardLisneter(){
        //creating the label
        l = new Label();

        //setting the location of label
        l.setBounds(20,50,200,20);

        //setting location of the text area
        area = new TextArea();

        //setting location of the text area
        area.setBounds(20,80,300,300);

        //adding Key Listener to the text area
        area.addKeyListener(this);

        //adding label and text area to frame
        add(l);
        add(area);

        //setting size,layout and visibility of frame
        setTitle("Keyboard Liistener");
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        String text = area.getText();

        //splitting the string in word
        String word[] = text.split("\\s");

        //printing the number of word and caracters of string
        l.setText("Word : " + word.length + "Character:" + text.length());

    }

    public static void main(String[] args) { new KeyboardLisneter();}

}
