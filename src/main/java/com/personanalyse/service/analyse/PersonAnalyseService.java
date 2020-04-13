package com.personanalyse.service.analyse;

import lombok.var;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.HashMap;

/**
 * @author jianytan
 * @date 4/11/2020  8:12 AM
 */

@Service
public class PersonAnalyseService {

    @Autowired
    CommonAipBodyAnalysisService commonAipBodyAnalysisService;

    public JSONObject getDynamicPersonNumber() throws Exception {
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("case_id", "1234");
        options.put("case_init", "1234");
        options.put("show", "true");
        options.put("area", "1,1,639,1,639,349,1,349");

        String dynamic = "true";

        // 参数为本地路径
        var client=commonAipBodyAnalysisService.getAipBodyAnalysis();

        // 参数为二进制数组
        File file = new File("C:\\Users\\jianytan\\Desktop\\test.jpg");
        byte[] fileByte = Files.readAllBytes(file.toPath());
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        var res = client.bodyTracking(fileByte, dynamic, options);
        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeMillis());
        return res;
    }
}
