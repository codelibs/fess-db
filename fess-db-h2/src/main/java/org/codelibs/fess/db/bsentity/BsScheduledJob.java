package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of SCHEDULED_JOB as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, NAME, TARGET, CRON_EXPRESSION, SCRIPT_TYPE, SCRIPT_DATA, CRAWLER, JOB_LOGGING, AVAILABLE, SORT_ORDER, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
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
 * String name = entity.getName();
 * String target = entity.getTarget();
 * String cronExpression = entity.getCronExpression();
 * String scriptType = entity.getScriptType();
 * String scriptData = entity.getScriptData();
 * String crawler = entity.getCrawler();
 * String jobLogging = entity.getJobLogging();
 * String available = entity.getAvailable();
 * Integer sortOrder = entity.getSortOrder();
 * String createdBy = entity.getCreatedBy();
 * java.time.LocalDateTime createdTime = entity.getCreatedTime();
 * String updatedBy = entity.getUpdatedBy();
 * java.time.LocalDateTime updatedTime = entity.getUpdatedTime();
 * String deletedBy = entity.getDeletedBy();
 * java.time.LocalDateTime deletedTime = entity.getDeletedTime();
 * Integer versionNo = entity.getVersionNo();
 * entity.setId(id);
 * entity.setName(name);
 * entity.setTarget(target);
 * entity.setCronExpression(cronExpression);
 * entity.setScriptType(scriptType);
 * entity.setScriptData(scriptData);
 * entity.setCrawler(crawler);
 * entity.setJobLogging(jobLogging);
 * entity.setAvailable(available);
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
public abstract class BsScheduledJob extends AbstractEntity implements DomainEntity {

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

    /** NAME: {NotNull, VARCHAR(100)} */
    protected String _name;

    /** TARGET: {NotNull, VARCHAR(100)} */
    protected String _target;

    /** CRON_EXPRESSION: {NotNull, VARCHAR(100)} */
    protected String _cronExpression;

    /** SCRIPT_TYPE: {NotNull, VARCHAR(100)} */
    protected String _scriptType;

    /** SCRIPT_DATA: {VARCHAR(4000)} */
    protected String _scriptData;

    /** CRAWLER: {NotNull, VARCHAR(1)} */
    protected String _crawler;

    /** JOB_LOGGING: {NotNull, VARCHAR(1)} */
    protected String _jobLogging;

    /** AVAILABLE: {NotNull, VARCHAR(1)} */
    protected String _available;

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
        return "SCHEDULED_JOB";
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
        if (obj instanceof BsScheduledJob) {
            BsScheduledJob other = (BsScheduledJob)obj;
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
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_target));
        sb.append(dm).append(xfND(_cronExpression));
        sb.append(dm).append(xfND(_scriptType));
        sb.append(dm).append(xfND(_scriptData));
        sb.append(dm).append(xfND(_crawler));
        sb.append(dm).append(xfND(_jobLogging));
        sb.append(dm).append(xfND(_available));
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
    public ScheduledJob clone() {
        return (ScheduledJob)super.clone();
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
     * [get] NAME: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] NAME: {NotNull, VARCHAR(100)} <br>
     * @param name The value of the column 'NAME'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] TARGET: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'TARGET'. (basically NotNull if selected: for the constraint)
     */
    public String getTarget() {
        checkSpecifiedProperty("target");
        return _target;
    }

    /**
     * [set] TARGET: {NotNull, VARCHAR(100)} <br>
     * @param target The value of the column 'TARGET'. (basically NotNull if update: for the constraint)
     */
    public void setTarget(String target) {
        registerModifiedProperty("target");
        _target = target;
    }

    /**
     * [get] CRON_EXPRESSION: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'CRON_EXPRESSION'. (basically NotNull if selected: for the constraint)
     */
    public String getCronExpression() {
        checkSpecifiedProperty("cronExpression");
        return _cronExpression;
    }

    /**
     * [set] CRON_EXPRESSION: {NotNull, VARCHAR(100)} <br>
     * @param cronExpression The value of the column 'CRON_EXPRESSION'. (basically NotNull if update: for the constraint)
     */
    public void setCronExpression(String cronExpression) {
        registerModifiedProperty("cronExpression");
        _cronExpression = cronExpression;
    }

    /**
     * [get] SCRIPT_TYPE: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'SCRIPT_TYPE'. (basically NotNull if selected: for the constraint)
     */
    public String getScriptType() {
        checkSpecifiedProperty("scriptType");
        return _scriptType;
    }

    /**
     * [set] SCRIPT_TYPE: {NotNull, VARCHAR(100)} <br>
     * @param scriptType The value of the column 'SCRIPT_TYPE'. (basically NotNull if update: for the constraint)
     */
    public void setScriptType(String scriptType) {
        registerModifiedProperty("scriptType");
        _scriptType = scriptType;
    }

    /**
     * [get] SCRIPT_DATA: {VARCHAR(4000)} <br>
     * @return The value of the column 'SCRIPT_DATA'. (NullAllowed even if selected: for no constraint)
     */
    public String getScriptData() {
        checkSpecifiedProperty("scriptData");
        return _scriptData;
    }

    /**
     * [set] SCRIPT_DATA: {VARCHAR(4000)} <br>
     * @param scriptData The value of the column 'SCRIPT_DATA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setScriptData(String scriptData) {
        registerModifiedProperty("scriptData");
        _scriptData = scriptData;
    }

    /**
     * [get] CRAWLER: {NotNull, VARCHAR(1)} <br>
     * @return The value of the column 'CRAWLER'. (basically NotNull if selected: for the constraint)
     */
    public String getCrawler() {
        checkSpecifiedProperty("crawler");
        return _crawler;
    }

    /**
     * [set] CRAWLER: {NotNull, VARCHAR(1)} <br>
     * @param crawler The value of the column 'CRAWLER'. (basically NotNull if update: for the constraint)
     */
    public void setCrawler(String crawler) {
        registerModifiedProperty("crawler");
        _crawler = crawler;
    }

    /**
     * [get] JOB_LOGGING: {NotNull, VARCHAR(1)} <br>
     * @return The value of the column 'JOB_LOGGING'. (basically NotNull if selected: for the constraint)
     */
    public String getJobLogging() {
        checkSpecifiedProperty("jobLogging");
        return _jobLogging;
    }

    /**
     * [set] JOB_LOGGING: {NotNull, VARCHAR(1)} <br>
     * @param jobLogging The value of the column 'JOB_LOGGING'. (basically NotNull if update: for the constraint)
     */
    public void setJobLogging(String jobLogging) {
        registerModifiedProperty("jobLogging");
        _jobLogging = jobLogging;
    }

    /**
     * [get] AVAILABLE: {NotNull, VARCHAR(1)} <br>
     * @return The value of the column 'AVAILABLE'. (basically NotNull if selected: for the constraint)
     */
    public String getAvailable() {
        checkSpecifiedProperty("available");
        return _available;
    }

    /**
     * [set] AVAILABLE: {NotNull, VARCHAR(1)} <br>
     * @param available The value of the column 'AVAILABLE'. (basically NotNull if update: for the constraint)
     */
    public void setAvailable(String available) {
        registerModifiedProperty("available");
        _available = available;
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
}
