package com.dll.code.controller;

import com.dll.common.model.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dll.code.service.StudyService;

@RestController
public class StudyController {
    @Autowired
    StudyService studyService;

    @PostMapping("/show")
    public ResultData<?> entrySwIndex() {
        try {
            return ResultData.ok(studyService.getString());
        } catch (Exception e) {
            e.printStackTrace();
            return ResultData.failed(e.getMessage());
        }
    }

    @GetMapping("/show2")
    public ResultData<?> show2() {
        try {
            return ResultData.ok(studyService.getString());
        } catch (Exception e) {
            e.printStackTrace();
            return ResultData.failed(e.getMessage());
        }
    }



}
