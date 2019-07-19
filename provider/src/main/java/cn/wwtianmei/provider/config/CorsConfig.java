package cn.wwtianmei.provider.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @Auther: zhengbiao
 * @Date: 2019/3/7 11:27
 * @Description:跨域请求配置
 */
@Configuration
public class CorsConfig {

    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*"); // 1允许任何域名
        corsConfiguration.addAllowedHeader("*"); // 2允许任何请求头
        corsConfiguration.addAllowedMethod("*"); // 3允许任何请求方法
        corsConfiguration.setAllowCredentials(true); // 4允许请求带有验证信息
        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }
}
