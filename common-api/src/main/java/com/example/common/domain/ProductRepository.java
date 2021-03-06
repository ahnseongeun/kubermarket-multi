package com.example.common.domain;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ProductRepository extends CrudRepository<Product,Long> {
    //select c+d as total from (select a.id , a.interest_count as c,count(b.product_id) as d  from product as a left join chat_Room b  on a.id=b.product_id  group by a.id ) order by total desc
    //@Query("Select a.id ,count(b.product) as Chatnum from Product as a left join ChatRoom b  on a.id= b.product")
   // @Query("select c+d as total from (select a.id ,s a.interest_count as c,count(b.product_id) as d  from product as a left join chat_Room b  on a.id=b.product_id  group by a.id ) order by total desc")
   //List<Product> findByInterestCount(Integer InterestCount,Pageable pageRequest);
   //Page<Product> findAllByInterestCount(Integer InterestCount,Pageable pageRequest);
   //TODO// Page<Product> findByAddress(@Param("address") String address, Pageable pageRequest);
   List<Product> findByAddress(@Param("address") String address);
   Page<Product> findByKeyword(@Param("keyword") String keyword, Pageable pageRequest);
   List<Product> findByPopular();
   List<Product> findByCategory(@Param("category") String category);
   //Page<Product> findByPopular(Pageable pageRequest);
   //Page<Product> findByCategory(@Param("category") String category, Pageable pageRequest);

//test
    //List<Product> findAll(Sort interestCount);
}
