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
 * The DB meta of SCHEDULED_JOB. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ScheduledJobDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ScheduledJobDbm _instance = new ScheduledJobDbm();
    private ScheduledJobDbm() {}
    public static ScheduledJobDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ScheduledJob)et).getId(), (et, vl) -> ((ScheduledJob)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((ScheduledJob)et).getName(), (et, vl) -> ((ScheduledJob)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((ScheduledJob)et).getTarget(), (et, vl) -> ((ScheduledJob)et).setTarget((String)vl), "target");
        setupEpg(_epgMap, et -> ((ScheduledJob)et).getCronExpression(), (et, vl) -> ((ScheduledJob)et).setCronExpression((String)vl), "cronExpression");
        setupEpg(_epgMap, et -> ((ScheduledJob)et).getScriptType(), (et, vl) -> ((ScheduledJob)et).setScriptType((String)vl), "scriptType");
        setupEpg(_epgMap, et -> ((ScheduledJob)et).getScriptData(), (et, vl) -> ((ScheduledJob)et).setScriptData((String)vl), "scriptData");
        setupEpg(_epgMap, et -> ((ScheduledJob)et).getCrawler(), (et, vl) -> ((ScheduledJob)et).setCrawler((String)vl), "crawler");
        setupEpg(_epgMap, et -> ((ScheduledJob)et).getJobLogging(), (et, vl) -> ((ScheduledJob)et).setJobLogging((String)vl), "jobLogging");
        setupEpg(_epgMap, et -> ((ScheduledJob)et).getAvailable(), (et, vl) -> ((ScheduledJob)et).setAvailable((String)vl), "available");
        setupEpg(_epgMap, et -> ((ScheduledJob)et).getSortOrder(), (et, vl) -> ((ScheduledJob)et).setSortOrder(cti(vl)), "sortOrder");
        setupEpg(_epgMap, et -> ((ScheduledJob)et).getCreatedBy(), (et, vl) -> ((ScheduledJob)et).setCreatedBy((String)vl), "createdBy");
        setupEpg(_epgMap, et -> ((ScheduledJob)et).getCreatedTime(), (et, vl) -> ((ScheduledJob)et).setCreatedTime(ctldt(vl)), "createdTime");
        setupEpg(_epgMap, et -> ((ScheduledJob)et).getUpdatedBy(), (et, vl) -> ((ScheduledJob)et).setUpdatedBy((String)vl), "updatedBy");
        setupEpg(_epgMap, et -> ((ScheduledJob)et).getUpdatedTime(), (et, vl) -> ((ScheduledJob)et).setUpdatedTime(ctldt(vl)), "updatedTime");
        setupEpg(_epgMap, et -> ((ScheduledJob)et).getDeletedBy(), (et, vl) -> ((ScheduledJob)et).setDeletedBy((String)vl), "deletedBy");
        setupEpg(_epgMap, et -> ((ScheduledJob)et).getDeletedTime(), (et, vl) -> ((ScheduledJob)et).setDeletedTime(ctldt(vl)), "deletedTime");
        setupEpg(_epgMap, et -> ((ScheduledJob)et).getVersionNo(), (et, vl) -> ((ScheduledJob)et).setVersionNo(cti(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SCHEDULED_JOB";
    protected final String _tableDispName = "SCHEDULED_JOB";
    protected final String _tablePropertyName = "scheduledJob";
    protected final TableSqlName _tableSqlName = new TableSqlName("SCHEDULED_JOB", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName = cci("NAME", "NAME", null, null, String.class, "name", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTarget = cci("TARGET", "TARGET", null, null, String.class, "target", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCronExpression = cci("CRON_EXPRESSION", "CRON_EXPRESSION", null, null, String.class, "cronExpression", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScriptType = cci("SCRIPT_TYPE", "SCRIPT_TYPE", null, null, String.class, "scriptType", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScriptData = cci("SCRIPT_DATA", "SCRIPT_DATA", null, null, String.class, "scriptData", null, false, false, false, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCrawler = cci("CRAWLER", "CRAWLER", null, null, String.class, "crawler", null, false, false, true, "VARCHAR", 1, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJobLogging = cci("JOB_LOGGING", "JOB_LOGGING", null, null, String.class, "jobLogging", null, false, false, true, "VARCHAR", 1, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAvailable = cci("AVAILABLE", "AVAILABLE", null, null, String.class, "available", null, false, false, true, "VARCHAR", 1, 0, null, false, null, null, null, null, null, false);
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
     * TARGET: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTarget() { return _columnTarget; }
    /**
     * CRON_EXPRESSION: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCronExpression() { return _columnCronExpression; }
    /**
     * SCRIPT_TYPE: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScriptType() { return _columnScriptType; }
    /**
     * SCRIPT_DATA: {TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScriptData() { return _columnScriptData; }
    /**
     * CRAWLER: {NotNull, VARCHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCrawler() { return _columnCrawler; }
    /**
     * JOB_LOGGING: {NotNull, VARCHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJobLogging() { return _columnJobLogging; }
    /**
     * AVAILABLE: {NotNull, VARCHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAvailable() { return _columnAvailable; }
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
        ls.add(columnTarget());
        ls.add(columnCronExpression());
        ls.add(columnScriptType());
        ls.add(columnScriptData());
        ls.add(columnCrawler());
        ls.add(columnJobLogging());
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.ScheduledJob"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.ScheduledJobCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.ScheduledJobBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ScheduledJob> getEntityType() { return ScheduledJob.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ScheduledJob newEntity() { return new ScheduledJob(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ScheduledJob)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ScheduledJob)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
