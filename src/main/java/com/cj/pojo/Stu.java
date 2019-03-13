package com.cj.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chen·jie
 */
@Data
@NoArgsConstructor
public class Stu {
    public Stu(int age) {
        this.age = age;
    }

    private int id;

    private int age;
}
