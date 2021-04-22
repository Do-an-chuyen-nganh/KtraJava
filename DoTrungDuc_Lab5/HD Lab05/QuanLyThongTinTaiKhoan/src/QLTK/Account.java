/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTK;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HuyCuong
 */
public class Account {
    public String AccountNo; 
    public String AccountName; 
    public String Address;
    public double Amount; 
    
    public Account() 
    {
        
    }
    public Account(String no, String name, String add, double amt)
    {
        AccountNo = no;
        AccountName = name;
        Address = add;
        Amount = amt;
    }
    
    public static ArrayList<Account> GetListAccount() throws Exception 
    {
        ArrayList<Account>  list = new ArrayList(); 
        String query = "select * from Account"; 
        ResultSet rs = new SQLContext().ExcuteQuery(query); 
        while(rs.next())
        { 
            Account temp = new Account();
            temp.AccountNo = rs.getString("AccountNo"); 
            temp.AccountName = rs.getString("AccountName"); 
            temp.Address= rs.getString("Address"); 
            temp.Amount = rs.getDouble("Amount"); 
            list.add(temp);
        }
        return list; 
    }
    public void Insert() throws Exception 
    {
        String sql = String.format("INSERT INTO Account VALUES('%s', '%s', '%s', %f)", this.AccountNo, this.AccountName, this.Address, this.Amount);
        new SQLContext().ExcuteUpdate(sql);
    }
    public void Update() throws Exception 
    {
        String sql = String.format("UPDATE Account SET AccountName = '%s', Address = '%s', Amount = %f WHERE AccountNo = '%s'", this.AccountName, this.Address, this.Amount,this.AccountNo);
        new SQLContext().ExcuteUpdate(sql);
    }
    public static void Delete(String accountNo) throws Exception 
    {
        String sql = String.format("DELETE Account WHERE AccountNo = '%s'", accountNo);
        new SQLContext().ExcuteUpdate(sql);
    }
}
