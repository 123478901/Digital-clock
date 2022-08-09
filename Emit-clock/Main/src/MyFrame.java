import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
/* https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html#text */

public class MyFrame extends JFrame {

    SimpleDateFormat timeFormat, dayFormat, dateFormat;
    JLabel timeLabel, dayLabel, dateLabel;
    String time, day, date;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Emit");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(false);


        timeFormat = new SimpleDateFormat("kk:mm:ss ");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont( new Font("Verdana",Font.PLAIN,65));
        timeLabel.setForeground( new Color(0xFF0000));
        timeLabel.setBackground(Color.LIGHT_GRAY);
        timeLabel.setOpaque(true);
        
        dayLabel = new JLabel();
        dayLabel.setFont( new Font("Ink Free",Font.PLAIN,35));
        
        dateLabel = new JLabel();
        dateLabel.setFont( new Font("Ink Free",Font.PLAIN,25));

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();
    }

    public void setTime() {
        while (true) {
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);

        day = dayFormat.format(Calendar.getInstance().getTime());
        dayLabel.setText(day);
        
        date = dateFormat.format(Calendar.getInstance().getTime());
        dateLabel.setText(date);
        try {
            
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
}