package com.baizhi.dao;

import com.baizhi.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    void deleteByPrimaryKey(Integer id);

    void insert(Book record);

    Book selectByPrimaryKey(Integer id);

    void updateByPrimaryKeySelective(Book record);

    int totalPage(@Param("search")String search);

    void deleteMany(@Param("ids") List<Integer> ids);

    List<Book> showAllPage(@Param("offset")Integer offset,@Param("limit")Integer limit,@Param("search")String search);

}