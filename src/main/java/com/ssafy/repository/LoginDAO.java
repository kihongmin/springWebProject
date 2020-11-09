package com.ssafy.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ssafy.util.DBUtil;

public class LoginDAO {
	public String login(String id, String pass) throws SQLException{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select pw from member where id=?";
		try {
			con=DBUtil.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			rs=ps.executeQuery();
			if(rs.next()) {
				String pw=rs.getString(1);//rs.getString("pw");
				if(pass.equals(pw)) {
					return id;
				}
			}
		}finally{
			DBUtil.close(rs);
			DBUtil.close(ps);
			DBUtil.close(con);
		}
		return null;
	}

	public boolean isadmin(String id, String pass) throws SQLException{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select admin from member where id=?";
		try {
			con=DBUtil.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			rs=ps.executeQuery();
			if(rs.next()) {
				boolean admin = rs.getBoolean(1);
				if(admin) {
					return admin;
				}
			}
		}finally{
			DBUtil.close(rs);
			DBUtil.close(ps);
			DBUtil.close(con);
		}
		return false;
	}
}
