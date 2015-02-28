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
 * The DB meta of LABEL_TYPE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LabelTypeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LabelTypeDbm _instance = new LabelTypeDbm();
    private LabelTypeDbm() {}
    public static LabelTypeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((LabelType)et).getId(), (et, vl) -> ((LabelType)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((LabelType)et).getName(), (et, vl) -> ((LabelType)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((LabelType)et).getValue(), (et, vl) -> ((LabelType)et).setValue((String)vl), "value");
        setupEpg(_epgMap, et -> ((LabelType)et).getIncludedPaths(), (et, vl) -> ((LabelType)et).setIncludedPaths((String)vl), "includedPaths");
        setupEpg(_epgMap, et -> ((LabelType)et).getExcludedPaths(), (et, vl) -> ((LabelType)et).setExcludedPaths((String)vl), "excludedPaths");
        setupEpg(_epgMap, et -> ((LabelType)et).getSortOrder(), (et, vl) -> ((LabelType)et).setSortOrder(cti(vl)), "sortOrder");
        setupEpg(_epgMap, et -> ((LabelType)et).getCreatedBy(), (et, vl) -> ((LabelType)et).setCreatedBy((String)vl), "createdBy");
        setupEpg(_epgMap, et -> ((LabelType)et).getCreatedTime(), (et, vl) -> ((LabelType)et).setCreatedTime(ctldt(vl)), "createdTime");
        setupEpg(_epgMap, et -> ((LabelType)et).getUpdatedBy(), (et, vl) -> ((LabelType)et).setUpdatedBy((String)vl), "updatedBy");
        setupEpg(_epgMap, et -> ((LabelType)et).getUpdatedTime(), (et, vl) -> ((LabelType)et).setUpdatedTime(ctldt(vl)), "updatedTime");
        setupEpg(_epgMap, et -> ((LabelType)et).getDeletedBy(), (et, vl) -> ((LabelType)et).setDeletedBy((String)vl), "deletedBy");
        setupEpg(_epgMap, et -> ((LabelType)et).getDeletedTime(), (et, vl) -> ((LabelType)et).setDeletedTime(ctldt(vl)), "deletedTime");
        setupEpg(_epgMap, et -> ((LabelType)et).getVersionNo(), (et, vl) -> ((LabelType)et).setVersionNo(cti(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LABEL_TYPE";
    protected final String _tableDispName = "LABEL_TYPE";
    protected final String _tablePropertyName = "labelType";
    protected final TableSqlName _tableSqlName = new TableSqlName("LABEL_TYPE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_451EF3E2_80DD_4254_90D8_6155981A1D82", false, null, null, null, "dataConfigToLabelTypeMappingList,fileConfigToLabelTypeMappingList,labelTypeToRoleTypeMappingList,webConfigToLabelTypeMappingList", null, false);
    protected final ColumnInfo _columnName = cci("NAME", "NAME", null, null, String.class, "name", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnValue = cci("VALUE", "VALUE", null, null, String.class, "value", null, false, false, true, "VARCHAR", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIncludedPaths = cci("INCLUDED_PATHS", "INCLUDED_PATHS", null, null, String.class, "includedPaths", null, false, false, false, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExcludedPaths = cci("EXCLUDED_PATHS", "EXCLUDED_PATHS", null, null, String.class, "excludedPaths", null, false, false, false, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortOrder = cci("SORT_ORDER", "SORT_ORDER", null, null, Integer.class, "sortOrder", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedBy = cci("CREATED_BY", "CREATED_BY", null, null, String.class, "createdBy", null, false, false, true, "VARCHAR", 255, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedTime = cci("CREATED_TIME", "CREATED_TIME", null, null, java.time.LocalDateTime.class, "createdTime", null, false, false, true, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdatedBy = cci("UPDATED_BY", "UPDATED_BY", null, null, String.class, "updatedBy", null, false, false, false, "VARCHAR", 255, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdatedTime = cci("UPDATED_TIME", "UPDATED_TIME", null, null, java.time.LocalDateTime.class, "updatedTime", null, false, false, false, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeletedBy = cci("DELETED_BY", "DELETED_BY", null, null, String.class, "deletedBy", null, false, false, false, "VARCHAR", 255, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeletedTime = cci("DELETED_TIME", "DELETED_TIME", null, null, java.time.LocalDateTime.class, "deletedTime", null, false, false, false, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Integer.class, "versionNo", null, false, false, true, "INTEGER", 10, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

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
     * INCLUDED_PATHS: {VARCHAR(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIncludedPaths() { return _columnIncludedPaths; }
    /**
     * EXCLUDED_PATHS: {VARCHAR(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExcludedPaths() { return _columnExcludedPaths; }
    /**
     * SORT_ORDER: {NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortOrder() { return _columnSortOrder; }
    /**
     * CREATED_BY: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedBy() { return _columnCreatedBy; }
    /**
     * CREATED_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedTime() { return _columnCreatedTime; }
    /**
     * UPDATED_BY: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdatedBy() { return _columnUpdatedBy; }
    /**
     * UPDATED_TIME: {TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdatedTime() { return _columnUpdatedTime; }
    /**
     * DELETED_BY: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeletedBy() { return _columnDeletedBy; }
    /**
     * DELETED_TIME: {TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeletedTime() { return _columnDeletedTime; }
    /**
     * VERSION_NO: {NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnName());
        ls.add(columnValue());
        ls.add(columnIncludedPaths());
        ls.add(columnExcludedPaths());
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
     * DATA_CONFIG_TO_LABEL_TYPE_MAPPING by LABEL_TYPE_ID, named 'dataConfigToLabelTypeMappingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerDataConfigToLabelTypeMappingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), DataConfigToLabelTypeMappingDbm.getInstance().columnLabelTypeId());
        return cri("CONSTRAINT_5CE1", "dataConfigToLabelTypeMappingList", this, DataConfigToLabelTypeMappingDbm.getInstance(), mp, false, "labelType");
    }
    /**
     * FILE_CONFIG_TO_LABEL_TYPE_MAPPING by LABEL_TYPE_ID, named 'fileConfigToLabelTypeMappingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerFileConfigToLabelTypeMappingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), FileConfigToLabelTypeMappingDbm.getInstance().columnLabelTypeId());
        return cri("CONSTRAINT_F57", "fileConfigToLabelTypeMappingList", this, FileConfigToLabelTypeMappingDbm.getInstance(), mp, false, "labelType");
    }
    /**
     * LABEL_TYPE_TO_ROLE_TYPE_MAPPING by LABEL_TYPE_ID, named 'labelTypeToRoleTypeMappingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerLabelTypeToRoleTypeMappingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), LabelTypeToRoleTypeMappingDbm.getInstance().columnLabelTypeId());
        return cri("CONSTRAINT_2C", "labelTypeToRoleTypeMappingList", this, LabelTypeToRoleTypeMappingDbm.getInstance(), mp, false, "labelType");
    }
    /**
     * WEB_CONFIG_TO_LABEL_TYPE_MAPPING by LABEL_TYPE_ID, named 'webConfigToLabelTypeMappingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWebConfigToLabelTypeMappingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), WebConfigToLabelTypeMappingDbm.getInstance().columnLabelTypeId());
        return cri("CONSTRAINT_6A", "webConfigToLabelTypeMappingList", this, WebConfigToLabelTypeMappingDbm.getInstance(), mp, false, "labelType");
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
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.LabelType"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.LabelTypeCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.LabelTypeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LabelType> getEntityType() { return LabelType.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LabelType newEntity() { return new LabelType(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LabelType)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LabelType)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
