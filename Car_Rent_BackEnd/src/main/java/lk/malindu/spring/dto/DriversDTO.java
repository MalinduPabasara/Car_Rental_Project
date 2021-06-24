package lk.malindu.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import javax.persistence.Entity;
import javax.persistence.Id;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class DriversDTO{

    private String id;
    private String name;
    private String address;
    private String contact;
}
