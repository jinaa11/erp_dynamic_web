/**
 * 
 */
package com.erp.attendance.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description : 클래스에 대한 설명을 입력해주세요.<br>
 * Date : 2024. 12. 27.<br>
 * History :<br>
 * - 작성자 : Kosta, 날짜 : 2024. 12. 27., 설명 : 최초작성<br>
 *
 * @author Kosta
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceVO {
	private Long attendance_seq;
	private String attendance_code;
	private Date attendance_date;
	private int days_number;
	private String vacation_name;
	private String notes;
	private int user_seq_number;	
}
