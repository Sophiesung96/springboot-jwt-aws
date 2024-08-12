package com.javatechie.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier of the user", example = "1", required = true)
    private int id;
    @Schema(description = "Name the user", example = "Jane Doe", required = true)
    private String name;
    @Schema(description = "User's email address", example = "12345@example.com", required = true)
    private String email;
    @Schema(description = "User's password",example = "credentials",required = true)
    private String password;
    @Schema(description = "User's role",example = "USER_ADMIN",required = true)
    private String roles;

}
