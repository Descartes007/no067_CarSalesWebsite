package com.dao;

import com.entity.WeixiucailiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiucailiaoVO;
import com.entity.view.WeixiucailiaoView;


/**
 * 维修材料
 * 
 * @author 
 * @email 
 * @date 2021-04-26 11:54:44
 */
public interface WeixiucailiaoDao extends BaseMapper<WeixiucailiaoEntity> {
	
	List<WeixiucailiaoVO> selectListVO(@Param("ew") Wrapper<WeixiucailiaoEntity> wrapper);
	
	WeixiucailiaoVO selectVO(@Param("ew") Wrapper<WeixiucailiaoEntity> wrapper);
	
	List<WeixiucailiaoView> selectListView(@Param("ew") Wrapper<WeixiucailiaoEntity> wrapper);

	List<WeixiucailiaoView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiucailiaoEntity> wrapper);
	
	WeixiucailiaoView selectView(@Param("ew") Wrapper<WeixiucailiaoEntity> wrapper);
	
}
