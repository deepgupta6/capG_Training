package com;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.controller.EmployeeController;
import com.dto.EmployeeDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.service.EmployeeService;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@MockitoBean
	private EmployeeService service;

	@Test
	void testGetEmployeeById() throws Exception {
		EmployeeDTO eDto = new EmployeeDTO("Raj", LocalDate.of(2003, 10, 2), 30000.);

		when(service.getEmployee(1)).thenReturn(eDto);
		mockMvc.perform(get("/employees/1")).andExpect(status().isOk()).andExpect(jsonPath("$.fullName").value("Raj"));
	}

	void testGetAllEmployee() throws Exception {
		EmployeeDTO eDto = new EmployeeDTO("Raj", LocalDate.of(2003, 10, 2), 30000.);
		EmployeeDTO eDto1 = new EmployeeDTO("Raja", LocalDate.of(2003, 10, 2), 30000.);
		EmployeeDTO eDto2 = new EmployeeDTO("Raju", LocalDate.of(2003, 10, 2), 30000.);
		EmployeeDTO eDto3 = new EmployeeDTO("Raje", LocalDate.of(2003, 10, 2), 30000.);
		EmployeeDTO eDto4 = new EmployeeDTO("Raji", LocalDate.of(2003, 10, 2), 30000.);

		List<EmployeeDTO> li = List.of(eDto, eDto1, eDto2, eDto3, eDto4);

		when(service.getAllEmployee()).thenReturn(li);
		mockMvc.perform(get("/employees")).andExpect(status().isOk()).andExpect(jsonPath("$[0].fullName").value("Raj"));
	}

	void testGetEmployeeByName() throws Exception {
		EmployeeDTO eDto = new EmployeeDTO("Raj", LocalDate.of(2003, 10, 2), 30000.);
		EmployeeDTO eDto1 = new EmployeeDTO("Raj", LocalDate.of(2003, 11, 2), 35000.);

		List<EmployeeDTO> li = List.of(eDto, eDto1);

		when(service.getEmployeeByName("Raj")).thenReturn(li);
		mockMvc.perform(get("/employees/Raj")).andExpect(status().isOk())
				.andExpect(jsonPath("$[0].fullName").value("Raj"));
	}

	@Test
	void testCreateEmployee() throws Exception {

	    ObjectMapper mapper = new ObjectMapper();
	    mapper.registerModule(new JavaTimeModule());

	    EmployeeDTO eDto = new EmployeeDTO("Raj", LocalDate.of(2003, 10, 2), 30000.);
	    eDto.setEmployeeId(1001);

	    when(service.createEmployee(Mockito.any(EmployeeDTO.class))).thenReturn(eDto);

	    mockMvc.perform(post("/employees")
	            .contentType(MediaType.APPLICATION_JSON)
	            .content(mapper.writeValueAsString(eDto)))
	            .andExpect(status().isOk())
	            .andExpect(jsonPath("$.fullName").value("Raj"));
	}
	
	@Test
	void testDeleteEmployee() throws Exception {

	    int empId = 1001;

	    when(service.removeEmployee(empId)).thenReturn("Employee deleted");

	    mockMvc.perform(delete("/employees/{empId}", empId))
	            .andExpect(status().isOk())
	            .andExpect(content().string("Employee deleted"));

	    verify(service).removeEmployee(empId);
	}
	
	@Test
	void testUpdateEmployee() throws Exception {
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.registerModule(new JavaTimeModule());

	    EmployeeDTO updatedDto = new EmployeeDTO("Raja", LocalDate.of(2003, 10, 2), 40000.);
	    updatedDto.setEmployeeId(1001);

	    when(service.updateEmployee(Mockito.any(EmployeeDTO.class))).thenReturn(updatedDto);

		mockMvc.perform(put("/employees")
	            .contentType(MediaType.APPLICATION_JSON)
	            .content(mapper.writeValueAsString(updatedDto)))
	            .andExpect(status().isOk())
	            .andExpect(jsonPath("$.fullName").value("Raja"))
	            .andExpect(jsonPath("$.salary").value(40000.0));

	    verify(service).updateEmployee(Mockito.any(EmployeeDTO.class));
	}

}
