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
 * The DB meta of OVERLAPPING_HOST. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class OverlappingHostDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final OverlappingHostDbm _instance = new OverlappingHostDbm();
    private OverlappingHostDbm() {}
    public static OverlappingHostDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((OverlappingHost)et).getId(), (et, vl) -> ((OverlappingHost)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((OverlappingHost)et).getRegularName(), (et, vl) -> ((OverlappingHost)et).setRegularName((String)vl), "regularName");
        setupEpg(_epgMap, et -> ((OverlappingHost)et).getOverlappingName(), (et, vl) -> ((OverlappingHost)et).setOverlappingName((String)vl), "overlappingName");
        setupEpg(_epgMap, et -> ((OverlappingHost)et).getSortOrder(), (et, vl) -> ((OverlappingHost)et).setSortOrder(cti(vl)), "sortOrder");
        setupEpg(_epgMap, et -> ((OverlappingHost)et).getCreatedBy(), (et, vl) -> ((OverlappingHost)et).setCreatedBy((String)vl), "createdBy");
        setupEpg(_epgMap, et -> ((OverlappingHost)et).getCreatedTime(), (et, vl) -> ((OverlappingHost)et).setCreatedTime(ctldt(vl)), "createdTime");
        setupEpg(_epgMap, et -> ((OverlappingHost)et).getUpdatedBy(), (et, vl) -> ((OverlappingHost)et).setUpdatedBy((String)vl), "updatedBy");
        setupEpg(_epgMap, et -> ((OverlappingHost)et).getUpdatedTime(), (et, vl) -> ((OverlappingHost)et).setUpdatedTime(ctldt(vl)), "updatedTime");
        setupEpg(_epgMap, et -> ((OverlappingHost)et).getDeletedBy(), (et, vl) -> ((OverlappingHost)et).setDeletedBy((String)vl), "deletedBy");
        setupEpg(_epgMap, et -> ((OverlappingHost)et).getDeletedTime(), (et, vl) -> ((OverlappingHost)et).setDeletedTime(ctldt(vl)), "deletedTime");
        setupEpg(_epgMap, et -> ((OverlappingHost)et).getVersionNo(), (et, vl) -> ((OverlappingHost)et).setVersionNo(cti(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "OVERLAPPING_HOST";
    protected final String _tableDispName = "OVERLAPPING_HOST";
    protected final String _tablePropertyName = "overlappingHost";
    protected final TableSqlName _tableSqlName = new TableSqlName("OVERLAPPING_HOST", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegularName = cci("REGULAR_NAME", "REGULAR_NAME", null, null, String.class, "regularName", null, false, false, true, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOverlappingName = cci("OVERLAPPING_NAME", "OVERLAPPING_NAME", null, null, String.class, "overlappingName", null, false, false, true, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSortOrder = cci("SORT_ORDER", "SORT_ORDER", null, null, Integer.class, "sortOrder", null, false, false, true, "INT", 10, 0, null, false, null, null, null, null, null, false);
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
     * REGULAR_NAME: {NotNull, TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegularName() { return _columnRegularName; }
    /**
     * OVERLAPPING_NAME: {NotNull, TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOverlappingName() { return _columnOverlappingName; }
    /**
     * SORT_ORDER: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSortOrder() { return _columnSortOrder; }
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
        ls.add(columnRegularName());
        ls.add(columnOverlappingName());
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
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.OverlappingHost"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.OverlappingHostCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.OverlappingHostBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<OverlappingHost> getEntityType() { return OverlappingHost.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public OverlappingHost newEntity() { return new OverlappingHost(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((OverlappingHost)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((OverlappingHost)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
