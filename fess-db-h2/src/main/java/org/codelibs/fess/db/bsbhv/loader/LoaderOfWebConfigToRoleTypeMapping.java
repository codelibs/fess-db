package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The referrer loader of WEB_CONFIG_TO_ROLE_TYPE_MAPPING as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, WEB_CONFIG_ID, ROLE_TYPE_ID
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
 *     ROLE_TYPE, WEB_CRAWLING_CONFIG
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     roleType, webCrawlingConfig
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWebConfigToRoleTypeMapping {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WebConfigToRoleTypeMapping> _selectedList;
    protected BehaviorSelector _selector;
    protected WebConfigToRoleTypeMappingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWebConfigToRoleTypeMapping ready(List<WebConfigToRoleTypeMapping> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WebConfigToRoleTypeMappingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WebConfigToRoleTypeMappingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfRoleType _foreignRoleTypeLoader;
    public LoaderOfRoleType pulloutRoleType() {
        if (_foreignRoleTypeLoader == null)
        { _foreignRoleTypeLoader = new LoaderOfRoleType().ready(myBhv().pulloutRoleType(_selectedList), _selector); }
        return _foreignRoleTypeLoader;
    }

    protected LoaderOfWebCrawlingConfig _foreignWebCrawlingConfigLoader;
    public LoaderOfWebCrawlingConfig pulloutWebCrawlingConfig() {
        if (_foreignWebCrawlingConfigLoader == null)
        { _foreignWebCrawlingConfigLoader = new LoaderOfWebCrawlingConfig().ready(myBhv().pulloutWebCrawlingConfig(_selectedList), _selector); }
        return _foreignWebCrawlingConfigLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WebConfigToRoleTypeMapping> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
