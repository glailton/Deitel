package cap24;

import javax.swing.JApplet;
import javax.swing.JLabel;

import org.joda.time.DateTime;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DigitalClock extends JApplet {

	private JLabel lblClock;

	/**
	 * Create the applet.
	 */
	public DigitalClock() {
		getContentPane().setLayout(null);
		
		lblClock = new JLabel("Clock");
		lblClock.setFont(new Font("Lucida Sans", Font.BOLD, 15));
		lblClock.setBounds(22, 70, 308, 151);
		getContentPane().add(lblClock);
		clock();

	}
	
	public void clock() {
		
		Thread t = new Thread(){
			public void run(){
				try {
					for(;;){
						/*Calendar cal = new GregorianCalendar();
						int day = cal.get(Calendar.DAY_OF_MONTH);
						int month = cal.get(Calendar.MONTH+1);
						int year = cal.get(Calendar.YEAR);
						
						int hour = cal.get(Calendar.HOUR);
						int min = cal.get(Calendar.MINUTE);
						int sec = cal.get(Calendar.SECOND);*/
						
						Date date = new Date();
						DateTime dt = new DateTime(date);
						
						int day = dt.getDayOfMonth();
						int month = dt.getMonthOfYear();
						int year = dt.getYear();
						int hour = dt.getHourOfDay();
						int min = dt.getMinuteOfHour();
						int sec = dt.getSecondOfMinute();
						
						lblClock.setText("Time: "+ hour + ":" + min + ":" + sec + 
								" Date: "+day+"/"+month+"/"+year);
						sleep(1000);
					}
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		t.start();
		
		
	}
}
