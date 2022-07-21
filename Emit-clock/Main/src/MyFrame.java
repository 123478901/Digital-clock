import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
//https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html#text

public class MyFrame extends JFrame {


    Calendar calender;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    String time;
    String day;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Emit");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(false);


        timeFormat = new SimpleDateFormat("kk:mm:ss ");
        dayFormat = new SimpleDateFormat("E");

        timeLabel = new JLabel();
        timeLabel.setFont( new Font("Verdana",Font.PLAIN,65));
        timeLabel.setForeground( new Color(0xFF0000));
        timeLabel.setBackground(Color.LIGHT_GRAY);
        timeLabel.setOpaque(true);
        
        dayLabel = new JLabel();
        dayLabel.setFont( new Font("Ink Free",Font.PLAIN,50));
        

        this.add(timeLabel);
        this.add(dayLabel);
        this.setVisible(true);

        setTime();
    }

    public void setTime() {
        while (true) {
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);

        day = dayFormat.format(Calendar.getInstance().getTime());
        dayLabel.setText(day);

        try {
            
            Thread.sleep(1000);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    } 
}
}