package com.pms.modal;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmailRequest {
	
	@NotBlank
	private String subject;
	@NotBlank
	private String message;
	@NotBlank
	@Email
	private String[] to;
	
	
	
	

}
