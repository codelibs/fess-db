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
 * The DB meta of DATA_CONFIG_TO_ROLE_TYPE_MAPPING. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DataConfigToRoleTypeMappingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DataConfigToRoleTypeMappingDbm _instance = new DataConfigToRoleTypeMappingDbm();
    private DataConfigToRoleTypeMappingDbm() {}
    public static DataConfigToRoleTypeMappingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DataConfigToRoleTypeMapping)et).getId(), (et, vl) -> ((DataConfigToRoleTypeMapping)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((DataConfigToRoleTypeMapping)et).getDataConfigId(), (et, vl) -> ((DataConfigToRoleTypeMapping)et).setDataConfigId(ctl(vl)), "dataConfigId");
        setupEpg(_epgMap, et -> ((DataConfigToRoleTypeMapping)et).getRoleTypeId(), (et, vl) -> ((DataConfigToRoleTypeMapping)et).setRoleTypeId(ctl(vl)), "roleTypeId");
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
        setupEfpg(_efpgMap, et -> ((DataConfigToRoleTypeMapping)et).getDataCrawlingConfig(), (et, vl) -> ((DataConfigToRoleTypeMapping)et).setDataCrawlingConfig((OptionalEntity<DataCrawlingConfig>)vl), "dataCrawlingConfig");
        setupEfpg(_efpgMap, et -> ((DataConfigToRoleTypeMapping)et).getRoleType(), (et, vl) -> ((DataConfigToRoleTypeMapping)et).setRoleType((OptionalEntity<RoleType>)vl), "roleType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "DATA_CONFIG_TO_ROLE_TYPE_MAPPING";
    protected final String _tableDispName = "DATA_CONFIG_TO_ROLE_TYPE_MAPPING";
    protected final String _tablePropertyName = "dataConfigToRoleTypeMapping";
    protected final TableSqlName _tableSqlName = new TableSqlName("DATA_CONFIG_TO_ROLE_TYPE_MAPPING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_4030ED41_6AE2_4375_A9F5_F097FA9EB0F9", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataConfigId = cci("DATA_CONFIG_ID", "DATA_CONFIG_ID", null, null, Long.class, "dataConfigId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "dataCrawlingConfig", null, null, false);
    protected final ColumnInfo _columnRoleTypeId = cci("ROLE_TYPE_ID", "ROLE_TYPE_ID", null, null, Long.class, "roleTypeId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "roleType", null, null, false);

    /**
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * DATA_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to DATA_CRAWLING_CONFIG}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataConfigId() { return _columnDataConfigId; }
    /**
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRoleTypeId() { return _columnRoleTypeId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnDataConfigId());
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
     * DATA_CRAWLING_CONFIG by my DATA_CONFIG_ID, named 'dataCrawlingConfig'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignDataCrawlingConfig() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDataConfigId(), DataCrawlingConfigDbm.getInstance().columnId());
        return cfi("CONSTRAINT_E3", "dataCrawlingConfig", this, DataCrawlingConfigDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "dataConfigToRoleTypeMappingList", false);
    }
    /**
     * ROLE_TYPE by my ROLE_TYPE_ID, named 'roleType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignRoleType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRoleTypeId(), RoleTypeDbm.getInstance().columnId());
        return cfi("CONSTRAINT_E31", "roleType", this, RoleTypeDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "dataConfigToRoleTypeMappingList", false);
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
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.DataConfigToRoleTypeMapping"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.DataConfigToRoleTypeMappingCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.DataConfigToRoleTypeMappingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DataConfigToRoleTypeMapping> getEntityType() { return DataConfigToRoleTypeMapping.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DataConfigToRoleTypeMapping newEntity() { return new DataConfigToRoleTypeMapping(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DataConfigToRoleTypeMapping)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DataConfigToRoleTypeMapping)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
