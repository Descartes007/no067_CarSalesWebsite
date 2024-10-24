package com.dao;

import com.entity.CailiaofenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CailiaofenleiVO;
import com.entity.view.CailiaofenleiView;


/**
 * 材料分类
 * 
 * @author 
 * @email 
 * @date 2021-04-26 11:54:44
 */
public interface CailiaofenleiDao extends BaseMapper<CailiaofenleiEntity> {
	
	List<CailiaofenleiVO> selectListVO(@Param("ew") Wrapper<CailiaofenleiEntity> wrapper);
	
	CailiaofenleiVO selectVO(@Param("ew") Wrapper<CailiaofenleiEntity> wrapper);
	
	List<CailiaofenleiView> selectListView(@Param("ew") Wrapper<CailiaofenleiEntity> wrapper);

	List<CailiaofenleiView> selectListView(Pagination page,@Param("ew") Wrapper<CailiaofenleiEntity> wrapper);
	
	CailiaofenleiView selectView(@Param("ew") Wrapper<CailiaofenleiEntity> wrapper);
	
}
