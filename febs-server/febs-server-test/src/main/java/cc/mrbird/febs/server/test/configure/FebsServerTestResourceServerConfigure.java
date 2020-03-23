package cc.mrbird.febs.server.test.configure;

/**
 * Created by S on 2020/3/22.
 */
@Configuration
@EnableResourceServer
public class FebsServerTestResourceServerConfigure extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .requestMatchers().antMatchers("/**")
                .and()
                .authorizeRequests()
                .antMatchers("/**").authenticated();
    }
}