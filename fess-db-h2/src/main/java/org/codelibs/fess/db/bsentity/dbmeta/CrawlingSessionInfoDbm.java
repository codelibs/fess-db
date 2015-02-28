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
 * The DB meta of CRAWLING_SESSION_INFO. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CrawlingSessionInfoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CrawlingSessionInfoDbm _instance = new CrawlingSessionInfoDbm();
    private CrawlingSessionInfoDbm() {}
    public static CrawlingSessionInfoDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((CrawlingSessionInfo)et).getId(), (et, vl) -> ((CrawlingSessionInfo)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((CrawlingSessionInfo)et).getCrawlingSessionId(), (et, vl) -> ((CrawlingSessionInfo)et).setCrawlingSessionId(ctl(vl)), "crawlingSessionId");
        setupEpg(_epgMap, et -> ((CrawlingSessionInfo)et).getKey(), (et, vl) -> ((CrawlingSessionInfo)et).setKey((String)vl), "key");
        setupEpg(_epgMap, et -> ((CrawlingSessionInfo)et).getValue(), (et, vl) -> ((CrawlingSessionInfo)et).setValue((String)vl), "value");
        setupEpg(_epgMap, et -> ((CrawlingSessionInfo)et).getCreatedTime(), (et, vl) -> ((CrawlingSessionInfo)et).setCreatedTime(ctldt(vl)), "createdTime");
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
        setupEfpg(_efpgMap, et -> ((CrawlingSessionInfo)et).getCrawlingSession(), (et, vl) -> ((CrawlingSessionInfo)et).setCrawlingSession((OptionalEntity<CrawlingSession>)vl), "crawlingSession");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "CRAWLING_SESSION_INFO";
    protected final String _tableDispName = "CRAWLING_SESSION_INFO";
    protected final String _tablePropertyName = "crawlingSessionInfo";
    protected final TableSqlName _tableSqlName = new TableSqlName("CRAWLING_SESSION_INFO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_842330EE_C91D_4D79_A4B1_FA830C20AFC3", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCrawlingSessionId = cci("CRAWLING_SESSION_ID", "CRAWLING_SESSION_ID", null, null, Long.class, "crawlingSessionId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "crawlingSession", null, null, false);
    protected final ColumnInfo _columnKey = cci("KEY", "KEY", null, null, String.class, "key", null, false, false, true, "VARCHAR", 20, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnValue = cci("VALUE", "VALUE", null, null, String.class, "value", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedTime = cci("CREATED_TIME", "CREATED_TIME", null, null, java.time.LocalDateTime.class, "createdTime", null, false, false, true, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null, false);

    /**
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * CRAWLING_SESSION_ID: {IX, NotNull, BIGINT(19), FK to CRAWLING_SESSION}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCrawlingSessionId() { return _columnCrawlingSessionId; }
    /**
     * KEY: {NotNull, VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKey() { return _columnKey; }
    /**
     * VALUE: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValue() { return _columnValue; }
    /**
     * CREATED_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedTime() { return _columnCreatedTime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnCrawlingSessionId());
        ls.add(columnKey());
        ls.add(columnValue());
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
    /**
     * CRAWLING_SESSION by my CRAWLING_SESSION_ID, named 'crawlingSession'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCrawlingSession() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCrawlingSessionId(), CrawlingSessionDbm.getInstance().columnId());
        return cfi("CONSTRAINT_B3A", "crawlingSession", this, CrawlingSessionDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "crawlingSessionInfoList", false);
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
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.CrawlingSessionInfo"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.CrawlingSessionInfoCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.CrawlingSessionInfoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CrawlingSessionInfo> getEntityType() { return CrawlingSessionInfo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CrawlingSessionInfo newEntity() { return new CrawlingSessionInfo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CrawlingSessionInfo)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CrawlingSessionInfo)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
