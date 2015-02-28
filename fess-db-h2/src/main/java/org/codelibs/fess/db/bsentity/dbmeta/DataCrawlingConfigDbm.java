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
 * The DB meta of DATA_CRAWLING_CONFIG. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DataCrawlingConfigDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DataCrawlingConfigDbm _instance = new DataCrawlingConfigDbm();
    private DataCrawlingConfigDbm() {}
    public static DataCrawlingConfigDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DataCrawlingConfig)et).getId(), (et, vl) -> ((DataCrawlingConfig)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((DataCrawlingConfig)et).getName(), (et, vl) -> ((DataCrawlingConfig)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((DataCrawlingConfig)et).getHandlerName(), (et, vl) -> ((DataCrawlingConfig)et).setHandlerName((String)vl), "handlerName");
        setupEpg(_epgMap, et -> ((DataCrawlingConfig)et).getHandlerParameter(), (et, vl) -> ((DataCrawlingConfig)et).setHandlerParameter((String)vl), "handlerParameter");
        setupEpg(_epgMap, et -> ((DataCrawlingConfig)et).getHandlerScript(), (et, vl) -> ((DataCrawlingConfig)et).setHandlerScript((String)vl), "handlerScript");
        setupEpg(_epgMap, et -> ((DataCrawlingConfig)et).getBoost(), (et, vl) -> ((DataCrawlingConfig)et).setBoost(ctb(vl)), "boost");
        setupEpg(_epgMap, et -> ((DataCrawlingConfig)et).getAvailable(), (et, vl) -> ((DataCrawlingConfig)et).setAvailable((String)vl), "available");
        setupEpg(_epgMap, et -> ((DataCrawlingConfig)et).getSortOrder(), (et, vl) -> ((DataCrawlingConfig)et).setSortOrder(cti(vl)), "sortOrder");
        setupEpg(_epgMap, et -> ((DataCrawlingConfig)et).getCreatedBy(), (et, vl) -> ((DataCrawlingConfig)et).setCreatedBy((String)vl), "createdBy");
        setupEpg(_epgMap, et -> ((DataCrawlingConfig)et).getCreatedTime(), (et, vl) -> ((DataCrawlingConfig)et).setCreatedTime(ctldt(vl)), "createdTime");
        setupEpg(_epgMap, et -> ((DataCrawlingConfig)et).getUpdatedBy(), (et, vl) -> ((DataCrawlingConfig)et).setUpdatedBy((String)vl), "updatedBy");
        setupEpg(_epgMap, et -> ((DataCrawlingConfig)et).getUpdatedTime(), (et, vl) -> ((DataCrawlingConfig)et).setUpdatedTime(ctldt(vl)), "updatedTime");
        setupEpg(_epgMap, et -> ((DataCrawlingConfig)et).getDeletedBy(), (et, vl) -> ((DataCrawlingConfig)et).setDeletedBy((String)vl), "deletedBy");
        setupEpg(_epgMap, et -> ((DataCrawlingConfig)et).getDeletedTime(), (et, vl) -> ((DataCrawlingConfig)et).setDeletedTime(ctldt(vl)), "deletedTime");
        setupEpg(_epgMap, et -> ((DataCrawlingConfig)et).getVersionNo(), (et, vl) -> ((DataCrawlingConfig)et).setVersionNo(cti(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "DATA_CRAWLING_CONFIG";
    protected final String _tableDispName = "DATA_CRAWLING_CONFIG";
    protected final String _tablePropertyName = "dataCrawlingConfig";
    protected final TableSqlName _tableSqlName = new TableSqlName("DATA_CRAWLING_CONFIG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_C7169751_7D68_4513_B93E_B3C70001FA74", false, null, null, null, "dataConfigToLabelTypeMappingList,dataConfigToRoleTypeMappingList", null, false);
    protected final ColumnInfo _columnName = cci("NAME", "NAME", null, null, String.class, "name", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHandlerName = cci("HANDLER_NAME", "HANDLER_NAME", null, null, String.class, "handlerName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHandlerParameter = cci("HANDLER_PARAMETER", "HANDLER_PARAMETER", null, null, String.class, "handlerParameter", null, false, false, false, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHandlerScript = cci("HANDLER_SCRIPT", "HANDLER_SCRIPT", null, null, String.class, "handlerScript", null, false, false, false, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoost = cci("BOOST", "BOOST", null, null, java.math.BigDecimal.class, "boost", null, false, false, true, "DOUBLE", 17, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAvailable = cci("AVAILABLE", "AVAILABLE", null, null, String.class, "available", null, false, false, true, "VARCHAR", 1, 0, null, false, null, null, null, null, null, false);
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
     * NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * HANDLER_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHandlerName() { return _columnHandlerName; }
    /**
     * HANDLER_PARAMETER: {VARCHAR(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHandlerParameter() { return _columnHandlerParameter; }
    /**
     * HANDLER_SCRIPT: {VARCHAR(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHandlerScript() { return _columnHandlerScript; }
    /**
     * BOOST: {NotNull, DOUBLE(17)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoost() { return _columnBoost; }
    /**
     * AVAILABLE: {NotNull, VARCHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAvailable() { return _columnAvailable; }
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
        ls.add(columnHandlerName());
        ls.add(columnHandlerParameter());
        ls.add(columnHandlerScript());
        ls.add(columnBoost());
        ls.add(columnAvailable());
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
     * DATA_CONFIG_TO_LABEL_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToLabelTypeMappingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerDataConfigToLabelTypeMappingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), DataConfigToLabelTypeMappingDbm.getInstance().columnDataConfigId());
        return cri("CONSTRAINT_5CE", "dataConfigToLabelTypeMappingList", this, DataConfigToLabelTypeMappingDbm.getInstance(), mp, false, "dataCrawlingConfig");
    }
    /**
     * DATA_CONFIG_TO_ROLE_TYPE_MAPPING by DATA_CONFIG_ID, named 'dataConfigToRoleTypeMappingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerDataConfigToRoleTypeMappingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), DataConfigToRoleTypeMappingDbm.getInstance().columnDataConfigId());
        return cri("CONSTRAINT_E3", "dataConfigToRoleTypeMappingList", this, DataConfigToRoleTypeMappingDbm.getInstance(), mp, false, "dataCrawlingConfig");
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
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.DataCrawlingConfig"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.DataCrawlingConfigCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.DataCrawlingConfigBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DataCrawlingConfig> getEntityType() { return DataCrawlingConfig.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DataCrawlingConfig newEntity() { return new DataCrawlingConfig(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DataCrawlingConfig)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DataCrawlingConfig)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
