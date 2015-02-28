package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of LABEL_TYPE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, NAME, VALUE, INCLUDED_PATHS, EXCLUDED_PATHS, SORT_ORDER, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
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
 *     DATA_CONFIG_TO_LABEL_TYPE_MAPPING, FILE_CONFIG_TO_LABEL_TYPE_MAPPING, LABEL_TYPE_TO_ROLE_TYPE_MAPPING, WEB_CONFIG_TO_LABEL_TYPE_MAPPING
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     dataConfigToLabelTypeMappingList, fileConfigToLabelTypeMappingList, labelTypeToRoleTypeMappingList, webConfigToLabelTypeMappingList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * String name = entity.getName();
 * String value = entity.getValue();
 * String includedPaths = entity.getIncludedPaths();
 * String excludedPaths = entity.getExcludedPaths();
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
 * entity.setValue(value);
 * entity.setIncludedPaths(includedPaths);
 * entity.setExcludedPaths(excludedPaths);
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
public abstract class BsLabelType extends AbstractEntity implements DomainEntity {

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

    /** VALUE: {NotNull, VARCHAR(20)} */
    protected String _value;

    /** INCLUDED_PATHS: {VARCHAR(4000)} */
    protected String _includedPaths;

    /** EXCLUDED_PATHS: {VARCHAR(4000)} */
    protected String _excludedPaths;

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
        return "LABEL_TYPE";
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
    /** DATA_CONFIG_TO_LABEL_TYPE_MAPPING by LABEL_TYPE_ID, named 'dataConfigToLabelTypeMappingList'. */
    protected List<DataConfigToLabelTypeMapping> _dataConfigToLabelTypeMappingList;

    /**
     * [get] DATA_CONFIG_TO_LABEL_TYPE_MAPPING by LABEL_TYPE_ID, named 'dataConfigToLabelTypeMappingList'.
     * @return The entity list of referrer property 'dataConfigToLabelTypeMappingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DataConfigToLabelTypeMapping> getDataConfigToLabelTypeMappingList() {
        if (_dataConfigToLabelTypeMappingList == null) { _dataConfigToLabelTypeMappingList = newReferrerList(); }
        return _dataConfigToLabelTypeMappingList;
    }

    /**
     * [set] DATA_CONFIG_TO_LABEL_TYPE_MAPPING by LABEL_TYPE_ID, named 'dataConfigToLabelTypeMappingList'.
     * @param dataConfigToLabelTypeMappingList The entity list of referrer property 'dataConfigToLabelTypeMappingList'. (NullAllowed)
     */
    public void setDataConfigToLabelTypeMappingList(List<DataConfigToLabelTypeMapping> dataConfigToLabelTypeMappingList) {
        _dataConfigToLabelTypeMappingList = dataConfigToLabelTypeMappingList;
    }

    /** FILE_CONFIG_TO_LABEL_TYPE_MAPPING by LABEL_TYPE_ID, named 'fileConfigToLabelTypeMappingList'. */
    protected List<FileConfigToLabelTypeMapping> _fileConfigToLabelTypeMappingList;

    /**
     * [get] FILE_CONFIG_TO_LABEL_TYPE_MAPPING by LABEL_TYPE_ID, named 'fileConfigToLabelTypeMappingList'.
     * @return The entity list of referrer property 'fileConfigToLabelTypeMappingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<FileConfigToLabelTypeMapping> getFileConfigToLabelTypeMappingList() {
        if (_fileConfigToLabelTypeMappingList == null) { _fileConfigToLabelTypeMappingList = newReferrerList(); }
        return _fileConfigToLabelTypeMappingList;
    }

    /**
     * [set] FILE_CONFIG_TO_LABEL_TYPE_MAPPING by LABEL_TYPE_ID, named 'fileConfigToLabelTypeMappingList'.
     * @param fileConfigToLabelTypeMappingList The entity list of referrer property 'fileConfigToLabelTypeMappingList'. (NullAllowed)
     */
    public void setFileConfigToLabelTypeMappingList(List<FileConfigToLabelTypeMapping> fileConfigToLabelTypeMappingList) {
        _fileConfigToLabelTypeMappingList = fileConfigToLabelTypeMappingList;
    }

    /** LABEL_TYPE_TO_ROLE_TYPE_MAPPING by LABEL_TYPE_ID, named 'labelTypeToRoleTypeMappingList'. */
    protected List<LabelTypeToRoleTypeMapping> _labelTypeToRoleTypeMappingList;

    /**
     * [get] LABEL_TYPE_TO_ROLE_TYPE_MAPPING by LABEL_TYPE_ID, named 'labelTypeToRoleTypeMappingList'.
     * @return The entity list of referrer property 'labelTypeToRoleTypeMappingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LabelTypeToRoleTypeMapping> getLabelTypeToRoleTypeMappingList() {
        if (_labelTypeToRoleTypeMappingList == null) { _labelTypeToRoleTypeMappingList = newReferrerList(); }
        return _labelTypeToRoleTypeMappingList;
    }

    /**
     * [set] LABEL_TYPE_TO_ROLE_TYPE_MAPPING by LABEL_TYPE_ID, named 'labelTypeToRoleTypeMappingList'.
     * @param labelTypeToRoleTypeMappingList The entity list of referrer property 'labelTypeToRoleTypeMappingList'. (NullAllowed)
     */
    public void setLabelTypeToRoleTypeMappingList(List<LabelTypeToRoleTypeMapping> labelTypeToRoleTypeMappingList) {
        _labelTypeToRoleTypeMappingList = labelTypeToRoleTypeMappingList;
    }

    /** WEB_CONFIG_TO_LABEL_TYPE_MAPPING by LABEL_TYPE_ID, named 'webConfigToLabelTypeMappingList'. */
    protected List<WebConfigToLabelTypeMapping> _webConfigToLabelTypeMappingList;

    /**
     * [get] WEB_CONFIG_TO_LABEL_TYPE_MAPPING by LABEL_TYPE_ID, named 'webConfigToLabelTypeMappingList'.
     * @return The entity list of referrer property 'webConfigToLabelTypeMappingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WebConfigToLabelTypeMapping> getWebConfigToLabelTypeMappingList() {
        if (_webConfigToLabelTypeMappingList == null) { _webConfigToLabelTypeMappingList = newReferrerList(); }
        return _webConfigToLabelTypeMappingList;
    }

    /**
     * [set] WEB_CONFIG_TO_LABEL_TYPE_MAPPING by LABEL_TYPE_ID, named 'webConfigToLabelTypeMappingList'.
     * @param webConfigToLabelTypeMappingList The entity list of referrer property 'webConfigToLabelTypeMappingList'. (NullAllowed)
     */
    public void setWebConfigToLabelTypeMappingList(List<WebConfigToLabelTypeMapping> webConfigToLabelTypeMappingList) {
        _webConfigToLabelTypeMappingList = webConfigToLabelTypeMappingList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsLabelType) {
            BsLabelType other = (BsLabelType)obj;
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
        if (_dataConfigToLabelTypeMappingList != null) { for (DataConfigToLabelTypeMapping et : _dataConfigToLabelTypeMappingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "dataConfigToLabelTypeMappingList")); } } }
        if (_fileConfigToLabelTypeMappingList != null) { for (FileConfigToLabelTypeMapping et : _fileConfigToLabelTypeMappingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "fileConfigToLabelTypeMappingList")); } } }
        if (_labelTypeToRoleTypeMappingList != null) { for (LabelTypeToRoleTypeMapping et : _labelTypeToRoleTypeMappingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "labelTypeToRoleTypeMappingList")); } } }
        if (_webConfigToLabelTypeMappingList != null) { for (WebConfigToLabelTypeMapping et : _webConfigToLabelTypeMappingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "webConfigToLabelTypeMappingList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_value));
        sb.append(dm).append(xfND(_includedPaths));
        sb.append(dm).append(xfND(_excludedPaths));
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
        if (_dataConfigToLabelTypeMappingList != null && !_dataConfigToLabelTypeMappingList.isEmpty())
        { sb.append(dm).append("dataConfigToLabelTypeMappingList"); }
        if (_fileConfigToLabelTypeMappingList != null && !_fileConfigToLabelTypeMappingList.isEmpty())
        { sb.append(dm).append("fileConfigToLabelTypeMappingList"); }
        if (_labelTypeToRoleTypeMappingList != null && !_labelTypeToRoleTypeMappingList.isEmpty())
        { sb.append(dm).append("labelTypeToRoleTypeMappingList"); }
        if (_webConfigToLabelTypeMappingList != null && !_webConfigToLabelTypeMappingList.isEmpty())
        { sb.append(dm).append("webConfigToLabelTypeMappingList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LabelType clone() {
        return (LabelType)super.clone();
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
     * [get] VALUE: {NotNull, VARCHAR(20)} <br>
     * @return The value of the column 'VALUE'. (basically NotNull if selected: for the constraint)
     */
    public String getValue() {
        checkSpecifiedProperty("value");
        return _value;
    }

    /**
     * [set] VALUE: {NotNull, VARCHAR(20)} <br>
     * @param value The value of the column 'VALUE'. (basically NotNull if update: for the constraint)
     */
    public void setValue(String value) {
        registerModifiedProperty("value");
        _value = value;
    }

    /**
     * [get] INCLUDED_PATHS: {VARCHAR(4000)} <br>
     * @return The value of the column 'INCLUDED_PATHS'. (NullAllowed even if selected: for no constraint)
     */
    public String getIncludedPaths() {
        checkSpecifiedProperty("includedPaths");
        return _includedPaths;
    }

    /**
     * [set] INCLUDED_PATHS: {VARCHAR(4000)} <br>
     * @param includedPaths The value of the column 'INCLUDED_PATHS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIncludedPaths(String includedPaths) {
        registerModifiedProperty("includedPaths");
        _includedPaths = includedPaths;
    }

    /**
     * [get] EXCLUDED_PATHS: {VARCHAR(4000)} <br>
     * @return The value of the column 'EXCLUDED_PATHS'. (NullAllowed even if selected: for no constraint)
     */
    public String getExcludedPaths() {
        checkSpecifiedProperty("excludedPaths");
        return _excludedPaths;
    }

    /**
     * [set] EXCLUDED_PATHS: {VARCHAR(4000)} <br>
     * @param excludedPaths The value of the column 'EXCLUDED_PATHS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExcludedPaths(String excludedPaths) {
        registerModifiedProperty("excludedPaths");
        _excludedPaths = excludedPaths;
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
