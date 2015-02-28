package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of FILE_CRAWLING_CONFIG as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, NAME, PATHS, INCLUDED_PATHS, EXCLUDED_PATHS, INCLUDED_DOC_PATHS, EXCLUDED_DOC_PATHS, CONFIG_PARAMETER, DEPTH, MAX_ACCESS_COUNT, NUM_OF_THREAD, INTERVAL_TIME, BOOST, AVAILABLE, SORT_ORDER, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
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
 *     FILE_AUTHENTICATION, FILE_CONFIG_TO_LABEL_TYPE_MAPPING, FILE_CONFIG_TO_ROLE_TYPE_MAPPING
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     fileAuthenticationList, fileConfigToLabelTypeMappingList, fileConfigToRoleTypeMappingList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * String name = entity.getName();
 * String paths = entity.getPaths();
 * String includedPaths = entity.getIncludedPaths();
 * String excludedPaths = entity.getExcludedPaths();
 * String includedDocPaths = entity.getIncludedDocPaths();
 * String excludedDocPaths = entity.getExcludedDocPaths();
 * String configParameter = entity.getConfigParameter();
 * Integer depth = entity.getDepth();
 * Long maxAccessCount = entity.getMaxAccessCount();
 * Integer numOfThread = entity.getNumOfThread();
 * Integer intervalTime = entity.getIntervalTime();
 * java.math.BigDecimal boost = entity.getBoost();
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
 * entity.setPaths(paths);
 * entity.setIncludedPaths(includedPaths);
 * entity.setExcludedPaths(excludedPaths);
 * entity.setIncludedDocPaths(includedDocPaths);
 * entity.setExcludedDocPaths(excludedDocPaths);
 * entity.setConfigParameter(configParameter);
 * entity.setDepth(depth);
 * entity.setMaxAccessCount(maxAccessCount);
 * entity.setNumOfThread(numOfThread);
 * entity.setIntervalTime(intervalTime);
 * entity.setBoost(boost);
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
public abstract class BsFileCrawlingConfig extends AbstractEntity implements DomainEntity {

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

    /** NAME: {NotNull, VARCHAR(200)} */
    protected String _name;

    /** PATHS: {NotNull, TEXT(65535)} */
    protected String _paths;

    /** INCLUDED_PATHS: {TEXT(65535)} */
    protected String _includedPaths;

    /** EXCLUDED_PATHS: {TEXT(65535)} */
    protected String _excludedPaths;

    /** INCLUDED_DOC_PATHS: {TEXT(65535)} */
    protected String _includedDocPaths;

    /** EXCLUDED_DOC_PATHS: {TEXT(65535)} */
    protected String _excludedDocPaths;

    /** CONFIG_PARAMETER: {TEXT(65535)} */
    protected String _configParameter;

    /** DEPTH: {INT(10)} */
    protected Integer _depth;

    /** MAX_ACCESS_COUNT: {BIGINT(19)} */
    protected Long _maxAccessCount;

    /** NUM_OF_THREAD: {NotNull, INT(10)} */
    protected Integer _numOfThread;

    /** INTERVAL_TIME: {NotNull, INT(10)} */
    protected Integer _intervalTime;

    /** BOOST: {NotNull, FLOAT(12)} */
    protected java.math.BigDecimal _boost;

    /** AVAILABLE: {NotNull, VARCHAR(1)} */
    protected String _available;

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
        return "FILE_CRAWLING_CONFIG";
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
    /** FILE_AUTHENTICATION by FILE_CRAWLING_CONFIG_ID, named 'fileAuthenticationList'. */
    protected List<FileAuthentication> _fileAuthenticationList;

    /**
     * [get] FILE_AUTHENTICATION by FILE_CRAWLING_CONFIG_ID, named 'fileAuthenticationList'.
     * @return The entity list of referrer property 'fileAuthenticationList'. (NotNull: even if no loading, returns empty list)
     */
    public List<FileAuthentication> getFileAuthenticationList() {
        if (_fileAuthenticationList == null) { _fileAuthenticationList = newReferrerList(); }
        return _fileAuthenticationList;
    }

    /**
     * [set] FILE_AUTHENTICATION by FILE_CRAWLING_CONFIG_ID, named 'fileAuthenticationList'.
     * @param fileAuthenticationList The entity list of referrer property 'fileAuthenticationList'. (NullAllowed)
     */
    public void setFileAuthenticationList(List<FileAuthentication> fileAuthenticationList) {
        _fileAuthenticationList = fileAuthenticationList;
    }

    /** FILE_CONFIG_TO_LABEL_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToLabelTypeMappingList'. */
    protected List<FileConfigToLabelTypeMapping> _fileConfigToLabelTypeMappingList;

    /**
     * [get] FILE_CONFIG_TO_LABEL_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToLabelTypeMappingList'.
     * @return The entity list of referrer property 'fileConfigToLabelTypeMappingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<FileConfigToLabelTypeMapping> getFileConfigToLabelTypeMappingList() {
        if (_fileConfigToLabelTypeMappingList == null) { _fileConfigToLabelTypeMappingList = newReferrerList(); }
        return _fileConfigToLabelTypeMappingList;
    }

    /**
     * [set] FILE_CONFIG_TO_LABEL_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToLabelTypeMappingList'.
     * @param fileConfigToLabelTypeMappingList The entity list of referrer property 'fileConfigToLabelTypeMappingList'. (NullAllowed)
     */
    public void setFileConfigToLabelTypeMappingList(List<FileConfigToLabelTypeMapping> fileConfigToLabelTypeMappingList) {
        _fileConfigToLabelTypeMappingList = fileConfigToLabelTypeMappingList;
    }

    /** FILE_CONFIG_TO_ROLE_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToRoleTypeMappingList'. */
    protected List<FileConfigToRoleTypeMapping> _fileConfigToRoleTypeMappingList;

    /**
     * [get] FILE_CONFIG_TO_ROLE_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToRoleTypeMappingList'.
     * @return The entity list of referrer property 'fileConfigToRoleTypeMappingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<FileConfigToRoleTypeMapping> getFileConfigToRoleTypeMappingList() {
        if (_fileConfigToRoleTypeMappingList == null) { _fileConfigToRoleTypeMappingList = newReferrerList(); }
        return _fileConfigToRoleTypeMappingList;
    }

    /**
     * [set] FILE_CONFIG_TO_ROLE_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToRoleTypeMappingList'.
     * @param fileConfigToRoleTypeMappingList The entity list of referrer property 'fileConfigToRoleTypeMappingList'. (NullAllowed)
     */
    public void setFileConfigToRoleTypeMappingList(List<FileConfigToRoleTypeMapping> fileConfigToRoleTypeMappingList) {
        _fileConfigToRoleTypeMappingList = fileConfigToRoleTypeMappingList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsFileCrawlingConfig) {
            BsFileCrawlingConfig other = (BsFileCrawlingConfig)obj;
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
        StringBuilder sb = new StringBuilder();
        if (_fileAuthenticationList != null) { for (FileAuthentication et : _fileAuthenticationList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "fileAuthenticationList")); } } }
        if (_fileConfigToLabelTypeMappingList != null) { for (FileConfigToLabelTypeMapping et : _fileConfigToLabelTypeMappingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "fileConfigToLabelTypeMappingList")); } } }
        if (_fileConfigToRoleTypeMappingList != null) { for (FileConfigToRoleTypeMapping et : _fileConfigToRoleTypeMappingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "fileConfigToRoleTypeMappingList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_paths));
        sb.append(dm).append(xfND(_includedPaths));
        sb.append(dm).append(xfND(_excludedPaths));
        sb.append(dm).append(xfND(_includedDocPaths));
        sb.append(dm).append(xfND(_excludedDocPaths));
        sb.append(dm).append(xfND(_configParameter));
        sb.append(dm).append(xfND(_depth));
        sb.append(dm).append(xfND(_maxAccessCount));
        sb.append(dm).append(xfND(_numOfThread));
        sb.append(dm).append(xfND(_intervalTime));
        sb.append(dm).append(xfND(_boost));
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
        StringBuilder sb = new StringBuilder();
        if (_fileAuthenticationList != null && !_fileAuthenticationList.isEmpty())
        { sb.append(dm).append("fileAuthenticationList"); }
        if (_fileConfigToLabelTypeMappingList != null && !_fileConfigToLabelTypeMappingList.isEmpty())
        { sb.append(dm).append("fileConfigToLabelTypeMappingList"); }
        if (_fileConfigToRoleTypeMappingList != null && !_fileConfigToRoleTypeMappingList.isEmpty())
        { sb.append(dm).append("fileConfigToRoleTypeMappingList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public FileCrawlingConfig clone() {
        return (FileCrawlingConfig)super.clone();
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
     * [get] NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] NAME: {NotNull, VARCHAR(200)} <br>
     * @param name The value of the column 'NAME'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] PATHS: {NotNull, TEXT(65535)} <br>
     * @return The value of the column 'PATHS'. (basically NotNull if selected: for the constraint)
     */
    public String getPaths() {
        checkSpecifiedProperty("paths");
        return _paths;
    }

    /**
     * [set] PATHS: {NotNull, TEXT(65535)} <br>
     * @param paths The value of the column 'PATHS'. (basically NotNull if update: for the constraint)
     */
    public void setPaths(String paths) {
        registerModifiedProperty("paths");
        _paths = paths;
    }

    /**
     * [get] INCLUDED_PATHS: {TEXT(65535)} <br>
     * @return The value of the column 'INCLUDED_PATHS'. (NullAllowed even if selected: for no constraint)
     */
    public String getIncludedPaths() {
        checkSpecifiedProperty("includedPaths");
        return _includedPaths;
    }

    /**
     * [set] INCLUDED_PATHS: {TEXT(65535)} <br>
     * @param includedPaths The value of the column 'INCLUDED_PATHS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIncludedPaths(String includedPaths) {
        registerModifiedProperty("includedPaths");
        _includedPaths = includedPaths;
    }

    /**
     * [get] EXCLUDED_PATHS: {TEXT(65535)} <br>
     * @return The value of the column 'EXCLUDED_PATHS'. (NullAllowed even if selected: for no constraint)
     */
    public String getExcludedPaths() {
        checkSpecifiedProperty("excludedPaths");
        return _excludedPaths;
    }

    /**
     * [set] EXCLUDED_PATHS: {TEXT(65535)} <br>
     * @param excludedPaths The value of the column 'EXCLUDED_PATHS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExcludedPaths(String excludedPaths) {
        registerModifiedProperty("excludedPaths");
        _excludedPaths = excludedPaths;
    }

    /**
     * [get] INCLUDED_DOC_PATHS: {TEXT(65535)} <br>
     * @return The value of the column 'INCLUDED_DOC_PATHS'. (NullAllowed even if selected: for no constraint)
     */
    public String getIncludedDocPaths() {
        checkSpecifiedProperty("includedDocPaths");
        return _includedDocPaths;
    }

    /**
     * [set] INCLUDED_DOC_PATHS: {TEXT(65535)} <br>
     * @param includedDocPaths The value of the column 'INCLUDED_DOC_PATHS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIncludedDocPaths(String includedDocPaths) {
        registerModifiedProperty("includedDocPaths");
        _includedDocPaths = includedDocPaths;
    }

    /**
     * [get] EXCLUDED_DOC_PATHS: {TEXT(65535)} <br>
     * @return The value of the column 'EXCLUDED_DOC_PATHS'. (NullAllowed even if selected: for no constraint)
     */
    public String getExcludedDocPaths() {
        checkSpecifiedProperty("excludedDocPaths");
        return _excludedDocPaths;
    }

    /**
     * [set] EXCLUDED_DOC_PATHS: {TEXT(65535)} <br>
     * @param excludedDocPaths The value of the column 'EXCLUDED_DOC_PATHS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExcludedDocPaths(String excludedDocPaths) {
        registerModifiedProperty("excludedDocPaths");
        _excludedDocPaths = excludedDocPaths;
    }

    /**
     * [get] CONFIG_PARAMETER: {TEXT(65535)} <br>
     * @return The value of the column 'CONFIG_PARAMETER'. (NullAllowed even if selected: for no constraint)
     */
    public String getConfigParameter() {
        checkSpecifiedProperty("configParameter");
        return _configParameter;
    }

    /**
     * [set] CONFIG_PARAMETER: {TEXT(65535)} <br>
     * @param configParameter The value of the column 'CONFIG_PARAMETER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setConfigParameter(String configParameter) {
        registerModifiedProperty("configParameter");
        _configParameter = configParameter;
    }

    /**
     * [get] DEPTH: {INT(10)} <br>
     * @return The value of the column 'DEPTH'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDepth() {
        checkSpecifiedProperty("depth");
        return _depth;
    }

    /**
     * [set] DEPTH: {INT(10)} <br>
     * @param depth The value of the column 'DEPTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepth(Integer depth) {
        registerModifiedProperty("depth");
        _depth = depth;
    }

    /**
     * [get] MAX_ACCESS_COUNT: {BIGINT(19)} <br>
     * @return The value of the column 'MAX_ACCESS_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMaxAccessCount() {
        checkSpecifiedProperty("maxAccessCount");
        return _maxAccessCount;
    }

    /**
     * [set] MAX_ACCESS_COUNT: {BIGINT(19)} <br>
     * @param maxAccessCount The value of the column 'MAX_ACCESS_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxAccessCount(Long maxAccessCount) {
        registerModifiedProperty("maxAccessCount");
        _maxAccessCount = maxAccessCount;
    }

    /**
     * [get] NUM_OF_THREAD: {NotNull, INT(10)} <br>
     * @return The value of the column 'NUM_OF_THREAD'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNumOfThread() {
        checkSpecifiedProperty("numOfThread");
        return _numOfThread;
    }

    /**
     * [set] NUM_OF_THREAD: {NotNull, INT(10)} <br>
     * @param numOfThread The value of the column 'NUM_OF_THREAD'. (basically NotNull if update: for the constraint)
     */
    public void setNumOfThread(Integer numOfThread) {
        registerModifiedProperty("numOfThread");
        _numOfThread = numOfThread;
    }

    /**
     * [get] INTERVAL_TIME: {NotNull, INT(10)} <br>
     * @return The value of the column 'INTERVAL_TIME'. (basically NotNull if selected: for the constraint)
     */
    public Integer getIntervalTime() {
        checkSpecifiedProperty("intervalTime");
        return _intervalTime;
    }

    /**
     * [set] INTERVAL_TIME: {NotNull, INT(10)} <br>
     * @param intervalTime The value of the column 'INTERVAL_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setIntervalTime(Integer intervalTime) {
        registerModifiedProperty("intervalTime");
        _intervalTime = intervalTime;
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
