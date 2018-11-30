package com.resgen;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.resgen.model.Resource;

@Repository
public class BscsDaoImp extends JdbcDaoSupport implements BscsDao {
	
	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	@Override
	public void insertResource(Resource resource) {
//		String sql = "INSERT INTO employee " +
//				"(empId, empName) VALUES (?, ?)" ;
//		getJdbcTemplate().update(sql, new Object[]{
//				resource.getEmpId(), resource.getEmpName()
//		});
	}

//	@Override
//	public void insertResource(Resource resource) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void deleteResource(Resource resource) {
		// TODO Auto-generated method stub
		
	}
	
	
//	@Override
//	public Mpusptab dataTraduction(String shdes) {
//		
//		String sql = "SELECT * FROM MPUSPTAB WHERE SPCODE IN "
//				+ "(SELECT SPCODE FROM MPULKTM1 WHERE SNCODE = '1044' AND TMCODE = (SELECT TMCODE FROM MPUTMTAB WHERE shdes = 'TPGC' AND VSCODE = '0'))"
//				+ "ORDER BY SPCODE" ;
//		
//		return (Mpusptab)getJdbcTemplate().queryForObject(sql, new Object[]{shdes}, new RowMapper<Mpusptab>(){
//			@Override
//			public Mpusptab mapRow(ResultSet rs, int rwNumber) throws SQLException {
//				Mpusptab mpusptab = new Mpusptab();
//				mpusptab.setSHDES(rs.getString("SHDES"));
//				mpusptab.setSPCODE(rs.getString("SPCODE"));
//				return mpusptab;
//			}
//		});
//
//		
//	}

}
