package com.tutorialspoint;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UnitDAO {
	JdbcTemplate template;  
	
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	public int save(Unit p){  
	    String sql="insert into unit(name,exp,bblvl,type) values('"+p.getName()+"',"+p.getExp()+","+p.getbblvl()+",'"+p.gettype()+"')";  
	    return template.update(sql);  
	}  
	public int update(Unit p){  
	    String sql="update unit set name='"+p.getName()+"', exp="+p.getExp()+", bblvl="+p.getbblvl()+", type='"+p.gettype()+"' where unitId="+p.getId()+"";  
	    return template.update(sql);  
	}  
	public int delete(int id){  
	    String sql="delete from unit where unitId="+id+"";  
	    return template.update(sql);  
	}  
	public Unit getEmpById(int id){  
	    String sql="select * from unit where unitId=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Unit>(Unit.class));  
	}  
	public List<Unit> getEmployees(){  
	    return template.query("select * from unit",new RowMapper<Unit>(){  
	        public Unit mapRow(ResultSet rs, int row) throws SQLException {  
	        	Unit e=new Unit();  
	            e.setId(rs.getInt(1));  
	            e.setName(rs.getString(2));  
	            e.setExp(rs.getInt(3));  
	            e.setbblvl(rs.getInt(4));
	            e.settype(rs.getString(5));	            
	            return e;  
	        }  
	    });  
	}  
}
