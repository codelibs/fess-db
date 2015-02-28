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
 * The DB meta of SEARCH_LOG. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SearchLogDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SearchLogDbm _instance = new SearchLogDbm();
    private SearchLogDbm() {}
    public static SearchLogDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SearchLog)et).getId(), (et, vl) -> ((SearchLog)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((SearchLog)et).getSearchWord(), (et, vl) -> ((SearchLog)et).setSearchWord((String)vl), "searchWord");
        setupEpg(_epgMap, et -> ((SearchLog)et).getRequestedTime(), (et, vl) -> ((SearchLog)et).setRequestedTime(ctldt(vl)), "requestedTime");
        setupEpg(_epgMap, et -> ((SearchLog)et).getResponseTime(), (et, vl) -> ((SearchLog)et).setResponseTime(cti(vl)), "responseTime");
        setupEpg(_epgMap, et -> ((SearchLog)et).getHitCount(), (et, vl) -> ((SearchLog)et).setHitCount(ctl(vl)), "hitCount");
        setupEpg(_epgMap, et -> ((SearchLog)et).getQueryOffset(), (et, vl) -> ((SearchLog)et).setQueryOffset(cti(vl)), "queryOffset");
        setupEpg(_epgMap, et -> ((SearchLog)et).getQueryPageSize(), (et, vl) -> ((SearchLog)et).setQueryPageSize(cti(vl)), "queryPageSize");
        setupEpg(_epgMap, et -> ((SearchLog)et).getUserAgent(), (et, vl) -> ((SearchLog)et).setUserAgent((String)vl), "userAgent");
        setupEpg(_epgMap, et -> ((SearchLog)et).getReferer(), (et, vl) -> ((SearchLog)et).setReferer((String)vl), "referer");
        setupEpg(_epgMap, et -> ((SearchLog)et).getClientIp(), (et, vl) -> ((SearchLog)et).setClientIp((String)vl), "clientIp");
        setupEpg(_epgMap, et -> ((SearchLog)et).getUserSessionId(), (et, vl) -> ((SearchLog)et).setUserSessionId((String)vl), "userSessionId");
        setupEpg(_epgMap, et -> ((SearchLog)et).getAccessType(), (et, vl) -> {
            ColumnInfo col = columnAccessType();
            CDef.AccessType cls = (CDef.AccessType)gcls(col, vl);
            if (cls != null) {
                ((SearchLog)et).setAccessTypeAsAccessType(cls);
            } else {
                ((SearchLog)et).mynativeMappingAccessType((String)vl);
            }
        }, "accessType");
        setupEpg(_epgMap, et -> ((SearchLog)et).getUserId(), (et, vl) -> ((SearchLog)et).setUserId(ctl(vl)), "userId");
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
        setupEfpg(_efpgMap, et -> ((SearchLog)et).getUserInfo(), (et, vl) -> ((SearchLog)et).setUserInfo((OptionalEntity<UserInfo>)vl), "userInfo");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SEARCH_LOG";
    protected final String _tableDispName = "SEARCH_LOG";
    protected final String _tablePropertyName = "searchLog";
    protected final TableSqlName _tableSqlName = new TableSqlName("SEARCH_LOG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_F183D3A9_46A8_4D39_9FA1_32A82838FC31", false, null, null, null, "clickLogList,searchFieldLogList", null, false);
    protected final ColumnInfo _columnSearchWord = cci("SEARCH_WORD", "SEARCH_WORD", null, null, String.class, "searchWord", null, false, false, false, "VARCHAR", 1000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRequestedTime = cci("REQUESTED_TIME", "REQUESTED_TIME", null, null, java.time.LocalDateTime.class, "requestedTime", null, false, false, true, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnResponseTime = cci("RESPONSE_TIME", "RESPONSE_TIME", null, null, Integer.class, "responseTime", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHitCount = cci("HIT_COUNT", "HIT_COUNT", null, null, Long.class, "hitCount", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQueryOffset = cci("QUERY_OFFSET", "QUERY_OFFSET", null, null, Integer.class, "queryOffset", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQueryPageSize = cci("QUERY_PAGE_SIZE", "QUERY_PAGE_SIZE", null, null, Integer.class, "queryPageSize", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserAgent = cci("USER_AGENT", "USER_AGENT", null, null, String.class, "userAgent", null, false, false, false, "VARCHAR", 255, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReferer = cci("REFERER", "REFERER", null, null, String.class, "referer", null, false, false, false, "VARCHAR", 1000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientIp = cci("CLIENT_IP", "CLIENT_IP", null, null, String.class, "clientIp", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserSessionId = cci("USER_SESSION_ID", "USER_SESSION_ID", null, null, String.class, "userSessionId", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAccessType = cci("ACCESS_TYPE", "ACCESS_TYPE", null, null, String.class, "accessType", null, false, false, true, "VARCHAR", 1, 0, null, false, null, null, null, null, CDef.DefMeta.AccessType, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Long.class, "userId", null, false, false, false, "BIGINT", 19, 0, null, false, null, null, "userInfo", null, null, false);

    /**
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * SEARCH_WORD: {IX, VARCHAR(1000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSearchWord() { return _columnSearchWord; }
    /**
     * REQUESTED_TIME: {IX+, NotNull, TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRequestedTime() { return _columnRequestedTime; }
    /**
     * RESPONSE_TIME: {IX, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnResponseTime() { return _columnResponseTime; }
    /**
     * HIT_COUNT: {IX, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHitCount() { return _columnHitCount; }
    /**
     * QUERY_OFFSET: {NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQueryOffset() { return _columnQueryOffset; }
    /**
     * QUERY_PAGE_SIZE: {NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQueryPageSize() { return _columnQueryPageSize; }
    /**
     * USER_AGENT: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserAgent() { return _columnUserAgent; }
    /**
     * REFERER: {VARCHAR(1000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReferer() { return _columnReferer; }
    /**
     * CLIENT_IP: {VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientIp() { return _columnClientIp; }
    /**
     * USER_SESSION_ID: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserSessionId() { return _columnUserSessionId; }
    /**
     * ACCESS_TYPE: {NotNull, VARCHAR(1), classification=AccessType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccessType() { return _columnAccessType; }
    /**
     * USER_ID: {IX, BIGINT(19), FK to USER_INFO}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnSearchWord());
        ls.add(columnRequestedTime());
        ls.add(columnResponseTime());
        ls.add(columnHitCount());
        ls.add(columnQueryOffset());
        ls.add(columnQueryPageSize());
        ls.add(columnUserAgent());
        ls.add(columnReferer());
        ls.add(columnClientIp());
        ls.add(columnUserSessionId());
        ls.add(columnAccessType());
        ls.add(columnUserId());
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
     * USER_INFO by my USER_ID, named 'userInfo'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserInfo() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), UserInfoDbm.getInstance().columnId());
        return cfi("CONSTRAINT_F2A", "userInfo", this, UserInfoDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "searchLogList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * CLICK_LOG by SEARCH_ID, named 'clickLogList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerClickLogList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), ClickLogDbm.getInstance().columnSearchId());
        return cri("CONSTRAINT_310", "clickLogList", this, ClickLogDbm.getInstance(), mp, false, "searchLog");
    }
    /**
     * SEARCH_FIELD_LOG by SEARCH_ID, named 'searchFieldLogList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerSearchFieldLogList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), SearchFieldLogDbm.getInstance().columnSearchId());
        return cri("CONSTRAINT_96", "searchFieldLogList", this, SearchFieldLogDbm.getInstance(), mp, false, "searchLog");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.SearchLog"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.SearchLogCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.SearchLogBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SearchLog> getEntityType() { return SearchLog.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SearchLog newEntity() { return new SearchLog(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SearchLog)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SearchLog)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
