package org.aadi.demoschool.audit;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DemoSchoolInfoContributor implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        Map<String, String> demoSchoolMap = new HashMap<String, String>();
        demoSchoolMap.put("App Name", "EazySchool");
        demoSchoolMap.put("App Description", "Demo School Web Application for Students and Admin");
        demoSchoolMap.put("App Version", "1.0.0");
        demoSchoolMap.put("Contact Email", "info@demoschool.com");
        demoSchoolMap.put("Contact Mobile", "+1(21) 673 4587");
        builder.withDetail("demoschool-info", demoSchoolMap);
    }

}
