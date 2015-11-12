
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    private int horas;
    private int minutos;
    /**
     * Constructor for objects of the class ClockDisplay
     */
    public ClockDisplay()
    {
       horas = 00;
       minutos = 00;
    }

    /**
     * Method to fix a time in the clock
     */
    
    public void setTime(int hora, int minuto)
    {
       if (hora < 24 && minuto < 60){
           horas = hora;
           minutos = minuto;
        }
        else{
        System.out.println("Hora no admitida");
       }
    }
    
    /**
     * Method to sum a minute in the clock and change automatically
     * the hour and the minutes
     */
    public void timeTick()
    {
       if (minutos >=59 && horas >= 23){
            minutos = 00;
            horas = 00;
       }
       else if (minutos >=59 && horas<= 23){
            minutos = 00;
            horas = horas + 1;
       }
       else {
            minutos = minutos + 1;
       }
    }
    
    /**
     * Method to get the time of the clock
     */
    public String getTime()
    {
        String HoraAc = "%02d:%02d";
        String resultado = String.format(HoraAc,horas,minutos);
        return resultado;
    }
}