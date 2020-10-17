package da.project.sporteezone.app;


import da.project.sporteezone.app.service.UserPrincipalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.HashSet;
import java.util.Set;

@Configuration
@EnableWebSecurity
@Order(1)
public class OAuth2LoginSecurityConfig
    extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        Set<String> googleScopes = new HashSet<>();
        googleScopes.add("https://www.googleapis.com/auth/userinfo.email");
        googleScopes.add("https://www.googleapis.com/auth/userinfo.profile");

        OidcUserService googleUserService = new OidcUserService();
        googleUserService.setAccessibleScopes(googleScopes);

        http
            .authorizeRequests(authorizeRequests -> authorizeRequests.antMatchers("/star").authenticated())
            .oauth2Login(oauthLogin -> oauthLogin
                .userInfoEndpoint()
                .oidcUserService(googleUserService));
    }
}

