package save.edit.model;

import java.util.List;

import save.edit.model.backpack.Backpack;
import save.edit.model.btn.DevelopBtnStatus;
import save.edit.model.btn.LotusBtnID;
import save.edit.model.courde.YearCourdeNode;
import save.edit.model.friendly.NpcFriendlyNode;
import save.edit.model.martial.AbilityID;
import save.edit.model.martial.MartialID;
import save.edit.model.property.PropertyGroupsNode;
import save.edit.model.routine.PlayerNeigongNode;
import save.edit.model.routine.PlayerRoutineNode;
import save.edit.model.store.StoreDataNode;
import save.edit.util.UnicodeUtils;

public class SaveModel {
	private String m_strVersion;// 版本
	private String m_strPlayerName;// 名
	private String m_strPlayerLastName;// 姓
	private String m_PlayerIconID;// 头像
	private long m_iMoney;// 金钱
	private String m_strModelName;
	private int m_fTalkRange;
	private float m_fStopRange;
	private float m_fWalkRange;
	private int m_fNowX;
	private int m_fNowY;
	private int m_fNowZ;
	private int m_iNowTime;
	private int m_fDir;
	private int m_fNowTime;
	private String m_strSceneName;
	private int m_iFre;
	private int m_iTalent1ID;
	private int m_iTalent2ID;
	private int m_iTalent3ID;
	private boolean m_bTalent2Open;
	private boolean m_bTalent3Open;
	private int m_iPlayBout;
	private int m_iMonth;
	private int m_iMonthInterval;
	private int m_iYear;
	private int m_iSeason;
	private int m_iPhysical;
	private int m_iMood;
	private int m_iPlotRound;
	private int m_iAttack;// 攻击力
	private int m_iDefense;// 防御力
	private int m_iCritical;
	private int m_iDodge;
	private int m_iConter;
	private int m_iDefendCritical;
	private int m_iDefendConter;
	private int m_iEquipAddReal;
	private int m_iEquipAddWushu;
	private int m_iEquipAddEthics;
	private int m_iEquipAddReputation;
	private int m_iEquipAddSavvy;
	private int m_iEquipAddHp;
	private int m_iEquipAddMp;
	private int m_iEquipAddAttack;
	private int m_iEquipAddDefense;
	private int m_iEquipAddCritical;
	private int m_iEquipAddDodge;
	private int m_iEquipAddConter;
	private int m_iEquipDefendCritical;
	private int m_iEquipDefendConter;
	private int m_iEquipAddBuff;
	private List<PropertyGroupsNode> m_PropertyGroupsNodeList;
	private List<Backpack> m_BackpackList;
	private List<String> m_CollectionList;
	private List<String> m_QuestList;
	private List<Integer> m_EventList;
	private List<Integer> m_TitleIDList;
	private int m_iTitleID;
	private int m_iRoutineID;
	private List<PlayerRoutineNode> m_PlayerRoutineNodeList;
	private List<PlayerNeigongNode> m_PlayerNeigongNodeList;
	private int m_iNeigongID;
	private List<Integer> m_DevelopQuestList;
	private List<LotusBtnID> m_LotusBtnIDList;
	private List<DevelopBtnStatus> m_DevelopBtnStatusList;
	private List<YearCourdeNode> m_YearCourdeNodeList;
	private List<MartialID> m_MartialIDList;
	private List<AbilityID> m_AbilityIDList;
	private int m_iWeaponsID;
	private int m_iEquipID;
	private int m_iAccessoriesID;
	private List<NpcFriendlyNode> m_NpcFriendlyNodeList;
	private List<String> m_TreasureBoxIDList;
	private int m_iAutomaticIndex;
	private int m_iAutomaticDIndex;
	private List<StoreDataNode> m_StoreDataNodeList;
	private boolean m_bInOutSideHouse;
	private float m_fInSideAbLi_r;
	private float m_fInSideAbLi_g;
	private float m_fInSideAbLi_b;
	private float m_fInSideAbLi_a;
	private int m_iMusicIndex;
	private List<Integer> m_teamMemberList;
	private List<String> m_TimeQuestList;
	private int m_iBattleArea;
	private int m_iBattleDifficulty;
	private String m_gGuid;
	private List<Integer> m_completeGuides;
	private List<String> m_completeGuides_Develop;
	
	public List<AbilityID> getM_AbilityIDList() {
		return m_AbilityIDList;
	}
	public void setM_AbilityIDList(List<AbilityID> m_AbilityIDList) {
		this.m_AbilityIDList = m_AbilityIDList;
	}
	public String getM_strVersion() {
		return m_strVersion;
	}
	public void setM_strVersion(String m_strVersion) {
		this.m_strVersion = m_strVersion;
	}
	public String getM_strPlayerName() {
		return UnicodeUtils.toUnicode(m_strPlayerName);
	}
	public void setM_strPlayerName(String m_strPlayerName) {
		this.m_strPlayerName = m_strPlayerName;
	}
	public String getM_strPlayerLastName() {
		return m_strPlayerLastName;
	}
	public void setM_strPlayerLastName(String m_strPlayerLastName) {
		this.m_strPlayerLastName = m_strPlayerLastName;
	}
	public String getM_PlayerIconID() {
		return m_PlayerIconID;
	}
	public void setM_PlayerIconID(String m_PlayerIconID) {
		this.m_PlayerIconID = m_PlayerIconID;
	}
	public long getM_iMoney() {
		return m_iMoney;
	}
	public void setM_iMoney(long m_iMoney) {
		this.m_iMoney = m_iMoney;
	}
	public String getM_strModelName() {
		return m_strModelName;
	}
	public void setM_strModelName(String m_strModelName) {
		this.m_strModelName = m_strModelName;
	}
	public int getM_fTalkRange() {
		return m_fTalkRange;
	}
	public void setM_fTalkRange(int m_fTalkRange) {
		this.m_fTalkRange = m_fTalkRange;
	}
	public float getM_fStopRange() {
		return m_fStopRange;
	}
	public void setM_fStopRange(float m_fStopRange) {
		this.m_fStopRange = m_fStopRange;
	}
	public float getM_fWalkRange() {
		return m_fWalkRange;
	}
	public void setM_fWalkRange(float m_fWalkRange) {
		this.m_fWalkRange = m_fWalkRange;
	}
	public int getM_fNowX() {
		return m_fNowX;
	}
	public void setM_fNowX(int m_fNowX) {
		this.m_fNowX = m_fNowX;
	}
	public int getM_fNowY() {
		return m_fNowY;
	}
	public void setM_fNowY(int m_fNowY) {
		this.m_fNowY = m_fNowY;
	}
	public int getM_fNowZ() {
		return m_fNowZ;
	}
	public void setM_fNowZ(int m_fNowZ) {
		this.m_fNowZ = m_fNowZ;
	}
	public int getM_iNowTime() {
		return m_iNowTime;
	}
	public void setM_iNowTime(int m_iNowTime) {
		this.m_iNowTime = m_iNowTime;
	}
	public int getM_fDir() {
		return m_fDir;
	}
	public void setM_fDir(int m_fDir) {
		this.m_fDir = m_fDir;
	}
	public int getM_fNowTime() {
		return m_fNowTime;
	}
	public void setM_fNowTime(int m_fNowTime) {
		this.m_fNowTime = m_fNowTime;
	}
	public String getM_strSceneName() {
		return m_strSceneName;
	}
	public void setM_strSceneName(String m_strSceneName) {
		this.m_strSceneName = m_strSceneName;
	}
	public int getM_iFre() {
		return m_iFre;
	}
	public void setM_iFre(int m_iFre) {
		this.m_iFre = m_iFre;
	}
	public int getM_iTalent1ID() {
		return m_iTalent1ID;
	}
	public void setM_iTalent1ID(int m_iTalent1ID) {
		this.m_iTalent1ID = m_iTalent1ID;
	}
	public int getM_iTalent2ID() {
		return m_iTalent2ID;
	}
	public void setM_iTalent2ID(int m_iTalent2ID) {
		this.m_iTalent2ID = m_iTalent2ID;
	}
	public int getM_iTalent3ID() {
		return m_iTalent3ID;
	}
	public void setM_iTalent3ID(int m_iTalent3ID) {
		this.m_iTalent3ID = m_iTalent3ID;
	}
	public boolean isM_bTalent2Open() {
		return m_bTalent2Open;
	}
	public void setM_bTalent2Open(boolean m_bTalent2Open) {
		this.m_bTalent2Open = m_bTalent2Open;
	}
	public boolean isM_bTalent3Open() {
		return m_bTalent3Open;
	}
	public void setM_bTalent3Open(boolean m_bTalent3Open) {
		this.m_bTalent3Open = m_bTalent3Open;
	}
	public int getM_iPlayBout() {
		return m_iPlayBout;
	}
	public void setM_iPlayBout(int m_iPlayBout) {
		this.m_iPlayBout = m_iPlayBout;
	}
	public int getM_iMonth() {
		return m_iMonth;
	}
	public void setM_iMonth(int m_iMonth) {
		this.m_iMonth = m_iMonth;
	}
	public int getM_iMonthInterval() {
		return m_iMonthInterval;
	}
	public void setM_iMonthInterval(int m_iMonthInterval) {
		this.m_iMonthInterval = m_iMonthInterval;
	}
	public int getM_iYear() {
		return m_iYear;
	}
	public void setM_iYear(int m_iYear) {
		this.m_iYear = m_iYear;
	}
	public int getM_iSeason() {
		return m_iSeason;
	}
	public void setM_iSeason(int m_iSeason) {
		this.m_iSeason = m_iSeason;
	}
	public int getM_iPhysical() {
		return m_iPhysical;
	}
	public void setM_iPhysical(int m_iPhysical) {
		this.m_iPhysical = m_iPhysical;
	}
	public int getM_iMood() {
		return m_iMood;
	}
	public void setM_iMood(int m_iMood) {
		this.m_iMood = m_iMood;
	}
	public int getM_iPlotRound() {
		return m_iPlotRound;
	}
	public void setM_iPlotRound(int m_iPlotRound) {
		this.m_iPlotRound = m_iPlotRound;
	}
	public int getM_iAttack() {
		return m_iAttack;
	}
	public void setM_iAttack(int m_iAttack) {
		this.m_iAttack = m_iAttack;
	}
	public int getM_iDefense() {
		return m_iDefense;
	}
	public void setM_iDefense(int m_iDefense) {
		this.m_iDefense = m_iDefense;
	}
	public int getM_iCritical() {
		return m_iCritical;
	}
	public void setM_iCritical(int m_iCritical) {
		this.m_iCritical = m_iCritical;
	}
	public int getM_iDodge() {
		return m_iDodge;
	}
	public void setM_iDodge(int m_iDodge) {
		this.m_iDodge = m_iDodge;
	}
	public int getM_iConter() {
		return m_iConter;
	}
	public void setM_iConter(int m_iConter) {
		this.m_iConter = m_iConter;
	}
	public int getM_iDefendCritical() {
		return m_iDefendCritical;
	}
	public void setM_iDefendCritical(int m_iDefendCritical) {
		this.m_iDefendCritical = m_iDefendCritical;
	}
	public int getM_iDefendConter() {
		return m_iDefendConter;
	}
	public void setM_iDefendConter(int m_iDefendConter) {
		this.m_iDefendConter = m_iDefendConter;
	}
	public int getM_iEquipAddReal() {
		return m_iEquipAddReal;
	}
	public void setM_iEquipAddReal(int m_iEquipAddReal) {
		this.m_iEquipAddReal = m_iEquipAddReal;
	}
	public int getM_iEquipAddWushu() {
		return m_iEquipAddWushu;
	}
	public void setM_iEquipAddWushu(int m_iEquipAddWushu) {
		this.m_iEquipAddWushu = m_iEquipAddWushu;
	}
	public int getM_iEquipAddEthics() {
		return m_iEquipAddEthics;
	}
	public void setM_iEquipAddEthics(int m_iEquipAddEthics) {
		this.m_iEquipAddEthics = m_iEquipAddEthics;
	}
	public int getM_iEquipAddReputation() {
		return m_iEquipAddReputation;
	}
	public void setM_iEquipAddReputation(int m_iEquipAddReputation) {
		this.m_iEquipAddReputation = m_iEquipAddReputation;
	}
	public int getM_iEquipAddSavvy() {
		return m_iEquipAddSavvy;
	}
	public void setM_iEquipAddSavvy(int m_iEquipAddSavvy) {
		this.m_iEquipAddSavvy = m_iEquipAddSavvy;
	}
	public int getM_iEquipAddHp() {
		return m_iEquipAddHp;
	}
	public void setM_iEquipAddHp(int m_iEquipAddHp) {
		this.m_iEquipAddHp = m_iEquipAddHp;
	}
	public int getM_iEquipAddMp() {
		return m_iEquipAddMp;
	}
	public void setM_iEquipAddMp(int m_iEquipAddMp) {
		this.m_iEquipAddMp = m_iEquipAddMp;
	}
	public int getM_iEquipAddAttack() {
		return m_iEquipAddAttack;
	}
	public void setM_iEquipAddAttack(int m_iEquipAddAttack) {
		this.m_iEquipAddAttack = m_iEquipAddAttack;
	}
	public int getM_iEquipAddDefense() {
		return m_iEquipAddDefense;
	}
	public void setM_iEquipAddDefense(int m_iEquipAddDefense) {
		this.m_iEquipAddDefense = m_iEquipAddDefense;
	}
	public int getM_iEquipAddCritical() {
		return m_iEquipAddCritical;
	}
	public void setM_iEquipAddCritical(int m_iEquipAddCritical) {
		this.m_iEquipAddCritical = m_iEquipAddCritical;
	}
	public int getM_iEquipAddDodge() {
		return m_iEquipAddDodge;
	}
	public void setM_iEquipAddDodge(int m_iEquipAddDodge) {
		this.m_iEquipAddDodge = m_iEquipAddDodge;
	}
	public int getM_iEquipAddConter() {
		return m_iEquipAddConter;
	}
	public void setM_iEquipAddConter(int m_iEquipAddConter) {
		this.m_iEquipAddConter = m_iEquipAddConter;
	}
	public int getM_iEquipDefendCritical() {
		return m_iEquipDefendCritical;
	}
	public void setM_iEquipDefendCritical(int m_iEquipDefendCritical) {
		this.m_iEquipDefendCritical = m_iEquipDefendCritical;
	}
	public int getM_iEquipDefendConter() {
		return m_iEquipDefendConter;
	}
	public void setM_iEquipDefendConter(int m_iEquipDefendConter) {
		this.m_iEquipDefendConter = m_iEquipDefendConter;
	}
	public int getM_iEquipAddBuff() {
		return m_iEquipAddBuff;
	}
	public void setM_iEquipAddBuff(int m_iEquipAddBuff) {
		this.m_iEquipAddBuff = m_iEquipAddBuff;
	}
	public List<PropertyGroupsNode> getM_PropertyGroupsNodeList() {
		return m_PropertyGroupsNodeList;
	}
	public void setM_PropertyGroupsNodeList(List<PropertyGroupsNode> m_PropertyGroupsNodeList) {
		this.m_PropertyGroupsNodeList = m_PropertyGroupsNodeList;
	}
	public List<Backpack> getM_BackpackList() {
		return m_BackpackList;
	}
	public void setM_BackpackList(List<Backpack> m_BackpackList) {
		this.m_BackpackList = m_BackpackList;
	}
	public List<String> getM_CollectionList() {
		return m_CollectionList;
	}
	public void setM_CollectionList(List<String> m_CollectionList) {
		this.m_CollectionList = m_CollectionList;
	}
	public List<String> getM_QuestList() {
		return m_QuestList;
	}
	public void setM_QuestList(List<String> m_QuestList) {
		this.m_QuestList = m_QuestList;
	}
	public List<Integer> getM_EventList() {
		return m_EventList;
	}
	public void setM_EventList(List<Integer> m_EventList) {
		this.m_EventList = m_EventList;
	}
	public List<Integer> getM_TitleIDList() {
		return m_TitleIDList;
	}
	public void setM_TitleIDList(List<Integer> m_TitleIDList) {
		this.m_TitleIDList = m_TitleIDList;
	}
	public int getM_iTitleID() {
		return m_iTitleID;
	}
	public void setM_iTitleID(int m_iTitleID) {
		this.m_iTitleID = m_iTitleID;
	}
	public int getM_iRoutineID() {
		return m_iRoutineID;
	}
	public void setM_iRoutineID(int m_iRoutineID) {
		this.m_iRoutineID = m_iRoutineID;
	}
	public List<PlayerRoutineNode> getM_PlayerRoutineNodeList() {
		return m_PlayerRoutineNodeList;
	}
	public void setM_PlayerRoutineNodeList(List<PlayerRoutineNode> m_PlayerRoutineNodeList) {
		this.m_PlayerRoutineNodeList = m_PlayerRoutineNodeList;
	}
	public List<PlayerNeigongNode> getM_PlayerNeigongNodeList() {
		return m_PlayerNeigongNodeList;
	}
	public void setM_PlayerNeigongNodeList(List<PlayerNeigongNode> m_PlayerNeigongNodeList) {
		this.m_PlayerNeigongNodeList = m_PlayerNeigongNodeList;
	}
	public int getM_iNeigongID() {
		return m_iNeigongID;
	}
	public void setM_iNeigongID(int m_iNeigongID) {
		this.m_iNeigongID = m_iNeigongID;
	}
	public List<Integer> getM_DevelopQuestList() {
		return m_DevelopQuestList;
	}
	public void setM_DevelopQuestList(List<Integer> m_DevelopQuestList) {
		this.m_DevelopQuestList = m_DevelopQuestList;
	}
	public List<LotusBtnID> getM_LotusBtnIDList() {
		return m_LotusBtnIDList;
	}
	public void setM_LotusBtnIDList(List<LotusBtnID> m_LotusBtnIDList) {
		this.m_LotusBtnIDList = m_LotusBtnIDList;
	}
	public List<DevelopBtnStatus> getM_DevelopBtnStatusList() {
		return m_DevelopBtnStatusList;
	}
	public void setM_DevelopBtnStatusList(List<DevelopBtnStatus> m_DevelopBtnStatusList) {
		this.m_DevelopBtnStatusList = m_DevelopBtnStatusList;
	}
	public List<YearCourdeNode> getM_YearCourdeNodeList() {
		return m_YearCourdeNodeList;
	}
	public void setM_YearCourdeNodeList(List<YearCourdeNode> m_YearCourdeNodeList) {
		this.m_YearCourdeNodeList = m_YearCourdeNodeList;
	}
	public List<MartialID> getM_MartialIDList() {
		return m_MartialIDList;
	}
	public void setM_MartialIDList(List<MartialID> m_MartialIDList) {
		this.m_MartialIDList = m_MartialIDList;
	}
	public int getM_iWeaponsID() {
		return m_iWeaponsID;
	}
	public void setM_iWeaponsID(int m_iWeaponsID) {
		this.m_iWeaponsID = m_iWeaponsID;
	}
	public int getM_iEquipID() {
		return m_iEquipID;
	}
	public void setM_iEquipID(int m_iEquipID) {
		this.m_iEquipID = m_iEquipID;
	}
	public int getM_iAccessoriesID() {
		return m_iAccessoriesID;
	}
	public void setM_iAccessoriesID(int m_iAccessoriesID) {
		this.m_iAccessoriesID = m_iAccessoriesID;
	}
	public List<NpcFriendlyNode> getM_NpcFriendlyNodeList() {
		return m_NpcFriendlyNodeList;
	}
	public void setM_NpcFriendlyNodeList(List<NpcFriendlyNode> m_NpcFriendlyNodeList) {
		this.m_NpcFriendlyNodeList = m_NpcFriendlyNodeList;
	}
	public List<String> getM_TreasureBoxIDList() {
		return m_TreasureBoxIDList;
	}
	public void setM_TreasureBoxIDList(List<String> m_TreasureBoxIDList) {
		this.m_TreasureBoxIDList = m_TreasureBoxIDList;
	}
	public int getM_iAutomaticIndex() {
		return m_iAutomaticIndex;
	}
	public void setM_iAutomaticIndex(int m_iAutomaticIndex) {
		this.m_iAutomaticIndex = m_iAutomaticIndex;
	}
	public int getM_iAutomaticDIndex() {
		return m_iAutomaticDIndex;
	}
	public void setM_iAutomaticDIndex(int m_iAutomaticDIndex) {
		this.m_iAutomaticDIndex = m_iAutomaticDIndex;
	}
	public List<StoreDataNode> getM_StoreDataNodeList() {
		return m_StoreDataNodeList;
	}
	public void setM_StoreDataNodeList(List<StoreDataNode> m_StoreDataNodeList) {
		this.m_StoreDataNodeList = m_StoreDataNodeList;
	}
	public boolean isM_bInOutSideHouse() {
		return m_bInOutSideHouse;
	}
	public void setM_bInOutSideHouse(boolean m_bInOutSideHouse) {
		this.m_bInOutSideHouse = m_bInOutSideHouse;
	}
	public float getM_fInSideAbLi_r() {
		return m_fInSideAbLi_r;
	}
	public void setM_fInSideAbLi_r(float m_fInSideAbLi_r) {
		this.m_fInSideAbLi_r = m_fInSideAbLi_r;
	}
	public float getM_fInSideAbLi_g() {
		return m_fInSideAbLi_g;
	}
	public void setM_fInSideAbLi_g(float m_fInSideAbLi_g) {
		this.m_fInSideAbLi_g = m_fInSideAbLi_g;
	}
	public float getM_fInSideAbLi_b() {
		return m_fInSideAbLi_b;
	}
	public void setM_fInSideAbLi_b(float m_fInSideAbLi_b) {
		this.m_fInSideAbLi_b = m_fInSideAbLi_b;
	}
	public float getM_fInSideAbLi_a() {
		return m_fInSideAbLi_a;
	}
	public void setM_fInSideAbLi_a(float m_fInSideAbLi_a) {
		this.m_fInSideAbLi_a = m_fInSideAbLi_a;
	}
	public int getM_iMusicIndex() {
		return m_iMusicIndex;
	}
	public void setM_iMusicIndex(int m_iMusicIndex) {
		this.m_iMusicIndex = m_iMusicIndex;
	}
	public List<Integer> getM_teamMemberList() {
		return m_teamMemberList;
	}
	public void setM_teamMemberList(List<Integer> m_teamMemberList) {
		this.m_teamMemberList = m_teamMemberList;
	}
	public List<String> getM_TimeQuestList() {
		return m_TimeQuestList;
	}
	public void setM_TimeQuestList(List<String> m_TimeQuestList) {
		this.m_TimeQuestList = m_TimeQuestList;
	}
	public int getM_iBattleArea() {
		return m_iBattleArea;
	}
	public void setM_iBattleArea(int m_iBattleArea) {
		this.m_iBattleArea = m_iBattleArea;
	}
	public int getM_iBattleDifficulty() {
		return m_iBattleDifficulty;
	}
	public void setM_iBattleDifficulty(int m_iBattleDifficulty) {
		this.m_iBattleDifficulty = m_iBattleDifficulty;
	}
	public String getM_gGuid() {
		return m_gGuid;
	}
	public void setM_gGuid(String m_gGuid) {
		this.m_gGuid = m_gGuid;
	}
	public List<Integer> getM_completeGuides() {
		return m_completeGuides;
	}
	public void setM_completeGuides(List<Integer> m_completeGuides) {
		this.m_completeGuides = m_completeGuides;
	}
	public List<String> getM_completeGuides_Develop() {
		return m_completeGuides_Develop;
	}
	public void setM_completeGuides_Develop(List<String> m_completeGuides_Develop) {
		this.m_completeGuides_Develop = m_completeGuides_Develop;
	}
}
