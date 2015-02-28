package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;
import org.codelibs.fess.db.cbean.*;

/**
 * The referrer loader of USER_INFO as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfUserInfo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<UserInfo> _selectedList;
    protected BehaviorSelector _selector;
    protected UserInfoBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfUserInfo ready(List<UserInfo> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected UserInfoBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(UserInfoBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<FavoriteLog> _referrerFavoriteLog;

    /**
     * Load referrer of favoriteLogList by the set-upper of referrer. <br>
     * FAVORITE_LOG by USER_ID, named 'favoriteLogList'.
     * <pre>
     * <span style="color: #0000C0">userInfoBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userInfoList</span>, <span style="color: #553000">infoLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">infoLoader</span>.<span style="color: #CC4747">loadFavoriteLog</span>(<span style="color: #553000">logCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">logCB</span>.setupSelect...
     *         <span style="color: #553000">logCB</span>.query().set...
     *         <span style="color: #553000">logCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">logLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    logLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (UserInfo userInfo : <span style="color: #553000">userInfoList</span>) {
     *     ... = userInfo.<span style="color: #CC4747">getFavoriteLogList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfFavoriteLog> loadFavoriteLog(ReferrerConditionSetupper<FavoriteLogCB> refCBLambda) {
        myBhv().loadFavoriteLog(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerFavoriteLog = refLs);
        return hd -> hd.handle(new LoaderOfFavoriteLog().ready(_referrerFavoriteLog, _selector));
    }

    protected List<SearchLog> _referrerSearchLog;

    /**
     * Load referrer of searchLogList by the set-upper of referrer. <br>
     * SEARCH_LOG by USER_ID, named 'searchLogList'.
     * <pre>
     * <span style="color: #0000C0">userInfoBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userInfoList</span>, <span style="color: #553000">infoLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">infoLoader</span>.<span style="color: #CC4747">loadSearchLog</span>(<span style="color: #553000">logCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">logCB</span>.setupSelect...
     *         <span style="color: #553000">logCB</span>.query().set...
     *         <span style="color: #553000">logCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">logLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    logLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (UserInfo userInfo : <span style="color: #553000">userInfoList</span>) {
     *     ... = userInfo.<span style="color: #CC4747">getSearchLogList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfSearchLog> loadSearchLog(ReferrerConditionSetupper<SearchLogCB> refCBLambda) {
        myBhv().loadSearchLog(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerSearchLog = refLs);
        return hd -> hd.handle(new LoaderOfSearchLog().ready(_referrerSearchLog, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<UserInfo> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
