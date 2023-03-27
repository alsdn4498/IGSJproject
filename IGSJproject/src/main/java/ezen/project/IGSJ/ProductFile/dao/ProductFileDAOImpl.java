package ezen.project.IGSJ.ProductFile.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import ezen.project.IGSJ.ProductFile.dto.ProductFileDTO;

@Repository
public class ProductFileDAOImpl implements ProductFileDAO{

	@Inject
	private SqlSession sqlsession;
	
	private static final String Namespace = "ezen.project.IGSJ.Product.ProductFileMapper";

	@Override
	public void imgRegister(ProductFileDTO productfile) throws Exception {
		
		sqlsession.insert(Namespace+".imgRegister",productfile);
	}
	
	
}
