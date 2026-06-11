package com.wipro.eCommerce.securityconfig;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.wipro.eCommerce.Repository.CustomerRepository;
import com.wipro.eCommerce.entity.Customer;

@Service
public class UserInfoUserDetailsService implements UserDetailsService {  // UserDetailsServiceImp class

    @Autowired
    private CustomerRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Customer> userInfo = repository.findByName(username);
        
        return userInfo.map(UserInfoUserDetails::new) 
                .orElseThrow(() -> new UsernameNotFoundException("user not found " + username));

    }
}

