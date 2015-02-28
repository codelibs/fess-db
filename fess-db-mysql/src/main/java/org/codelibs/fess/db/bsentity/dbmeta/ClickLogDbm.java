package org.codelibs.fess.db.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.codelibs.fess.db.allcommon.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The DB meta of CLICK_LOG. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ClickLogDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ClickLogDbm _instance = new ClickLogDbm();
    private ClickLogDbm() {}
    public static ClickLogDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ClickLog)et).getId(), (et, vl) -> ((ClickLog)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((ClickLog)et).getSearchId(), (et, vl) -> ((ClickLog)et).setSearchId(ctl(vl)), "searchId");
        setupEpg(_epgMap, et -> ((ClickLog)et).getUrl(), (et, vl) -> ((ClickLog)et).setUrl((String)vl), "url");
        setupEpg(_epgMap, et -> ((ClickLog)et).getRequestedTime(), (et, vl) -> ((ClickLog)et).setRequestedTime(ctldt(vl)), "requestedTime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((ClickLog)et).getSearchLog(), (et, vl) -> ((ClickLog)et).setSearchLog((OptionalEntity<SearchLog>)vl), "searchLog");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "CLICK_LOG";
    protected final String _tableDispName = "CLICK_LOG";
    protected final String _tablePropertyName = "clickLog";
    protected final TableSqlName _tableSqlName = new TableSqlName("CLICK_LOG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSearchId = cci("SEARCH_ID", "SEARCH_ID", null, null, Long.class, "searchId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "searchLog", null, null, false);
    protected final ColumnInfo _columnUrl = cci("URL", "URL", null, null, String.class, "url", null, false, false, true, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRequestedTime = cci("REQUESTED_TIME", "REQUESTED_TIME", null, null, java.time.LocalDateTime.class, "requestedTime", null, false, false, true, "TIMESTAMP", 19, 0, "CURRENT_TIMESTAMP", false, null, null, null, null, null, false);

    /**
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * SEARCH_ID: {IX, NotNull, BIGINT(19), FK to SEARCH_LOG}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSearchId() { return _columnSearchId; }
    /**
     * URL: {NotNull, TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUrl() { return _columnUrl; }
    /**
     * REQUESTED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRequestedTime() { return _columnRequestedTime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnSearchId());
        ls.add(columnUrl());
        ls.add(columnRequestedTime());
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
    /**
     * SEARCH_LOG by my SEARCH_ID, named 'searchLog'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignSearchLog() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSearchId(), SearchLogDbm.getInstance().columnId());
        return cfi("CLICK_LOG_ibfk_1", "searchLog", this, SearchLogDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "clickLogList", false);
    }

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
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.ClickLog"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.ClickLogCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.ClickLogBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ClickLog> getEntityType() { return ClickLog.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ClickLog newEntity() { return new ClickLog(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ClickLog)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ClickLog)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
