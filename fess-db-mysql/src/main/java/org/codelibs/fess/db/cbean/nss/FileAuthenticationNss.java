package org.codelibs.fess.db.cbean.nss;

import org.codelibs.fess.db.cbean.cq.FileAuthenticationCQ;

/**
 * The nest select set-upper of FILE_AUTHENTICATION.
 * @author DBFlute(AutoGenerator)
 */
public class FileAuthenticationNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final FileAuthenticationCQ _query;
    public FileAuthenticationNss(FileAuthenticationCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * FILE_CRAWLING_CONFIG by my FILE_CRAWLING_CONFIG_ID, named 'fileCrawlingConfig'.
     */
    public void withFileCrawlingConfig() {
        _query.xdoNss(() -> _query.queryFileCrawlingConfig());
    }
}
