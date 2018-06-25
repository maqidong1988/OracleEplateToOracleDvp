package model.to.cadredb;

import javax.persistence.*;

/**
 * Created by Jay on 2018/1/28.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Entity
//@Table(name = "RELATION_LINK", schema = "OPS_DVP_DEV", catalog = "")
@Table(name = "RELATION_LINK", schema = "OPS_DVP", catalog = "")
public class RelationLink {
    private String linkId;
    private String beRelatedId;
    private String mainId;
    private String relationDescription;
    private String relationType;
    private String statusCode;
    private String ids;

    @Id
    @Column(name = "LINK_ID", nullable = false, length = 50)
    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    @Basic
    @Column(name = "BE_RELATED_ID", nullable = true, length = 50)
    public String getBeRelatedId() {
        return beRelatedId;
    }

    public void setBeRelatedId(String beRelatedId) {
        this.beRelatedId = beRelatedId;
    }

    @Basic
    @Column(name = "MAIN_ID", nullable = true, length = 50)
    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId;
    }

    @Basic
    @Column(name = "RELATION_DESCRIPTION", nullable = true, length = 1000)
    public String getRelationDescription() {
        return relationDescription;
    }

    public void setRelationDescription(String relationDescription) {
        this.relationDescription = relationDescription;
    }

    @Basic
    @Column(name = "RELATION_TYPE", nullable = true, length = 100)
    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    @Column(name = "STATUS_CODE", nullable = true, length = 30)
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Column(name = "IDS", nullable = true, length = 100)
    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

}
