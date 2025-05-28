package site_celler.repository;

import org.springframework.stereotype.Repository;

import site_celler.entity.Tech;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TechRepository extends JpaRepository<Tech,Long>{

    
}
