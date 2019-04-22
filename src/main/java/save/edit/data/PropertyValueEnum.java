package save.edit.data;

import save.edit.constant.LocationConstant;

public enum PropertyValueEnum {
	SHIZHAN(0, 0, LocationConstant.PROPERTIES_INDEX_SHIZHAN, 500), //
	WUXUE(0, 1, LocationConstant.PROPERTIES_INDEX_WUXUE, 500), //
	DAODE(0, 2, LocationConstant.PROPERTIES_INDEX_DAODE, 500), //
	MINGSHENG(0, 3, LocationConstant.PROPERTIES_INDEX_MINGSHENG, 500), //
	WUXING(0, 4, LocationConstant.PROPERTIES_INDEX_WUXING, 100), //
	YANGONG(1, 0, LocationConstant.PROPERTIES_INDEX_YANGONG, 100), //
	ERGONG(1, 1, LocationConstant.PROPERTIES_INDEX_ERGONG, 100), //
	RUANGONG(1, 2, LocationConstant.PROPERTIES_INDEX_RUANGONG, 100), //
	YINGGONG(1, 3, LocationConstant.PROPERTIES_INDEX_YINGGONG, 100), //
	QINGGONG(1, 4, LocationConstant.PROPERTIES_INDEX_QINGGONG, 100), //
	NEIGONG(1, 5, LocationConstant.PROPERTIES_INDEX_NEIGONG, 100), //
	QUANZHANG(2, 0, LocationConstant.PROPERTIES_INDEX_QUANZHANG, 100), //
	ZHIFA(2, 1, LocationConstant.PROPERTIES_INDEX_ZHIFA, 100), //
	TUIFA(2, 2, LocationConstant.PROPERTIES_INDEX_TUIFA, 100), //
	JIANFA(2, 3, LocationConstant.PROPERTIES_INDEX_JIANFA, 100), //
	DAOFA(2, 4, LocationConstant.PROPERTIES_INDEX_DAOFA, 100), //
	GUNFA(2, 5, LocationConstant.PROPERTIES_INDEX_GUNFA, 100), //
	DUANBING(2, 6, LocationConstant.PROPERTIES_INDEX_DUANBING, 100), //
	ANQI(2, 7, LocationConstant.PROPERTIES_INDEX_ANQI, 100), //
	QINFA(2, 8, LocationConstant.PROPERTIES_INDEX_QINFA, 100), //
	WAKUANG(3, 0, LocationConstant.PROPERTIES_INDEX_WAKUANG, 100), //
	DALIE(3, 1, LocationConstant.PROPERTIES_INDEX_DALIE, 100), //
	DIAOYU(3, 2, LocationConstant.PROPERTIES_INDEX_DIAOYU, 100), //
	CAIYAO(3, 3, LocationConstant.PROPERTIES_INDEX_CAIYAO, 100), //
	LIANDAN(3, 4, LocationConstant.PROPERTIES_INDEX_LIANDAN, 100), //
	DATIE(3, 5, LocationConstant.PROPERTIES_INDEX_DATIE, 100), //
	JIANDING(3, 6, LocationConstant.PROPERTIES_INDEX_JIANDING, 100), //
	XINFA(3, 7, LocationConstant.PROPERTIES_INDEX_XINFA, 100), // ??
	CHUYI(3, 8, LocationConstant.PROPERTIES_INDEX_CHUYI, 100), //
	YUELI(4, 0, LocationConstant.PROPERTIES_INDEX_YUELI, 100), //
	QIYI(4, 1, LocationConstant.PROPERTIES_INDEX_QIYI, 100), //
	DUSHU(4, 2, LocationConstant.PROPERTIES_INDEX_DUSHU, 100), //
	YISHU(4, 3, LocationConstant.PROPERTIES_INDEX_YISHU, 100), //
	HUIHUA(4, 4, LocationConstant.PROPERTIES_INDEX_HUIHUA, 100), //
	SHUFA(4, 5, LocationConstant.PROPERTIES_INDEX_SHUFA, 100), //
	JIUYI(4, 6, LocationConstant.PROPERTIES_INDEX_JIUYI, 100), //
	HUAHUI(4, 7, LocationConstant.PROPERTIES_INDEX_HUAHUI, 100), //
	CHADAO(4, 8, LocationConstant.PROPERTIES_INDEX_CHADAO, 100), //
	;

	private int m_iType;
	private int m_iIndex;
	private int propertyIndex;
	private int m_iMax;

	private PropertyValueEnum(int m_iType, int m_iIndex, int propertyIndex, int m_iMax) {
		this.m_iType = m_iType;
		this.m_iIndex = m_iIndex;
		this.propertyIndex = propertyIndex;
		this.m_iMax = m_iMax;
	}

	public int getM_iType() {
		return m_iType;
	}

	public int getM_iIndex() {
		return m_iIndex;
	}
	/**
	 * 编辑框的下标
	 * @return
	 */
	public int getPropertyIndex() {
		return propertyIndex;
	}
	public int getM_iMax() {
		return m_iMax;
	}
}
