package com.example.upfsda_security_monitoring.serviceImpl;

import com.example.upfsda_security_monitoring.Repository.AllAlertNotificationRepo;
import com.example.upfsda_security_monitoring.Repository.AllLabRtspUrlRepo;
import com.example.upfsda_security_monitoring.Repository.LabDetectionRepo;
import com.example.upfsda_security_monitoring.entity.AllLabRtspUrl;
import com.example.upfsda_security_monitoring.service.AllLabRtspUrlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
public class AllLabRtspUrlServiceImpl extends BaseServiceImpl<AllLabRtspUrl, Integer> implements AllLabRtspUrlService {


    private final AllAlertNotificationRepo allAlertNotificationRepo;
    private final AllLabRtspUrlRepo allLabRtspUrlRepo;
    private final LabDetectionRepo labDetectionRepo;

    public AllLabRtspUrlServiceImpl(AllAlertNotificationRepo allAlertNotificationRepo,
                                    AllLabRtspUrlRepo allLabRtspUrlRepo,LabDetectionRepo labDetectionRepo) {
        super(allLabRtspUrlRepo);
        this.allAlertNotificationRepo = allAlertNotificationRepo;
        this.allLabRtspUrlRepo = allLabRtspUrlRepo;
        this.labDetectionRepo = labDetectionRepo;
    }

    @Override
    public List<AllLabRtspUrl> getAllLabRtspUrlData() {
        return allLabRtspUrlRepo.findAll();
    }
}
