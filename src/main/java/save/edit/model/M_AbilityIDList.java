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
public class M_AbilityIDList {

    private int m_iType;
    private List<String> m_IDList;
    private List<M_BookNodeList> m_BookNodeList;
    public void setM_iType(int m_iType) {
         this.m_iType = m_iType;
     }
     public int getM_iType() {
         return m_iType;
     }

    public void setM_IDList(List<String> m_IDList) {
         this.m_IDList = m_IDList;
     }
     public List<String> getM_IDList() {
         return m_IDList;
     }

    public void setM_BookNodeList(List<M_BookNodeList> m_BookNodeList) {
         this.m_BookNodeList = m_BookNodeList;
     }
     public List<M_BookNodeList> getM_BookNodeList() {
         return m_BookNodeList;
     }

}