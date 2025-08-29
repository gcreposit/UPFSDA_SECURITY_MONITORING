package com.example.upfsda_security_monitoring.Repository;

import com.example.upfsda_security_monitoring.entity.AllAlertNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllAlertNotificationRepo extends JpaRepository<AllAlertNotification,Integer> {
}
