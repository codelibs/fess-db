package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The referrer loader of DATA_CONFIG_TO_LABEL_TYPE_MAPPING as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, DATA_CONFIG_ID, LABEL_TYPE_ID
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
 *     DATA_CRAWLING_CONFIG, LABEL_TYPE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     dataCrawlingConfig, labelType
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfDataConfigToLabelTypeMapping {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DataConfigToLabelTypeMapping> _selectedList;
    protected BehaviorSelector _selector;
    protected DataConfigToLabelTypeMappingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfDataConfigToLabelTypeMapping ready(List<DataConfigToLabelTypeMapping> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DataConfigToLabelTypeMappingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DataConfigToLabelTypeMappingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfDataCrawlingConfig _foreignDataCrawlingConfigLoader;
    public LoaderOfDataCrawlingConfig pulloutDataCrawlingConfig() {
        if (_foreignDataCrawlingConfigLoader == null)
        { _foreignDataCrawlingConfigLoader = new LoaderOfDataCrawlingConfig().ready(myBhv().pulloutDataCrawlingConfig(_selectedList), _selector); }
        return _foreignDataCrawlingConfigLoader;
    }

    protected LoaderOfLabelType _foreignLabelTypeLoader;
    public LoaderOfLabelType pulloutLabelType() {
        if (_foreignLabelTypeLoader == null)
        { _foreignLabelTypeLoader = new LoaderOfLabelType().ready(myBhv().pulloutLabelType(_selectedList), _selector); }
        return _foreignLabelTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DataConfigToLabelTypeMapping> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
