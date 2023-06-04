package com.wp.user;

import com.wp.location.Location;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    @ManyToOne
    private Location location;
    private String email;





}
