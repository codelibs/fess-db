package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The referrer loader of BOOST_DOCUMENT_RULE as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, URL_EXPR, BOOST_EXPR, SORT_ORDER, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
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
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBoostDocumentRule {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BoostDocumentRule> _selectedList;
    protected BehaviorSelector _selector;
    protected BoostDocumentRuleBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBoostDocumentRule ready(List<BoostDocumentRule> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BoostDocumentRuleBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BoostDocumentRuleBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BoostDocumentRule> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
