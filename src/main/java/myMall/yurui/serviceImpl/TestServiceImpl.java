package myMall.yurui.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myMall.yurui.entity.User;
import myMall.yurui.mapping.TestMapper;
import myMall.yurui.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestMapper mapper;
	
	@Override
	public List<User> findAll() {
		return mapper.findAll();
	}
	
}
