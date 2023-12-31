package com.example.demo.repository;

import com.example.demo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {

    Region findByName(String name);



//    @Query(value="select r from Region r where r.name =:name")
//    Region aa(String name);

}
