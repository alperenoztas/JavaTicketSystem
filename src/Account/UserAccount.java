/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

import Tickets.Tickets;
import java.util.ArrayList;

/**
 *
 * @author Duygu-Alperen
 */
public class UserAccount {
    private String username;
    private String password;
    private String name;
    private String surname;
    private String phoneNumber;
    private String gender;
    private String birthdate;
    private Tickets myTicket;
    private ArrayList<Tickets> userTickets = new ArrayList<>();

    public UserAccount(String username, String password,String name,String surname,String phoneNumber,String gender,String birthdate) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public ArrayList<Tickets> getUserTickets() {
        return userTickets;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    public void addTicket(Tickets ticket){
        userTickets.add(ticket);
    }
    
    
    
    
    
    
    
}
