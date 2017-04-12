package server;

public enum MapleStatInfo {

    MDF(0),
    MDamageOver(999999),
    OnActive(0),
    PVPdamage(0),
    PVPdamageX(0),
    abnormalDamR(0),
    acc(0), // 命中
    acc2dam(0),
    acc2mp(0),
    accR(0),
    accX(0),
    actionSpeed(0),
    ar(0),
    asrR(0),
    attackCount(1),
    bdR(0),
    bufftimeR(0),
    bulletConsume(0),
    bulletCount(1),
    coolTimeR(0),
    cooltime(0),
    cr(0),
    criticaldamageMax(0),
    criticaldamageMin(0),
    costmpR(0),
    damR(0),
    damage(100),
    damageToBoss(100),
    dex(0),
    dex2str(0),
    dexFX(0),
    dexX(0),
    dexR(0),
    dot(0),
    dotInterval(0),
    dotSuperpos(1),
    dotTime(0),
    dropR(0),
    emad(0),
    emdd(0),
    emhp(0),
    emmp(0),
    epad(0),
    epdd(0),
    er(0),
    eva(0), // 回避
    eva2hp(0),
    evaR(0),
    evaX(0),
    expLossReduceR(0),
    expR(0),
    extendPrice(0),
    finalAttackDamR(0),
    fixdamage(0),
    forceCon(0),
    gauge(0),
    hcCooltime(0),
    hcHp(0),
    hcProp(0),
    hcReflect(0),
    hcSubProp(0),
    hcSubTime(0),
    hcSummonHp(0),
    hcTime(0),
    hp(0),
    hpCon(0),
    iceGageCon(0),
    ignoreMobDamR(0),
    ignoreMobpdpR(0),
    indieIgnoreMobpdpR(0),
    indieAcc(0),
    indieSTR(0),
    indieDEX(0),
    indieINT(0),
    indieLUK(0),
    indieAllStat(0),
    indieBooster(0),
    indieDamR(0),
    indieEva(0),
    indieJump(0),
    indieMDF(0),
    indieMad(0),
    indieMaxDamageOver(0),
    indieMdd(0),
    indieMhp(0),
    indieMhpR(0),
    indieMmp(0),
    indieMmpR(0),
    indiePad(0),
    indiePdd(0),
    indieSpeed(0),
    indieExp(0),
    indieCr(0),
    indieAsrR(0),
    indieTerR(0),
    indieBDR(0),
    int2luk(0),
    intFX(0),
    intX(0),
    int_(0, true),
    intR(0),
    itemCon(0),
    itemConNo(0),
    itemConsume(0),
    jump(0),
    kp(0),
    luk2dex(0),
    lukFX(0),
    lukX(0),
    luk(0),
    lukR(0),
    lv2mhp(0),
    lv2mmp(0),
    lv2damX(0),
    lv2mad(0),
    lv2mdX(0),
    lv2pad(0),
    lv2pdX(0),
    mad(0), // 魔法力
    madX(0),
    mastery(0),
    mdR(0),
    mdd(0),
    mdd2dam(0),
    mdd2pdd(0),
    mdd2pdx(0),
    mddR(0),
    mddX(0),
    mesoR(0),
    mhp2damX(0),
    mhpR(0),
    mhpX(0),
    minionDeathProp(0),
    mmp2damX(0),
    mmpR(0),
    mmpX(0),
    mobCount(1),
    mobCountDamR(0),
    morph(0),
    mp(0),
    mpCon(0),
    mpConEff(0),
    mpConReduce(0),
    nbdR(0),
    nocoolProp(0),
    onActive(0),
    onHitHpRecoveryR(0),
    onHitMpRecoveryR(0),
    pad(0), // 物理攻击力
    padX(0),
    passivePlus(0),
    pdd(0), // 物理防御力
    pdd2dam(0),
    pdd2mdd(0),
    pdd2mdx(0),
    pddR(0),
    pddX(0),
    pdR(0),
    period(0),
    price(0),
    priceUnit(0),
    prop(100),
    psdJump(0),
    psdSpeed(0),
    powerCon(0),
    range(0),
    reqGuildLevel(0),
    selfDestruction(0),
    speed(0), // 移动速度
    thaw(0), // 抵消掉血值
    speedMax(0),
    str(0),
    str2dex(0),
    strFX(0),
    strX(0),
    strR(0),
    subProp(0),
    subTime(-1),
    suddenDeathR(0),
    summonTimeR(0),
    targetPlus(0),
    tdR(0),
    terR(0),
    time(-1),
    q(0),
    s(0),
    t(0),
    u(0),
    v(0),
    w(0),
    x(0),
    y(0),
    z(0);

    private final int def;
    private final boolean special;

    MapleStatInfo(int def) {
        this.def = def;
        this.special = false;
    }

    MapleStatInfo(int def, boolean special) {
        this.def = def;
        this.special = special;
    }

    public int getDefault() {
        return this.def;
    }

    public boolean isSpecial() {
        return this.special;
    }
}