package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;
import org.codelibs.fess.db.cbean.*;

/**
 * The referrer loader of CRAWLING_SESSION as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, SESSION_ID, NAME, EXPIRED_TIME, CREATED_TIME
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
 *     CRAWLING_SESSION_INFO
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     crawlingSessionInfoList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCrawlingSession {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<CrawlingSession> _selectedList;
    protected BehaviorSelector _selector;
    protected CrawlingSessionBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCrawlingSession ready(List<CrawlingSession> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CrawlingSessionBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CrawlingSessionBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<CrawlingSessionInfo> _referrerCrawlingSessionInfo;

    /**
     * Load referrer of crawlingSessionInfoList by the set-upper of referrer. <br>
     * CRAWLING_SESSION_INFO by CRAWLING_SESSION_ID, named 'crawlingSessionInfoList'.
     * <pre>
     * <span style="color: #0000C0">crawlingSessionBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">crawlingSessionList</span>, <span style="color: #553000">sessionLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">sessionLoader</span>.<span style="color: #CC4747">loadCrawlingSessionInfo</span>(<span style="color: #553000">infoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">infoCB</span>.setupSelect...
     *         <span style="color: #553000">infoCB</span>.query().set...
     *         <span style="color: #553000">infoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">infoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    infoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (CrawlingSession crawlingSession : <span style="color: #553000">crawlingSessionList</span>) {
     *     ... = crawlingSession.<span style="color: #CC4747">getCrawlingSessionInfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCrawlingSessionId_InScope(pkList);
     * cb.query().addOrderBy_CrawlingSessionId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfCrawlingSessionInfo> loadCrawlingSessionInfo(ReferrerConditionSetupper<CrawlingSessionInfoCB> refCBLambda) {
        myBhv().loadCrawlingSessionInfo(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerCrawlingSessionInfo = refLs);
        return hd -> hd.handle(new LoaderOfCrawlingSessionInfo().ready(_referrerCrawlingSessionInfo, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<CrawlingSession> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
