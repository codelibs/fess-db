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
 * The DB meta of FILE_CONFIG_TO_ROLE_TYPE_MAPPING. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class FileConfigToRoleTypeMappingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final FileConfigToRoleTypeMappingDbm _instance = new FileConfigToRoleTypeMappingDbm();
    private FileConfigToRoleTypeMappingDbm() {}
    public static FileConfigToRoleTypeMappingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((FileConfigToRoleTypeMapping)et).getId(), (et, vl) -> ((FileConfigToRoleTypeMapping)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((FileConfigToRoleTypeMapping)et).getFileConfigId(), (et, vl) -> ((FileConfigToRoleTypeMapping)et).setFileConfigId(ctl(vl)), "fileConfigId");
        setupEpg(_epgMap, et -> ((FileConfigToRoleTypeMapping)et).getRoleTypeId(), (et, vl) -> ((FileConfigToRoleTypeMapping)et).setRoleTypeId(ctl(vl)), "roleTypeId");
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
        setupEfpg(_efpgMap, et -> ((FileConfigToRoleTypeMapping)et).getFileCrawlingConfig(), (et, vl) -> ((FileConfigToRoleTypeMapping)et).setFileCrawlingConfig((OptionalEntity<FileCrawlingConfig>)vl), "fileCrawlingConfig");
        setupEfpg(_efpgMap, et -> ((FileConfigToRoleTypeMapping)et).getRoleType(), (et, vl) -> ((FileConfigToRoleTypeMapping)et).setRoleType((OptionalEntity<RoleType>)vl), "roleType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "FILE_CONFIG_TO_ROLE_TYPE_MAPPING";
    protected final String _tableDispName = "FILE_CONFIG_TO_ROLE_TYPE_MAPPING";
    protected final String _tablePropertyName = "fileConfigToRoleTypeMapping";
    protected final TableSqlName _tableSqlName = new TableSqlName("FILE_CONFIG_TO_ROLE_TYPE_MAPPING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_E4FCCB00_E116_42AC_8D8C_EC21A26E09D7", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFileConfigId = cci("FILE_CONFIG_ID", "FILE_CONFIG_ID", null, null, Long.class, "fileConfigId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "fileCrawlingConfig", null, null, false);
    protected final ColumnInfo _columnRoleTypeId = cci("ROLE_TYPE_ID", "ROLE_TYPE_ID", null, null, Long.class, "roleTypeId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "roleType", null, null, false);

    /**
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * FILE_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to FILE_CRAWLING_CONFIG}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFileConfigId() { return _columnFileConfigId; }
    /**
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRoleTypeId() { return _columnRoleTypeId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnFileConfigId());
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
     * FILE_CRAWLING_CONFIG by my FILE_CONFIG_ID, named 'fileCrawlingConfig'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignFileCrawlingConfig() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFileConfigId(), FileCrawlingConfigDbm.getInstance().columnId());
        return cfi("CONSTRAINT_3A", "fileCrawlingConfig", this, FileCrawlingConfigDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "fileConfigToRoleTypeMappingList", false);
    }
    /**
     * ROLE_TYPE by my ROLE_TYPE_ID, named 'roleType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignRoleType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRoleTypeId(), RoleTypeDbm.getInstance().columnId());
        return cfi("CONSTRAINT_3A9", "roleType", this, RoleTypeDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "fileConfigToRoleTypeMappingList", false);
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
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.FileConfigToRoleTypeMapping"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.FileConfigToRoleTypeMappingCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.FileConfigToRoleTypeMappingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<FileConfigToRoleTypeMapping> getEntityType() { return FileConfigToRoleTypeMapping.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public FileConfigToRoleTypeMapping newEntity() { return new FileConfigToRoleTypeMapping(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((FileConfigToRoleTypeMapping)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((FileConfigToRoleTypeMapping)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
