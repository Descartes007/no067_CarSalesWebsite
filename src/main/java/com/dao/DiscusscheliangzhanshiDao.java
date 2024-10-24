package com.dao;

import com.entity.DiscusscheliangzhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusscheliangzhanshiVO;
import com.entity.view.DiscusscheliangzhanshiView;


/**
 * 车辆展示评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-26 11:54:45
 */
public interface DiscusscheliangzhanshiDao extends BaseMapper<DiscusscheliangzhanshiEntity> {
	
	List<DiscusscheliangzhanshiVO> selectListVO(@Param("ew") Wrapper<DiscusscheliangzhanshiEntity> wrapper);
	
	DiscusscheliangzhanshiVO selectVO(@Param("ew") Wrapper<DiscusscheliangzhanshiEntity> wrapper);
	
	List<DiscusscheliangzhanshiView> selectListView(@Param("ew") Wrapper<DiscusscheliangzhanshiEntity> wrapper);

	List<DiscusscheliangzhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusscheliangzhanshiEntity> wrapper);
	
	DiscusscheliangzhanshiView selectView(@Param("ew") Wrapper<DiscusscheliangzhanshiEntity> wrapper);
	
}
