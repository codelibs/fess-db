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
 * The DB meta of WEB_AUTHENTICATION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WebAuthenticationDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WebAuthenticationDbm _instance = new WebAuthenticationDbm();
    private WebAuthenticationDbm() {}
    public static WebAuthenticationDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WebAuthentication)et).getId(), (et, vl) -> ((WebAuthentication)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((WebAuthentication)et).getHostname(), (et, vl) -> ((WebAuthentication)et).setHostname((String)vl), "hostname");
        setupEpg(_epgMap, et -> ((WebAuthentication)et).getPort(), (et, vl) -> ((WebAuthentication)et).setPort(cti(vl)), "port");
        setupEpg(_epgMap, et -> ((WebAuthentication)et).getAuthRealm(), (et, vl) -> ((WebAuthentication)et).setAuthRealm((String)vl), "authRealm");
        setupEpg(_epgMap, et -> ((WebAuthentication)et).getProtocolScheme(), (et, vl) -> ((WebAuthentication)et).setProtocolScheme((String)vl), "protocolScheme");
        setupEpg(_epgMap, et -> ((WebAuthentication)et).getUsername(), (et, vl) -> ((WebAuthentication)et).setUsername((String)vl), "username");
        setupEpg(_epgMap, et -> ((WebAuthentication)et).getPassword(), (et, vl) -> ((WebAuthentication)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((WebAuthentication)et).getParameters(), (et, vl) -> ((WebAuthentication)et).setParameters((String)vl), "parameters");
        setupEpg(_epgMap, et -> ((WebAuthentication)et).getWebCrawlingConfigId(), (et, vl) -> ((WebAuthentication)et).setWebCrawlingConfigId(ctl(vl)), "webCrawlingConfigId");
        setupEpg(_epgMap, et -> ((WebAuthentication)et).getCreatedBy(), (et, vl) -> ((WebAuthentication)et).setCreatedBy((String)vl), "createdBy");
        setupEpg(_epgMap, et -> ((WebAuthentication)et).getCreatedTime(), (et, vl) -> ((WebAuthentication)et).setCreatedTime(ctldt(vl)), "createdTime");
        setupEpg(_epgMap, et -> ((WebAuthentication)et).getUpdatedBy(), (et, vl) -> ((WebAuthentication)et).setUpdatedBy((String)vl), "updatedBy");
        setupEpg(_epgMap, et -> ((WebAuthentication)et).getUpdatedTime(), (et, vl) -> ((WebAuthentication)et).setUpdatedTime(ctldt(vl)), "updatedTime");
        setupEpg(_epgMap, et -> ((WebAuthentication)et).getDeletedBy(), (et, vl) -> ((WebAuthentication)et).setDeletedBy((String)vl), "deletedBy");
        setupEpg(_epgMap, et -> ((WebAuthentication)et).getDeletedTime(), (et, vl) -> ((WebAuthentication)et).setDeletedTime(ctldt(vl)), "deletedTime");
        setupEpg(_epgMap, et -> ((WebAuthentication)et).getVersionNo(), (et, vl) -> ((WebAuthentication)et).setVersionNo(cti(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((WebAuthentication)et).getWebCrawlingConfig(), (et, vl) -> ((WebAuthentication)et).setWebCrawlingConfig((OptionalEntity<WebCrawlingConfig>)vl), "webCrawlingConfig");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WEB_AUTHENTICATION";
    protected final String _tableDispName = "WEB_AUTHENTICATION";
    protected final String _tablePropertyName = "webAuthentication";
    protected final TableSqlName _tableSqlName = new TableSqlName("WEB_AUTHENTICATION", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHostname = cci("HOSTNAME", "HOSTNAME", null, null, String.class, "hostname", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPort = cci("PORT", "PORT", null, null, Integer.class, "port", null, false, false, true, "INT", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAuthRealm = cci("AUTH_REALM", "AUTH_REALM", null, null, String.class, "authRealm", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProtocolScheme = cci("PROTOCOL_SCHEME", "PROTOCOL_SCHEME", null, null, String.class, "protocolScheme", null, false, false, false, "VARCHAR", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsername = cci("USERNAME", "USERNAME", null, null, String.class, "username", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPassword = cci("PASSWORD", "PASSWORD", null, null, String.class, "password", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnParameters = cci("PARAMETERS", "PARAMETERS", null, null, String.class, "parameters", null, false, false, false, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWebCrawlingConfigId = cci("WEB_CRAWLING_CONFIG_ID", "WEB_CRAWLING_CONFIG_ID", null, null, Long.class, "webCrawlingConfigId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "webCrawlingConfig", null, null, false);
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
     * HOSTNAME: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHostname() { return _columnHostname; }
    /**
     * PORT: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPort() { return _columnPort; }
    /**
     * AUTH_REALM: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAuthRealm() { return _columnAuthRealm; }
    /**
     * PROTOCOL_SCHEME: {VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProtocolScheme() { return _columnProtocolScheme; }
    /**
     * USERNAME: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsername() { return _columnUsername; }
    /**
     * PASSWORD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPassword() { return _columnPassword; }
    /**
     * PARAMETERS: {TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParameters() { return _columnParameters; }
    /**
     * WEB_CRAWLING_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWebCrawlingConfigId() { return _columnWebCrawlingConfigId; }
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
        ls.add(columnHostname());
        ls.add(columnPort());
        ls.add(columnAuthRealm());
        ls.add(columnProtocolScheme());
        ls.add(columnUsername());
        ls.add(columnPassword());
        ls.add(columnParameters());
        ls.add(columnWebCrawlingConfigId());
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
    /**
     * WEB_CRAWLING_CONFIG by my WEB_CRAWLING_CONFIG_ID, named 'webCrawlingConfig'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWebCrawlingConfig() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWebCrawlingConfigId(), WebCrawlingConfigDbm.getInstance().columnId());
        return cfi("WEB_AUTHENTICATION_ibfk_1", "webCrawlingConfig", this, WebCrawlingConfigDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "webAuthenticationList", false);
    }

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
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.WebAuthentication"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.WebAuthenticationCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.WebAuthenticationBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WebAuthentication> getEntityType() { return WebAuthentication.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WebAuthentication newEntity() { return new WebAuthentication(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WebAuthentication)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WebAuthentication)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
