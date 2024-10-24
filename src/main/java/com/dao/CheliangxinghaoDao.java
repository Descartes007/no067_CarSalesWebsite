package com.dao;

import com.entity.CheliangxinghaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangxinghaoVO;
import com.entity.view.CheliangxinghaoView;


/**
 * 车辆型号
 * 
 * @author 
 * @email 
 * @date 2021-04-26 11:54:44
 */
public interface CheliangxinghaoDao extends BaseMapper<CheliangxinghaoEntity> {
	
	List<CheliangxinghaoVO> selectListVO(@Param("ew") Wrapper<CheliangxinghaoEntity> wrapper);
	
	CheliangxinghaoVO selectVO(@Param("ew") Wrapper<CheliangxinghaoEntity> wrapper);
	
	List<CheliangxinghaoView> selectListView(@Param("ew") Wrapper<CheliangxinghaoEntity> wrapper);

	List<CheliangxinghaoView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangxinghaoEntity> wrapper);
	
	CheliangxinghaoView selectView(@Param("ew") Wrapper<CheliangxinghaoEntity> wrapper);
	
}
