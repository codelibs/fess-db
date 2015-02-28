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
 * The DB meta of JOB_LOG. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class JobLogDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final JobLogDbm _instance = new JobLogDbm();
    private JobLogDbm() {}
    public static JobLogDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((JobLog)et).getId(), (et, vl) -> ((JobLog)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((JobLog)et).getJobName(), (et, vl) -> ((JobLog)et).setJobName((String)vl), "jobName");
        setupEpg(_epgMap, et -> ((JobLog)et).getJobStatus(), (et, vl) -> ((JobLog)et).setJobStatus((String)vl), "jobStatus");
        setupEpg(_epgMap, et -> ((JobLog)et).getTarget(), (et, vl) -> ((JobLog)et).setTarget((String)vl), "target");
        setupEpg(_epgMap, et -> ((JobLog)et).getScriptType(), (et, vl) -> ((JobLog)et).setScriptType((String)vl), "scriptType");
        setupEpg(_epgMap, et -> ((JobLog)et).getScriptData(), (et, vl) -> ((JobLog)et).setScriptData((String)vl), "scriptData");
        setupEpg(_epgMap, et -> ((JobLog)et).getScriptResult(), (et, vl) -> ((JobLog)et).setScriptResult((String)vl), "scriptResult");
        setupEpg(_epgMap, et -> ((JobLog)et).getStartTime(), (et, vl) -> ((JobLog)et).setStartTime(ctldt(vl)), "startTime");
        setupEpg(_epgMap, et -> ((JobLog)et).getEndTime(), (et, vl) -> ((JobLog)et).setEndTime(ctldt(vl)), "endTime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "JOB_LOG";
    protected final String _tableDispName = "JOB_LOG";
    protected final String _tablePropertyName = "jobLog";
    protected final TableSqlName _tableSqlName = new TableSqlName("JOB_LOG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_A407B8A7_4692_49D3_9C23_4B0C07088376", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJobName = cci("JOB_NAME", "JOB_NAME", null, null, String.class, "jobName", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJobStatus = cci("JOB_STATUS", "JOB_STATUS", null, null, String.class, "jobStatus", null, false, false, true, "VARCHAR", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTarget = cci("TARGET", "TARGET", null, null, String.class, "target", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScriptType = cci("SCRIPT_TYPE", "SCRIPT_TYPE", null, null, String.class, "scriptType", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScriptData = cci("SCRIPT_DATA", "SCRIPT_DATA", null, null, String.class, "scriptData", null, false, false, false, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScriptResult = cci("SCRIPT_RESULT", "SCRIPT_RESULT", null, null, String.class, "scriptResult", null, false, false, false, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStartTime = cci("START_TIME", "START_TIME", null, null, java.time.LocalDateTime.class, "startTime", null, false, false, true, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEndTime = cci("END_TIME", "END_TIME", null, null, java.time.LocalDateTime.class, "endTime", null, false, false, false, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null, false);

    /**
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * JOB_NAME: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJobName() { return _columnJobName; }
    /**
     * JOB_STATUS: {NotNull, VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJobStatus() { return _columnJobStatus; }
    /**
     * TARGET: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTarget() { return _columnTarget; }
    /**
     * SCRIPT_TYPE: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScriptType() { return _columnScriptType; }
    /**
     * SCRIPT_DATA: {VARCHAR(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScriptData() { return _columnScriptData; }
    /**
     * SCRIPT_RESULT: {VARCHAR(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScriptResult() { return _columnScriptResult; }
    /**
     * START_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStartTime() { return _columnStartTime; }
    /**
     * END_TIME: {TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEndTime() { return _columnEndTime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnJobName());
        ls.add(columnJobStatus());
        ls.add(columnTarget());
        ls.add(columnScriptType());
        ls.add(columnScriptData());
        ls.add(columnScriptResult());
        ls.add(columnStartTime());
        ls.add(columnEndTime());
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.JobLog"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.JobLogCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.JobLogBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<JobLog> getEntityType() { return JobLog.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public JobLog newEntity() { return new JobLog(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((JobLog)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((JobLog)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
