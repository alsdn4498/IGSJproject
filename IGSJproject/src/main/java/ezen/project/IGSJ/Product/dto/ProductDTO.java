package ezen.project.IGSJ.Product.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
	
	private String pno;									// 제품번호
	private int cno;										// 카테고리 번호
	private String product_name;				// 제품이름
	private int product_price;						// 제품가격
	private int product_stock;					// 제품재고
	private String product_description;		// 제품설명
	private Date product_regDate;			// 제품등록일자

}
