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
public class TrainTicket extends Tickets implements IPrice{
    public String wagonNo;
    public boolean isBedded;

    public TrainTicket(String fromCountry, String toCountry, int ticketPrice, String departing, String departingTime, int adult, int child, int lapInfant,String wagonNo, boolean isBedded) {
        super(fromCountry, toCountry, ticketPrice, departing, departingTime, adult, child, lapInfant);
        this.wagonNo = wagonNo;
        this.isBedded = isBedded;
    }

    public String getWagonNo() {
        return wagonNo;
    }

    public void setWagonNo(String wagonNo) {
        this.wagonNo = wagonNo;
    }

    public boolean isIsBedded() {
        return isBedded;
    }

    public void setIsBedded(boolean isBedded) {
        this.isBedded = isBedded;
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
        int adultPrice = 25;
        int childPrice = 10;
        int lapInfantsPrice = 5;
        try {
            File myObj = new File("traincountryprice.txt");
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
            File myObj = new File("traincountryprice.txt");
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
        
        if(departingTime == "00.00"){
            totalPrice += 5;
        }
        
        if(departingTime == "07.00"){
            totalPrice += 10;
        }
        if(departingTime == "12.00"){
            totalPrice += 15;
        }
        if(departingTime == "17.00"){
            totalPrice += 20;
        }
        if(departingTime == "21.00"){
            totalPrice += 30;
        }

        
        totalPrice += adult*adultPrice+ child*childPrice + lapInfants * lapInfantsPrice;
        
        return totalPrice;
    }
    
    

    
    
    
}
