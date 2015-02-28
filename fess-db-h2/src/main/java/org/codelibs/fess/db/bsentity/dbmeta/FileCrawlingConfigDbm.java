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
 * The DB meta of FILE_CRAWLING_CONFIG. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class FileCrawlingConfigDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final FileCrawlingConfigDbm _instance = new FileCrawlingConfigDbm();
    private FileCrawlingConfigDbm() {}
    public static FileCrawlingConfigDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getId(), (et, vl) -> ((FileCrawlingConfig)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getName(), (et, vl) -> ((FileCrawlingConfig)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getPaths(), (et, vl) -> ((FileCrawlingConfig)et).setPaths((String)vl), "paths");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getIncludedPaths(), (et, vl) -> ((FileCrawlingConfig)et).setIncludedPaths((String)vl), "includedPaths");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getExcludedPaths(), (et, vl) -> ((FileCrawlingConfig)et).setExcludedPaths((String)vl), "excludedPaths");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getIncludedDocPaths(), (et, vl) -> ((FileCrawlingConfig)et).setIncludedDocPaths((String)vl), "includedDocPaths");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getExcludedDocPaths(), (et, vl) -> ((FileCrawlingConfig)et).setExcludedDocPaths((String)vl), "excludedDocPaths");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getConfigParameter(), (et, vl) -> ((FileCrawlingConfig)et).setConfigParameter((String)vl), "configParameter");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getDepth(), (et, vl) -> ((FileCrawlingConfig)et).setDepth(cti(vl)), "depth");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getMaxAccessCount(), (et, vl) -> ((FileCrawlingConfig)et).setMaxAccessCount(ctl(vl)), "maxAccessCount");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getNumOfThread(), (et, vl) -> ((FileCrawlingConfig)et).setNumOfThread(cti(vl)), "numOfThread");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getIntervalTime(), (et, vl) -> ((FileCrawlingConfig)et).setIntervalTime(cti(vl)), "intervalTime");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getBoost(), (et, vl) -> ((FileCrawlingConfig)et).setBoost(ctb(vl)), "boost");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getAvailable(), (et, vl) -> ((FileCrawlingConfig)et).setAvailable((String)vl), "available");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getSortOrder(), (et, vl) -> ((FileCrawlingConfig)et).setSortOrder(cti(vl)), "sortOrder");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getCreatedBy(), (et, vl) -> ((FileCrawlingConfig)et).setCreatedBy((String)vl), "createdBy");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getCreatedTime(), (et, vl) -> ((FileCrawlingConfig)et).setCreatedTime(ctldt(vl)), "createdTime");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getUpdatedBy(), (et, vl) -> ((FileCrawlingConfig)et).setUpdatedBy((String)vl), "updatedBy");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getUpdatedTime(), (et, vl) -> ((FileCrawlingConfig)et).setUpdatedTime(ctldt(vl)), "updatedTime");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getDeletedBy(), (et, vl) -> ((FileCrawlingConfig)et).setDeletedBy((String)vl), "deletedBy");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getDeletedTime(), (et, vl) -> ((FileCrawlingConfig)et).setDeletedTime(ctldt(vl)), "deletedTime");
        setupEpg(_epgMap, et -> ((FileCrawlingConfig)et).getVersionNo(), (et, vl) -> ((FileCrawlingConfig)et).setVersionNo(cti(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "FILE_CRAWLING_CONFIG";
    protected final String _tableDispName = "FILE_CRAWLING_CONFIG";
    protected final String _tablePropertyName = "fileCrawlingConfig";
    protected final TableSqlName _tableSqlName = new TableSqlName("FILE_CRAWLING_CONFIG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_24415F91_AB32_4A38_AB78_5414D767D083", false, null, null, null, "fileAuthenticationList,fileConfigToLabelTypeMappingList,fileConfigToRoleTypeMappingList", null, false);
    protected final ColumnInfo _columnName = cci("NAME", "NAME", null, null, String.class, "name", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaths = cci("PATHS", "PATHS", null, null, String.class, "paths", null, false, false, true, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIncludedPaths = cci("INCLUDED_PATHS", "INCLUDED_PATHS", null, null, String.class, "includedPaths", null, false, false, false, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExcludedPaths = cci("EXCLUDED_PATHS", "EXCLUDED_PATHS", null, null, String.class, "excludedPaths", null, false, false, false, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIncludedDocPaths = cci("INCLUDED_DOC_PATHS", "INCLUDED_DOC_PATHS", null, null, String.class, "includedDocPaths", null, false, false, false, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExcludedDocPaths = cci("EXCLUDED_DOC_PATHS", "EXCLUDED_DOC_PATHS", null, null, String.class, "excludedDocPaths", null, false, false, false, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnConfigParameter = cci("CONFIG_PARAMETER", "CONFIG_PARAMETER", null, null, String.class, "configParameter", null, false, false, false, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepth = cci("DEPTH", "DEPTH", null, null, Integer.class, "depth", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxAccessCount = cci("MAX_ACCESS_COUNT", "MAX_ACCESS_COUNT", null, null, Long.class, "maxAccessCount", null, false, false, false, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNumOfThread = cci("NUM_OF_THREAD", "NUM_OF_THREAD", null, null, Integer.class, "numOfThread", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIntervalTime = cci("INTERVAL_TIME", "INTERVAL_TIME", null, null, Integer.class, "intervalTime", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null, false);
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
     * PATHS: {NotNull, VARCHAR(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaths() { return _columnPaths; }
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
     * INCLUDED_DOC_PATHS: {VARCHAR(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIncludedDocPaths() { return _columnIncludedDocPaths; }
    /**
     * EXCLUDED_DOC_PATHS: {VARCHAR(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExcludedDocPaths() { return _columnExcludedDocPaths; }
    /**
     * CONFIG_PARAMETER: {VARCHAR(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConfigParameter() { return _columnConfigParameter; }
    /**
     * DEPTH: {INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepth() { return _columnDepth; }
    /**
     * MAX_ACCESS_COUNT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxAccessCount() { return _columnMaxAccessCount; }
    /**
     * NUM_OF_THREAD: {NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumOfThread() { return _columnNumOfThread; }
    /**
     * INTERVAL_TIME: {NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIntervalTime() { return _columnIntervalTime; }
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
        ls.add(columnPaths());
        ls.add(columnIncludedPaths());
        ls.add(columnExcludedPaths());
        ls.add(columnIncludedDocPaths());
        ls.add(columnExcludedDocPaths());
        ls.add(columnConfigParameter());
        ls.add(columnDepth());
        ls.add(columnMaxAccessCount());
        ls.add(columnNumOfThread());
        ls.add(columnIntervalTime());
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
     * FILE_AUTHENTICATION by FILE_CRAWLING_CONFIG_ID, named 'fileAuthenticationList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerFileAuthenticationList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), FileAuthenticationDbm.getInstance().columnFileCrawlingConfigId());
        return cri("CONSTRAINT_F90", "fileAuthenticationList", this, FileAuthenticationDbm.getInstance(), mp, false, "fileCrawlingConfig");
    }
    /**
     * FILE_CONFIG_TO_LABEL_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToLabelTypeMappingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerFileConfigToLabelTypeMappingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), FileConfigToLabelTypeMappingDbm.getInstance().columnFileConfigId());
        return cri("CONSTRAINT_F57F", "fileConfigToLabelTypeMappingList", this, FileConfigToLabelTypeMappingDbm.getInstance(), mp, false, "fileCrawlingConfig");
    }
    /**
     * FILE_CONFIG_TO_ROLE_TYPE_MAPPING by FILE_CONFIG_ID, named 'fileConfigToRoleTypeMappingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerFileConfigToRoleTypeMappingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), FileConfigToRoleTypeMappingDbm.getInstance().columnFileConfigId());
        return cri("CONSTRAINT_3A", "fileConfigToRoleTypeMappingList", this, FileConfigToRoleTypeMappingDbm.getInstance(), mp, false, "fileCrawlingConfig");
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
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.FileCrawlingConfig"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.FileCrawlingConfigCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.FileCrawlingConfigBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<FileCrawlingConfig> getEntityType() { return FileCrawlingConfig.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public FileCrawlingConfig newEntity() { return new FileCrawlingConfig(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((FileCrawlingConfig)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((FileCrawlingConfig)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
