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
public class Car {
    @Id
    private String rno;
    private String brand;
    private String type;
    private int passenger;
    private String transmissiontype;
    private String fueltype;
    private String freeMforaduration;
    private String color;
//    private double dailyRate;
//    private double monthrate;
    private String freeMforaPrice;
    private double priceForextrakm;
    private String lossdamage;
}
