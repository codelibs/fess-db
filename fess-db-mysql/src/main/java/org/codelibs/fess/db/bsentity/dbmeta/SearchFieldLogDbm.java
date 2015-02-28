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
 * The DB meta of SEARCH_FIELD_LOG. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SearchFieldLogDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SearchFieldLogDbm _instance = new SearchFieldLogDbm();
    private SearchFieldLogDbm() {}
    public static SearchFieldLogDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SearchFieldLog)et).getId(), (et, vl) -> ((SearchFieldLog)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((SearchFieldLog)et).getSearchId(), (et, vl) -> ((SearchFieldLog)et).setSearchId(ctl(vl)), "searchId");
        setupEpg(_epgMap, et -> ((SearchFieldLog)et).getName(), (et, vl) -> ((SearchFieldLog)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((SearchFieldLog)et).getValue(), (et, vl) -> ((SearchFieldLog)et).setValue((String)vl), "value");
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
        setupEfpg(_efpgMap, et -> ((SearchFieldLog)et).getSearchLog(), (et, vl) -> ((SearchFieldLog)et).setSearchLog((OptionalEntity<SearchLog>)vl), "searchLog");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SEARCH_FIELD_LOG";
    protected final String _tableDispName = "SEARCH_FIELD_LOG";
    protected final String _tablePropertyName = "searchFieldLog";
    protected final TableSqlName _tableSqlName = new TableSqlName("SEARCH_FIELD_LOG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSearchId = cci("SEARCH_ID", "SEARCH_ID", null, null, Long.class, "searchId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "searchLog", null, null, false);
    protected final ColumnInfo _columnName = cci("NAME", "NAME", null, null, String.class, "name", null, false, false, true, "VARCHAR", 255, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnValue = cci("VALUE", "VALUE", null, null, String.class, "value", null, false, false, true, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);

    /**
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * SEARCH_ID: {IX, NotNull, BIGINT(19), FK to SEARCH_LOG}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSearchId() { return _columnSearchId; }
    /**
     * NAME: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * VALUE: {NotNull, TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValue() { return _columnValue; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnSearchId());
        ls.add(columnName());
        ls.add(columnValue());
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
     * SEARCH_LOG by my SEARCH_ID, named 'searchLog'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignSearchLog() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSearchId(), SearchLogDbm.getInstance().columnId());
        return cfi("SEARCH_FIELD_LOG_ibfk_1", "searchLog", this, SearchLogDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "searchFieldLogList", false);
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
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.SearchFieldLog"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.SearchFieldLogCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.SearchFieldLogBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SearchFieldLog> getEntityType() { return SearchFieldLog.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SearchFieldLog newEntity() { return new SearchFieldLog(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SearchFieldLog)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SearchFieldLog)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
