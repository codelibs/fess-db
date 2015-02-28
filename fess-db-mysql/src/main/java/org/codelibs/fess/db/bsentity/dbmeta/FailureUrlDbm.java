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
 * The DB meta of FAILURE_URL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class FailureUrlDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final FailureUrlDbm _instance = new FailureUrlDbm();
    private FailureUrlDbm() {}
    public static FailureUrlDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((FailureUrl)et).getId(), (et, vl) -> ((FailureUrl)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((FailureUrl)et).getUrl(), (et, vl) -> ((FailureUrl)et).setUrl((String)vl), "url");
        setupEpg(_epgMap, et -> ((FailureUrl)et).getThreadName(), (et, vl) -> ((FailureUrl)et).setThreadName((String)vl), "threadName");
        setupEpg(_epgMap, et -> ((FailureUrl)et).getErrorName(), (et, vl) -> ((FailureUrl)et).setErrorName((String)vl), "errorName");
        setupEpg(_epgMap, et -> ((FailureUrl)et).getErrorLog(), (et, vl) -> ((FailureUrl)et).setErrorLog((String)vl), "errorLog");
        setupEpg(_epgMap, et -> ((FailureUrl)et).getErrorCount(), (et, vl) -> ((FailureUrl)et).setErrorCount(cti(vl)), "errorCount");
        setupEpg(_epgMap, et -> ((FailureUrl)et).getLastAccessTime(), (et, vl) -> ((FailureUrl)et).setLastAccessTime(ctldt(vl)), "lastAccessTime");
        setupEpg(_epgMap, et -> ((FailureUrl)et).getConfigId(), (et, vl) -> ((FailureUrl)et).setConfigId((String)vl), "configId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "FAILURE_URL";
    protected final String _tableDispName = "FAILURE_URL";
    protected final String _tablePropertyName = "failureUrl";
    protected final TableSqlName _tableSqlName = new TableSqlName("FAILURE_URL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUrl = cci("URL", "URL", null, null, String.class, "url", null, false, false, true, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnThreadName = cci("THREAD_NAME", "THREAD_NAME", null, null, String.class, "threadName", null, false, false, true, "VARCHAR", 30, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorName = cci("ERROR_NAME", "ERROR_NAME", null, null, String.class, "errorName", null, false, false, false, "VARCHAR", 255, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorLog = cci("ERROR_LOG", "ERROR_LOG", null, null, String.class, "errorLog", null, false, false, false, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorCount = cci("ERROR_COUNT", "ERROR_COUNT", null, null, Integer.class, "errorCount", null, false, false, true, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastAccessTime = cci("LAST_ACCESS_TIME", "LAST_ACCESS_TIME", null, null, java.time.LocalDateTime.class, "lastAccessTime", null, false, false, true, "TIMESTAMP", 19, 0, "CURRENT_TIMESTAMP", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnConfigId = cci("CONFIG_ID", "CONFIG_ID", null, null, String.class, "configId", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);

    /**
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * URL: {NotNull, TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUrl() { return _columnUrl; }
    /**
     * THREAD_NAME: {NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnThreadName() { return _columnThreadName; }
    /**
     * ERROR_NAME: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorName() { return _columnErrorName; }
    /**
     * ERROR_LOG: {TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorLog() { return _columnErrorLog; }
    /**
     * ERROR_COUNT: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorCount() { return _columnErrorCount; }
    /**
     * LAST_ACCESS_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastAccessTime() { return _columnLastAccessTime; }
    /**
     * CONFIG_ID: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConfigId() { return _columnConfigId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnUrl());
        ls.add(columnThreadName());
        ls.add(columnErrorName());
        ls.add(columnErrorLog());
        ls.add(columnErrorCount());
        ls.add(columnLastAccessTime());
        ls.add(columnConfigId());
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
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.FailureUrl"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.FailureUrlCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.FailureUrlBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<FailureUrl> getEntityType() { return FailureUrl.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public FailureUrl newEntity() { return new FailureUrl(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((FailureUrl)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((FailureUrl)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
