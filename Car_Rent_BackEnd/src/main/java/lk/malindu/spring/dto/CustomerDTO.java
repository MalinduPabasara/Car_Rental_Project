package lk.malindu.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {

    private String nic;
    private String name;
    private String address;
    private String email;
    private String dlc;
    private String contact;
    private String password;

}
