package com.lihuan.wiki.service;

import com.lihuan.wiki.domain.Ebook;
import com.lihuan.wiki.domain.EbookExample;
import com.lihuan.wiki.mapper.EbookMapper;
import com.lihuan.wiki.req.EbookReq;
import com.lihuan.wiki.resp.EbookResp;
import com.lihuan.wiki.utils.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        /*//将Ebook转换成EbookResponse返回
        List<EbookResp> respList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            *//*EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook,ebookResp);*//*
            //ebookResp.setId(123L); //此方法每个都要设置
            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
            respList.add(ebookResp);
        }*/
        //将Ebook转换成EbookResponse返回
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);

        return list;
    }
}
