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
 * The DB meta of SUGGEST_ELEVATE_WORD. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SuggestElevateWordDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SuggestElevateWordDbm _instance = new SuggestElevateWordDbm();
    private SuggestElevateWordDbm() {}
    public static SuggestElevateWordDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SuggestElevateWord)et).getId(), (et, vl) -> ((SuggestElevateWord)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((SuggestElevateWord)et).getSuggestWord(), (et, vl) -> ((SuggestElevateWord)et).setSuggestWord((String)vl), "suggestWord");
        setupEpg(_epgMap, et -> ((SuggestElevateWord)et).getReading(), (et, vl) -> ((SuggestElevateWord)et).setReading((String)vl), "reading");
        setupEpg(_epgMap, et -> ((SuggestElevateWord)et).getTargetRole(), (et, vl) -> ((SuggestElevateWord)et).setTargetRole((String)vl), "targetRole");
        setupEpg(_epgMap, et -> ((SuggestElevateWord)et).getTargetLabel(), (et, vl) -> ((SuggestElevateWord)et).setTargetLabel((String)vl), "targetLabel");
        setupEpg(_epgMap, et -> ((SuggestElevateWord)et).getBoost(), (et, vl) -> ((SuggestElevateWord)et).setBoost(ctb(vl)), "boost");
        setupEpg(_epgMap, et -> ((SuggestElevateWord)et).getCreatedBy(), (et, vl) -> ((SuggestElevateWord)et).setCreatedBy((String)vl), "createdBy");
        setupEpg(_epgMap, et -> ((SuggestElevateWord)et).getCreatedTime(), (et, vl) -> ((SuggestElevateWord)et).setCreatedTime(ctldt(vl)), "createdTime");
        setupEpg(_epgMap, et -> ((SuggestElevateWord)et).getUpdatedBy(), (et, vl) -> ((SuggestElevateWord)et).setUpdatedBy((String)vl), "updatedBy");
        setupEpg(_epgMap, et -> ((SuggestElevateWord)et).getUpdatedTime(), (et, vl) -> ((SuggestElevateWord)et).setUpdatedTime(ctldt(vl)), "updatedTime");
        setupEpg(_epgMap, et -> ((SuggestElevateWord)et).getDeletedBy(), (et, vl) -> ((SuggestElevateWord)et).setDeletedBy((String)vl), "deletedBy");
        setupEpg(_epgMap, et -> ((SuggestElevateWord)et).getDeletedTime(), (et, vl) -> ((SuggestElevateWord)et).setDeletedTime(ctldt(vl)), "deletedTime");
        setupEpg(_epgMap, et -> ((SuggestElevateWord)et).getVersionNo(), (et, vl) -> ((SuggestElevateWord)et).setVersionNo(cti(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SUGGEST_ELEVATE_WORD";
    protected final String _tableDispName = "SUGGEST_ELEVATE_WORD";
    protected final String _tablePropertyName = "suggestElevateWord";
    protected final TableSqlName _tableSqlName = new TableSqlName("SUGGEST_ELEVATE_WORD", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuggestWord = cci("SUGGEST_WORD", "SUGGEST_WORD", null, null, String.class, "suggestWord", null, false, false, true, "VARCHAR", 255, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReading = cci("READING", "READING", null, null, String.class, "reading", null, false, false, false, "VARCHAR", 255, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTargetRole = cci("TARGET_ROLE", "TARGET_ROLE", null, null, String.class, "targetRole", null, false, false, false, "VARCHAR", 255, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTargetLabel = cci("TARGET_LABEL", "TARGET_LABEL", null, null, String.class, "targetLabel", null, false, false, false, "VARCHAR", 255, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoost = cci("BOOST", "BOOST", null, null, java.math.BigDecimal.class, "boost", null, false, false, true, "FLOAT", 12, 0, null, false, null, null, null, null, null, false);
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
     * SUGGEST_WORD: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuggestWord() { return _columnSuggestWord; }
    /**
     * READING: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReading() { return _columnReading; }
    /**
     * TARGET_ROLE: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTargetRole() { return _columnTargetRole; }
    /**
     * TARGET_LABEL: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTargetLabel() { return _columnTargetLabel; }
    /**
     * BOOST: {NotNull, FLOAT(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoost() { return _columnBoost; }
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
        ls.add(columnSuggestWord());
        ls.add(columnReading());
        ls.add(columnTargetRole());
        ls.add(columnTargetLabel());
        ls.add(columnBoost());
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
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.SuggestElevateWord"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.SuggestElevateWordCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.SuggestElevateWordBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SuggestElevateWord> getEntityType() { return SuggestElevateWord.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SuggestElevateWord newEntity() { return new SuggestElevateWord(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SuggestElevateWord)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SuggestElevateWord)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
