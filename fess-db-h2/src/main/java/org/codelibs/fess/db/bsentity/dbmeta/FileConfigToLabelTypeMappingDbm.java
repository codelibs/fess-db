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
 * The DB meta of FILE_CONFIG_TO_LABEL_TYPE_MAPPING. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class FileConfigToLabelTypeMappingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final FileConfigToLabelTypeMappingDbm _instance = new FileConfigToLabelTypeMappingDbm();
    private FileConfigToLabelTypeMappingDbm() {}
    public static FileConfigToLabelTypeMappingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((FileConfigToLabelTypeMapping)et).getId(), (et, vl) -> ((FileConfigToLabelTypeMapping)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((FileConfigToLabelTypeMapping)et).getFileConfigId(), (et, vl) -> ((FileConfigToLabelTypeMapping)et).setFileConfigId(ctl(vl)), "fileConfigId");
        setupEpg(_epgMap, et -> ((FileConfigToLabelTypeMapping)et).getLabelTypeId(), (et, vl) -> ((FileConfigToLabelTypeMapping)et).setLabelTypeId(ctl(vl)), "labelTypeId");
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
        setupEfpg(_efpgMap, et -> ((FileConfigToLabelTypeMapping)et).getFileCrawlingConfig(), (et, vl) -> ((FileConfigToLabelTypeMapping)et).setFileCrawlingConfig((OptionalEntity<FileCrawlingConfig>)vl), "fileCrawlingConfig");
        setupEfpg(_efpgMap, et -> ((FileConfigToLabelTypeMapping)et).getLabelType(), (et, vl) -> ((FileConfigToLabelTypeMapping)et).setLabelType((OptionalEntity<LabelType>)vl), "labelType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "FILE_CONFIG_TO_LABEL_TYPE_MAPPING";
    protected final String _tableDispName = "FILE_CONFIG_TO_LABEL_TYPE_MAPPING";
    protected final String _tablePropertyName = "fileConfigToLabelTypeMapping";
    protected final TableSqlName _tableSqlName = new TableSqlName("FILE_CONFIG_TO_LABEL_TYPE_MAPPING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_971D385A_45FD_43DC_A955_31B8B6092933", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFileConfigId = cci("FILE_CONFIG_ID", "FILE_CONFIG_ID", null, null, Long.class, "fileConfigId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "fileCrawlingConfig", null, null, false);
    protected final ColumnInfo _columnLabelTypeId = cci("LABEL_TYPE_ID", "LABEL_TYPE_ID", null, null, Long.class, "labelTypeId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "labelType", null, null, false);

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
     * LABEL_TYPE_ID: {IX, NotNull, BIGINT(19), FK to LABEL_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLabelTypeId() { return _columnLabelTypeId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnFileConfigId());
        ls.add(columnLabelTypeId());
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
        return cfi("CONSTRAINT_F57F", "fileCrawlingConfig", this, FileCrawlingConfigDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "fileConfigToLabelTypeMappingList", false);
    }
    /**
     * LABEL_TYPE by my LABEL_TYPE_ID, named 'labelType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLabelType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLabelTypeId(), LabelTypeDbm.getInstance().columnId());
        return cfi("CONSTRAINT_F57", "labelType", this, LabelTypeDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "fileConfigToLabelTypeMappingList", false);
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
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.FileConfigToLabelTypeMapping"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.FileConfigToLabelTypeMappingCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.FileConfigToLabelTypeMappingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<FileConfigToLabelTypeMapping> getEntityType() { return FileConfigToLabelTypeMapping.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public FileConfigToLabelTypeMapping newEntity() { return new FileConfigToLabelTypeMapping(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((FileConfigToLabelTypeMapping)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((FileConfigToLabelTypeMapping)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
