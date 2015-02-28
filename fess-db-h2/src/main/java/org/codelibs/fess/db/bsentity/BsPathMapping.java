package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.allcommon.CDef;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of PATH_MAPPING as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, REGEX, REPLACEMENT, PROCESS_TYPE, SORT_ORDER, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
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
 * String regex = entity.getRegex();
 * String replacement = entity.getReplacement();
 * String processType = entity.getProcessType();
 * Integer sortOrder = entity.getSortOrder();
 * String createdBy = entity.getCreatedBy();
 * java.time.LocalDateTime createdTime = entity.getCreatedTime();
 * String updatedBy = entity.getUpdatedBy();
 * java.time.LocalDateTime updatedTime = entity.getUpdatedTime();
 * String deletedBy = entity.getDeletedBy();
 * java.time.LocalDateTime deletedTime = entity.getDeletedTime();
 * Integer versionNo = entity.getVersionNo();
 * entity.setId(id);
 * entity.setRegex(regex);
 * entity.setReplacement(replacement);
 * entity.setProcessType(processType);
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
public abstract class BsPathMapping extends AbstractEntity implements DomainEntity {

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

    /** REGEX: {NotNull, VARCHAR(1000)} */
    protected String _regex;

    /** REPLACEMENT: {NotNull, VARCHAR(1000)} */
    protected String _replacement;

    /** PROCESS_TYPE: {NotNull, VARCHAR(1), classification=ProcessType} */
    protected String _processType;

    /** SORT_ORDER: {NotNull, INTEGER(10)} */
    protected Integer _sortOrder;

    /** CREATED_BY: {NotNull, VARCHAR(255)} */
    protected String _createdBy;

    /** CREATED_TIME: {NotNull, TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _createdTime;

    /** UPDATED_BY: {VARCHAR(255)} */
    protected String _updatedBy;

    /** UPDATED_TIME: {TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _updatedTime;

    /** DELETED_BY: {VARCHAR(255)} */
    protected String _deletedBy;

    /** DELETED_TIME: {TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _deletedTime;

    /** VERSION_NO: {NotNull, INTEGER(10)} */
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
        return "PATH_MAPPING";
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of processType as the classification of ProcessType. <br>
     * PROCESS_TYPE: {NotNull, VARCHAR(1), classification=ProcessType} <br>
     * Processing Type
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ProcessType getProcessTypeAsProcessType() {
        return CDef.ProcessType.codeOf(getProcessType());
    }

    /**
     * Set the value of processType as the classification of ProcessType. <br>
     * PROCESS_TYPE: {NotNull, VARCHAR(1), classification=ProcessType} <br>
     * Processing Type
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setProcessTypeAsProcessType(CDef.ProcessType cdef) {
        setProcessType(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of processType as Crawling (C). <br>
     * Crawling: Process When Crawling
     */
    public void setProcessType_Crawling() {
        setProcessTypeAsProcessType(CDef.ProcessType.Crawling);
    }

    /**
     * Set the value of processType as Displaying (D). <br>
     * Displaying: Process When Displaying
     */
    public void setProcessType_Displaying() {
        setProcessTypeAsProcessType(CDef.ProcessType.Displaying);
    }

    /**
     * Set the value of processType as Both (B). <br>
     * Both: Process When Crawling/Displaying
     */
    public void setProcessType_Both() {
        setProcessTypeAsProcessType(CDef.ProcessType.Both);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of processType Crawling? <br>
     * Crawling: Process When Crawling
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProcessTypeCrawling() {
        CDef.ProcessType cdef = getProcessTypeAsProcessType();
        return cdef != null ? cdef.equals(CDef.ProcessType.Crawling) : false;
    }

    /**
     * Is the value of processType Displaying? <br>
     * Displaying: Process When Displaying
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProcessTypeDisplaying() {
        CDef.ProcessType cdef = getProcessTypeAsProcessType();
        return cdef != null ? cdef.equals(CDef.ProcessType.Displaying) : false;
    }

    /**
     * Is the value of processType Both? <br>
     * Both: Process When Crawling/Displaying
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProcessTypeBoth() {
        CDef.ProcessType cdef = getProcessTypeAsProcessType();
        return cdef != null ? cdef.equals(CDef.ProcessType.Both) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'processType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getProcessTypeName() {
        CDef.ProcessType cdef = getProcessTypeAsProcessType();
        return cdef != null ? cdef.name() : null;
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
        if (obj instanceof BsPathMapping) {
            BsPathMapping other = (BsPathMapping)obj;
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
        sb.append(dm).append(xfND(_regex));
        sb.append(dm).append(xfND(_replacement));
        sb.append(dm).append(xfND(_processType));
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
    public PathMapping clone() {
        return (PathMapping)super.clone();
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
     * [get] REGEX: {NotNull, VARCHAR(1000)} <br>
     * @return The value of the column 'REGEX'. (basically NotNull if selected: for the constraint)
     */
    public String getRegex() {
        checkSpecifiedProperty("regex");
        return _regex;
    }

    /**
     * [set] REGEX: {NotNull, VARCHAR(1000)} <br>
     * @param regex The value of the column 'REGEX'. (basically NotNull if update: for the constraint)
     */
    public void setRegex(String regex) {
        registerModifiedProperty("regex");
        _regex = regex;
    }

    /**
     * [get] REPLACEMENT: {NotNull, VARCHAR(1000)} <br>
     * @return The value of the column 'REPLACEMENT'. (basically NotNull if selected: for the constraint)
     */
    public String getReplacement() {
        checkSpecifiedProperty("replacement");
        return _replacement;
    }

    /**
     * [set] REPLACEMENT: {NotNull, VARCHAR(1000)} <br>
     * @param replacement The value of the column 'REPLACEMENT'. (basically NotNull if update: for the constraint)
     */
    public void setReplacement(String replacement) {
        registerModifiedProperty("replacement");
        _replacement = replacement;
    }

    /**
     * [get] PROCESS_TYPE: {NotNull, VARCHAR(1), classification=ProcessType} <br>
     * @return The value of the column 'PROCESS_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getProcessType() {
        checkSpecifiedProperty("processType");
        return _processType;
    }

    /**
     * [set] PROCESS_TYPE: {NotNull, VARCHAR(1), classification=ProcessType} <br>
     * @param processType The value of the column 'PROCESS_TYPE'. (basically NotNull if update: for the constraint)
     */
    protected void setProcessType(String processType) {
        checkClassificationCode("PROCESS_TYPE", CDef.DefMeta.ProcessType, processType);
        registerModifiedProperty("processType");
        _processType = processType;
    }

    /**
     * [get] SORT_ORDER: {NotNull, INTEGER(10)} <br>
     * @return The value of the column 'SORT_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSortOrder() {
        checkSpecifiedProperty("sortOrder");
        return _sortOrder;
    }

    /**
     * [set] SORT_ORDER: {NotNull, INTEGER(10)} <br>
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
     * [get] CREATED_TIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'CREATED_TIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getCreatedTime() {
        checkSpecifiedProperty("createdTime");
        return _createdTime;
    }

    /**
     * [set] CREATED_TIME: {NotNull, TIMESTAMP(23, 10)} <br>
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
     * [get] UPDATED_TIME: {TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'UPDATED_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getUpdatedTime() {
        checkSpecifiedProperty("updatedTime");
        return _updatedTime;
    }

    /**
     * [set] UPDATED_TIME: {TIMESTAMP(23, 10)} <br>
     * @param updatedTime The value of the column 'UPDATED_TIME'. (NullAllowed: null update allowed for no constraint)
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
     * [get] DELETED_TIME: {TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'DELETED_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getDeletedTime() {
        checkSpecifiedProperty("deletedTime");
        return _deletedTime;
    }

    /**
     * [set] DELETED_TIME: {TIMESTAMP(23, 10)} <br>
     * @param deletedTime The value of the column 'DELETED_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeletedTime(java.time.LocalDateTime deletedTime) {
        registerModifiedProperty("deletedTime");
        _deletedTime = deletedTime;
    }

    /**
     * [get] VERSION_NO: {NotNull, INTEGER(10)} <br>
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, INTEGER(10)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Integer versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param processType The value of the column 'PROCESS_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingProcessType(String processType) {
        setProcessType(processType);
    }
}
