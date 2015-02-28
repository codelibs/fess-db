package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The referrer loader of WEB_CONFIG_TO_LABEL_TYPE_MAPPING as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, WEB_CONFIG_ID, LABEL_TYPE_ID
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
 *     LABEL_TYPE, WEB_CRAWLING_CONFIG
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     labelType, webCrawlingConfig
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWebConfigToLabelTypeMapping {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WebConfigToLabelTypeMapping> _selectedList;
    protected BehaviorSelector _selector;
    protected WebConfigToLabelTypeMappingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWebConfigToLabelTypeMapping ready(List<WebConfigToLabelTypeMapping> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WebConfigToLabelTypeMappingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WebConfigToLabelTypeMappingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfLabelType _foreignLabelTypeLoader;
    public LoaderOfLabelType pulloutLabelType() {
        if (_foreignLabelTypeLoader == null)
        { _foreignLabelTypeLoader = new LoaderOfLabelType().ready(myBhv().pulloutLabelType(_selectedList), _selector); }
        return _foreignLabelTypeLoader;
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
    public List<WebConfigToLabelTypeMapping> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
