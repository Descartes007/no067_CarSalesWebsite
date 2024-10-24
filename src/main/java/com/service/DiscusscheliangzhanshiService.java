package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusscheliangzhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusscheliangzhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusscheliangzhanshiView;


/**
 * 车辆展示评论表
 *
 * @author 
 * @email 
 * @date 2021-04-26 11:54:45
 */
public interface DiscusscheliangzhanshiService extends IService<DiscusscheliangzhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusscheliangzhanshiVO> selectListVO(Wrapper<DiscusscheliangzhanshiEntity> wrapper);
   	
   	DiscusscheliangzhanshiVO selectVO(@Param("ew") Wrapper<DiscusscheliangzhanshiEntity> wrapper);
   	
   	List<DiscusscheliangzhanshiView> selectListView(Wrapper<DiscusscheliangzhanshiEntity> wrapper);
   	
   	DiscusscheliangzhanshiView selectView(@Param("ew") Wrapper<DiscusscheliangzhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusscheliangzhanshiEntity> wrapper);
   	
}

