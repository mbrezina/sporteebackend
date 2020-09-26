package da.project.sporteezone.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

//@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    // deklaruji uživatele s různými rolemi
    //@Override
    @Autowired
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.
            inMemoryAuthentication()
            .withUser("user").password(passwordEncoder().encode("password456")).roles("USER")

            .and()
            .withUser("admin").password(passwordEncoder().encode("pass")).roles("USER", "ADMIN")
            //.withUser("admin").password(passwordEncoder().encode("pass")).roles("USER", "ADMIN")

            .and()
            .withUser("manager").password(passwordEncoder().encode("pass")).roles("MANAGER", "ADMIN").authorities("UPLOAD_API");
    }

    // Secure the endpoins with HTTP Basic authentication
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
            .csrf().disable()
            .httpBasic().and()
            .authorizeRequests()
            .antMatchers(HttpMethod.POST, "/api/v1").hasRole("ADMIN")
            .antMatchers(HttpMethod.GET).permitAll();

    }

    //pro SpringBoot 2 a vyšší je potřeba password encoder a je třeba ho použít pro zakódování hesel uživatelů
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();

    }

    /**@Bean public UserDetailsService userDetailsService() {
    //ok for demo
    User.UserBuilder users = User.withDefaultPasswordEncoder();

    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
    manager.createUser(users.username("user").password("password").roles("USER").build());
    manager.createUser(users.username("admin").password("password").roles("USER", "ADMIN").build());
    return manager;
    }*/


}
