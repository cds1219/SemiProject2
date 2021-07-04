package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dao.SemiDAO;
import web.vo.SemiVO;

@Service
public class SemiService {
	
	@Autowired
	SemiDAO semiDAO;

	public SemiVO loginById(SemiVO semiVO){
		return semiDAO.loginById(semiVO);
	}

}
