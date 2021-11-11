package com.ion.solutions.profiles.model;

import lombok.*;
import javax.validation.constraints.Email;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor @Builder @ToString(onlyExplicitlyIncluded = true)
public class UserProfile {
    private UUID id;
    @Email
    private String email;
    private String firstName;
    private String lastName;
}
