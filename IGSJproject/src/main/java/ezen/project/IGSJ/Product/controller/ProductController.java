package ezen.project.IGSJ.Product.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ezen.project.IGSJ.Product.dto.ProductDTO;
import ezen.project.IGSJ.Product.service.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class ProductController {
	
	@Inject
	private ProductService productService;
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	
	@PostMapping("/register22")
	public ModelAndView register(@RequestBody ProductDTO product) throws Exception{

		productService.register(product);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/");
		
		return mav;
	
	}

}
