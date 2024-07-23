package com.dao;

import com.entity.BokeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BokeView;

/**
 * 博客信息 Dao 接口
 *
 * @author 
 */
public interface BokeDao extends BaseMapper<BokeEntity> {

   List<BokeView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
