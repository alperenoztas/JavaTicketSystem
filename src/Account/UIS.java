/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.util.ArrayList;

/**
 *
 * @author Duygu-Alperen
 */
public class UIS {
    public static ArrayList<UserAccount> accounts = new ArrayList<UserAccount>();

    
    
    
    public static String display(){
        String accountList = "";
        for (int i = 0; i < accounts.size(); i++) {
            accountList += accounts.get(i).toString();
        }
        return accountList;
    }
    
    public static void deleteAccount(String username){
        for (int i = 0; i < accounts.size(); i++) {
            if(username.equals(accounts.get(i).getUsername())){
                accounts.remove(i);
            }
        }
    }
    
    
    public static boolean checkAccount(String username,String password){
        for (int i = 0; i < accounts.size(); i++) {
            if(username.equals(accounts.get(i).getUsername()) && password.equals(accounts.get(i).getPassword())){
                return true;
            }
        }
        return false;
    }
    public static int checkAccountIndex(String username){
        for (int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).getUsername().equals(username)){
                return i;
            }
        }
        return -99;
    }
    
    public static int ticketCheck(String country){
        for(int i = 0; i < accounts.size(); i++){
            for(int j = 0; j < accounts.get(i).getUserTickets().size(); j++){
                if(accounts.get(i).getUserTickets().get(j).fromCountry.equals(country)){
                    return j;
                }
            }
        }
        return -99;

    }
    
    public static String searchDatedTicket(String date){
        String ticketList = "";
        for(int i = 0; i < accounts.size(); i++){
            for(int j = 0; j < accounts.get(i).getUserTickets().size(); j++){
                if(accounts.get(i).getUserTickets().get(j).departing.equals(date)){
                    ticketList += accounts.get(i).getUserTickets().get(j).toString();
                }
            }
        }
        return ticketList;
    }
     public static void deleteDatedTicket(String date){
        for(int i = 0; i < accounts.size(); i++){
            for(int j = 0; j < accounts.get(i).getUserTickets().size(); j++){
                if(accounts.get(i).getUserTickets().get(j).departing.equals(date)){
                     accounts.get(i).getUserTickets().remove(j);
                }
            }
        }
    }
}
