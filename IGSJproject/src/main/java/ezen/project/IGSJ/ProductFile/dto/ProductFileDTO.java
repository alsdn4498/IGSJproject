package ezen.project.IGSJ.ProductFile.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductFileDTO {
	
	private String pno;
	private String originalFileName;
	private String storedFileRootName;
	private String storedThumbNailName;

}
