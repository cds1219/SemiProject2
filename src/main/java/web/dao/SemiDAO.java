package web.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import web.vo.SemiVO;

@Mapper
@Repository("semiDAO")
public interface SemiDAO {

	public SemiVO loginById(SemiVO semiVO);

}
