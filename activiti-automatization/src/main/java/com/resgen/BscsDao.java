package com.resgen;

import org.springframework.data.repository.CrudRepository;


import com.resgen.model.Resource;

public interface BscsDao {

	void insertResource(Resource resource);
	void deleteResource(Resource resource);
//	Mpusptab dataTraduction (String shdes);
	
}
