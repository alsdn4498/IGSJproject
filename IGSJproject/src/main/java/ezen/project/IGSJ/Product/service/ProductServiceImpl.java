package ezen.project.IGSJ.Product.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import ezen.project.IGSJ.Product.dao.ProductDAO;
import ezen.project.IGSJ.Product.dto.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Inject
	private ProductDAO productDAO;

	@Override
	public void register(ProductDTO product) throws Exception {
		
		productDAO.register(product);
	}
	
	
	

}
