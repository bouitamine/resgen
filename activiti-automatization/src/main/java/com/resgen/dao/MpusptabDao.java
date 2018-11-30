package com.resgen.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.resgen.entity.Mpusptab;

public interface MpusptabDao extends CrudRepository<Mpusptab, String> {

	final static String TRADUCCION_QUERY = "SELECT * FROM MPUSPTAB WHERE SPCODE IN (SELECT SPCODE FROM MPULKTM1 WHERE SNCODE = '1044' AND TMCODE = (SELECT TMCODE FROM MPUTMTAB WHERE SHDES = ? AND VSCODE = '0'))ORDER BY SPCODE";

	@Query(value = TRADUCCION_QUERY, nativeQuery = true)
	Mpusptab dataTraduction(String shdes);

}
