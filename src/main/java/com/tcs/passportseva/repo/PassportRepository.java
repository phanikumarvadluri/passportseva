package com.tcs.passportseva.repo;


import com.tcs.passportseva.model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepository extends JpaRepository<Passport,Integer> {
}
