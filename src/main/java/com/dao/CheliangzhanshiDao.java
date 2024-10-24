package com.dao;

import com.entity.CheliangzhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangzhanshiVO;
import com.entity.view.CheliangzhanshiView;


/**
 * 车辆展示
 * 
 * @author 
 * @email 
 * @date 2021-04-26 11:54:44
 */
public interface CheliangzhanshiDao extends BaseMapper<CheliangzhanshiEntity> {
	
	List<CheliangzhanshiVO> selectListVO(@Param("ew") Wrapper<CheliangzhanshiEntity> wrapper);
	
	CheliangzhanshiVO selectVO(@Param("ew") Wrapper<CheliangzhanshiEntity> wrapper);
	
	List<CheliangzhanshiView> selectListView(@Param("ew") Wrapper<CheliangzhanshiEntity> wrapper);

	List<CheliangzhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangzhanshiEntity> wrapper);
	
	CheliangzhanshiView selectView(@Param("ew") Wrapper<CheliangzhanshiEntity> wrapper);
	
}
