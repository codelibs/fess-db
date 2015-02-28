package org.codelibs.fess.db.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.codelibs.fess.db.exentity.customize.*;

/**
 * The entity of ClientIpRanking. <br>
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
public abstract class BsClientIpRanking extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** NAME: {VARCHAR(50), refers to SEARCH_LOG.CLIENT_IP} */
    protected String _name;

    /** CNT: {BIGINT(19)} */
    protected Long _cnt;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.codelibs.fess.db.bsentity.customize.dbmeta.ClientIpRankingDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "ClientIpRanking";
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
        if (obj instanceof BsClientIpRanking) {
            BsClientIpRanking other = (BsClientIpRanking)obj;
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
    public ClientIpRanking clone() {
        return (ClientIpRanking)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NAME: {VARCHAR(50), refers to SEARCH_LOG.CLIENT_IP} <br>
     * @return The value of the column 'NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] NAME: {VARCHAR(50), refers to SEARCH_LOG.CLIENT_IP} <br>
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
