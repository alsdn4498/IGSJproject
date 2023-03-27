package ezen.project.IGSJ.Category.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import ezen.project.IGSJ.Category.dto.CategoryDTO;

@Repository
public class CategoryDAOImpl implements CategoryDAO{

	@Inject
	private SqlSession sqlsession;
	
	private static final String Namespace = "ezen.project.IGSJ.Category.CategoryMapper";

	
	@Override
	public List<CategoryDTO> getCategory() throws Exception {
		
		return sqlsession.selectList(Namespace+".getCategory");	
	}


	@Override
	public List<CategoryDTO> getCategory2(int cno) throws Exception {
		
		return sqlsession.selectList(Namespace+".getCategory2",cno);	
	}
	

}
