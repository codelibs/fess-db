package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The referrer loader of WEB_AUTHENTICATION as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, HOSTNAME, PORT, AUTH_REALM, PROTOCOL_SCHEME, USERNAME, PASSWORD, PARAMETERS, WEB_CRAWLING_CONFIG_ID, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
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
public class LoaderOfWebAuthentication {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WebAuthentication> _selectedList;
    protected BehaviorSelector _selector;
    protected WebAuthenticationBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWebAuthentication ready(List<WebAuthentication> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WebAuthenticationBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WebAuthenticationBhv.class); return _myBhv; } }

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
    public List<WebAuthentication> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
