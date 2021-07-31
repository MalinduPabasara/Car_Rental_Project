package lk.malindu.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarRentDTO {

    private String rentId;
    private String startDate;
    private String endDate;
    private String duration;
    private double rate;
//    private double dayRate;
    private double cost;
    private int extrakm;
}
