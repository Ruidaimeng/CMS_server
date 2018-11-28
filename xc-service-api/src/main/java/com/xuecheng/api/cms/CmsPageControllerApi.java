package com.xuecheng.api.cms;/*
 * Description
 *@author Ruimeng
 *@Date 2018/11/27 17:20
 * 页面相关接口
 */

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

public interface CmsPageControllerApi {

    //页面查询，分页查询

    /**
     * @param page
     * @param size
     * @param queryPageRequest 页面查询条件
     * @return
     */
    public QueryResponseResult findList(int page , int size, QueryPageRequest queryPageRequest);
}
