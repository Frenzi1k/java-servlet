package com.frenzi.utils;

import java.sql.*;

public class Word {

    private Connection con = null;
    private Statement state = null;

    public Word(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary?autoReconnect=true&useSSL=false",
                    "root", "pass");
            state = con.createStatement();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    public String getWord(String word){
        ResultSet rs;
        try {
           if (checkLanguage(word)) {
               rs = state.executeQuery(String.format("select ruWord from words where enWord = '%s'", word));
           } else {
               rs = state.executeQuery(String.format("select enWord from words where ruWord = '%s'", word));
           }
           if (rs != null) {
               rs.next();
               return rs.getString(1);
           }
           this.con.close();
        } catch (SQLException e ){
            System.out.println(e.getMessage());
        }
        return word;
    }

    private boolean checkLanguage(String word){
        int ch = word.trim().toLowerCase().charAt(0);
        return  ch > 96 && ch < 123;
    }
}
