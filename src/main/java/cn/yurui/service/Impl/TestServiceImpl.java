package cn.yurui.service.Impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yurui.entity.User;
import cn.yurui.mapping.TestMapper;
import cn.yurui.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestMapper mapper;
	
	@Override
	public List<User> findAll() {
		return mapper.findAll();
	}
	
}
