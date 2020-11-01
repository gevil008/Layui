package com.baizhi.service.impl;

import com.baizhi.entity.Book;
import com.baizhi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookService bookMapper;
    @Override
    public void deleteByPrimaryKey(Integer id) {
        bookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insert(Book record) {
        bookMapper.insert(record);
    }

    @Override
    public Book selectByPrimaryKey(Integer id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKeySelective(Book record) {
        bookMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int totalPage(String search) {
        return bookMapper.totalPage(search);
    }

    @Override
    public void deleteMany(List<Integer> ids) {
        bookMapper.deleteMany(ids);
    }

    @Override
    public List<Book> showAllPage(Integer offset, Integer limit, String search) {
        return bookMapper.showAllPage(offset,limit,search);
    }
}
