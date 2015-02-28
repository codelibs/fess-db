package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The referrer loader of FILE_AUTHENTICATION as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, HOSTNAME, PORT, PROTOCOL_SCHEME, USERNAME, PASSWORD, PARAMETERS, FILE_CRAWLING_CONFIG_ID, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
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
 *     FILE_CRAWLING_CONFIG
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     fileCrawlingConfig
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfFileAuthentication {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<FileAuthentication> _selectedList;
    protected BehaviorSelector _selector;
    protected FileAuthenticationBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfFileAuthentication ready(List<FileAuthentication> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected FileAuthenticationBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(FileAuthenticationBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfFileCrawlingConfig _foreignFileCrawlingConfigLoader;
    public LoaderOfFileCrawlingConfig pulloutFileCrawlingConfig() {
        if (_foreignFileCrawlingConfigLoader == null)
        { _foreignFileCrawlingConfigLoader = new LoaderOfFileCrawlingConfig().ready(myBhv().pulloutFileCrawlingConfig(_selectedList), _selector); }
        return _foreignFileCrawlingConfigLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<FileAuthentication> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
