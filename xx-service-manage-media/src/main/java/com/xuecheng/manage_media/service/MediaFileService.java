package com.xuecheng.manage_media.service;

import com.xuecheng.manage_media.dao.MediaFileRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.xuecheng.framework.*;
/**
 * @author zhangyang
 */
public class MediaFileService {

    @Autowired
    MediaFileRepository mediaFileRepository;

    //查询我的媒资列表
    public QueryReponseResult<MediaFile> findList(int page,int size,QueryMediaFileRequest queryMediaFileRequest){
    	if (queryMediaFileRequest==null) {
    		queryMediaFileRequest=new QueryMediaFileRequest();
    	}
    	//条件值对象
        MediaFile mediaFile = new MediaFile();
    	if(StringUtils.isNotEmpty)
    }


}


