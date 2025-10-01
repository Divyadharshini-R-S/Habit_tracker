//package com.habittracker.controller;
//
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Map;
//
//@Component
//public class DBTest {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @PostConstruct
//    public void testDb() {
//        jdbcTemplate.execute(
//                "IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='TestTable' AND xtype='U') " +
//                        "BEGIN " +
//                        "CREATE TABLE TestTable(Id INT IDENTITY(1,1) PRIMARY KEY, Message NVARCHAR(100)) " +
//                        "END"
//        );
//
//        jdbcTemplate.execute("INSERT INTO TestTable(Message) VALUES('DB is working in docker!')");
//
//        List<Map<String, Object>> results = jdbcTemplate.queryForList("SELECT * FROM TestTable");
//        results.forEach(System.out::println);
//    }
//
//}
