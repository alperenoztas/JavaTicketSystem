/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

import Interface.IPrice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Duygu-Alperen
 */
public class ShipTicket extends Tickets implements IPrice{
    private int cabin;
    private boolean hasBalcony,isInside;

    public ShipTicket(String fromCountry, String toCountry, int ticketPrice, String departing, String departingTime, int adult, int child, int lapInfant, int cabin, boolean hasBalcony, boolean isInside) {
        super(fromCountry, toCountry, ticketPrice, departing, departingTime, adult, child, lapInfant);
        this.cabin = cabin;
        this.hasBalcony = hasBalcony;
        this.isInside = isInside;
    }

    public int getCabin() {
        return cabin;
    }

    public void setCabin(int cabin) {
        this.cabin = cabin;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isIsInside() {
        return isInside;
    }

    public void setIsInside(boolean isInside) {
        this.isInside = isInside;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public String getToCountry() {
        return toCountry;
    }

    public void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getDeparting() {
        return departing;
    }

    public void setDeparting(String departing) {
        this.departing = departing;
    }

    public String getDepartingTime() {
        return departingTime;
    }

    public void setDepartingTime(String departingTime) {
        this.departingTime = departingTime;
    }

    public int getAdult() {
        return adult;
    }

    public void setAdult(int adult) {
        this.adult = adult;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public int getLapInfant() {
        return lapInfant;
    }

    public void setLapInfant(int lapInfant) {
        this.lapInfant = lapInfant;
    }
    
    

    @Override
    public int calcPrice(String fromCountry, String toCountry, String departingTime, int adult, int child, int lapInfants) {
        int totalPrice = 0;
        int adultPrice = 50;
        int childPrice = 30;
        int lapInfantsPrice = 5;
        try {
            File myObj = new File("shipcountryprice.txt");
            Scanner reader = new Scanner(myObj);
            while (reader.hasNext()) {
                if(fromCountry.equals(reader.next())){
                    int fromPrice = reader.nextInt();
                    totalPrice += fromPrice;
                }
            }
            reader.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        try {
            File myObj = new File("shipcountryprice.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNext()) {
                if(toCountry.equals(myReader.next())){
                    int toPrice = myReader.nextInt();
                    totalPrice += toPrice;
                }
            }
            myReader.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        if(departingTime == "09.00"){
            totalPrice += 35;
        }
        
        if(departingTime == "15.30"){
            totalPrice += 25;
        }
        if(departingTime == "22.30"){
            totalPrice += 15;
        }
        
        totalPrice += adult*adultPrice+ child*childPrice + lapInfants * lapInfantsPrice;
        
        return totalPrice;
    }

  
}
