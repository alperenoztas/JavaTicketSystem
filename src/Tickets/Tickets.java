/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;




/**
 *
 * @author Duygu-Alperen
 */
public abstract class Tickets {
    public String fromCountry;
    public String toCountry;
    public int ticketPrice;
    public String departing;
    public String departingTime;
    public int adult;
    public int child;
    public int lapInfant;

    public Tickets(String fromCountry, String toCountry, int ticketPrice, String departing, String departingTime, int adult, int child, int lapInfant) {
        this.fromCountry = fromCountry;
        this.toCountry = toCountry;
        this.ticketPrice = ticketPrice;
        this.departing = departing;
        this.departingTime = departingTime;
        this.adult = adult;
        this.child = child;
        this.lapInfant = lapInfant;
    }
    public void addExtra(int price){
        this.ticketPrice += price;
    }

    @Override
    public String toString() {
        return "\nTicket:\n"+ "FromCountry: " +fromCountry+"\nToCountry: "+toCountry+"\nTicketPrice: "+ ticketPrice+
                "\nDeparting: " + departing +"\nDeparting Time: "+ departingTime + "\nAdult: " + adult +
                "\nChildren: " +child +"\nLap Infants: " + lapInfant +"\n";
    }
    

    /**
     *
     * @param fromCountry
     * @param toCountry
     * @param ticketPrice
     * @param departing
     * @param departingTime
     * @param adult
     * @param child
     * @param lapInfant
     */
   
    
    
}

                       