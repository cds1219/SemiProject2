package web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import web.service.SemiService;
import web.vo.SemiVO;

@Controller
public class SemiController {

	@Autowired
	SemiService semiService;
	
	@ResponseBody
	@RequestMapping("/loginById")
	public String loginById(HttpServletRequest request,HttpServletResponse response){
		try {
			String id=request.getParameter("id");
			String pw=request.getParameter("pw");
			SemiVO semiVO=new SemiVO(id,pw,null);
			semiVO=semiService.loginById(semiVO);
			JSONObject json=new JSONObject();
			json.put("id", id);
			return json.toJSONString();
		} catch (DataAccessException e) {
			e.printStackTrace();
			return "로그인 실패";
		}
	}
	
}
