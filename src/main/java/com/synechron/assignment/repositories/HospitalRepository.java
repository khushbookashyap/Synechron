package com.synechron.assignment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synechron.assignment.entities.PlanSubtype;

public interface HospitalRepository extends JpaRepository<PlanSubtype, Integer> {

}
