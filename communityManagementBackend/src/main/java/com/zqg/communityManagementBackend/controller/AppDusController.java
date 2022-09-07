package com.zqg.communityManagementBackend.controller;

import com.zqg.communityManagementBackend.entity.AppDus;
import com.zqg.communityManagementBackend.entity.AppDusDetail;
import com.zqg.communityManagementBackend.entity.AppDusRsp;
import com.zqg.communityManagementBackend.entity.Comment;
import com.zqg.communityManagementBackend.service.AppCommentService;
import com.zqg.communityManagementBackend.service.AppDusService;
import com.zqg.communityManagementBackend.service.AutoAddSerice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
/**
 * @creteTime: 2022/2/19 9:54
 * @author: lunarYoung
 * @version: v 1.0
 * @Description:
 */
@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/AppDus")
public class AppDusController {
    @Autowired
    AppDusService appDusService;
    @Autowired
    AutoAddSerice autoAddSerice;
    @Autowired
    AppCommentService appCommentService;
    private static String endpoint = "http://oss-cn-shenzhen.aliyuncs.com";
    private static String accessKeyId = "LTAI5tKo37aRc2jNmNCq51hi";
    private static String accessKeySecret = "D5vdAvM890l25LVladx1PqNvH7AIBM";
    //阿里Bucket(存储空间名)
    private static String bucketName = "zengqinggao";



    @PostMapping("/upImage")
    @ResponseBody
    public String UpImage(@RequestParam(value = "file", required = false)
    MultipartFile file) throws IOException {
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        String common = "http://zengqinggao.oss-cn-shenzhen.aliyuncs.com/";
        String s = UUID.randomUUID().toString();
        ossClient.putObject(bucketName, s+".png", file.getInputStream());
        ossClient.shutdown();
        return common+s+".png";
    }

    @PostMapping("/upFrom")
    public void updateStatus(@RequestBody AppDus appDus){
        Date date = new Date();//获取当前的日期
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String str = df.format(date);//获取String类型的时间
        appDus.setTime(str);
        appDusService.addAppDus(appDus);
    }

    @PostMapping("/upDusComment")
    public void upDusComment(@RequestBody Comment comment){
        appCommentService.addComment(comment);

    }

    @PostMapping("/queryAppDus")
    @ResponseBody
    public List queryAppDus(@RequestParam Integer sort){
        return (appDusService.queryAppDus(sort));
    }

    @PostMapping("/appDusViewId")
    @ResponseBody
    public AppDusRsp appViewId(@RequestParam Integer id){
        autoAddSerice.AuAddDusView(id);
        AppDusRsp rsp = new AppDusRsp();
        List<Comment> list = appCommentService.AllComment(id);
        AppDusDetail appDusDetail =  appDusService.appDusViewId(id);
        rsp.setAppDusDetail(appDusDetail);
        rsp.setCommentList(list);
        return rsp;
    }

    @PostMapping("/autoAddDusStar")
    public void autoAddDusStar(@RequestParam Integer id){
        autoAddSerice.autoAddDusStar(id);
    }
}
