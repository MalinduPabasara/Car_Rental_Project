package lk.malindu.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {
    @Id
    private String nic;
    private String name;
    private String address;
    private String email;
    private String dlc;
    private String contact;
    private String password;
}
