/**
  * Copyright 2019 bejson.com 
  */
package save.edit.model;
import java.util.List;

/**
 * Auto-generated: 2019-04-11 12:51:32
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class M_StoreDataNodeList {

    private long m_iStoreID;
    private long m_iStoreNamaID;
    private String m_strStroreIconID;
    private int m_iStoreType;
    private List<M_StoreItemNodeList> m_StoreItemNodeList;
    public void setM_iStoreID(long m_iStoreID) {
         this.m_iStoreID = m_iStoreID;
     }
     public long getM_iStoreID() {
         return m_iStoreID;
     }

    public void setM_iStoreNamaID(long m_iStoreNamaID) {
         this.m_iStoreNamaID = m_iStoreNamaID;
     }
     public long getM_iStoreNamaID() {
         return m_iStoreNamaID;
     }

    public void setM_strStroreIconID(String m_strStroreIconID) {
         this.m_strStroreIconID = m_strStroreIconID;
     }
     public String getM_strStroreIconID() {
         return m_strStroreIconID;
     }

    public void setM_iStoreType(int m_iStoreType) {
         this.m_iStoreType = m_iStoreType;
     }
     public int getM_iStoreType() {
         return m_iStoreType;
     }

    public void setM_StoreItemNodeList(List<M_StoreItemNodeList> m_StoreItemNodeList) {
         this.m_StoreItemNodeList = m_StoreItemNodeList;
     }
     public List<M_StoreItemNodeList> getM_StoreItemNodeList() {
         return m_StoreItemNodeList;
     }

}