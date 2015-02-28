package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The referrer loader of REQUEST_HEADER as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, NAME, VALUE, WEB_CRAWLING_CONFIG_ID, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     WEB_CRAWLING_CONFIG
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     webCrawlingConfig
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfRequestHeader {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<RequestHeader> _selectedList;
    protected BehaviorSelector _selector;
    protected RequestHeaderBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfRequestHeader ready(List<RequestHeader> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected RequestHeaderBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(RequestHeaderBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWebCrawlingConfig _foreignWebCrawlingConfigLoader;
    public LoaderOfWebCrawlingConfig pulloutWebCrawlingConfig() {
        if (_foreignWebCrawlingConfigLoader == null)
        { _foreignWebCrawlingConfigLoader = new LoaderOfWebCrawlingConfig().ready(myBhv().pulloutWebCrawlingConfig(_selectedList), _selector); }
        return _foreignWebCrawlingConfigLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<RequestHeader> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
