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
 * The DB meta of WEB_CRAWLING_CONFIG. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WebCrawlingConfigDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WebCrawlingConfigDbm _instance = new WebCrawlingConfigDbm();
    private WebCrawlingConfigDbm() {}
    public static WebCrawlingConfigDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getId(), (et, vl) -> ((WebCrawlingConfig)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getName(), (et, vl) -> ((WebCrawlingConfig)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getUrls(), (et, vl) -> ((WebCrawlingConfig)et).setUrls((String)vl), "urls");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getIncludedUrls(), (et, vl) -> ((WebCrawlingConfig)et).setIncludedUrls((String)vl), "includedUrls");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getExcludedUrls(), (et, vl) -> ((WebCrawlingConfig)et).setExcludedUrls((String)vl), "excludedUrls");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getIncludedDocUrls(), (et, vl) -> ((WebCrawlingConfig)et).setIncludedDocUrls((String)vl), "includedDocUrls");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getExcludedDocUrls(), (et, vl) -> ((WebCrawlingConfig)et).setExcludedDocUrls((String)vl), "excludedDocUrls");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getConfigParameter(), (et, vl) -> ((WebCrawlingConfig)et).setConfigParameter((String)vl), "configParameter");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getDepth(), (et, vl) -> ((WebCrawlingConfig)et).setDepth(cti(vl)), "depth");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getMaxAccessCount(), (et, vl) -> ((WebCrawlingConfig)et).setMaxAccessCount(ctl(vl)), "maxAccessCount");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getUserAgent(), (et, vl) -> ((WebCrawlingConfig)et).setUserAgent((String)vl), "userAgent");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getNumOfThread(), (et, vl) -> ((WebCrawlingConfig)et).setNumOfThread(cti(vl)), "numOfThread");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getIntervalTime(), (et, vl) -> ((WebCrawlingConfig)et).setIntervalTime(cti(vl)), "intervalTime");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getBoost(), (et, vl) -> ((WebCrawlingConfig)et).setBoost(ctb(vl)), "boost");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getAvailable(), (et, vl) -> ((WebCrawlingConfig)et).setAvailable((String)vl), "available");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getSortOrder(), (et, vl) -> ((WebCrawlingConfig)et).setSortOrder(cti(vl)), "sortOrder");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getCreatedBy(), (et, vl) -> ((WebCrawlingConfig)et).setCreatedBy((String)vl), "createdBy");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getCreatedTime(), (et, vl) -> ((WebCrawlingConfig)et).setCreatedTime(ctldt(vl)), "createdTime");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getUpdatedBy(), (et, vl) -> ((WebCrawlingConfig)et).setUpdatedBy((String)vl), "updatedBy");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getUpdatedTime(), (et, vl) -> ((WebCrawlingConfig)et).setUpdatedTime(ctldt(vl)), "updatedTime");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getDeletedBy(), (et, vl) -> ((WebCrawlingConfig)et).setDeletedBy((String)vl), "deletedBy");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getDeletedTime(), (et, vl) -> ((WebCrawlingConfig)et).setDeletedTime(ctldt(vl)), "deletedTime");
        setupEpg(_epgMap, et -> ((WebCrawlingConfig)et).getVersionNo(), (et, vl) -> ((WebCrawlingConfig)et).setVersionNo(cti(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WEB_CRAWLING_CONFIG";
    protected final String _tableDispName = "WEB_CRAWLING_CONFIG";
    protected final String _tablePropertyName = "webCrawlingConfig";
    protected final TableSqlName _tableSqlName = new TableSqlName("WEB_CRAWLING_CONFIG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_6A2AC523_E1F1_4A9B_84B9_E69E676D3E2D", false, null, null, null, "requestHeaderList,webAuthenticationList,webConfigToLabelTypeMappingList,webConfigToRoleTypeMappingList", null, false);
    protected final ColumnInfo _columnName = cci("NAME", "NAME", null, null, String.class, "name", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUrls = cci("URLS", "URLS", null, null, String.class, "urls", null, false, false, true, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIncludedUrls = cci("INCLUDED_URLS", "INCLUDED_URLS", null, null, String.class, "includedUrls", null, false, false, false, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExcludedUrls = cci("EXCLUDED_URLS", "EXCLUDED_URLS", null, null, String.class, "excludedUrls", null, false, false, false, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIncludedDocUrls = cci("INCLUDED_DOC_URLS", "INCLUDED_DOC_URLS", null, null, String.class, "includedDocUrls", null, false, false, false, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExcludedDocUrls = cci("EXCLUDED_DOC_URLS", "EXCLUDED_DOC_URLS", null, null, String.class, "excludedDocUrls", null, false, false, false, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnConfigParameter = cci("CONFIG_PARAMETER", "CONFIG_PARAMETER", null, null, String.class, "configParameter", null, false, false, false, "VARCHAR", 4000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepth = cci("DEPTH", "DEPTH", null, null, Integer.class, "depth", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxAccessCount = cci("MAX_ACCESS_COUNT", "MAX_ACCESS_COUNT", null, null, Long.class, "maxAccessCount", null, false, false, false, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserAgent = cci("USER_AGENT", "USER_AGENT", null, null, String.class, "userAgent", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
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
     * URLS: {NotNull, VARCHAR(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUrls() { return _columnUrls; }
    /**
     * INCLUDED_URLS: {VARCHAR(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIncludedUrls() { return _columnIncludedUrls; }
    /**
     * EXCLUDED_URLS: {VARCHAR(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExcludedUrls() { return _columnExcludedUrls; }
    /**
     * INCLUDED_DOC_URLS: {VARCHAR(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIncludedDocUrls() { return _columnIncludedDocUrls; }
    /**
     * EXCLUDED_DOC_URLS: {VARCHAR(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExcludedDocUrls() { return _columnExcludedDocUrls; }
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
     * USER_AGENT: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserAgent() { return _columnUserAgent; }
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
        ls.add(columnUrls());
        ls.add(columnIncludedUrls());
        ls.add(columnExcludedUrls());
        ls.add(columnIncludedDocUrls());
        ls.add(columnExcludedDocUrls());
        ls.add(columnConfigParameter());
        ls.add(columnDepth());
        ls.add(columnMaxAccessCount());
        ls.add(columnUserAgent());
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
     * REQUEST_HEADER by WEB_CRAWLING_CONFIG_ID, named 'requestHeaderList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerRequestHeaderList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), RequestHeaderDbm.getInstance().columnWebCrawlingConfigId());
        return cri("CONSTRAINT_A1", "requestHeaderList", this, RequestHeaderDbm.getInstance(), mp, false, "webCrawlingConfig");
    }
    /**
     * WEB_AUTHENTICATION by WEB_CRAWLING_CONFIG_ID, named 'webAuthenticationList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWebAuthenticationList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), WebAuthenticationDbm.getInstance().columnWebCrawlingConfigId());
        return cri("CONSTRAINT_A31", "webAuthenticationList", this, WebAuthenticationDbm.getInstance(), mp, false, "webCrawlingConfig");
    }
    /**
     * WEB_CONFIG_TO_LABEL_TYPE_MAPPING by WEB_CONFIG_ID, named 'webConfigToLabelTypeMappingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWebConfigToLabelTypeMappingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), WebConfigToLabelTypeMappingDbm.getInstance().columnWebConfigId());
        return cri("CONSTRAINT_6AC", "webConfigToLabelTypeMappingList", this, WebConfigToLabelTypeMappingDbm.getInstance(), mp, false, "webCrawlingConfig");
    }
    /**
     * WEB_CONFIG_TO_ROLE_TYPE_MAPPING by WEB_CONFIG_ID, named 'webConfigToRoleTypeMappingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWebConfigToRoleTypeMappingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), WebConfigToRoleTypeMappingDbm.getInstance().columnWebConfigId());
        return cri("CONSTRAINT_A17D", "webConfigToRoleTypeMappingList", this, WebConfigToRoleTypeMappingDbm.getInstance(), mp, false, "webCrawlingConfig");
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
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.WebCrawlingConfig"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.WebCrawlingConfigCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.WebCrawlingConfigBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WebCrawlingConfig> getEntityType() { return WebCrawlingConfig.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WebCrawlingConfig newEntity() { return new WebCrawlingConfig(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WebCrawlingConfig)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WebCrawlingConfig)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
