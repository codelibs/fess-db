package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The referrer loader of SEARCH_FIELD_LOG as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfSearchFieldLog {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SearchFieldLog> _selectedList;
    protected BehaviorSelector _selector;
    protected SearchFieldLogBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSearchFieldLog ready(List<SearchFieldLog> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SearchFieldLogBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SearchFieldLogBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfSearchLog _foreignSearchLogLoader;
    public LoaderOfSearchLog pulloutSearchLog() {
        if (_foreignSearchLogLoader == null)
        { _foreignSearchLogLoader = new LoaderOfSearchLog().ready(myBhv().pulloutSearchLog(_selectedList), _selector); }
        return _foreignSearchLogLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SearchFieldLog> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
