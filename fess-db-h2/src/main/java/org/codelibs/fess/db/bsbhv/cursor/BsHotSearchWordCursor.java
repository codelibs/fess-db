package org.codelibs.fess.db.bsbhv.cursor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dbflute.jdbc.ValueType;
import org.dbflute.s2dao.valuetype.TnValueTypes;

/**
 * The cursor of HotSearchWord. <br>
 * @author DBFlute(AutoGenerator)
 */
public class BsHotSearchWordCursor {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                        Column DB Name
    //                                        --------------
    /** DB name of NAME. */
    public static final String DB_NAME_NAME = "NAME";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** Wrapped result set. */
    protected ResultSet _rs;

    protected ValueType _vtName = vt(String.class);

    protected ValueType vt(Class<?> type) {
        return TnValueTypes.getValueType(type);
    }

    protected ValueType vt(Class<?> type, String name) {
        ValueType valueType = TnValueTypes.getPluginValueType(name);
        return valueType != null ? valueType : vt(type);
    }

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHotSearchWordCursor() {
    }

    // ===================================================================================
    //                                                                             Prepare
    //                                                                             =======
    /**
     * Accept the result set.
     * @param rs The cursor (result set) for the query, which has first pointer. (NotNull)
     */
    public void accept(ResultSet rs) {
        this._rs = rs;
    }

    // ===================================================================================
    //                                                                              Direct
    //                                                                              ======
    /**
     * Get the wrapped cursor (result set).
     * @return The instance of result set. (NotNull)
     */
    public ResultSet cursor() {
        return _rs;
    }

    // ===================================================================================
    //                                                                            Delegate
    //                                                                            ========
    /**
     * Move to next result.
     * @return Is exist next result.
     * @throws SQLException When it fails to move the cursor to next point.
     */
    public boolean next() throws SQLException {
        return _rs.next();
    }

    // ===================================================================================
    //                                                                  Type Safe Accessor
    //                                                                  ==================
    /**
     * [get] NAME: {VARCHAR(1000), refers to SEARCH_LOG.SEARCH_WORD} <br>
     * @return The value of name. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public String getName() throws SQLException {
        return (String)_vtName.getValue(_rs, DB_NAME_NAME);
    }

}
