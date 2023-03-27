package ezen.project.IGSJ.Category.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import ezen.project.IGSJ.Category.dao.CategoryDAO;
import ezen.project.IGSJ.Category.dto.CategoryDTO;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Inject
	private CategoryDAO categoryDAO;
	
	@Override
	public List<CategoryDTO> getCategory() throws Exception {
		return 	categoryDAO.getCategory();
	}

	@Override
	public List<CategoryDTO> getCategory2(int cno) throws Exception {

		return categoryDAO.getCategory2(cno);
	}
	

}
