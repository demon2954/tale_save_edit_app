package save.edit.data;

import save.edit.LocationConstant;

public enum PropertyValueEnum {
	WUXUE(0, 1, LocationConstant.PROPERTIES_INDEX_WUXUE), //
	SHIZHAN(0, 0, LocationConstant.PROPERTIES_INDEX_SHIZHAN), //
	WUXING(0, 4, LocationConstant.PROPERTIES_INDEX_WUXING), //
	DAODE(0, 2, LocationConstant.PROPERTIES_INDEX_DAODE), //
	MINGSHENG(0, 3, LocationConstant.PROPERTIES_INDEX_MINGSHENG), //
	QINGGONG(1, 4, LocationConstant.PROPERTIES_INDEX_QINGGONG), //
	YINGGONG(1, 3, LocationConstant.PROPERTIES_INDEX_YINGGONG), //
	RUANGONG(1, 2, LocationConstant.PROPERTIES_INDEX_RUANGONG), //
	ERGONG(1, 1, LocationConstant.PROPERTIES_INDEX_ERGONG), //
	YANGONG(1, 0, LocationConstant.PROPERTIES_INDEX_YANGONG), //
	QUANZHANG(2, 0, LocationConstant.PROPERTIES_INDEX_QUANZHANG), //
	XINFA(3, 7, LocationConstant.PROPERTIES_INDEX_XINFA), // ??
	DAOFA(2, 4, LocationConstant.PROPERTIES_INDEX_DAOFA), //
	ZHIFA(2, 1, LocationConstant.PROPERTIES_INDEX_ZHIFA), //
	GUNFA(2, 5, LocationConstant.PROPERTIES_INDEX_GUNFA), //
	QINFA(2, 8, LocationConstant.PROPERTIES_INDEX_QINFA), //
	JIANFA(2, 3, LocationConstant.PROPERTIES_INDEX_JIANFA), //
	TUIFA(2, 2, LocationConstant.PROPERTIES_INDEX_TUIFA), //
	DUANBING(2, 6, LocationConstant.PROPERTIES_INDEX_DUANBING), //
	ANQI(2, 7, LocationConstant.PROPERTIES_INDEX_ANQI), //
	LIANDAN(3, 4, LocationConstant.PROPERTIES_INDEX_LIANDAN), //
	CAIYAO(3, 3, LocationConstant.PROPERTIES_INDEX_CAIYAO), //
	CHADAO(4, 8, LocationConstant.PROPERTIES_INDEX_CHADAO), //
	CHUYI(3, 8, LocationConstant.PROPERTIES_INDEX_CHUYI), //
	JIANDING(3, 6, LocationConstant.PROPERTIES_INDEX_JIANDING), //
	YUELI(4, 0, LocationConstant.PROPERTIES_INDEX_YUELI), //
	SHUFA(4, 5, LocationConstant.PROPERTIES_INDEX_SHUFA), //
	DUSHU(4, 2, LocationConstant.PROPERTIES_INDEX_DUSHU), //
	WAKUANG(3, 0, LocationConstant.PROPERTIES_INDEX_WAKUANG), //
	HUAHUI(4, 7, LocationConstant.PROPERTIES_INDEX_HUAHUI), //
	YISHU(4, 3, LocationConstant.PROPERTIES_INDEX_YISHU), //
	DATIE(3, 5, LocationConstant.PROPERTIES_INDEX_DATIE), //
	HUIHUA(4, 4, LocationConstant.PROPERTIES_INDEX_HUIHUA), //
	DIAOYU(3, 2, LocationConstant.PROPERTIES_INDEX_DIAOYU), //
	DALIE(3, 1, LocationConstant.PROPERTIES_INDEX_DALIE), //
	JIUYI(4, 6, LocationConstant.PROPERTIES_INDEX_JIUYI),//
	;

	private int m_iType;
	private int m_iIndex;
	private int propertyIndex;

	private PropertyValueEnum(int m_iType, int m_iIndex, int propertyIndex) {
		this.m_iType = m_iType;
		this.m_iIndex = m_iIndex;
		this.propertyIndex = propertyIndex;
	}

	public int getM_iType() {
		return m_iType;
	}

	public int getM_iIndex() {
		return m_iIndex;
	}

	public int getPropertyIndex() {
		return propertyIndex;
	}
}
