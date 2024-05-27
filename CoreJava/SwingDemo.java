import javax.swing.*;

class MarvellousFrame
{
    public JFrame fobj;

    public MarvellousFrame(String title)
    {
        fobj = new JFrame(title);

        fobj.setSize(400,400);
        fobj.setVisible(true);
    }
}

class SwingDemo
{
    public static void main(String a[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA");
        
    }
}


/* 
    AWT     SWING
    Frame - JFrame
    Button - JButton
    Label - JLabel

*/