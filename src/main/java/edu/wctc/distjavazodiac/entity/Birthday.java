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
@Table(name="Birthday")
public class Birthday {
    @Id
    @Column(name="year")
    private int year;
    @Column(name="day")
    private int day;
    @Column(name="month")
    private int month;
    @Column(name="zodiac_type")
    private String zodiacType;
    @Column(name="terms_accepted")
    private boolean termsAccepted;
}
