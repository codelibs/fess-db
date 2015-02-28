package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of DATA_CRAWLING_CONFIG as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, NAME, HANDLER_NAME, HANDLER_PARAMETER, HANDLER_SCRIPT, BOOST, AVAILABLE, SORT_ORDER, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
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
 *     DATA_CONFIG_TO_LABEL_TYPE_MAPPING, DATA_CONFIG_TO_ROLE_TYPE_MAPPING
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     dataConfigToLabelTypeMappingList, dataConfigToRoleTypeMappingList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * String name = entity.getName();
 * String handlerName = entity.getHandlerName();
 * String handlerParameter = entity.getHandlerParameter();
 * String handlerScript = entity.getHandlerScript();
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
 * entity.setHandlerName(handlerName);
 * entity.setHandlerParameter(handlerParameter);
 * entity.setHandlerScript(handlerScript);
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
public abstract class BsDataCrawlingConfig extends AbstractEntity implements DomainEntity {

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

    /** HANDLER_NAME: {NotNull, VARCHAR(200)} */
    protected String _handlerName;

    /** HANDLER_PARAMETER: {TEXT(65535)} */
    protected String _handlerParameter;

    /** HANDLER_SCRIPT: {TEXT(65535)} */
    protected String _handlerScript;

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
        return "DATA_CRAWLING_CONFIG";
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
    /** DATA_CONFIG_TO_LABEL_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToLabelTypeMappingList'. */
    protected List<DataConfigToLabelTypeMapping> _dataConfigToLabelTypeMappingList;

    /**
     * [get] DATA_CONFIG_TO_LABEL_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToLabelTypeMappingList'.
     * @return The entity list of referrer property 'dataConfigToLabelTypeMappingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DataConfigToLabelTypeMapping> getDataConfigToLabelTypeMappingList() {
        if (_dataConfigToLabelTypeMappingList == null) { _dataConfigToLabelTypeMappingList = newReferrerList(); }
        return _dataConfigToLabelTypeMappingList;
    }

    /**
     * [set] DATA_CONFIG_TO_LABEL_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToLabelTypeMappingList'.
     * @param dataConfigToLabelTypeMappingList The entity list of referrer property 'dataConfigToLabelTypeMappingList'. (NullAllowed)
     */
    public void setDataConfigToLabelTypeMappingList(List<DataConfigToLabelTypeMapping> dataConfigToLabelTypeMappingList) {
        _dataConfigToLabelTypeMappingList = dataConfigToLabelTypeMappingList;
    }

    /** DATA_CONFIG_TO_ROLE_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToRoleTypeMappingList'. */
    protected List<DataConfigToRoleTypeMapping> _dataConfigToRoleTypeMappingList;

    /**
     * [get] DATA_CONFIG_TO_ROLE_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToRoleTypeMappingList'.
     * @return The entity list of referrer property 'dataConfigToRoleTypeMappingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DataConfigToRoleTypeMapping> getDataConfigToRoleTypeMappingList() {
        if (_dataConfigToRoleTypeMappingList == null) { _dataConfigToRoleTypeMappingList = newReferrerList(); }
        return _dataConfigToRoleTypeMappingList;
    }

    /**
     * [set] DATA_CONFIG_TO_ROLE_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToRoleTypeMappingList'.
     * @param dataConfigToRoleTypeMappingList The entity list of referrer property 'dataConfigToRoleTypeMappingList'. (NullAllowed)
     */
    public void setDataConfigToRoleTypeMappingList(List<DataConfigToRoleTypeMapping> dataConfigToRoleTypeMappingList) {
        _dataConfigToRoleTypeMappingList = dataConfigToRoleTypeMappingList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsDataCrawlingConfig) {
            BsDataCrawlingConfig other = (BsDataCrawlingConfig)obj;
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
        if (_dataConfigToRoleTypeMappingList != null) { for (DataConfigToRoleTypeMapping et : _dataConfigToRoleTypeMappingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "dataConfigToRoleTypeMappingList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_handlerName));
        sb.append(dm).append(xfND(_handlerParameter));
        sb.append(dm).append(xfND(_handlerScript));
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
        if (_dataConfigToLabelTypeMappingList != null && !_dataConfigToLabelTypeMappingList.isEmpty())
        { sb.append(dm).append("dataConfigToLabelTypeMappingList"); }
        if (_dataConfigToRoleTypeMappingList != null && !_dataConfigToRoleTypeMappingList.isEmpty())
        { sb.append(dm).append("dataConfigToRoleTypeMappingList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DataCrawlingConfig clone() {
        return (DataCrawlingConfig)super.clone();
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
     * [get] HANDLER_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'HANDLER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getHandlerName() {
        checkSpecifiedProperty("handlerName");
        return _handlerName;
    }

    /**
     * [set] HANDLER_NAME: {NotNull, VARCHAR(200)} <br>
     * @param handlerName The value of the column 'HANDLER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setHandlerName(String handlerName) {
        registerModifiedProperty("handlerName");
        _handlerName = handlerName;
    }

    /**
     * [get] HANDLER_PARAMETER: {TEXT(65535)} <br>
     * @return The value of the column 'HANDLER_PARAMETER'. (NullAllowed even if selected: for no constraint)
     */
    public String getHandlerParameter() {
        checkSpecifiedProperty("handlerParameter");
        return _handlerParameter;
    }

    /**
     * [set] HANDLER_PARAMETER: {TEXT(65535)} <br>
     * @param handlerParameter The value of the column 'HANDLER_PARAMETER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHandlerParameter(String handlerParameter) {
        registerModifiedProperty("handlerParameter");
        _handlerParameter = handlerParameter;
    }

    /**
     * [get] HANDLER_SCRIPT: {TEXT(65535)} <br>
     * @return The value of the column 'HANDLER_SCRIPT'. (NullAllowed even if selected: for no constraint)
     */
    public String getHandlerScript() {
        checkSpecifiedProperty("handlerScript");
        return _handlerScript;
    }

    /**
     * [set] HANDLER_SCRIPT: {TEXT(65535)} <br>
     * @param handlerScript The value of the column 'HANDLER_SCRIPT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHandlerScript(String handlerScript) {
        registerModifiedProperty("handlerScript");
        _handlerScript = handlerScript;
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
