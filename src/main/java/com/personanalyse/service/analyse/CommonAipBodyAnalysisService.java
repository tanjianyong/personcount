package com.personanalyse.service.analyse;

import com.baidu.aip.bodyanalysis.AipBodyAnalysis;
import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @author jianytan
 * @date 4/11/2020  8:25 AM
 */
@Data
@Service
public class CommonAipBodyAnalysisService {

    public static final String APP_ID = "19382474";
    public static final String API_KEY = "zhozoGldem8PvUKpdhsjG35W";
    public static final String SECRET_KEY = "TGcouzOXEgTM4UGGIu4nw7leXr7GQKpG";

    private AipBodyAnalysis aipBodyAnalysis;

    public CommonAipBodyAnalysisService(){
        this.setAipBodyAnalysis(new AipBodyAnalysis(APP_ID, API_KEY, SECRET_KEY));
    }
}
