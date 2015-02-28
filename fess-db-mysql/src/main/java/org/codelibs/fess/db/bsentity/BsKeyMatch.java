package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of KEY_MATCH as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, TERM, QUERY, MAX_SIZE, BOOST, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * String term = entity.getTerm();
 * String query = entity.getQuery();
 * Integer maxSize = entity.getMaxSize();
 * java.math.BigDecimal boost = entity.getBoost();
 * String createdBy = entity.getCreatedBy();
 * java.time.LocalDateTime createdTime = entity.getCreatedTime();
 * String updatedBy = entity.getUpdatedBy();
 * java.time.LocalDateTime updatedTime = entity.getUpdatedTime();
 * String deletedBy = entity.getDeletedBy();
 * java.time.LocalDateTime deletedTime = entity.getDeletedTime();
 * Integer versionNo = entity.getVersionNo();
 * entity.setId(id);
 * entity.setTerm(term);
 * entity.setQuery(query);
 * entity.setMaxSize(maxSize);
 * entity.setBoost(boost);
 * entity.setCreatedBy(createdBy);
 * entity.setCreatedTime(createdTime);
 * entity.setUpdatedBy(updatedBy);
 * entity.setUpdatedTime(updatedTime);
 * entity.setDeletedBy(deletedBy);
 * entity.setDeletedTime(deletedTime);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsKeyMatch extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _id;

    /** TERM: {NotNull, VARCHAR(100)} */
    protected String _term;

    /** QUERY: {NotNull, TEXT(65535)} */
    protected String _query;

    /** MAX_SIZE: {NotNull, INT(10)} */
    protected Integer _maxSize;

    /** BOOST: {NotNull, FLOAT(12)} */
    protected java.math.BigDecimal _boost;

    /** CREATED_BY: {NotNull, VARCHAR(255)} */
    protected String _createdBy;

    /** CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} */
    protected java.time.LocalDateTime _createdTime;

    /** UPDATED_BY: {VARCHAR(255)} */
    protected String _updatedBy;

    /** UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]} */
    protected java.time.LocalDateTime _updatedTime;

    /** DELETED_BY: {VARCHAR(255)} */
    protected String _deletedBy;

    /** DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]} */
    protected java.time.LocalDateTime _deletedTime;

    /** VERSION_NO: {NotNull, INT(10)} */
    protected Integer _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "KEY_MATCH";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsKeyMatch) {
            BsKeyMatch other = (BsKeyMatch)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_term));
        sb.append(dm).append(xfND(_query));
        sb.append(dm).append(xfND(_maxSize));
        sb.append(dm).append(xfND(_boost));
        sb.append(dm).append(xfND(_createdBy));
        sb.append(dm).append(xfND(_createdTime));
        sb.append(dm).append(xfND(_updatedBy));
        sb.append(dm).append(xfND(_updatedTime));
        sb.append(dm).append(xfND(_deletedBy));
        sb.append(dm).append(xfND(_deletedTime));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public KeyMatch clone() {
        return (KeyMatch)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param id The value of the column 'ID'. (basically NotNull if update: for the constraint)
     */
    public void setId(Long id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] TERM: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'TERM'. (basically NotNull if selected: for the constraint)
     */
    public String getTerm() {
        checkSpecifiedProperty("term");
        return _term;
    }

    /**
     * [set] TERM: {NotNull, VARCHAR(100)} <br>
     * @param term The value of the column 'TERM'. (basically NotNull if update: for the constraint)
     */
    public void setTerm(String term) {
        registerModifiedProperty("term");
        _term = term;
    }

    /**
     * [get] QUERY: {NotNull, TEXT(65535)} <br>
     * @return The value of the column 'QUERY'. (basically NotNull if selected: for the constraint)
     */
    public String getQuery() {
        checkSpecifiedProperty("query");
        return _query;
    }

    /**
     * [set] QUERY: {NotNull, TEXT(65535)} <br>
     * @param query The value of the column 'QUERY'. (basically NotNull if update: for the constraint)
     */
    public void setQuery(String query) {
        registerModifiedProperty("query");
        _query = query;
    }

    /**
     * [get] MAX_SIZE: {NotNull, INT(10)} <br>
     * @return The value of the column 'MAX_SIZE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMaxSize() {
        checkSpecifiedProperty("maxSize");
        return _maxSize;
    }

    /**
     * [set] MAX_SIZE: {NotNull, INT(10)} <br>
     * @param maxSize The value of the column 'MAX_SIZE'. (basically NotNull if update: for the constraint)
     */
    public void setMaxSize(Integer maxSize) {
        registerModifiedProperty("maxSize");
        _maxSize = maxSize;
    }

    /**
     * [get] BOOST: {NotNull, FLOAT(12)} <br>
     * @return The value of the column 'BOOST'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getBoost() {
        checkSpecifiedProperty("boost");
        return _boost;
    }

    /**
     * [set] BOOST: {NotNull, FLOAT(12)} <br>
     * @param boost The value of the column 'BOOST'. (basically NotNull if update: for the constraint)
     */
    public void setBoost(java.math.BigDecimal boost) {
        registerModifiedProperty("boost");
        _boost = boost;
    }

    /**
     * [get] CREATED_BY: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'CREATED_BY'. (basically NotNull if selected: for the constraint)
     */
    public String getCreatedBy() {
        checkSpecifiedProperty("createdBy");
        return _createdBy;
    }

    /**
     * [set] CREATED_BY: {NotNull, VARCHAR(255)} <br>
     * @param createdBy The value of the column 'CREATED_BY'. (basically NotNull if update: for the constraint)
     */
    public void setCreatedBy(String createdBy) {
        registerModifiedProperty("createdBy");
        _createdBy = createdBy;
    }

    /**
     * [get] CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * @return The value of the column 'CREATED_TIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getCreatedTime() {
        checkSpecifiedProperty("createdTime");
        return _createdTime;
    }

    /**
     * [set] CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * @param createdTime The value of the column 'CREATED_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setCreatedTime(java.time.LocalDateTime createdTime) {
        registerModifiedProperty("createdTime");
        _createdTime = createdTime;
    }

    /**
     * [get] UPDATED_BY: {VARCHAR(255)} <br>
     * @return The value of the column 'UPDATED_BY'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdatedBy() {
        checkSpecifiedProperty("updatedBy");
        return _updatedBy;
    }

    /**
     * [set] UPDATED_BY: {VARCHAR(255)} <br>
     * @param updatedBy The value of the column 'UPDATED_BY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdatedBy(String updatedBy) {
        registerModifiedProperty("updatedBy");
        _updatedBy = updatedBy;
    }

    /**
     * [get] UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]} <br>
     * @return The value of the column 'UPDATED_TIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdatedTime() {
        checkSpecifiedProperty("updatedTime");
        return _updatedTime;
    }

    /**
     * [set] UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]} <br>
     * @param updatedTime The value of the column 'UPDATED_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdatedTime(java.time.LocalDateTime updatedTime) {
        registerModifiedProperty("updatedTime");
        _updatedTime = updatedTime;
    }

    /**
     * [get] DELETED_BY: {VARCHAR(255)} <br>
     * @return The value of the column 'DELETED_BY'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeletedBy() {
        checkSpecifiedProperty("deletedBy");
        return _deletedBy;
    }

    /**
     * [set] DELETED_BY: {VARCHAR(255)} <br>
     * @param deletedBy The value of the column 'DELETED_BY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeletedBy(String deletedBy) {
        registerModifiedProperty("deletedBy");
        _deletedBy = deletedBy;
    }

    /**
     * [get] DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]} <br>
     * @return The value of the column 'DELETED_TIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getDeletedTime() {
        checkSpecifiedProperty("deletedTime");
        return _deletedTime;
    }

    /**
     * [set] DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]} <br>
     * @param deletedTime The value of the column 'DELETED_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setDeletedTime(java.time.LocalDateTime deletedTime) {
        registerModifiedProperty("deletedTime");
        _deletedTime = deletedTime;
    }

    /**
     * [get] VERSION_NO: {NotNull, INT(10)} <br>
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, INT(10)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Integer versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
