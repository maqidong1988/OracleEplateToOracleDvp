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
//@Table(name = "RELATION_NODE", schema = "OPS_DVP_DEV", catalog = "")
@Table(name = "RELATION_NODE", schema = "OPS_DVP", catalog = "")
public class RelationNode {
    private String nodeId;
    private String name;
    private String nodeType;
    private String originalId;
    private String identityNumber;

    public RelationNode() {
        super();
    }

    public RelationNode(String nodeId, String name, String nodeType, String originalId, String identityNumber) {
        this.nodeId = nodeId;
        this.name = name;
        this.nodeType = nodeType;
        this.originalId = originalId;
        this.identityNumber = identityNumber;
    }

    public RelationNode(String nodeId, String originalId) {
        this.nodeId = nodeId;
        this.originalId = originalId;
    }

    @Id
    @Column(name = "NODE_ID", nullable = false, length = 50)
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "NODE_TYPE", nullable = true, length = 100)
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    @Basic
    @Column(name = "ORIGINAL_ID", nullable = true, length = 50)
    public String getOriginalId() {
        return originalId;
    }

    public void setOriginalId(String originalId) {
        this.originalId = originalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RelationNode that = (RelationNode) o;

        if (nodeId != null ? !nodeId.equals(that.nodeId) : that.nodeId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (nodeType != null ? !nodeType.equals(that.nodeType) : that.nodeType != null) return false;
        if (originalId != null ? !originalId.equals(that.originalId) : that.originalId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nodeId != null ? nodeId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nodeType != null ? nodeType.hashCode() : 0);
        result = 31 * result + (originalId != null ? originalId.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "IDENTITY_NUMBER", nullable = true, length = 50)
    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }
}
