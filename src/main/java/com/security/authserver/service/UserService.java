// package com.security.authserver.service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.stereotype.Service;

// import com.security.authserver.entity.User;
// import com.security.authserver.repository.UserRepository;

// @Service
// public class UserService {
//     @Autowired
//     private UserRepository userRepository;

//     @Autowired
//     private BCryptPasswordEncoder bCryptPasswordEncoder;

//     public User save(User user) {
//         user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//         return userRepository.save(user);
//     }

//     public User findByUsername(String username) {
//         return userRepository.findByUserName(username);
//     }
// }
