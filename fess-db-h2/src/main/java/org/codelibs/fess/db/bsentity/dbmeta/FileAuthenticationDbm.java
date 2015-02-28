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
 * The DB meta of FILE_AUTHENTICATION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class FileAuthenticationDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final FileAuthenticationDbm _instance = new FileAuthenticationDbm();
    private FileAuthenticationDbm() {}
    public static FileAuthenticationDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((FileAuthentication)et).getId(), (et, vl) -> ((FileAuthentication)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((FileAuthentication)et).getHostname(), (et, vl) -> ((FileAuthentication)et).setHostname((String)vl), "hostname");
        setupEpg(_epgMap, et -> ((FileAuthentication)et).getPort(), (et, vl) -> ((FileAuthentication)et).setPort(cti(vl)), "port");
        setupEpg(_epgMap, et -> ((FileAuthentication)et).getProtocolScheme(), (et, vl) -> ((FileAuthentication)et).setProtocolScheme((String)vl), "protocolScheme");
        setupEpg(_epgMap, et -> ((FileAuthentication)et).getUsername(), (et, vl) -> ((FileAuthentication)et).setUsername((String)vl), "username");
        setupEpg(_epgMap, et -> ((FileAuthentication)et).getPassword(), (et, vl) -> ((FileAuthentication)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((FileAuthentication)et).getParameters(), (et, vl) -> ((FileAuthentication)et).setParameters((String)vl), "parameters");
        setupEpg(_epgMap, et -> ((FileAuthentication)et).getFileCrawlingConfigId(), (et, vl) -> ((FileAuthentication)et).setFileCrawlingConfigId(ctl(vl)), "fileCrawlingConfigId");
        setupEpg(_epgMap, et -> ((FileAuthentication)et).getCreatedBy(), (et, vl) -> ((FileAuthentication)et).setCreatedBy((String)vl), "createdBy");
        setupEpg(_epgMap, et -> ((FileAuthentication)et).getCreatedTime(), (et, vl) -> ((FileAuthentication)et).setCreatedTime(ctldt(vl)), "createdTime");
        setupEpg(_epgMap, et -> ((FileAuthentication)et).getUpdatedBy(), (et, vl) -> ((FileAuthentication)et).setUpdatedBy((String)vl), "updatedBy");
        setupEpg(_epgMap, et -> ((FileAuthentication)et).getUpdatedTime(), (et, vl) -> ((FileAuthentication)et).setUpdatedTime(ctldt(vl)), "updatedTime");
        setupEpg(_epgMap, et -> ((FileAuthentication)et).getDeletedBy(), (et, vl) -> ((FileAuthentication)et).setDeletedBy((String)vl), "deletedBy");
        setupEpg(_epgMap, et -> ((FileAuthentication)et).getDeletedTime(), (et, vl) -> ((FileAuthentication)et).setDeletedTime(ctldt(vl)), "deletedTime");
        setupEpg(_epgMap, et -> ((FileAuthentication)et).getVersionNo(), (et, vl) -> ((FileAuthentication)et).setVersionNo(cti(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((FileAuthentication)et).getFileCrawlingConfig(), (et, vl) -> ((FileAuthentication)et).setFileCrawlingConfig((OptionalEntity<FileCrawlingConfig>)vl), "fileCrawlingConfig");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "FILE_AUTHENTICATION";
    protected final String _tableDispName = "FILE_AUTHENTICATION";
    protected final String _tablePropertyName = "fileAuthentication";
    protected final TableSqlName _tableSqlName = new TableSqlName("FILE_AUTHENTICATION", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_B28A9882_C08B_4EB7_82F2_1EBACFA3995E", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHostname = cci("HOSTNAME", "HOSTNAME", null, null, String.class, "hostname", null, false, false, false, "VARCHAR", 255, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPort = cci("PORT", "PORT", null, null, Integer.class, "port", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProtocolScheme = cci("PROTOCOL_SCHEME", "PROTOCOL_SCHEME", null, null, String.class, "protocolScheme", null, false, false, false, "VARCHAR", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUsername = cci("USERNAME", "USERNAME", null, null, String.class, "username", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPassword = cci("PASSWORD", "PASSWORD", null, null, String.class, "password", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnParameters = cci("PARAMETERS", "PARAMETERS", null, null, String.class, "parameters", null, false, false, false, "VARCHAR", 1000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFileCrawlingConfigId = cci("FILE_CRAWLING_CONFIG_ID", "FILE_CRAWLING_CONFIG_ID", null, null, Long.class, "fileCrawlingConfigId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "fileCrawlingConfig", null, null, false);
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
     * HOSTNAME: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHostname() { return _columnHostname; }
    /**
     * PORT: {NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPort() { return _columnPort; }
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
     * PARAMETERS: {VARCHAR(1000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParameters() { return _columnParameters; }
    /**
     * FILE_CRAWLING_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to FILE_CRAWLING_CONFIG}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFileCrawlingConfigId() { return _columnFileCrawlingConfigId; }
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
        ls.add(columnHostname());
        ls.add(columnPort());
        ls.add(columnProtocolScheme());
        ls.add(columnUsername());
        ls.add(columnPassword());
        ls.add(columnParameters());
        ls.add(columnFileCrawlingConfigId());
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
     * FILE_CRAWLING_CONFIG by my FILE_CRAWLING_CONFIG_ID, named 'fileCrawlingConfig'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignFileCrawlingConfig() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFileCrawlingConfigId(), FileCrawlingConfigDbm.getInstance().columnId());
        return cfi("CONSTRAINT_F90", "fileCrawlingConfig", this, FileCrawlingConfigDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "fileAuthenticationList", false);
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
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.FileAuthentication"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.FileAuthenticationCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.FileAuthenticationBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<FileAuthentication> getEntityType() { return FileAuthentication.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public FileAuthentication newEntity() { return new FileAuthentication(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((FileAuthentication)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((FileAuthentication)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
