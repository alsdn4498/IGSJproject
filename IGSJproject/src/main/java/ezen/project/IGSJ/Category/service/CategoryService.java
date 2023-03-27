package ezen.project.IGSJ.Category.service;

import java.util.List;

import ezen.project.IGSJ.Category.dto.CategoryDTO;

public interface CategoryService {
	
	public List<CategoryDTO> getCategory() throws Exception;
	
	public List<CategoryDTO> getCategory2(int cno) throws Exception;

}
