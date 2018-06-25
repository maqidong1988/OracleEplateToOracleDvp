package model.from;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by Jay on 2018/1/16.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Entity
@Table(name = "EMP_PHOTO", catalog = "")
public class EmpPhoto {
    private String empId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String filePath;
    private long seqid;
    private String photoUuid;
    private String status;
    private String status2;
    private String photoFormat;
    private String subId;
    private byte[] photoFile;

    @Basic
    @Column(name = "EMP_ID", nullable = false, length = 50)
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Basic
    @Column(name = "LAST_UPDATED_STAMP", nullable = true)
    public Timestamp getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    @Basic
    @Column(name = "LAST_UPDATED_TX_STAMP", nullable = true)
    public Timestamp getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    @Basic
    @Column(name = "CREATED_STAMP", nullable = true)
    public Timestamp getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }

    @Basic
    @Column(name = "CREATED_TX_STAMP", nullable = true)
    public Timestamp getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    @Basic
    @Column(name = "FILE_PATH", nullable = true, length = 500)
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Basic
    @Column(name = "SEQID", nullable = false, precision = 0)
    public long getSeqid() {
        return seqid;
    }

    public void setSeqid(long seqid) {
        this.seqid = seqid;
    }

    @Basic
    @Column(name = "PHOTO_UUID", nullable = true, length = 500)
    public String getPhotoUuid() {
        return photoUuid;
    }

    public void setPhotoUuid(String photoUuid) {
        this.photoUuid = photoUuid;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, length = 10)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "STATUS2", nullable = true, length = 10)
    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }

    @Basic
    @Column(name = "PHOTO_FORMAT", nullable = true, length = 50)
    public String getPhotoFormat() {
        return photoFormat;
    }

    public void setPhotoFormat(String photoFormat) {
        this.photoFormat = photoFormat;
    }

    @Id
    @Column(name = "SUB_ID", nullable = true, length = 50)
    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    @Basic
    @Column(name = "PHOTO_FILE", nullable = true)
    public byte[] getPhotoFile() {
        return photoFile;
    }

    public void setPhotoFile(byte[] photoFile) {
        this.photoFile = photoFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpPhoto empPhoto = (EmpPhoto) o;

        if (seqid != empPhoto.seqid) return false;
        if (empId != null ? !empId.equals(empPhoto.empId) : empPhoto.empId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empPhoto.lastUpdatedStamp) : empPhoto.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empPhoto.lastUpdatedTxStamp) : empPhoto.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empPhoto.createdStamp) : empPhoto.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empPhoto.createdTxStamp) : empPhoto.createdTxStamp != null)
            return false;
        if (filePath != null ? !filePath.equals(empPhoto.filePath) : empPhoto.filePath != null) return false;
        if (photoUuid != null ? !photoUuid.equals(empPhoto.photoUuid) : empPhoto.photoUuid != null) return false;
        if (status != null ? !status.equals(empPhoto.status) : empPhoto.status != null) return false;
        if (status2 != null ? !status2.equals(empPhoto.status2) : empPhoto.status2 != null) return false;
        if (photoFormat != null ? !photoFormat.equals(empPhoto.photoFormat) : empPhoto.photoFormat != null)
            return false;
        if (subId != null ? !subId.equals(empPhoto.subId) : empPhoto.subId != null) return false;
        if (!Arrays.equals(photoFile, empPhoto.photoFile)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empId != null ? empId.hashCode() : 0;
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (filePath != null ? filePath.hashCode() : 0);
        result = 31 * result + (int) (seqid ^ (seqid >>> 32));
        result = 31 * result + (photoUuid != null ? photoUuid.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (photoFormat != null ? photoFormat.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(photoFile);
        return result;
    }
}
