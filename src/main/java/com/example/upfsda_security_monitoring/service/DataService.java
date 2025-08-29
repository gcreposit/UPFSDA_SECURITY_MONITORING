package com.example.upfsda_security_monitoring.service;


import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface DataService {
    List<Map<String, Object>> fetchLabDetectionData(String id);

    byte[] getFileData(String filePath) throws IOException;
}
