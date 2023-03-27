package ezen.project.IGSJ.Product.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import ezen.project.IGSJ.Product.dto.ProductDTO;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	@Inject
	private SqlSession sqlsession;
	
	private static final String Namespace = "ezen.project.IGSJ.Product.ProductMapper";

	@Override
	public void register(ProductDTO product) throws Exception {
		sqlsession.insert(Namespace+".register",product);
	}

	
}
