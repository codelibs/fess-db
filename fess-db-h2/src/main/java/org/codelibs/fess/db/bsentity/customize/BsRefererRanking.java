package org.codelibs.fess.db.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.codelibs.fess.db.exentity.customize.*;

/**
 * The entity of RefererRanking. <br>
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     NAME, CNT
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
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
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String name = entity.getName();
 * Long cnt = entity.getCnt();
 * entity.setName(name);
 * entity.setCnt(cnt);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsRefererRanking extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** NAME: {VARCHAR(1000), refers to SEARCH_LOG.REFERER} */
    protected String _name;

    /** CNT: {BIGINT(19)} */
    protected Long _cnt;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.codelibs.fess.db.bsentity.customize.dbmeta.RefererRankingDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "RefererRanking";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsRefererRanking) {
            BsRefererRanking other = (BsRefererRanking)obj;
            if (!xSV(_name, other._name)) { return false; }
            if (!xSV(_cnt, other._cnt)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _name);
        hs = xCH(hs, _cnt);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_cnt));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public RefererRanking clone() {
        return (RefererRanking)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NAME: {VARCHAR(1000), refers to SEARCH_LOG.REFERER} <br>
     * @return The value of the column 'NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] NAME: {VARCHAR(1000), refers to SEARCH_LOG.REFERER} <br>
     * @param name The value of the column 'NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] CNT: {BIGINT(19)} <br>
     * @return The value of the column 'CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCnt() {
        checkSpecifiedProperty("cnt");
        return _cnt;
    }

    /**
     * [set] CNT: {BIGINT(19)} <br>
     * @param cnt The value of the column 'CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCnt(Long cnt) {
        registerModifiedProperty("cnt");
        _cnt = cnt;
    }
}
