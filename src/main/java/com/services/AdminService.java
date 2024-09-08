package com.services;

import java.util.List;

import com.model.UserModel;

public interface AdminService {
	public boolean addAdmin(UserModel um);

	public List<UserModel> getAdmins();

	public UserModel getAdminById(int id);

	public boolean isAdmin(UserModel um);

	public boolean isUpdate(UserModel um);

	public boolean isDelete(int id);
	public int adminCount();
	
}
