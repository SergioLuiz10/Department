package aplication;


import db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testw {
    public static void main(String[] args) {
        Connection conn=null;
        Statement st= null;
        ResultSet rs=null;
        try{
            conn= DB.getCon();
            st= conn.createStatement();
            rs=st.executeQuery("Select *from department");

            while (rs.next()){
                System.out.println(rs.getInt("Id")+"|"+rs.getString("Name"));
            }
        }catch (SQLException e ){
            e.printStackTrace();
        }finally {
            DB.dentrotabela(rs);
            DB.tabela(st);
            DB.fecharConexao();

        }

    }
}
