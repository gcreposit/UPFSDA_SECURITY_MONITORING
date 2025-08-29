package com.example.upfsda_security_monitoring.Repository;

import com.example.upfsda_security_monitoring.entity.LabDetection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface LabDetectionRepo extends JpaRepository<LabDetection,Integer> {

    @Query(value = "SELECT * FROM labDetection where lab_id=?1 ORDER BY id DESC",nativeQuery = true)
    List<Map<String, Object>> findLabDetectionById(Integer id);
}
