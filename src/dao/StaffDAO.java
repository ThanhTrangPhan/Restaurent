/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Staff;
      
/**
 *
 * @author demo
 */
public class StaffDAO extends DAO {

    public StaffDAO() {
        super();
    }
    
    public boolean checkLogin(Staff staff){
        boolean res=false;
        // tim position cua staff dang nhap
        String sql="SELECT * FROM tblStaff WHERE username=? AND pass=?";
        try {
            //thuc hien truy van tham so
            PreparedStatement ps=conn.prepareStatement(sql);
            // dat gia tri String cho chi so 
            ps.setString(1,staff.getUsername());
            ps.setString(2,staff.getPass());
            ResultSet rs =ps.executeQuery();
            if(rs.next()){
                staff.setId(rs.getInt("id"));
                staff.setFullname(rs.getString("fullname"));
                staff.setGender(rs.getString("gender"));
                staff.setPhone_number(rs.getString("phone_number"));
                staff.setSalary(rs.getFloat("salary"));
                staff.setPosition(rs.getString("position"));
                res=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
