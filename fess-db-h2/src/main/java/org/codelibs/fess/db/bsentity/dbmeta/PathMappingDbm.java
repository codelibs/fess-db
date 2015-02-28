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
 * The DB meta of PATH_MAPPING. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PathMappingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PathMappingDbm _instance = new PathMappingDbm();
    private PathMappingDbm() {}
    public static PathMappingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PathMapping)et).getId(), (et, vl) -> ((PathMapping)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((PathMapping)et).getRegex(), (et, vl) -> ((PathMapping)et).setRegex((String)vl), "regex");
        setupEpg(_epgMap, et -> ((PathMapping)et).getReplacement(), (et, vl) -> ((PathMapping)et).setReplacement((String)vl), "replacement");
        setupEpg(_epgMap, et -> ((PathMapping)et).getProcessType(), (et, vl) -> {
            ColumnInfo col = columnProcessType();
            CDef.ProcessType cls = (CDef.ProcessType)gcls(col, vl);
            if (cls != null) {
                ((PathMapping)et).setProcessTypeAsProcessType(cls);
            } else {
                ((PathMapping)et).mynativeMappingProcessType((String)vl);
            }
        }, "processType");
        setupEpg(_epgMap, et -> ((PathMapping)et).getSortOrder(), (et, vl) -> ((PathMapping)et).setSortOrder(cti(vl)), "sortOrder");
        setupEpg(_epgMap, et -> ((PathMapping)et).getCreatedBy(), (et, vl) -> ((PathMapping)et).setCreatedBy((String)vl), "createdBy");
        setupEpg(_epgMap, et -> ((PathMapping)et).getCreatedTime(), (et, vl) -> ((PathMapping)et).setCreatedTime(ctldt(vl)), "createdTime");
        setupEpg(_epgMap, et -> ((PathMapping)et).getUpdatedBy(), (et, vl) -> ((PathMapping)et).setUpdatedBy((String)vl), "updatedBy");
        setupEpg(_epgMap, et -> ((PathMapping)et).getUpdatedTime(), (et, vl) -> ((PathMapping)et).setUpdatedTime(ctldt(vl)), "updatedTime");
        setupEpg(_epgMap, et -> ((PathMapping)et).getDeletedBy(), (et, vl) -> ((PathMapping)et).setDeletedBy((String)vl), "deletedBy");
        setupEpg(_epgMap, et -> ((PathMapping)et).getDeletedTime(), (et, vl) -> ((PathMapping)et).setDeletedTime(ctldt(vl)), "deletedTime");
        setupEpg(_epgMap, et -> ((PathMapping)et).getVersionNo(), (et, vl) -> ((PathMapping)et).setVersionNo(cti(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PATH_MAPPING";
    protected final String _tableDispName = "PATH_MAPPING";
    protected final String _tablePropertyName = "pathMapping";
    protected final TableSqlName _tableSqlName = new TableSqlName("PATH_MAPPING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_7662972D_2392_4EAA_BBD9_A3DFE7B51C8F", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegex = cci("REGEX", "REGEX", null, null, String.class, "regex", null, false, false, true, "VARCHAR", 1000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplacement = cci("REPLACEMENT", "REPLACEMENT", null, null, String.class, "replacement", null, false, false, true, "VARCHAR", 1000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessType = cci("PROCESS_TYPE", "PROCESS_TYPE", null, null, String.class, "processType", null, false, false, true, "VARCHAR", 1, 0, null, false, null, null, null, null, CDef.DefMeta.ProcessType, false);
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
     * REGEX: {NotNull, VARCHAR(1000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegex() { return _columnRegex; }
    /**
     * REPLACEMENT: {NotNull, VARCHAR(1000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplacement() { return _columnReplacement; }
    /**
     * PROCESS_TYPE: {NotNull, VARCHAR(1), classification=ProcessType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessType() { return _columnProcessType; }
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
        ls.add(columnRegex());
        ls.add(columnReplacement());
        ls.add(columnProcessType());
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.PathMapping"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.PathMappingCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.PathMappingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PathMapping> getEntityType() { return PathMapping.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PathMapping newEntity() { return new PathMapping(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PathMapping)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PathMapping)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
