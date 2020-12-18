package study.code.dll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import study.code.dll.common.ResultData;
import study.code.dll.service.StudyService;

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

}
