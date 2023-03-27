package ezen.project.IGSJ.Category.controller;

import java.util.List;


import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ezen.project.IGSJ.Category.dto.CategoryDTO;
import ezen.project.IGSJ.Category.service.CategoryService;
import net.sf.json.JSONArray;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class CategoryController {

	@Inject
	private CategoryService categoryService;
	
	private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);
	
	// 1차 분류 불러오기
	@GetMapping("/getCategory")
	public List<CategoryDTO>  getCategory1( Model model)throws Exception{
		List<CategoryDTO> category = categoryService.getCategory();
		return category;
	}
	
	@GetMapping("/getCategory/{cno}")
	public List<CategoryDTO> getCategory2( @PathVariable("cno") int cno)throws Exception{	
		List<CategoryDTO> category2 = categoryService.getCategory2(cno);
		return category2;
	}
	
	
}
