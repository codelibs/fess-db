package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of BOOST_DOCUMENT_RULE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, URL_EXPR, BOOST_EXPR, SORT_ORDER, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
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
 * String urlExpr = entity.getUrlExpr();
 * String boostExpr = entity.getBoostExpr();
 * Integer sortOrder = entity.getSortOrder();
 * String createdBy = entity.getCreatedBy();
 * java.time.LocalDateTime createdTime = entity.getCreatedTime();
 * String updatedBy = entity.getUpdatedBy();
 * java.time.LocalDateTime updatedTime = entity.getUpdatedTime();
 * String deletedBy = entity.getDeletedBy();
 * java.time.LocalDateTime deletedTime = entity.getDeletedTime();
 * Integer versionNo = entity.getVersionNo();
 * entity.setId(id);
 * entity.setUrlExpr(urlExpr);
 * entity.setBoostExpr(boostExpr);
 * entity.setSortOrder(sortOrder);
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
public abstract class BsBoostDocumentRule extends AbstractEntity implements DomainEntity {

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

    /** URL_EXPR: {NotNull, TEXT(65535)} */
    protected String _urlExpr;

    /** BOOST_EXPR: {NotNull, TEXT(65535)} */
    protected String _boostExpr;

    /** SORT_ORDER: {NotNull, INT(10)} */
    protected Integer _sortOrder;

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
        return "BOOST_DOCUMENT_RULE";
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
        if (obj instanceof BsBoostDocumentRule) {
            BsBoostDocumentRule other = (BsBoostDocumentRule)obj;
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
        sb.append(dm).append(xfND(_urlExpr));
        sb.append(dm).append(xfND(_boostExpr));
        sb.append(dm).append(xfND(_sortOrder));
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
    public BoostDocumentRule clone() {
        return (BoostDocumentRule)super.clone();
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
     * [get] URL_EXPR: {NotNull, TEXT(65535)} <br>
     * @return The value of the column 'URL_EXPR'. (basically NotNull if selected: for the constraint)
     */
    public String getUrlExpr() {
        checkSpecifiedProperty("urlExpr");
        return _urlExpr;
    }

    /**
     * [set] URL_EXPR: {NotNull, TEXT(65535)} <br>
     * @param urlExpr The value of the column 'URL_EXPR'. (basically NotNull if update: for the constraint)
     */
    public void setUrlExpr(String urlExpr) {
        registerModifiedProperty("urlExpr");
        _urlExpr = urlExpr;
    }

    /**
     * [get] BOOST_EXPR: {NotNull, TEXT(65535)} <br>
     * @return The value of the column 'BOOST_EXPR'. (basically NotNull if selected: for the constraint)
     */
    public String getBoostExpr() {
        checkSpecifiedProperty("boostExpr");
        return _boostExpr;
    }

    /**
     * [set] BOOST_EXPR: {NotNull, TEXT(65535)} <br>
     * @param boostExpr The value of the column 'BOOST_EXPR'. (basically NotNull if update: for the constraint)
     */
    public void setBoostExpr(String boostExpr) {
        registerModifiedProperty("boostExpr");
        _boostExpr = boostExpr;
    }

    /**
     * [get] SORT_ORDER: {NotNull, INT(10)} <br>
     * @return The value of the column 'SORT_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSortOrder() {
        checkSpecifiedProperty("sortOrder");
        return _sortOrder;
    }

    /**
     * [set] SORT_ORDER: {NotNull, INT(10)} <br>
     * @param sortOrder The value of the column 'SORT_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setSortOrder(Integer sortOrder) {
        registerModifiedProperty("sortOrder");
        _sortOrder = sortOrder;
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
