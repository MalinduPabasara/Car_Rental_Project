package lk.malindu.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarRent {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String rentId;
    private String startDate;
    private String endDate;
    private String duration;
    private double rate;
//    private double dayRate;
    private double cost;
    private int extrakm;
    @ManyToOne
    @JoinColumn(name = "nic",referencedColumnName = "nic")
    private Customer nic;
    @ManyToOne
    @JoinColumn(name = "rno",referencedColumnName = "rno")
    private Car rno;
    @ManyToOne
    @JoinColumn(name = "id",referencedColumnName = "id")
    private Drivers id;
}
