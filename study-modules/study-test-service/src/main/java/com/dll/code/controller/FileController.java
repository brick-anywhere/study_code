package com.dll.code.controller;

import com.dll.common.model.ResultData;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author dll
 * @date 2021-02-19 13:11
 */
@RestController
public class FileController {

    @RequestMapping(value = "/file/checkType", method = POST)
    public ResultData fileCheckType(@RequestParam("file") MultipartFile mFile, HttpServletRequest request)throws Exception{

//        FileInputStream input = new FileInputStream(file);
//        File file = new File(mFile.getOriginalFilename());
//        FileUtils.c(mFile.getInputStream(), file);
//// 会在本地产生临时文件，用完后需要删除
//        if (file.exists()) {
//            file.delete();
//        }
        return ResultData.ok(null);
    }
}
