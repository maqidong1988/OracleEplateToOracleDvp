package model.to.cadredb;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "UNIT_INFO",catalog = "")
public class UnitInfo implements Serializable {

    private static final long serialVersionUID = 7972328475341093L;
    private String id;
    private String unitName;
    private String code;
    private String pptr;
    private Timestamp createDateTime;

    @Id
    @Column(name = "ID", nullable = false, length = 36)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "UNIT_NAME", nullable = false, length = 36)
    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Basic
    @Column(name = "CODE", nullable = true, precision = 0)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    @Basic
    @Column(name = "PPTR", nullable = true, precision = 0)
    public String getPptr() {
        return pptr;
    }

    public void setPptr(String pptr) {
        this.pptr = pptr;
    }

    @Basic
    @Column(name = "CREATE_DATE_TIME", nullable = true)
    public Timestamp getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Timestamp createDateTime) {
        this.createDateTime = createDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UnitInfo unitInfo = (UnitInfo) o;

        if (id != null ? !id.equals(unitInfo.id) : unitInfo.id != null) return false;
        if (unitName != null ? !unitName.equals(unitInfo.unitName) : unitInfo.unitName != null) return false;
        if (code != null ? !code.equals(unitInfo.code) : unitInfo.code != null) return false;
        if (pptr != null ? !pptr.equals(unitInfo.pptr) : unitInfo.pptr != null) return false;
        return createDateTime != null ? createDateTime.equals(unitInfo.createDateTime) : unitInfo.createDateTime == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (unitName != null ? unitName.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (pptr != null ? pptr.hashCode() : 0);
        result = 31 * result + (createDateTime != null ? createDateTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UnitInfo{" +
                "id='" + id + '\'' +
                ", unitName='" + unitName + '\'' +
                ", code='" + code + '\'' +
                ", pptr='" + pptr + '\'' +
                ", createDateTime=" + createDateTime +
                '}';
    }
}
