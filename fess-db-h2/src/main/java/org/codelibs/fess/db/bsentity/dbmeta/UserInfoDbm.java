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
 * The DB meta of USER_INFO. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UserInfoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UserInfoDbm _instance = new UserInfoDbm();
    private UserInfoDbm() {}
    public static UserInfoDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((UserInfo)et).getId(), (et, vl) -> ((UserInfo)et).setId(ctl(vl)), "id");
        setupEpg(_epgMap, et -> ((UserInfo)et).getCode(), (et, vl) -> ((UserInfo)et).setCode((String)vl), "code");
        setupEpg(_epgMap, et -> ((UserInfo)et).getCreatedTime(), (et, vl) -> ((UserInfo)et).setCreatedTime(ctldt(vl)), "createdTime");
        setupEpg(_epgMap, et -> ((UserInfo)et).getUpdatedTime(), (et, vl) -> ((UserInfo)et).setUpdatedTime(ctldt(vl)), "updatedTime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "USER_INFO";
    protected final String _tableDispName = "USER_INFO";
    protected final String _tablePropertyName = "userInfo";
    protected final TableSqlName _tableSqlName = new TableSqlName("USER_INFO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Long.class, "id", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_13C7317F_29F3_41CD_BEAC_5700BC298480", false, null, null, null, "favoriteLogList,searchLogList", null, false);
    protected final ColumnInfo _columnCode = cci("CODE", "CODE", null, null, String.class, "code", null, false, false, true, "VARCHAR", 1000, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedTime = cci("CREATED_TIME", "CREATED_TIME", null, null, java.time.LocalDateTime.class, "createdTime", null, false, false, true, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdatedTime = cci("UPDATED_TIME", "UPDATED_TIME", null, null, java.time.LocalDateTime.class, "updatedTime", null, false, false, true, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null, false);

    /**
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * CODE: {NotNull, VARCHAR(1000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCode() { return _columnCode; }
    /**
     * CREATED_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedTime() { return _columnCreatedTime; }
    /**
     * UPDATED_TIME: {NotNull, TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdatedTime() { return _columnUpdatedTime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnCode());
        ls.add(columnCreatedTime());
        ls.add(columnUpdatedTime());
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
    /**
     * FAVORITE_LOG by USER_ID, named 'favoriteLogList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerFavoriteLogList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), FavoriteLogDbm.getInstance().columnUserId());
        return cri("CONSTRAINT_A98", "favoriteLogList", this, FavoriteLogDbm.getInstance(), mp, false, "userInfo");
    }
    /**
     * SEARCH_LOG by USER_ID, named 'searchLogList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerSearchLogList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), SearchLogDbm.getInstance().columnUserId());
        return cri("CONSTRAINT_F2A", "searchLogList", this, SearchLogDbm.getInstance(), mp, false, "userInfo");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.codelibs.fess.db.exentity.UserInfo"; }
    public String getConditionBeanTypeName() { return "org.codelibs.fess.db.cbean.UserInfoCB"; }
    public String getBehaviorTypeName() { return "org.codelibs.fess.db.exbhv.UserInfoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<UserInfo> getEntityType() { return UserInfo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public UserInfo newEntity() { return new UserInfo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((UserInfo)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((UserInfo)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
