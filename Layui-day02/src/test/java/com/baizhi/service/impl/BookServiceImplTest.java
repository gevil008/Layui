package com.baizhi.service.impl;

import com.baizhi.dao.BookMapper;
import com.baizhi.entity.Book;
import com.baizhi.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BookServiceImplTest {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void selectByPrimaryKey() {
        System.err.println(bookService.selectByPrimaryKey(47));
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void totalPage() {
        //int i = bookService.totalPage(null);
        //System.err.println(i);
        int i = bookMapper.totalPage(null);
        System.err.println(i);
    }

    @Test
    public void deleteMany() {
    }

    @Test
    public void showAllPage() {
        List<Book> books = bookService.showAllPage(1, 5, null);
        books.forEach(System.err::println);
    }
}