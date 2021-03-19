package com.lihuan.wiki.controller;

import com.lihuan.wiki.req.EbookReq;
import com.lihuan.wiki.resp.CommonResp;
import com.lihuan.wiki.resp.EbookResp;
import com.lihuan.wiki.resp.PageResp;
import com.lihuan.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ebook")
public class EbookController {
    
    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookReq req){
        CommonResp<PageResp<EbookResp>> resp = new CommonResp<>();
        PageResp<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
