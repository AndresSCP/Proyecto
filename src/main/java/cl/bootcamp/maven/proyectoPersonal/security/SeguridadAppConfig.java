package cl.bootcamp.maven.proyectoPersonal.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SeguridadAppConfig extends WebSecurityConfigurerAdapter {
	
    @Autowired
    private DataSource dataSource;
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
            .usersByUsernameQuery("select username, password, true from usuarios where username=?")
            .authoritiesByUsernameQuery("select username, case tipoUsuario when 1 then 'ROLE_CLIENTE' when 2 then 'ROLE_ADMIN' end from usuarios where username=?")
            .passwordEncoder(new BCryptPasswordEncoder());
    }
    
 
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/main").hasAnyRole("CLIENTE", "ADMIN")
                .and()
            .formLogin()
                .loginPage("/")
                .defaultSuccessUrl("/main")
                .and()
            .logout()
                .logoutUrl("/")
                .logoutSuccessUrl("/");
    }
 
}