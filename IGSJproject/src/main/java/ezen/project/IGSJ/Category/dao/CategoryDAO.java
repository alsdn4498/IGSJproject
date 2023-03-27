package ezen.project.IGSJ.Category.dao;

import java.util.List;

import ezen.project.IGSJ.Category.dto.CategoryDTO;

public interface CategoryDAO {
	
	public List<CategoryDTO> getCategory() throws Exception;
	public List<CategoryDTO> getCategory2(int cno) throws Exception;
}
