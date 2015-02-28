package org.codelibs.fess.db.cbean.nss;

import org.codelibs.fess.db.cbean.cq.SearchLogCQ;

/**
 * The nest select set-upper of SEARCH_LOG.
 * @author DBFlute(AutoGenerator)
 */
public class SearchLogNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final SearchLogCQ _query;
    public SearchLogNss(SearchLogCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * USER_INFO by my USER_ID, named 'userInfo'.
     */
    public void withUserInfo() {
        _query.xdoNss(() -> _query.queryUserInfo());
    }
}
