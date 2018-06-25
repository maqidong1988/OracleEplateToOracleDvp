package model.to.teamdb;

import javax.persistence.*;

/**
 * Created by Jay on 2018/1/23.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Entity
@Table(name = "RELATIONSHIP_CHANGES", catalog = "")
public class RelationshipChanges {
    private String id;
    private String recordNumbers;
    private String recordYear;
    private String subId;

    @Id
    @Column(name = "ID", nullable = false, length = 36)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "RECORD_NUMBERS", nullable = true, length = 6)
    public String getRecordNumbers() {
        return recordNumbers;
    }

    public void setRecordNumbers(String recordNumbers) {
        this.recordNumbers = recordNumbers;
    }

    @Basic
    @Column(name = "RECORD_YEAR", nullable = true, length = 4)
    public String getRecordYear() {
        return recordYear;
    }

    public void setRecordYear(String recordYear) {
        this.recordYear = recordYear;
    }

    @Basic
    @Column(name = "SUB_ID", nullable = true, length = 36)
    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RelationshipChanges that = (RelationshipChanges) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (recordNumbers != null ? !recordNumbers.equals(that.recordNumbers) : that.recordNumbers != null)
            return false;
        if (recordYear != null ? !recordYear.equals(that.recordYear) : that.recordYear != null) return false;
        if (subId != null ? !subId.equals(that.subId) : that.subId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (recordNumbers != null ? recordNumbers.hashCode() : 0);
        result = 31 * result + (recordYear != null ? recordYear.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        return result;
    }
}
