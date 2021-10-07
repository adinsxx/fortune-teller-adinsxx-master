package edu.wctc.distjavazodiac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name="Horoscope")
public class Horoscope {
    @Id
    @Column(name="sign")
    private String sign;
    @Column(name="horoscope")
    private String horoscope;
}
