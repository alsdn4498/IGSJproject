package ezen.project.IGSJ.ProductFile.controller;

import java.io.File;
import java.nio.charset.StandardCharsets;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import ezen.project.IGSJ.ProductFile.dto.ProductFileDTO;
import ezen.project.IGSJ.ProductFile.service.ProductFileService;
import ezen.project.IGSJ.utils.UploadFileUtils;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class ProductFileController {
	
	@Inject
	private ProductFileService productfileService;
	
	private static final Logger logger = LoggerFactory.getLogger(ProductFileController.class);
	
	@Resource(name="uploadPath")
	private String uploadPath;
	
	@PostMapping(value="/imgRegister", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
	public ModelAndView imgRegister( ProductFileDTO productfile,@RequestParam(required = false) MultipartFile file) throws Exception{

		String imgUploadPath = uploadPath + File.separator + "imgUpload";
		String ymdPath = UploadFileUtils.calcPath(imgUploadPath);
		String fileName = null;
		logger.info("postProductRegister() file.getOriginalFilename() => " + file.getOriginalFilename());
		if(file.getOriginalFilename() != null && file.getOriginalFilename() != "") {
		 fileName =  UploadFileUtils.fileUpload(imgUploadPath, file.getOriginalFilename(), file.getBytes(), ymdPath); 
		} else{
		 fileName = uploadPath + File.separator + "images" + File.separator + "none.png";
		}
		
		productfile.setOriginalFileName(fileName);
		productfile.setStoredFileRootName(File.separator + "imgUpload" + ymdPath + File.separator + fileName);
		productfile.setStoredThumbNailName(File.separator + "imgUpload" + ymdPath + File.separator + "s" + File.separator + "s_" + fileName);
		
		productfileService.imgRegister(productfile);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/");
		
		return mav;
		
	}

}
