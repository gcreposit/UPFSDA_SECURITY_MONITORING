package com.example.upfsda_security_monitoring.Repository;

import com.example.upfsda_security_monitoring.entity.AllLabRtspUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllLabRtspUrlRepo extends JpaRepository<AllLabRtspUrl,Integer> {
}
