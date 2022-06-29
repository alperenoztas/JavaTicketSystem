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
public class PlaneTicket extends Tickets implements IPrice{
    
    public String seatNumber;
    public boolean isBusiness;

    public PlaneTicket(String fromCountry, String toCountry, int ticketPrice,String departing,String departingTime,int adult,int child,int lapInfant,String seatNumber,boolean isBusiness) {
        super(fromCountry, toCountry, ticketPrice, departing, departingTime, adult, child, lapInfant);
        this.seatNumber = seatNumber;
        this.isBusiness = isBusiness;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isIsBusiness() {
        return isBusiness;
    }

    public void setIsBusiness(boolean isBusiness) {
        this.isBusiness = isBusiness;
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
        int adultPrice = 40;
        int childPrice = 20;
        int lapInfantsPrice = 1;
        try {
            File myObj = new File("planecountryprice.txt");
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
            File myObj = new File("planecountryprice.txt");
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
        
        if(departingTime == "06.00"){
            totalPrice += 40;
        }
        
        if(departingTime == "12.30"){
            totalPrice += 20;
        }
        if(departingTime == "19.45"){
            totalPrice += 0;
        }
        
        totalPrice += adult*adultPrice+ child*childPrice + lapInfants * lapInfantsPrice;
        
        return totalPrice;
        
    }
    

    
    
    
}
