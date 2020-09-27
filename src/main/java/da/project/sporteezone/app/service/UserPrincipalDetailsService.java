package da.project.sporteezone.app.service;

import da.project.sporteezone.app.UserPrincipal;
import da.project.sporteezone.app.entity.User;
import da.project.sporteezone.app.repository.UserRepository;
import javassist.bytecode.stackmap.BasicBlock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class UserPrincipalDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    //loads a user from our database and converts it to UserPrincipal
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        try {
            User user = this.userRepository.findByUsername(s);
            UserPrincipal userPrincipal = new UserPrincipal();
            return userPrincipal;
        }
        catch(UsernameNotFoundException e) {
            log.info("Username does not exist in the database: " + e);
        }
        return null;
    }

}

