package com.devenzo.neuromarket.repository;

import com.devenzo.neuromarket.model.Influencer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfluencerRepository extends JpaRepository<Influencer, Integer> {

}
