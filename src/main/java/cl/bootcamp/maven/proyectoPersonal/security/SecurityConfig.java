package cl.bootcamp.maven.proyectoPersonal.security;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@Order(1)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;
    
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
       
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	
        auth.jdbcAuthentication().dataSource(dataSource)
            .usersByUsernameQuery("select username, password, true from usuarios where username=?")
            .authoritiesByUsernameQuery("select username, case role when cliente then 'ROLE_CLIENTE' when administrativo then 'ROLE_ADMIN' end from usuarios where username=?")
            .passwordEncoder(new BCryptPasswordEncoder());
   
    }


    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/", "/main").permitAll()
            .antMatchers("/administrativo/**").hasRole("ADMIN")
            .anyRequest().authenticated()
            .and()
            .formLogin()
            .loginPage("/")
            .permitAll()
            .and()
            .logout()
            .logoutSuccessUrl("/login?logout")
            .and()
            .csrf().disable()
            .exceptionHandling().accessDeniedPage("/403");
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .jdbcAuthentication() // Autenticar contra una base de datos mediante JdbcTemplate
                .dataSource(dataSource)
                .usersByUsernameQuery("SELECT username, password, enabled FROM Usuarios WHERE username = ?")
                .authoritiesByUsernameQuery("SELECT username, 'ROLE_USER' FROM Usuarios WHERE username = ?");
    }
    

}