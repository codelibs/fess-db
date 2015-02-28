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
 * The DB meta of WEB_CONFIG_TO_ROLE_TYPE_MAPPING. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WebConfigToRoleTypeMappingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WebConfigToRoleTypeMappingDbm _instance = new WebConfigToRoleTypeMappingDbm();
    private WebConfigToRoleTypeMappingDbm() {}
    public static WebConfigToRoleTypeMappingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WebConfigToRoleTypeMapping)et).getId(), (et, vl) -> ((WebConfigToRoleTypeMapping)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((WebConfigToRoleTypeMapping)et).getWebConfigId(), (et, vl) -> ((WebConfigToRoleTypeMapping)et).setWebConfigId(ctl(vl)), "webConfigId");
        setupEpg(_epgMap, et -> ((WebConfigToRoleTypeMapping)et).getRoleTypeId(), (et, vl) -> ((WebConfigToRoleTypeMapping)et).setRoleTypeId(ctl(vl)), "roleTypeId");
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
        setupEfpg(_efpgMap, et -> ((WebConfigToRoleTypeMapping)et).getRoleType(), (et, vl) -> ((WebConfigToRoleTypeMapping)et).setRoleType((OptionalEntity<RoleType>)vl), "roleType");
        setupEfpg(_efpgMap, et -> ((WebConfigToRoleTypeMapping)et).getWebCrawlingConfig(), (et, vl) -> ((WebConfigToRoleTypeMapping)et).setWebCrawlingConfig((OptionalEntity<WebCrawlingConfig>)vl), "webCrawlingConfig");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WEB_CONFIG_TO_ROLE_TYPE_MAPPING";
    protected final String _tableDispName = "WEB_CONFIG_TO_ROLE_TYPE_MAPPING";
    protected final String _tablePropertyName = "webConfigToRoleTypeMapping";
    protected final TableSqlName _tableSqlName = new TableSqlName("WEB_CONFIG_TO_ROLE_TYPE_MAPPING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWebConfigId = cci("WEB_CONFIG_ID", "WEB_CONFIG_ID", null, null, Long.class, "webConfigId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "webCrawlingConfig", null, null, false);
    protected final ColumnInfo _columnRoleTypeId = cci("ROLE_TYPE_ID", "ROLE_TYPE_ID", null, null, Long.class, "roleTypeId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "roleType", null, null, false);

    /**
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * WEB_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWebConfigId() { return _columnWebConfigId; }
    /**
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRoleTypeId() { return _columnRoleTypeId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnWebConfigId());
        ls.add(columnRoleTypeId());
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
     * ROLE_TYPE by my ROLE_TYPE_ID, named 'roleType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignRoleType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRoleTypeId(), RoleTypeDbm.getInstance().columnId());
        return cfi("WEB_CONFIG_TO_ROLE_TYPE_MAPPING_ibfk_2", "roleType", this, RoleTypeDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "webConfigToRoleTypeMappingList", false);
    }
    /**
     * WEB_CRAWLING_CONFIG by my WEB_CONFIG_ID, named 'webCrawlingConfig'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWebCrawlingConfig() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWebConfigId(), WebCrawlingConfigDbm.getInstance().columnId());
        return cfi("WEB_CONFIG_TO_ROLE_TYPE_MAPPING_ibfk_1", "webCrawlingConfig", this, WebCrawlingConfigDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "webConfigToRoleTypeMappingList", false);
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
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.WebConfigToRoleTypeMapping"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.WebConfigToRoleTypeMappingCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.WebConfigToRoleTypeMappingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WebConfigToRoleTypeMapping> getEntityType() { return WebConfigToRoleTypeMapping.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WebConfigToRoleTypeMapping newEntity() { return new WebConfigToRoleTypeMapping(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WebConfigToRoleTypeMapping)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WebConfigToRoleTypeMapping)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
