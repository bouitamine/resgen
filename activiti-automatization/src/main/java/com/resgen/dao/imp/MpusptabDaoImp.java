//package com.resgen.dao.imp;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.annotation.PostConstruct;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.NoResultException;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.support.JdbcDaoSupport;
//import org.springframework.stereotype.Repository;
//
//import com.resgen.dao.MpusptabDao;
//import com.resgen.entity.Mpusptab;
//
//@Repository
////public class MpusptabDaoImp extends JdbcDaoSupport implements MpusptabDao {
//public class MpusptabDaoImp  {
//	
//	
//	@PersistenceContext
//	private EntityManagerFactory entityManagerFactory;
//	@Autowired 
//	DataSource dataSource;
//	
//	@PostConstruct
//	private void initialize(){
//		setDataSource(dataSource);
//	}
//	
////	 public Mpusptab dataTraduction(String shdes){
////	        EntityManager session = entityManagerFactory.createEntityManager();
////	        try {
////	        	Query query = session.createNativeQuery("Select * FROM MPUSPTAB WHERE shdes=:shdes", Mpusptab.class);
////	        	session.setProperty("shdes", shdes);
////	        	List<Object[]> mpusptab = query.getResultList();
////	        	
////	             	List<Object[]> mpusptab = session.getr
//////	                    .setParameter("prdate", prdate)
//////	                    .getSingleResult();
////
////	            return mpusptab;
////	        }
////	        catch (NoResultException e){
////	            return null;
////	        }
////	        finally {
////	            if(session.isOpen()) session.close();
////	        }
////	    }
//	 
////		@Override
////		public Mpusptab dataTraduction(String shdes) {
////			
////			String sql = "SELECT * FROM MPUSPTAB WHERE SPCODE IN "
////					+ "(SELECT SPCODE FROM MPULKTM1 WHERE SNCODE = '1044' AND TMCODE = (SELECT TMCODE FROM MPUTMTAB WHERE shdes = 'TPGC' AND VSCODE = '0'))"
////					+ "ORDER BY SPCODE" ;
////			
////			return (Mpusptab)getJdbcTemplate().queryForObject(sql, new Object[]{shdes}, new RowMapper<Mpusptab>(){
////				@Override
////				public Mpusptab mapRow(ResultSet rs, int rwNumber) throws SQLException {
////					Mpusptab mpusptab = new Mpusptab();
////					mpusptab.setSHDES(rs.getString("SHDES"));
////					mpusptab.setSPCODE(rs.getString("SPCODE"));
////					return mpusptab;
////				}
////			});
//	//
////			
////		}
//	
////	@Override
////	public Mpusptab dataTraduction (String shdes) {
//////		String sql = "INSERT INTO employee " +
//////				"(empId, empName) VALUES (?, ?)" ;
//////		getJdbcTemplate().update(sql, new Object[]{
//////				resource.getEmpId(), resource.getEmpName()
//////		});
////		
////		return null;
////	}
//
//	
//}