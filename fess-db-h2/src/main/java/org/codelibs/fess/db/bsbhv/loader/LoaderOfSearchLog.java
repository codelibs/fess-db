package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;
import org.codelibs.fess.db.cbean.*;

/**
 * The referrer loader of SEARCH_LOG as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, SEARCH_WORD, REQUESTED_TIME, RESPONSE_TIME, HIT_COUNT, QUERY_OFFSET, QUERY_PAGE_SIZE, USER_AGENT, REFERER, CLIENT_IP, USER_SESSION_ID, ACCESS_TYPE, USER_ID
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
 *     USER_INFO
 *
 * [referrer table]
 *     CLICK_LOG, SEARCH_FIELD_LOG
 *
 * [foreign property]
 *     userInfo
 *
 * [referrer property]
 *     clickLogList, searchFieldLogList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfSearchLog {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SearchLog> _selectedList;
    protected BehaviorSelector _selector;
    protected SearchLogBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSearchLog ready(List<SearchLog> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SearchLogBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SearchLogBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<ClickLog> _referrerClickLog;

    /**
     * Load referrer of clickLogList by the set-upper of referrer. <br>
     * CLICK_LOG by SEARCH_ID, named 'clickLogList'.
     * <pre>
     * <span style="color: #0000C0">searchLogBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">searchLogList</span>, <span style="color: #553000">logLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">logLoader</span>.<span style="color: #CC4747">loadClickLog</span>(<span style="color: #553000">logCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">logCB</span>.setupSelect...
     *         <span style="color: #553000">logCB</span>.query().set...
     *         <span style="color: #553000">logCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">logLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    logLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (SearchLog searchLog : <span style="color: #553000">searchLogList</span>) {
     *     ... = searchLog.<span style="color: #CC4747">getClickLogList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSearchId_InScope(pkList);
     * cb.query().addOrderBy_SearchId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfClickLog> loadClickLog(ReferrerConditionSetupper<ClickLogCB> refCBLambda) {
        myBhv().loadClickLog(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerClickLog = refLs);
        return hd -> hd.handle(new LoaderOfClickLog().ready(_referrerClickLog, _selector));
    }

    protected List<SearchFieldLog> _referrerSearchFieldLog;

    /**
     * Load referrer of searchFieldLogList by the set-upper of referrer. <br>
     * SEARCH_FIELD_LOG by SEARCH_ID, named 'searchFieldLogList'.
     * <pre>
     * <span style="color: #0000C0">searchLogBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">searchLogList</span>, <span style="color: #553000">logLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">logLoader</span>.<span style="color: #CC4747">loadSearchFieldLog</span>(<span style="color: #553000">logCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">logCB</span>.setupSelect...
     *         <span style="color: #553000">logCB</span>.query().set...
     *         <span style="color: #553000">logCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">logLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    logLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (SearchLog searchLog : <span style="color: #553000">searchLogList</span>) {
     *     ... = searchLog.<span style="color: #CC4747">getSearchFieldLogList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSearchId_InScope(pkList);
     * cb.query().addOrderBy_SearchId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfSearchFieldLog> loadSearchFieldLog(ReferrerConditionSetupper<SearchFieldLogCB> refCBLambda) {
        myBhv().loadSearchFieldLog(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerSearchFieldLog = refLs);
        return hd -> hd.handle(new LoaderOfSearchFieldLog().ready(_referrerSearchFieldLog, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfUserInfo _foreignUserInfoLoader;
    public LoaderOfUserInfo pulloutUserInfo() {
        if (_foreignUserInfoLoader == null)
        { _foreignUserInfoLoader = new LoaderOfUserInfo().ready(myBhv().pulloutUserInfo(_selectedList), _selector); }
        return _foreignUserInfoLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SearchLog> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
