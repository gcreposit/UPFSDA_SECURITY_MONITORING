package com.example.upfsda_security_monitoring.service;

import com.example.upfsda_security_monitoring.entity.AllLabRtspUrl;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AllLabRtspUrlService extends BaseService<AllLabRtspUrl, Integer> {
    List<AllLabRtspUrl> getAllLabRtspUrlData();
}
