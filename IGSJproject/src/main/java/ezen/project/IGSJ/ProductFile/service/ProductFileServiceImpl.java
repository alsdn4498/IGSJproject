package ezen.project.IGSJ.ProductFile.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import ezen.project.IGSJ.ProductFile.dao.ProductFileDAO;
import ezen.project.IGSJ.ProductFile.dto.ProductFileDTO;

@Service
public class ProductFileServiceImpl implements ProductFileService{

	@Inject
	private ProductFileDAO productfileDAO;

	@Override
	public void imgRegister(ProductFileDTO productfile) throws Exception {
		productfileDAO.imgRegister(productfile);
		
	}
	
	
}
