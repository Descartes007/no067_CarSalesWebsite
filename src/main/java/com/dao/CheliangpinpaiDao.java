package com.dao;

import com.entity.CheliangpinpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangpinpaiVO;
import com.entity.view.CheliangpinpaiView;


/**
 * 车辆品牌
 * 
 * @author 
 * @email 
 * @date 2021-04-26 11:54:44
 */
public interface CheliangpinpaiDao extends BaseMapper<CheliangpinpaiEntity> {
	
	List<CheliangpinpaiVO> selectListVO(@Param("ew") Wrapper<CheliangpinpaiEntity> wrapper);
	
	CheliangpinpaiVO selectVO(@Param("ew") Wrapper<CheliangpinpaiEntity> wrapper);
	
	List<CheliangpinpaiView> selectListView(@Param("ew") Wrapper<CheliangpinpaiEntity> wrapper);

	List<CheliangpinpaiView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangpinpaiEntity> wrapper);
	
	CheliangpinpaiView selectView(@Param("ew") Wrapper<CheliangpinpaiEntity> wrapper);
	
}
