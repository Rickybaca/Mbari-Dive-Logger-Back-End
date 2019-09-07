package edu.csumb.sp19.cst438.mbari.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "logs")

public class Log{
    @Id private String id;
    private String diveDate;
    private String startTime;
    private String endTime;
    private String bottomMinutes;
    private String purpose;
    private String trainingProficiency;
    private String surfaceInterval;
    private String specificSite;
    private String otherSite;
    private String siteGPS;
    private String maxDive;
    private String divingMode;
    private String decompression;
    private String breathingGas;
    private String environment;
    private String surfaceCondition;
    private String waterCondition;
    private String comments;
    private String animalObservation;

    public Log(String diveDate, String startTime, String endTime, 
    String bottomMinutes, String purpose, String trainingProficiency, 
    String surfaceInterval, String specificSite, String otherSite, String siteGPS,
    String maxDive, String divingMode, String decompression, String breathingGas,
    String environment, String surfaceCondition, String waterCondition,
    String comments, String animalObservation){
        this.setDiveDate(diveDate);
        this.setStartTime(startTime);
        this.setEndTime(endTime);
        this.setBottomMinutes(bottomMinutes);
        this.setPurpose(purpose);
        this.setTrainingProficiency(trainingProficiency);
        this.setSurfaceInterval(surfaceInterval);
        this.setSpecificSite(specificSite);
        this.setOtherSite(otherSite);
        this.setSiteGPS(siteGPS);
        this.setMaxDive(maxDive);
        this.setDivingMode(divingMode);
        this.setDecompression(decompression);
        this.setBreathingGas(breathingGas);
        this.setEnvironment(environment);
        this.setSurfaceCondition(surfaceCondition);
        this.setWaterCondition(waterCondition);
        this.setComments(comments);
        this.setAnimalObservation(animalObservation);
    }

    public Log(){
        
    }

    public String getDiveDate() {
        return diveDate;
    }

    
    public String getAnimalObservation() {
        return animalObservation;
    }

    
    public void setAnimalObservation(String animalObservation) {
        this.animalObservation = animalObservation;
    }

    
    public String getComments() {
        return comments;
    }

    
    public void setComments(String comments) {
        this.comments = comments;
    }

    
    public String getWaterCondition() {
        return waterCondition;
    }

    
    public void setWaterCondition(String waterCondition) {
        this.waterCondition = waterCondition;
    }

    
    public String getSurfaceCondition() {
        return surfaceCondition;
    }

    
    public void setSurfaceCondition(String surfaceCondition) {
        this.surfaceCondition = surfaceCondition;
    }

    
    public String getEnvironment() {
        return environment;
    }

    
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    
    public String getBreathingGas() {
        return breathingGas;
    }

    
    public void setBreathingGas(String breathingGas) {
        this.breathingGas = breathingGas;
    }

    
    public String getDecompression() {
        return decompression;
    }

    
    public void setDecompression(String decompression) {
        this.decompression = decompression;
    }

    
    public String getDivingMode() {
        return divingMode;
    }

    
    public void setDivingMode(String divingMode) {
        this.divingMode = divingMode;
    }

    
    public String getMaxDive() {
        return maxDive;
    }

    
    public void setMaxDive(String maxDive) {
        this.maxDive = maxDive;
    }

    
    public String getSiteGPS() {
        return siteGPS;
    }

    
    public void setSiteGPS(String siteGPS) {
        this.siteGPS = siteGPS;
    }

    
    public String getOtherSite() {
        return otherSite;
    }

    
    public void setOtherSite(String otherSite) {
        this.otherSite = otherSite;
    }

    
    public String getSpecificSite() {
        return specificSite;
    }

    
    public void setSpecificSite(String specificSite) {
        this.specificSite = specificSite;
    }

    
    public String getSurfaceInterval() {
        return surfaceInterval;
    }

    
    public void setSurfaceInterval(String surfaceInterval) {
        this.surfaceInterval = surfaceInterval;
    }

    
    public String getTrainingProficiency() {
        return trainingProficiency;
    }

    
    public void setTrainingProficiency(String trainingProficiency) {
        this.trainingProficiency = trainingProficiency;
    }

    
    public String getPurpose() {
        return purpose;
    }

    
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    
    public String getBottomMinutes() {
        return bottomMinutes;
    }

    
    public void setBottomMinutes(String bottomMinutes) {
        this.bottomMinutes = bottomMinutes;
    }

    
    public String getEndTime() {
        return endTime;
    }

    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    
    public String getStartTime() {
        return startTime;
    }

    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    
    public void setDiveDate(String diveDate) {
        this.diveDate = diveDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}