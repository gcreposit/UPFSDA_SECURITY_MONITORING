package com.example.upfsda_security_monitoring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/upfsdaMonitoring")
public class PageController {

    // This class will handle page navigation and rendering
    // You can add methods to return views or redirect to other pages
    // For example, you might have a method like this:

    @GetMapping("/login")
    public String homePage() {
        return "Home/Login"; // This would return the home view
    }

    @GetMapping("/dashboard")
    public String dashboardPage() {
        return "Home/Dashboard"; // This would return the dashboard view
    }

    @GetMapping("/labProfilePage")
    public String labProfilePage(@RequestParam(name = "labName", required = false) String labName) {

        return "Home/LabProfilePage"; // This would return the lab profile view
    }

    @GetMapping("/labDetectionSummary")
    public String labDetectionSummary() {
        return "Home/LabDetetctionSummary"; // This would return the lab detection summary view
    }

    @GetMapping("/timeLineNavigation")
    public String timeLineNavigation() {
        return "Home/DetectionTimelinepage"; // This would return the timeline navigation view
    }


    @GetMapping("/crowdDetedtion")
    public String crowdDetection() {
        return "Home/CrowdDetection"; // This would return the crowd detection view
    }

    @GetMapping("/labDashboard")
    public String labDashboard() {
        return "Home/LabDashboard"; // This would return the lab dashboard view
    }

    @GetMapping("/allAlertDashboard")
    public String allAlertDashboard() {
        return "Home/AllAlertDashboard"; // This would return the all alert dashboard view
    }


    // Add more methods as needed for your application
}
