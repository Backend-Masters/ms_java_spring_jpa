package com.cppc.backend.sample.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Administrator on 2018-04-21.
 */
@Entity
@Data
@Table(name="sample")
public class Sample {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;


}
