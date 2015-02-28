package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of USER_INFO as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, CODE, CREATED_TIME, UPDATED_TIME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     FAVORITE_LOG, SEARCH_LOG
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     favoriteLogList, searchLogList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * String code = entity.getCode();
 * java.time.LocalDateTime createdTime = entity.getCreatedTime();
 * java.time.LocalDateTime updatedTime = entity.getUpdatedTime();
 * entity.setId(id);
 * entity.setCode(code);
 * entity.setCreatedTime(createdTime);
 * entity.setUpdatedTime(updatedTime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUserInfo extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _id;

    /** CODE: {NotNull, VARCHAR(1000)} */
    protected String _code;

    /** CREATED_TIME: {NotNull, TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _createdTime;

    /** UPDATED_TIME: {NotNull, TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _updatedTime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "USER_INFO";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** FAVORITE_LOG by USER_ID, named 'favoriteLogList'. */
    protected List<FavoriteLog> _favoriteLogList;

    /**
     * [get] FAVORITE_LOG by USER_ID, named 'favoriteLogList'.
     * @return The entity list of referrer property 'favoriteLogList'. (NotNull: even if no loading, returns empty list)
     */
    public List<FavoriteLog> getFavoriteLogList() {
        if (_favoriteLogList == null) { _favoriteLogList = newReferrerList(); }
        return _favoriteLogList;
    }

    /**
     * [set] FAVORITE_LOG by USER_ID, named 'favoriteLogList'.
     * @param favoriteLogList The entity list of referrer property 'favoriteLogList'. (NullAllowed)
     */
    public void setFavoriteLogList(List<FavoriteLog> favoriteLogList) {
        _favoriteLogList = favoriteLogList;
    }

    /** SEARCH_LOG by USER_ID, named 'searchLogList'. */
    protected List<SearchLog> _searchLogList;

    /**
     * [get] SEARCH_LOG by USER_ID, named 'searchLogList'.
     * @return The entity list of referrer property 'searchLogList'. (NotNull: even if no loading, returns empty list)
     */
    public List<SearchLog> getSearchLogList() {
        if (_searchLogList == null) { _searchLogList = newReferrerList(); }
        return _searchLogList;
    }

    /**
     * [set] SEARCH_LOG by USER_ID, named 'searchLogList'.
     * @param searchLogList The entity list of referrer property 'searchLogList'. (NullAllowed)
     */
    public void setSearchLogList(List<SearchLog> searchLogList) {
        _searchLogList = searchLogList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsUserInfo) {
            BsUserInfo other = (BsUserInfo)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_favoriteLogList != null) { for (FavoriteLog et : _favoriteLogList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "favoriteLogList")); } } }
        if (_searchLogList != null) { for (SearchLog et : _searchLogList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "searchLogList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_code));
        sb.append(dm).append(xfND(_createdTime));
        sb.append(dm).append(xfND(_updatedTime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_favoriteLogList != null && !_favoriteLogList.isEmpty())
        { sb.append(dm).append("favoriteLogList"); }
        if (_searchLogList != null && !_searchLogList.isEmpty())
        { sb.append(dm).append("searchLogList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public UserInfo clone() {
        return (UserInfo)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param id The value of the column 'ID'. (basically NotNull if update: for the constraint)
     */
    public void setId(Long id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] CODE: {NotNull, VARCHAR(1000)} <br>
     * @return The value of the column 'CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCode() {
        checkSpecifiedProperty("code");
        return _code;
    }

    /**
     * [set] CODE: {NotNull, VARCHAR(1000)} <br>
     * @param code The value of the column 'CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCode(String code) {
        registerModifiedProperty("code");
        _code = code;
    }

    /**
     * [get] CREATED_TIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'CREATED_TIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getCreatedTime() {
        checkSpecifiedProperty("createdTime");
        return _createdTime;
    }

    /**
     * [set] CREATED_TIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @param createdTime The value of the column 'CREATED_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setCreatedTime(java.time.LocalDateTime createdTime) {
        registerModifiedProperty("createdTime");
        _createdTime = createdTime;
    }

    /**
     * [get] UPDATED_TIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'UPDATED_TIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdatedTime() {
        checkSpecifiedProperty("updatedTime");
        return _updatedTime;
    }

    /**
     * [set] UPDATED_TIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @param updatedTime The value of the column 'UPDATED_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdatedTime(java.time.LocalDateTime updatedTime) {
        registerModifiedProperty("updatedTime");
        _updatedTime = updatedTime;
    }
}
