package com.example.bankdemo.repository;

import com.example.bankdemo.model.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface CustomerRepository {
    @Select({
            "<script>",
            "SELECT email, pwd, role FROM customer",
            "<where>",
            "<if test=\"email != null\">AND email=#{email}</if>",
            "</where>",
            "</script>"
    })
    List<Customer> findByEmail(@Param("email")String email);

    @Insert({
            "INSERT INTO customer(email, pwd, role)",
            "VALUES(#{email}, #{pwd}, #{role})"
    })
    int insert(Customer customer);
}
