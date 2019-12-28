package bobing.backend.constant;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DianShuType {

    CHAJINHUA("a","ZhuangYuanChaJinHua"),
    YIXIU("b","YiXiu"),
    ERJU("c", "ErJu"),
    SANHONG("c", "SanHong"),
    SIJIN("d", "SiJin"),
    DUITANG("e", "DuiTang"),
    SIHONG("f", "SiHong"),
    WUZI("g", "Wuzi"),
    WUHONG("h", "WuHong"),
    LIUHEI("i", "LiuHei"),
    LIUHONG("j", "LiuHong");


    private String code;
    private String name;

    DianShuType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static DianShuType getByCode(String code) {
        for (DianShuType dianShuType : DianShuType.values()) {
            if (dianShuType.getCode().equals(code)) {
                return dianShuType;
            }
        }
        return YIXIU;
    }

    public static DianShuType getByName(String name) {
        for (DianShuType dianShuType : DianShuType.values()) {
            if (dianShuType.getName().equalsIgnoreCase(name)) {
                return dianShuType;
            }
        }
        return YIXIU;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @JsonValue
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
