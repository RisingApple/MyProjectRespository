package com.system.wms.serviceImpl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.wms.dao.StaffMapper;
import com.system.wms.service.StaffLoginService;

@Service
public class StaffLoginServiceImpl implements StaffLoginService{
	@Autowired
	StaffMapper staffMapper;
	
	
	@Override
	public void doLogin(String account,String password) {
		
		System.out.println(staffMapper.selectByAccount("1245465610"));
	}
	
	@Test
	public void test() {
		staffMapper.selectByAccount("1245465610");
	}
}
