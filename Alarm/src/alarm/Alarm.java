/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alarm;

/**
 *
 * @author jelly_joneske
 */
public class Alarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
private int hours;
private int seconds;
private int hourAlarm;
private int minutesAlarm;
private int secondsAlarm;
private Boolean onSwitch;
public AlarmClock(int hours,  int minutes, int seconds, Boolean OnSwitch){
this.hours = hours;
this.minutes=minutes;
this.seconds=seconds;
this.onSwitch=false;
}
public int getHours(){
return hours;
}
public void setHours(int hours){
this.hours=hours;
}
public int getMinutes(){
return minutes;
}
public void setMinutes(int minutes){
this.minutes =minutes
}
public int getSeconds(){
return seconds;
}
public void setSeconds(int seconds){
this.seconds=seconds;
}
public int getHoursAlarm(){
return hoursAlarm;
}
public void setHoursAlarm(int hoursAlarm){
this.hoursAlarm=hoursAlarm;
}
public int getMinutesAlarm(){
return minutesAlarm;
}
public void setMinutesAlarm(int minutesAlarm){
this.minutesAlarm=minutesAlarm;
}
public int getSecondsAlarm(){
return secondsAlarm;
}
public void setSecondsAlarm(){
this.seconsAlarm=secondsAlarm;
}
public boolean  isOnSwitch(){
this.onSwitch=onSwitch;
}
public String to String(){
String result;
result=”Time of Day : \n” + hour+ “:” + “:”minutes+”:”seconds+”\n\n Alarm Time: \n”+ hoursAlarm+”:”+minutesAlarm+”:”+secondsAlarm;
if(onSwitch)
result=result+ “\n The alarm is turned on\n”;
else
result=result+”\nThe alarm is turned on\n”;
return result;
}
public  class TestClass{
public static void main (String[] args)
AlarmClock myAlarm=new AlarmClock(12, 15, 00, true);
System.out.println(myAlarm)
}
}

    }
    
}
