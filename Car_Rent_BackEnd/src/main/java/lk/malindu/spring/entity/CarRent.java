package lk.malindu.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class CarRent {
    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String rentId;
    private String startDate;
    private String endDate;
    private String duration;
    private double rate;
//    private double dayRate;
    private double cost;
    private int extrakm;
    @ManyToOne
    @JoinColumn(name = "nic",referencedColumnName = "nic",insertable = false,updatable = false)
    private Customer nic;
    @ManyToOne
    @JoinColumn(name = "rno",referencedColumnName = "rno",insertable = false,updatable = false)
    private Car rno;

//    @JoinColumn(name = "oid",referencedColumnName = "oid",insertable = false,updatable = false)
//    private Orders oid;
//    @ManyToOne
//    @JoinColumn(name = "id",referencedColumnName = "id")
//    private Drivers id;
}
