package com.baizhi.controller;

import com.baizhi.entity.Book;
import com.baizhi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ShowBookPageController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public Map showAllBook(@RequestParam(defaultValue = "1")Integer page,
                           @RequestParam(defaultValue = "5")Integer limit,
                           String search){
        List<Book> data = bookService.showAllPage(page, limit, search);
        int count = bookService.totalPage(search);
        Map map = new HashMap();
        map.put("code",0);
        map.put("data",data);
        map.put("count",count);
        return map;
    }

    @DeleteMapping("/books")
    public Map deleteAny(@RequestBody List<Integer> ids){
        System.err.println("id = " + ids);
        Map map = new HashMap();
        try {
            bookService.deleteMany(ids);
            map.put("status","success");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("status","error");
        }
        return map;
    }

    @PostMapping("/books")
    public Map addBook(@RequestBody Book book){
        System.err.println(book);
        Map map = new HashMap();
        try {
            bookService.insert(book);
            map.put("status","success");
        } catch (Exception e) {
            map.put("status","error");
            e.printStackTrace();
        }
        return map;
    }

    @PutMapping("/books")
    public Map update(@RequestBody Book book){
        System.err.println(book);
        Map map = new HashMap();
        try {
            bookService.updateByPrimaryKeySelective(book);
            map.put("status","success");
        } catch (Exception e) {
            map.put("status","error");
            e.printStackTrace();
        }
        return map;
    }

    @DeleteMapping("/books/{id}")
    public Map deleteOne(@PathVariable("id")Integer id){
        System.err.println(id);
        Map map = new HashMap();
        try {
            bookService.deleteByPrimaryKey(id);
            map.put("status","success");
        } catch (Exception e) {
            map.put("status","error");
            e.printStackTrace();
        }
        return map;
    }

}
