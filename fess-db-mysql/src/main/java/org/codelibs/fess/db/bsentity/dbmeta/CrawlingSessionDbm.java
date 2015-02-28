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
 * The DB meta of CRAWLING_SESSION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CrawlingSessionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CrawlingSessionDbm _instance = new CrawlingSessionDbm();
    private CrawlingSessionDbm() {}
    public static CrawlingSessionDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((CrawlingSession)et).getId(), (et, vl) -> ((CrawlingSession)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((CrawlingSession)et).getSessionId(), (et, vl) -> ((CrawlingSession)et).setSessionId((String)vl), "sessionId");
        setupEpg(_epgMap, et -> ((CrawlingSession)et).getName(), (et, vl) -> ((CrawlingSession)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((CrawlingSession)et).getExpiredTime(), (et, vl) -> ((CrawlingSession)et).setExpiredTime(ctldt(vl)), "expiredTime");
        setupEpg(_epgMap, et -> ((CrawlingSession)et).getCreatedTime(), (et, vl) -> ((CrawlingSession)et).setCreatedTime(ctldt(vl)), "createdTime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "CRAWLING_SESSION";
    protected final String _tableDispName = "CRAWLING_SESSION";
    protected final String _tablePropertyName = "crawlingSession";
    protected final TableSqlName _tableSqlName = new TableSqlName("CRAWLING_SESSION", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, "crawlingSessionInfoList", null, false);
    protected final ColumnInfo _columnSessionId = cci("SESSION_ID", "SESSION_ID", null, null, String.class, "sessionId", null, false, false, true, "VARCHAR", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName = cci("NAME", "NAME", null, null, String.class, "name", null, false, false, false, "VARCHAR", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExpiredTime = cci("EXPIRED_TIME", "EXPIRED_TIME", null, null, java.time.LocalDateTime.class, "expiredTime", null, false, false, true, "TIMESTAMP", 19, 0, "CURRENT_TIMESTAMP", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedTime = cci("CREATED_TIME", "CREATED_TIME", null, null, java.time.LocalDateTime.class, "createdTime", null, false, false, true, "TIMESTAMP", 19, 0, "0000-00-00 00:00:00", false, null, null, null, null, null, false);

    /**
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * SESSION_ID: {NotNull, VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSessionId() { return _columnSessionId; }
    /**
     * NAME: {VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * EXPIRED_TIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExpiredTime() { return _columnExpiredTime; }
    /**
     * CREATED_TIME: {NotNull, TIMESTAMP(19), default=[0000-00-00 00:00:00]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedTime() { return _columnCreatedTime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnSessionId());
        ls.add(columnName());
        ls.add(columnExpiredTime());
        ls.add(columnCreatedTime());
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
     * CRAWLING_SESSION_INFO by CRAWLING_SESSION_ID, named 'crawlingSessionInfoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCrawlingSessionInfoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), CrawlingSessionInfoDbm.getInstance().columnCrawlingSessionId());
        return cri("CRAWLING_SESSION_INFO_ibfk_1", "crawlingSessionInfoList", this, CrawlingSessionInfoDbm.getInstance(), mp, false, "crawlingSession");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.CrawlingSession"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.CrawlingSessionCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.CrawlingSessionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CrawlingSession> getEntityType() { return CrawlingSession.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CrawlingSession newEntity() { return new CrawlingSession(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CrawlingSession)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CrawlingSession)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
