package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of SEARCH_FIELD_LOG as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, SEARCH_ID, NAME, VALUE
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
 *     SEARCH_LOG
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     searchLog
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * Long searchId = entity.getSearchId();
 * String name = entity.getName();
 * String value = entity.getValue();
 * entity.setId(id);
 * entity.setSearchId(searchId);
 * entity.setName(name);
 * entity.setValue(value);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSearchFieldLog extends AbstractEntity implements DomainEntity {

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

    /** SEARCH_ID: {IX, NotNull, BIGINT(19), FK to SEARCH_LOG} */
    protected Long _searchId;

    /** NAME: {NotNull, VARCHAR(255)} */
    protected String _name;

    /** VALUE: {NotNull, TEXT(65535)} */
    protected String _value;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SEARCH_FIELD_LOG";
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
    /** SEARCH_LOG by my SEARCH_ID, named 'searchLog'. */
    protected OptionalEntity<SearchLog> _searchLog;

    /**
     * [get] SEARCH_LOG by my SEARCH_ID, named 'searchLog'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'searchLog'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<SearchLog> getSearchLog() {
        if (_searchLog == null) { _searchLog = OptionalEntity.relationEmpty(this, "searchLog"); }
        return _searchLog;
    }

    /**
     * [set] SEARCH_LOG by my SEARCH_ID, named 'searchLog'.
     * @param searchLog The entity of foreign property 'searchLog'. (NullAllowed)
     */
    public void setSearchLog(OptionalEntity<SearchLog> searchLog) {
        _searchLog = searchLog;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSearchFieldLog) {
            BsSearchFieldLog other = (BsSearchFieldLog)obj;
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
        if (_searchLog != null && _searchLog.isPresent())
        { sb.append(li).append(xbRDS(_searchLog, "searchLog")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_searchId));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_value));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_searchLog != null && _searchLog.isPresent())
        { sb.append(dm).append("searchLog"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public SearchFieldLog clone() {
        return (SearchFieldLog)super.clone();
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
     * [get] SEARCH_ID: {IX, NotNull, BIGINT(19), FK to SEARCH_LOG} <br>
     * @return The value of the column 'SEARCH_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSearchId() {
        checkSpecifiedProperty("searchId");
        return _searchId;
    }

    /**
     * [set] SEARCH_ID: {IX, NotNull, BIGINT(19), FK to SEARCH_LOG} <br>
     * @param searchId The value of the column 'SEARCH_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSearchId(Long searchId) {
        registerModifiedProperty("searchId");
        _searchId = searchId;
    }

    /**
     * [get] NAME: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] NAME: {NotNull, VARCHAR(255)} <br>
     * @param name The value of the column 'NAME'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] VALUE: {NotNull, TEXT(65535)} <br>
     * @return The value of the column 'VALUE'. (basically NotNull if selected: for the constraint)
     */
    public String getValue() {
        checkSpecifiedProperty("value");
        return _value;
    }

    /**
     * [set] VALUE: {NotNull, TEXT(65535)} <br>
     * @param value The value of the column 'VALUE'. (basically NotNull if update: for the constraint)
     */
    public void setValue(String value) {
        registerModifiedProperty("value");
        _value = value;
    }
}
