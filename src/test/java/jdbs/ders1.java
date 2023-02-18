package jdbs;

import java.sql.*;

public class ders1 {
    public static void main(String[] args) {


        //Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01","root","Aa123456");
        //try-catch de yapabiliriz
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01", "root", "1234");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        Statement st = null;
        try {
            st = con.createStatement();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        ResultSet rs = null;
        try {
            rs = st.executeQuery("select * from ogrenciler;");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        try {
            rs.next();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        try {
            System.out.println(rs.getInt(1) + "   " + rs.getString(2) + " " + rs.getString(3) + rs.getString(4));
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        try {
            con.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }


    }
}