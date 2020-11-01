package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {
    private Integer id;

    private String name;

    private String author;

    private String press;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date publishedDate;

    private String cover;

    private Double price;

    private static final long serialVersionUID = 1L;
}