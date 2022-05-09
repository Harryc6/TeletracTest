package com.example.teletractattempt.refentity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class RefEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "recordType must not be blank")
    private String recordType;
    @NotBlank(message = "deviceId must not be blank")
    private String deviceId;
    @NotBlank(message = "eventDateTime must not be blank")
    private String eventDateTime;
    @NotBlank(message = "fieldA must not be blank")
    private String fieldA;
    @NotBlank(message = "fieldB must not be blank")
    private String fieldB;
    @NotBlank(message = "fieldC must not be blank")
    private String fieldC;

    public RefEntity() {
    }

    public RefEntity(Long id, String recordType, String deviceId, String eventDateTime, String fieldA, String fieldB, String fieldC) {
        this.id = id;
        this.recordType = recordType;
        this.deviceId = deviceId;
        this.eventDateTime = eventDateTime;
        this.fieldA = fieldA;
        this.fieldB = fieldB;
        this.fieldC = fieldC;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(String eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public String getFieldA() {
        return fieldA;
    }

    public void setFieldA(String fieldA) {
        this.fieldA = fieldA;
    }

    public String getFieldB() {
        return fieldB;
    }

    public void setFieldB(String fieldB) {
        this.fieldB = fieldB;
    }

    public String getFieldC() {
        return fieldC;
    }

    public void setFieldC(String fieldC) {
        this.fieldC = fieldC;
    }
}
