package model.to.cadredb;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by Jay on 2018/1/23.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Entity
@Table(name = "CADRE_INFO_PHOTO", catalog = "")
public class CadreInfoPhoto {
    private String id;
    private String filePath;
    private String fileStatus;
    private byte[] photoFile;
    private String photoUuid;
    private String cadreId;
    private Timestamp storeTimeFromEplatform;

    @Id
    @Column(name = "ID", nullable = false, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FILE_PATH", nullable = true, length = 1000)
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Basic
    @Column(name = "FILE_STATUS", nullable = true, length = 20)
    public String getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
    }

    @Basic
    @Column(name = "PHOTO_FILE", nullable = true)
    public byte[] getPhotoFile() {
        return photoFile;
    }

    public void setPhotoFile(byte[] photoFile) {
        this.photoFile = photoFile;
    }

    @Basic
    @Column(name = "PHOTO_UUID", nullable = true, length = 1000)
    public String getPhotoUuid() {
        return photoUuid;
    }

    public void setPhotoUuid(String photoUuid) {
        this.photoUuid = photoUuid;
    }

    @Basic
    @Column(name = "CADRE_ID", nullable = true, length = 50)
    public String getCadreId() {
        return cadreId;
    }

    public void setCadreId(String cadreId) {
        this.cadreId = cadreId;
    }

    @Basic
    @Column(name = "STORE_TIME_FROM_EPLATFORM", nullable = true)
    public Timestamp getStoreTimeFromEplatform() {
        return storeTimeFromEplatform;
    }

    public void setStoreTimeFromEplatform(Timestamp storeTimeFromEplatform) {
        this.storeTimeFromEplatform = storeTimeFromEplatform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CadreInfoPhoto that = (CadreInfoPhoto) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (filePath != null ? !filePath.equals(that.filePath) : that.filePath != null) return false;
        if (fileStatus != null ? !fileStatus.equals(that.fileStatus) : that.fileStatus != null) return false;
        if (!Arrays.equals(photoFile, that.photoFile)) return false;
        if (photoUuid != null ? !photoUuid.equals(that.photoUuid) : that.photoUuid != null) return false;
        if (cadreId != null ? !cadreId.equals(that.cadreId) : that.cadreId != null) return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (filePath != null ? filePath.hashCode() : 0);
        result = 31 * result + (fileStatus != null ? fileStatus.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(photoFile);
        result = 31 * result + (photoUuid != null ? photoUuid.hashCode() : 0);
        result = 31 * result + (cadreId != null ? cadreId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
