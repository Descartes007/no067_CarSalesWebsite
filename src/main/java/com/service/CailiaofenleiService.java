package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CailiaofenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CailiaofenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CailiaofenleiView;


/**
 * 材料分类
 *
 * @author 
 * @email 
 * @date 2021-04-26 11:54:44
 */
public interface CailiaofenleiService extends IService<CailiaofenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CailiaofenleiVO> selectListVO(Wrapper<CailiaofenleiEntity> wrapper);
   	
   	CailiaofenleiVO selectVO(@Param("ew") Wrapper<CailiaofenleiEntity> wrapper);
   	
   	List<CailiaofenleiView> selectListView(Wrapper<CailiaofenleiEntity> wrapper);
   	
   	CailiaofenleiView selectView(@Param("ew") Wrapper<CailiaofenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CailiaofenleiEntity> wrapper);
   	
}

