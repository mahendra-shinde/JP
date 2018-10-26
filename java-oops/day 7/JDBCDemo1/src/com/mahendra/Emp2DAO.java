package com.mahendra;

import java.sql.*;

public class Emp2DAO implements CommonDAO<Employee> {
private static final String SQL_SELECT_ID="select empid, ename, desg from emp2";
private static final String SQL_UPDATE="update emp2 set ename=? , desg=? where empid=?";
private static final String SQL_DELETE="delete from emp2 where empid=?";
private static final String SQL_INSERT="insert into emp2(empid, ename, desg) values(?,?,?)";
	
	@Override
	public void save(Employee object) {
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement(SQL_INSERT);
			ps.setLong(1, object.getEmpid());
			ps.setString(2, object.getName());
			ps.setString(3, object.getDesignation());
			ps.executeUpdate();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void update(Employee object) {
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement(SQL_UPDATE);
			ps.setLong(3, object.getEmpid());
			ps.setString(1, object.getName());
			ps.setString(2, object.getDesignation());
			ps.executeUpdate();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void delete(Employee object) {
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement(SQL_DELETE);
			ps.setLong(1, object.getEmpid());
			ps.executeUpdate();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public Employee findById(long id) {
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement(SQL_SELECT_ID);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			Employee e = new Employee();
			if(rs.next()) {
				e.setEmpid(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setDesignation(rs.getString(3));
			}

			return e;
		}catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
		
	}

}
