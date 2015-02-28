package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The referrer loader of FILE_CONFIG_TO_LABEL_TYPE_MAPPING as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, FILE_CONFIG_ID, LABEL_TYPE_ID
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
 *     FILE_CRAWLING_CONFIG, LABEL_TYPE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     fileCrawlingConfig, labelType
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfFileConfigToLabelTypeMapping {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<FileConfigToLabelTypeMapping> _selectedList;
    protected BehaviorSelector _selector;
    protected FileConfigToLabelTypeMappingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfFileConfigToLabelTypeMapping ready(List<FileConfigToLabelTypeMapping> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected FileConfigToLabelTypeMappingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(FileConfigToLabelTypeMappingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfFileCrawlingConfig _foreignFileCrawlingConfigLoader;
    public LoaderOfFileCrawlingConfig pulloutFileCrawlingConfig() {
        if (_foreignFileCrawlingConfigLoader == null)
        { _foreignFileCrawlingConfigLoader = new LoaderOfFileCrawlingConfig().ready(myBhv().pulloutFileCrawlingConfig(_selectedList), _selector); }
        return _foreignFileCrawlingConfigLoader;
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
    public List<FileConfigToLabelTypeMapping> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
