package org.codelibs.fess.db.cbean.nss;

import org.codelibs.fess.db.cbean.cq.ClickLogCQ;

/**
 * The nest select set-upper of CLICK_LOG.
 * @author DBFlute(AutoGenerator)
 */
public class ClickLogNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final ClickLogCQ _query;
    public ClickLogNss(ClickLogCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * SEARCH_LOG by my SEARCH_ID, named 'searchLog'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public SearchLogNss withSearchLog() {
        _query.xdoNss(() -> _query.querySearchLog());
        return new SearchLogNss(_query.querySearchLog());
    }
}
