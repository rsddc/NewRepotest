package com.rs.ed.api.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicantInfo {
	private Integer caseNo;
	private String firstName;
	private String lastName;
	private String gender;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "YYYY-MM-dd")
	private LocalDate dob;
	private String planName;
	private Boolean isEmployeed;
	private Boolean isGraduate;
	private Double income;
	private int kids;
}
