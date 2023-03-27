package ezen.project.IGSJ.Category.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
		
	private int cno;									//	카테고리 번호
	private String category_name;			// 카테고리 이름
	private int category_level;				// 참조 카테고리
	private String big_ctg;									//	카테고리 분류
	
}
