
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    private int horas;
    private int min;
    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
       horas = 00;
       min = 00;
    }

    /**
     * 
     */
    
    public void setTime(int hora, int minutos)
    {
       if (hora < 24 && minutos < 60){
           horas = hora;
           min = minutos;
        }
        else{
        System.out.println("Hora no admitida");
       }
    }
    
    public void timeTick()
    {
       if (min >=59 && horas >= 23){
            min = 00;
            horas = 00;
       }
       else if (min >=59 && horas<= 23){
            min = 00;
            horas = horas+1;
       }
       else {
            min = min + 1;
       }
    }
    
    public String getTime()
    {
        String HoraAc = "%02d:%02d";
        String resultado = String.format(HoraAc,horas,min);
        return resultado;
    }
}