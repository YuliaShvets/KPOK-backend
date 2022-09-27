package ua.lviv.iot.KPOK.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "good")
public class Good {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private double price;

    @Column
    private String image;


}
