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
 * The DB meta of DATA_CONFIG_TO_LABEL_TYPE_MAPPING. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DataConfigToLabelTypeMappingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DataConfigToLabelTypeMappingDbm _instance = new DataConfigToLabelTypeMappingDbm();
    private DataConfigToLabelTypeMappingDbm() {}
    public static DataConfigToLabelTypeMappingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DataConfigToLabelTypeMapping)et).getId(), (et, vl) -> ((DataConfigToLabelTypeMapping)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((DataConfigToLabelTypeMapping)et).getDataConfigId(), (et, vl) -> ((DataConfigToLabelTypeMapping)et).setDataConfigId(ctl(vl)), "dataConfigId");
        setupEpg(_epgMap, et -> ((DataConfigToLabelTypeMapping)et).getLabelTypeId(), (et, vl) -> ((DataConfigToLabelTypeMapping)et).setLabelTypeId(ctl(vl)), "labelTypeId");
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
        setupEfpg(_efpgMap, et -> ((DataConfigToLabelTypeMapping)et).getDataCrawlingConfig(), (et, vl) -> ((DataConfigToLabelTypeMapping)et).setDataCrawlingConfig((OptionalEntity<DataCrawlingConfig>)vl), "dataCrawlingConfig");
        setupEfpg(_efpgMap, et -> ((DataConfigToLabelTypeMapping)et).getLabelType(), (et, vl) -> ((DataConfigToLabelTypeMapping)et).setLabelType((OptionalEntity<LabelType>)vl), "labelType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "DATA_CONFIG_TO_LABEL_TYPE_MAPPING";
    protected final String _tableDispName = "DATA_CONFIG_TO_LABEL_TYPE_MAPPING";
    protected final String _tablePropertyName = "dataConfigToLabelTypeMapping";
    protected final TableSqlName _tableSqlName = new TableSqlName("DATA_CONFIG_TO_LABEL_TYPE_MAPPING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataConfigId = cci("DATA_CONFIG_ID", "DATA_CONFIG_ID", null, null, Long.class, "dataConfigId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "dataCrawlingConfig", null, null, false);
    protected final ColumnInfo _columnLabelTypeId = cci("LABEL_TYPE_ID", "LABEL_TYPE_ID", null, null, Long.class, "labelTypeId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "labelType", null, null, false);

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
     * LABEL_TYPE_ID: {IX, NotNull, BIGINT(19), FK to LABEL_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLabelTypeId() { return _columnLabelTypeId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnDataConfigId());
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
     * DATA_CRAWLING_CONFIG by my DATA_CONFIG_ID, named 'dataCrawlingConfig'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignDataCrawlingConfig() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDataConfigId(), DataCrawlingConfigDbm.getInstance().columnId());
        return cfi("DATA_CONFIG_TO_LABEL_TYPE_MAPPING_ibfk_1", "dataCrawlingConfig", this, DataCrawlingConfigDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "dataConfigToLabelTypeMappingList", false);
    }
    /**
     * LABEL_TYPE by my LABEL_TYPE_ID, named 'labelType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignLabelType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLabelTypeId(), LabelTypeDbm.getInstance().columnId());
        return cfi("DATA_CONFIG_TO_LABEL_TYPE_MAPPING_ibfk_2", "labelType", this, LabelTypeDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "dataConfigToLabelTypeMappingList", false);
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
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.DataConfigToLabelTypeMapping"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.DataConfigToLabelTypeMappingCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.DataConfigToLabelTypeMappingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DataConfigToLabelTypeMapping> getEntityType() { return DataConfigToLabelTypeMapping.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DataConfigToLabelTypeMapping newEntity() { return new DataConfigToLabelTypeMapping(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DataConfigToLabelTypeMapping)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DataConfigToLabelTypeMapping)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
