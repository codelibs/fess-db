package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of JOB_LOG as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, JOB_NAME, JOB_STATUS, TARGET, SCRIPT_TYPE, SCRIPT_DATA, SCRIPT_RESULT, START_TIME, END_TIME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     ID
 * 
 * [version-no]
 *     
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
 * String jobName = entity.getJobName();
 * String jobStatus = entity.getJobStatus();
 * String target = entity.getTarget();
 * String scriptType = entity.getScriptType();
 * String scriptData = entity.getScriptData();
 * String scriptResult = entity.getScriptResult();
 * java.time.LocalDateTime startTime = entity.getStartTime();
 * java.time.LocalDateTime endTime = entity.getEndTime();
 * entity.setId(id);
 * entity.setJobName(jobName);
 * entity.setJobStatus(jobStatus);
 * entity.setTarget(target);
 * entity.setScriptType(scriptType);
 * entity.setScriptData(scriptData);
 * entity.setScriptResult(scriptResult);
 * entity.setStartTime(startTime);
 * entity.setEndTime(endTime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsJobLog extends AbstractEntity implements DomainEntity {

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

    /** JOB_NAME: {NotNull, VARCHAR(100)} */
    protected String _jobName;

    /** JOB_STATUS: {NotNull, VARCHAR(10)} */
    protected String _jobStatus;

    /** TARGET: {NotNull, VARCHAR(100)} */
    protected String _target;

    /** SCRIPT_TYPE: {NotNull, VARCHAR(100)} */
    protected String _scriptType;

    /** SCRIPT_DATA: {TEXT(65535)} */
    protected String _scriptData;

    /** SCRIPT_RESULT: {TEXT(65535)} */
    protected String _scriptResult;

    /** START_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} */
    protected java.time.LocalDateTime _startTime;

    /** END_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]} */
    protected java.time.LocalDateTime _endTime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "JOB_LOG";
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
        if (obj instanceof BsJobLog) {
            BsJobLog other = (BsJobLog)obj;
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
        sb.append(dm).append(xfND(_jobName));
        sb.append(dm).append(xfND(_jobStatus));
        sb.append(dm).append(xfND(_target));
        sb.append(dm).append(xfND(_scriptType));
        sb.append(dm).append(xfND(_scriptData));
        sb.append(dm).append(xfND(_scriptResult));
        sb.append(dm).append(xfND(_startTime));
        sb.append(dm).append(xfND(_endTime));
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
    public JobLog clone() {
        return (JobLog)super.clone();
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
     * [get] JOB_NAME: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'JOB_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getJobName() {
        checkSpecifiedProperty("jobName");
        return _jobName;
    }

    /**
     * [set] JOB_NAME: {NotNull, VARCHAR(100)} <br>
     * @param jobName The value of the column 'JOB_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setJobName(String jobName) {
        registerModifiedProperty("jobName");
        _jobName = jobName;
    }

    /**
     * [get] JOB_STATUS: {NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'JOB_STATUS'. (basically NotNull if selected: for the constraint)
     */
    public String getJobStatus() {
        checkSpecifiedProperty("jobStatus");
        return _jobStatus;
    }

    /**
     * [set] JOB_STATUS: {NotNull, VARCHAR(10)} <br>
     * @param jobStatus The value of the column 'JOB_STATUS'. (basically NotNull if update: for the constraint)
     */
    public void setJobStatus(String jobStatus) {
        registerModifiedProperty("jobStatus");
        _jobStatus = jobStatus;
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
     * [get] SCRIPT_DATA: {TEXT(65535)} <br>
     * @return The value of the column 'SCRIPT_DATA'. (NullAllowed even if selected: for no constraint)
     */
    public String getScriptData() {
        checkSpecifiedProperty("scriptData");
        return _scriptData;
    }

    /**
     * [set] SCRIPT_DATA: {TEXT(65535)} <br>
     * @param scriptData The value of the column 'SCRIPT_DATA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setScriptData(String scriptData) {
        registerModifiedProperty("scriptData");
        _scriptData = scriptData;
    }

    /**
     * [get] SCRIPT_RESULT: {TEXT(65535)} <br>
     * @return The value of the column 'SCRIPT_RESULT'. (NullAllowed even if selected: for no constraint)
     */
    public String getScriptResult() {
        checkSpecifiedProperty("scriptResult");
        return _scriptResult;
    }

    /**
     * [set] SCRIPT_RESULT: {TEXT(65535)} <br>
     * @param scriptResult The value of the column 'SCRIPT_RESULT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setScriptResult(String scriptResult) {
        registerModifiedProperty("scriptResult");
        _scriptResult = scriptResult;
    }

    /**
     * [get] START_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * @return The value of the column 'START_TIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getStartTime() {
        checkSpecifiedProperty("startTime");
        return _startTime;
    }

    /**
     * [set] START_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * @param startTime The value of the column 'START_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setStartTime(java.time.LocalDateTime startTime) {
        registerModifiedProperty("startTime");
        _startTime = startTime;
    }

    /**
     * [get] END_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]} <br>
     * @return The value of the column 'END_TIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getEndTime() {
        checkSpecifiedProperty("endTime");
        return _endTime;
    }

    /**
     * [set] END_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]} <br>
     * @param endTime The value of the column 'END_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setEndTime(java.time.LocalDateTime endTime) {
        registerModifiedProperty("endTime");
        _endTime = endTime;
    }
}
