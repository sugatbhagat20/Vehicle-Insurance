package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.backend.dto.UpdateUserDTO;
import com.backend.entity.User;
import com.backend.repo.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email already exists!");
        }
        return userRepository.save(user);
    }
    public User login(String email, String rawPassword) {
        User user = userRepository.findByEmail(email);
        if (user != null && rawPassword.equals(user.getPassword())) {
            return user;
        }
        throw new RuntimeException("Invalid email or password");
    }
    
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    public User updateUser(UpdateUserDTO dto) {
        User existingUser = userRepository.findByEmail(dto.getEmail());
        		existingUser.setName(dto.getName());
        existingUser.setPhone(dto.getPhone());

        return userRepository.save(existingUser);
    }
    
    public List<User> getAllNonAdminUsers() {
        return userRepository.findByRoleRoleIdNot(1L);  // Exclude Admins
    }
    
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

   
}
