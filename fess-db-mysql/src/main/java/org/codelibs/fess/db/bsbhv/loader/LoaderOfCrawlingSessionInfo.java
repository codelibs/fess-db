package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The referrer loader of CRAWLING_SESSION_INFO as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, CRAWLING_SESSION_ID, ID_KEY, VALUE, CREATED_TIME
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
 *     CRAWLING_SESSION
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     crawlingSession
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCrawlingSessionInfo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<CrawlingSessionInfo> _selectedList;
    protected BehaviorSelector _selector;
    protected CrawlingSessionInfoBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCrawlingSessionInfo ready(List<CrawlingSessionInfo> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CrawlingSessionInfoBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CrawlingSessionInfoBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfCrawlingSession _foreignCrawlingSessionLoader;
    public LoaderOfCrawlingSession pulloutCrawlingSession() {
        if (_foreignCrawlingSessionLoader == null)
        { _foreignCrawlingSessionLoader = new LoaderOfCrawlingSession().ready(myBhv().pulloutCrawlingSession(_selectedList), _selector); }
        return _foreignCrawlingSessionLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<CrawlingSessionInfo> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
