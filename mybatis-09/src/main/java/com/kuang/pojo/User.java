package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{
    private static final long serialVersionUID = -6849794885475667710L;

    private int id;
    private String name;
    private String pwd;

}
