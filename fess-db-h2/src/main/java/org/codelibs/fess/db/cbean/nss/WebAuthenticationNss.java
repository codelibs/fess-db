package org.codelibs.fess.db.cbean.nss;

import org.codelibs.fess.db.cbean.cq.WebAuthenticationCQ;

/**
 * The nest select set-upper of WEB_AUTHENTICATION.
 * @author DBFlute(AutoGenerator)
 */
public class WebAuthenticationNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WebAuthenticationCQ _query;
    public WebAuthenticationNss(WebAuthenticationCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WEB_CRAWLING_CONFIG by my WEB_CRAWLING_CONFIG_ID, named 'webCrawlingConfig'.
     */
    public void withWebCrawlingConfig() {
        _query.xdoNss(() -> _query.queryWebCrawlingConfig());
    }
}
