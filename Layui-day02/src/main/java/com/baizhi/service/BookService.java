package com.baizhi.service;

import com.baizhi.entity.Book;

import java.util.List;

public interface BookService {
    void deleteByPrimaryKey(Integer id);

    void insert(Book record);

    Book selectByPrimaryKey(Integer id);

    void updateByPrimaryKeySelective(Book record);

    int totalPage(String search);

    void deleteMany(List<Integer> ids);

    List<Book> showAllPage(Integer offset,Integer limit,String search);
}
