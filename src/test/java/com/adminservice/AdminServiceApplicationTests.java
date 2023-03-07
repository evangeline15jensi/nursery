package com.adminservice;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.adminservice.dao.AdminDAO;
import com.adminservice.entity.Admin;


@SpringBootTest
public class AdminServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private AdminDAO admindao;
	
	@Test
	void addadmin() {
		new Admin(1, "abc@gmail.com","abc");
		assertNotNull(admindao.findById(1).get());
	}

	@Test
	 public void getadmin(){
		 Admin admin = admindao.findById(1).get();
		 Assertions.assertThat(admin.getAdminId()).isEqualTo(1);
		 }
}


	
