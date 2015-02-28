package org.codelibs.fess.db.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.codelibs.fess.db.allcommon.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The DB meta of ROLE_TYPE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class RoleTypeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final RoleTypeDbm _instance = new RoleTypeDbm();
    private RoleTypeDbm() {}
    public static RoleTypeDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((RoleType)et).getId(), (et, vl) -> ((RoleType)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((RoleType)et).getName(), (et, vl) -> ((RoleType)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((RoleType)et).getValue(), (et, vl) -> ((RoleType)et).setValue((String)vl), "value");
        setupEpg(_epgMap, et -> ((RoleType)et).getSortOrder(), (et, vl) -> ((RoleType)et).setSortOrder(cti(vl)), "sortOrder");
        setupEpg(_epgMap, et -> ((RoleType)et).getCreatedBy(), (et, vl) -> ((RoleType)et).setCreatedBy((String)vl), "createdBy");
        setupEpg(_epgMap, et -> ((RoleType)et).getCreatedTime(), (et, vl) -> ((RoleType)et).setCreatedTime(ctldt(vl)), "createdTime");
        setupEpg(_epgMap, et -> ((RoleType)et).getUpdatedBy(), (et, vl) -> ((RoleType)et).setUpdatedBy((String)vl), "updatedBy");
        setupEpg(_epgMap, et -> ((RoleType)et).getUpdatedTime(), (et, vl) -> ((RoleType)et).setUpdatedTime(ctldt(vl)), "updatedTime");
        setupEpg(_epgMap, et -> ((RoleType)et).getDeletedBy(), (et, vl) -> ((RoleType)et).setDeletedBy((String)vl), "deletedBy");
        setupEpg(_epgMap, et -> ((RoleType)et).getDeletedTime(), (et, vl) -> ((RoleType)et).setDeletedTime(ctldt(vl)), "deletedTime");
        setupEpg(_epgMap, et -> ((RoleType)et).getVersionNo(), (et, vl) -> ((RoleType)et).setVersionNo(cti(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "ROLE_TYPE";
    protected final String _tableDispName = "ROLE_TYPE";
    protected final String _tablePropertyName = "roleType";
    protected final TableSqlName _tableSqlName = new TableSqlName("ROLE_TYPE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, "dataConfigToRoleTypeMappingList,fileConfigToRoleTypeMappingList,labelTypeToRoleTypeMappingList,webConfigToRoleTypeMappingList", null, false);
    protected final ColumnInfo _columnName = cci("NAME", "NAME", null, null, String.class, "name", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnValue = cci("VALUE", "VALUE", null, null, String.class, "value", null, false, false, true, "VARCHAR", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortOrder = cci("SORT_ORDER", "SORT_ORDER", null, null, Integer.class, "sortOrder", null, false, false, true, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedBy = cci("CREATED_BY", "CREATED_BY", null, null, String.class, "createdBy", null, false, false, true, "VARCHAR", 255, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedTime = cci("CREATED_TIME", "CREATED_TIME", null, null, java.time.LocalDateTime.class, "createdTime", null, false, false, true, "TIMESTAMP", 19, 0, "CURRENT_TIMESTAMP", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdatedBy = cci("UPDATED_BY", "UPDATED_BY", null, null, String.class, "updatedBy", null, false, false, false, "VARCHAR", 255, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdatedTime = cci("UPDATED_TIME", "UPDATED_TIME", null, null, java.time.LocalDateTime.class, "updatedTime", null, false, false, true, "TIMESTAMP", 19, 0, "0000-00-00 00:00:00", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeletedBy = cci("DELETED_BY", "DELETED_BY", null, null, String.class, "deletedBy", null, false, false, false, "VARCHAR", 255, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeletedTime = cci("DELETED_TIME", "DELETED_TIME", null, null, java.time.LocalDateTime.class, "deletedTime", null, false, false, true, "TIMESTAMP", 19, 0, "0000-00-00 00:00:00", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, true, "INT", 10, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * NAME: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * VALUE: {NotNull, VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValue() { return _columnValue; }
    /**
     * SORT_ORDER: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortOrder() { return _columnSortOrder; }
    /**
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedBy() { return _columnCreatedBy; }
    /**
     * CREATED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedTime() { return _columnCreatedTime; }
    /**
     * UPDATED_BY: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdatedBy() { return _columnUpdatedBy; }
    /**
     * UPDATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdatedTime() { return _columnUpdatedTime; }
    /**
     * DELETED_BY: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeletedBy() { return _columnDeletedBy; }
    /**
     * DELETED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeletedTime() { return _columnDeletedTime; }
    /**
     * VERSION_NO: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnName());
        ls.add(columnValue());
        ls.add(columnSortOrder());
        ls.add(columnCreatedBy());
        ls.add(columnCreatedTime());
        ls.add(columnUpdatedBy());
        ls.add(columnUpdatedTime());
        ls.add(columnDeletedBy());
        ls.add(columnDeletedTime());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * DATA_CONFIG_TO_ROLE_TYPE_MAPPING by ROLE_TYPE_ID, named 'dataConfigToRoleTypeMappingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerDataConfigToRoleTypeMappingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), DataConfigToRoleTypeMappingDbm.getInstance().columnRoleTypeId());
        return cri("DATA_CONFIG_TO_ROLE_TYPE_MAPPING_ibfk_2", "dataConfigToRoleTypeMappingList", this, DataConfigToRoleTypeMappingDbm.getInstance(), mp, false, "roleType");
    }
    /**
     * FILE_CONFIG_TO_ROLE_TYPE_MAPPING by ROLE_TYPE_ID, named 'fileConfigToRoleTypeMappingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerFileConfigToRoleTypeMappingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), FileConfigToRoleTypeMappingDbm.getInstance().columnRoleTypeId());
        return cri("FILE_CONFIG_TO_ROLE_TYPE_MAPPING_ibfk_2", "fileConfigToRoleTypeMappingList", this, FileConfigToRoleTypeMappingDbm.getInstance(), mp, false, "roleType");
    }
    /**
     * LABEL_TYPE_TO_ROLE_TYPE_MAPPING by ROLE_TYPE_ID, named 'labelTypeToRoleTypeMappingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerLabelTypeToRoleTypeMappingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), LabelTypeToRoleTypeMappingDbm.getInstance().columnRoleTypeId());
        return cri("LABEL_TYPE_TO_ROLE_TYPE_MAPPING_ibfk_2", "labelTypeToRoleTypeMappingList", this, LabelTypeToRoleTypeMappingDbm.getInstance(), mp, false, "roleType");
    }
    /**
     * WEB_CONFIG_TO_ROLE_TYPE_MAPPING by ROLE_TYPE_ID, named 'webConfigToRoleTypeMappingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWebConfigToRoleTypeMappingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), WebConfigToRoleTypeMappingDbm.getInstance().columnRoleTypeId());
        return cri("WEB_CONFIG_TO_ROLE_TYPE_MAPPING_ibfk_2", "webConfigToRoleTypeMappingList", this, WebConfigToRoleTypeMappingDbm.getInstance(), mp, false, "roleType");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.RoleType"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.RoleTypeCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.RoleTypeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<RoleType> getEntityType() { return RoleType.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public RoleType newEntity() { return new RoleType(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((RoleType)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((RoleType)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
