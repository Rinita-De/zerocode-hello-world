package org.jsmart.zerocode.testhelp.tests.helloworldjavaexec;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("my_web_app.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class HelloWorldJavaMethodExecTest {

    @Test
    @Scenario("helloworldjavaexec/hello_world_java_method_return_assertions.json")
    public void testJavaDbExec() throws Exception {

    }

    @Test
    @Scenario("helloworldjavaexec/hello_world_javaexec_req_resp_as_json.json")
    public void testJavaReqRespJson() throws Exception {

    }
    @Ignore
    @Test
    @Scenario("helloworldjavaexec/read_config_properties_into_test_case_1.json")
    public void test_aNewHostFromConfig() throws Exception {

    }
    @Ignore
    @Test
    @Scenario("helloworldjavaexec/read_config_properties_into_test_case_2.json")
    public void testJavaExecReadPropertiesIntoTest() throws Exception {

    }

    @Test
    @Scenario("helloworldjavaexec/hello_world_oauth2_unique_token_header.json")
    public void testOauth2TokenInHeader() throws Exception {

    }

}
