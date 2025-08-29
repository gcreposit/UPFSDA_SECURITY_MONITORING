package com.example.upfsda_security_monitoring.serviceImpl;

import com.example.upfsda_security_monitoring.Repository.LabDetectionRepo;
import com.example.upfsda_security_monitoring.entity.AllLabRtspUrl;
import com.example.upfsda_security_monitoring.entity.LabDetection;
import com.example.upfsda_security_monitoring.service.LabDetectionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
public class LabDetectionServiceImpl  extends BaseServiceImpl<LabDetection, Integer> implements LabDetectionService {

    private final LabDetectionRepo labDetectionRepo;

    public LabDetectionServiceImpl(LabDetectionRepo labDetectionRepo) {
        super(labDetectionRepo);
        this.labDetectionRepo = labDetectionRepo;
    }


    // Additional methods specific to LabDetection can be added here
}
