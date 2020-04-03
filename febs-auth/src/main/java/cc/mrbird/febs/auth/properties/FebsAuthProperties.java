package cc.mrbird.febs.auth.properties;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@SpringBootConfiguration
@PropertySource(value = {"classpath:febs-auth.properties"})
@ConfigurationProperties(prefix = "febs.auth")
@Component
public class FebsAuthProperties {

    private FebsClientsProperties[] clients = {};
    private int accessTokenValiditySeconds = 60 * 60 * 24;
    private int refreshTokenValiditySeconds = 60 * 60 * 24 * 7;
    // 免认证路径
    private String anonUrl;

    //验证码配置类
    private FebsValidateCodeProperties code = new FebsValidateCodeProperties();
}