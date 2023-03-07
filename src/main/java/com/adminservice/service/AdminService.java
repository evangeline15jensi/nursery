package com.adminservice.service;

import java.util.List;

import com.adminservice.entity.Admin;

public interface AdminService {
	public List<Admin> getAllAdmin();
	public Admin addAdmin(Admin admin);
}
